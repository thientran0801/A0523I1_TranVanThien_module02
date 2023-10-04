package casestudy.model;

public class Contract {
    int contractNumber, bookingCode, depositMoney, totalMoney;

    public Contract() {
    }

    public Contract(int contractNumber, int bookingCode, int depositMoney, int totalMoney) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}

