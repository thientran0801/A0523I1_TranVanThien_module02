package casestudy.service;

import casestudy.controller.FuramaController;
import casestudy.model.Facility;
import casestudy.model.House;
import casestudy.model.Room;
import casestudy.model.Villa;
import casestudy.repository.FacilityRepository;
import casestudy.utils.GetInput;

import java.util.Map;

public class FacilityService extends GetInput implements IFacilityService {
    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayListMaintenance() {
        Map<Facility, Integer> map = facilityRepository.getList();
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value >= 5) {
                if (entry.getKey() instanceof Villa) {
                    Villa villa = (Villa) entry.getKey();
                    System.out.println("Used: " + value + ", " + villa);
                } else if (entry.getKey() instanceof House) {
                    House house = (House) entry.getKey();
                    System.out.println("Used: " + value + ", " + house);
                } else {
                    Room room = (Room) entry.getKey();
                    System.out.println("Used: " + value + ", " + room);
                }
            }
        }
    }

    @Override
    public void add() {
        System.out.println("1. Add new villa: \n2. Add new house: \n3. Add new room: \n4. Back to menu: \nEnter your choice: ");
        int choice = FuramaController.getUserChoice(1, 4);
        String idService, roomStandard;
        int numberOfFloor;
        System.out.println("Enter name service: ");
        String nameService = getText();
        System.out.println("Enter usable area: ");
        double acreage = getAcreage();
        System.out.println("Enter expense service: ");
        double expense = getExpense();
        System.out.println("Enter number of person: ");
        int maxPerson = getNumberPerson();
        System.out.println("Enter rental type: Year, Month, Date, Hour");
        String rentalType = getText();
        switch (choice) {
            case 1:
                System.out.println("Enter id service: ");
                idService = getIdService("VL");
                System.out.println("Enter room standard: ");
                roomStandard = getText();
                System.out.println("Enter pool acreage: ");
                double poolAcreage = getAcreage();
                System.out.println("Enter number of floor: ");
                numberOfFloor = getNumber();
                Villa villa = new Villa(idService, nameService, acreage, expense, maxPerson, rentalType, numberOfFloor, roomStandard, poolAcreage);
                facilityRepository.add(villa);
                break;
            case 2:
                System.out.println("Enter id service: ");
                idService = getIdService("HO");
                System.out.println("Enter romm standard: ");
                roomStandard = getText();
                System.out.println("Enter number of floor: ");
                numberOfFloor = getNumber();
                House house = new House(idService, nameService, acreage, expense, maxPerson, rentalType, numberOfFloor, roomStandard);
                facilityRepository.add(house);
                break;
            case 3:
                System.out.println("Enter id service: ");
                idService = getIdService("RO");
                System.out.println("Enter incentives: ");
                String incentives = getText();
                Room room = new Room(idService, nameService, acreage, expense, maxPerson, rentalType, incentives);
                facilityRepository.add(room);
                break;
        }
    }

    @Override
    public void displayList() {
        Map<Facility, Integer> map = facilityRepository.getList();
        for (Map.Entry<Facility, Integer> entry : map.entrySet()) {
            Facility facility = entry.getKey();
            int value = entry.getValue();
            if (facility instanceof Villa) {
                Villa villa = (Villa) facility;
                System.out.println("Used: " + value + ", " + villa);
            } else if (facility instanceof House) {
                House house = (House) facility;
                System.out.println("Used: " + value + ", " + house);
            } else {
                Room room = (Room) facility;
                System.out.println("Used: " + value + ", " + room);
            }
        }
    }
}
