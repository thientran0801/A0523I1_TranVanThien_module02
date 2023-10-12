package casestudy.model;

public class Contract {
    private String contractCode, bookingCode;
    private double depositMoney, totalMoney;

    public Contract() {
    }

    public Contract(String contractCode, String bookingCode, double depositMoney, double totalMoney) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getInfoToWrite() {
        return getContractCode() + "," + getBookingCode() + "," + getDepositMoney() + "," + getTotalMoney();
    }

    @Override
    public String toString() {
        return "Contract code: " + getContractCode() + ", Booking code: " + getBookingCode() + ", Deposit: " + getDepositMoney() + ", Total money:" + getTotalMoney();
    }
}

