package casestudy.repository;

import casestudy.model.Booking;
import casestudy.model.Contract;
import casestudy.utils.GetInput;
import casestudy.utils.ReadAndWrite;

import java.util.*;

public class BookingRepository extends GetInput implements IBookingRepository {
    private static final String PARTH_BOOKING = "D:\\codegym\\module02\\src\\casestudy\\data\\booking.csv";
    private static final String PARTH_CONTRACT = "D:\\codegym\\module02\\src\\casestudy\\data\\contract.csv";

    private static final Set<Booking> BOOKINGLIST = new TreeSet<>();
    private static final List<Contract> CONTRACTLIST = new ArrayList<>();
    static {
        List<String> stringList = ReadAndWrite.readFromFile(PARTH_BOOKING);
        for (String str : stringList) {
            String[] array = str.split(",");
            Booking booking = new Booking(array[0], array[1], array[2], array[3], array[4], array[5]);
            BOOKINGLIST.add(booking);
        }
        List<String> stringList1 = ReadAndWrite.readFromFile(PARTH_CONTRACT);
        for (String str : stringList1) {
            String[] array = str.split(",");
            Contract contract = new Contract(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]));
            CONTRACTLIST.add(contract);
        }
    }
    @Override
    public Set<Booking> getListBooking() {
        return BOOKINGLIST;
    }

    @Override
    public void add(Booking booking) {
        BOOKINGLIST.add(booking);
        update();
    }

    private void update() {
        List<String> stringList = new ArrayList<>();
        for (Booking bk :BOOKINGLIST) {
            stringList.add(bk.getInfoToWrite());
        }
        ReadAndWrite.writeToFile(PARTH_BOOKING, stringList, false);
    }

    @Override
    public List<Contract> getListContract() {
        return CONTRACTLIST;
    }

    @Override
    public void createNewContract(Contract contract) {
        CONTRACTLIST.add(contract);
        updateContract();
    }

    @Override
    public void editContract(String contractCode) {
        for (Contract contract  : CONTRACTLIST) {
            if (contract.getContractCode().equals(contractCode)){
                System.out.println("Enter new ID contract: ");
                contract.setContractCode(getIdUser("FM"));
                System.out.println("Enter new ID booking: ");
                contract.setBookingCode(getIdUser("BK"));
                System.out.println("Enter new deposit: ");
                contract.setDepositMoney(getExpense());
                System.out.println("Enter new total money: ");
                contract.setTotalMoney(getExpense());
                updateContract();
                return;
            }
        }
        System.out.println("The Contract code not found!!!");
    }
    private void updateContract() {
        List<String> stringList = new ArrayList<>();
        for (Contract contract :CONTRACTLIST) {
            stringList.add(contract.getInfoToWrite());
        }
        ReadAndWrite.writeToFile(PARTH_CONTRACT, stringList, false);
    }
}
