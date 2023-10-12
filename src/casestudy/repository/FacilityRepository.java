package casestudy.repository;

import casestudy.model.*;
import casestudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private final static String PATH_FACILITY = "D:\\codegym\\module02\\src\\casestudy\\data\\facility.csv";
    private final static Map<Facility, Integer> FACILITYMAP = new LinkedHashMap<>();
    static {
        List<String> stringList = ReadAndWrite.readFromFile(PATH_FACILITY);
        for (String string : stringList) {
            String[] array = string.split(",");
            if (string.startsWith("SVVL")) {
                Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], Integer.parseInt(array[6]), array[7], Double.parseDouble(array[8]));
                FACILITYMAP.put(villa, Integer.parseInt(array[9]));
            } else if (string.startsWith("SVHO")) {
                House house = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], Integer.parseInt(array[6]), array[7]);
                FACILITYMAP.put(house, Integer.parseInt(array[8]));
            } else {
                Room room = new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6]);
                FACILITYMAP.put(room, Integer.parseInt(array[7]));
            }
        }
    }

    @Override

    public Map<Facility, Integer> getList() {
        return FACILITYMAP;
    }

    @Override
    public void add(Facility facility) {
        if (facility == null) {
            System.out.println("You have not filled in all the information for the facility!!! ");
            return;
        }
        FACILITYMAP.put(facility,0);
        update();
    }
    //nang vale +1 khi booking
    public static boolean increaseValue(String idService) {
        for (Map.Entry<Facility,Integer> entry : FACILITYMAP.entrySet()) {
            if (entry.getKey().getServiceCode().equals(idService)) {
                int value = entry.getValue();
                Facility facility = entry.getKey();
                FACILITYMAP.put(facility, value+1);
                update();
                return true;
            }
        }
        return false;
    }

    public static void update() {
        List<String> stringList = new ArrayList<>();
            for (Map.Entry<Facility, Integer> entry : FACILITYMAP.entrySet()) {
                if (entry.getKey() instanceof Villa) {
                    Villa villa = (Villa) entry.getKey();
                    stringList.add(villa.getInfoToWrite() + "," + entry.getValue());
                } else if (entry.getKey() instanceof House) {
                    House house = (House) entry.getKey();
                    stringList.add(house.getInfoToWrite() + "," + entry.getValue());
                } else {
                    Room room = (Room) entry.getKey();
                    stringList.add(room.getInfoToWrite() + "," + entry.getValue());
                }
            }
        ReadAndWrite.writeToFile(PATH_FACILITY, stringList, false);
    }
}
