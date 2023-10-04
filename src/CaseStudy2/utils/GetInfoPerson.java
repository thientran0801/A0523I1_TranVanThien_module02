package CaseStudy2.utils;

import java.util.Scanner;
import java.util.Stack;

public class GetInfoPerson {
    private Scanner scanner = new Scanner(System.in);

    //Exception
    //-	Mã nhân viên phải đúng định dạng: NV-YYYY, với YYYY là các số từ 0-9.
    public String getIdEmployee() {
        String id = "";
        boolean correctFormat = false;
        do {
            id = scanner.nextLine();
            if (id.length() == 7 && id.startsWith("NV-") && Integer.parseInt(id.substring(3)) > 0) {
                correctFormat = true;
            } else {
                System.out.println("wrong format: NV-XXXX");
                correctFormat = false;
            }
        } while (!correctFormat);
        return id;
    }

    public String getIdCustomer() {
        String id = "";
        boolean correctFormat = false;
        do {
            id = scanner.nextLine();
            if (id.length() == 7 && id.startsWith("KH-") && Integer.parseInt(id.substring(3)) > 0) {
                correctFormat = true;
            } else {
                System.out.println("wrong format: KH-XXXX");
                correctFormat = false;
            }
        } while (!correctFormat);
        return id;
    }
    //-	Tên nhân viên phải viết hoa các ký tự đầu của mỗi từ.
    public String getNameUser() {
        String name = "";
        boolean correctFormat = false;
        do {
            String nameInput = scanner.nextLine();
            name = nameInput.replaceAll("\\s+", " ");
            if (name.equals("")) {
                System.out.println("name cannot be empty!!!");
                continue;
            }
            String[] list = name.split(" ");
            for (String string : list) {
                if (Character.isUpperCase(string.charAt(0))) {
                    correctFormat = true;
                } else {
                    correctFormat = false;
                    System.out.println("You must capitalize the first letters!!!");
                    break;
                }
            }
        } while (!correctFormat);
        return name;
    }
    //-	Phải đủ 18 tuổi (tính cả ngày + tháng)
    public String getDob() {
        boolean corectDob = false;
        String dob = "";
        do {
            try {
                dob = scanner.nextLine();
                int date = Integer.parseInt(dob.substring(0, 2));
                int month = Integer.parseInt(dob.substring(3, 5));
                int year = Integer.parseInt(dob.substring(6));
                if (dob.length() != 10 || dob.charAt(2) != '/' || dob.charAt(5) != '/' || date <= 0 || month <= 0 || year <= 0 || date > 31 || month > 12) {
                    System.out.println("Please re-enter: XX/XX/XXXX:");
                    corectDob = false;
                } else {
                    if (2023 - year > 18) {
                        corectDob = true;
                    } else if (2023 - year == 18) {
                        if (month < 10) {
                            corectDob = true;
                        } else if (month == 10) {
                            if (date <= 2) {
                                corectDob = true;
                            } else {
                                corectDob = false;
                            }
                        } else {
                            corectDob = false;
                        }
                    } else {
                        corectDob = false;
                    }
                    if (!corectDob) {
                        System.out.println("Under 18 years old!!!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Please re-enter: XX/XX/XXXX");
                corectDob = false;
            }
        } while (!corectDob);

        return dob;
    }
    //-	CMND phải đủ 9 hoặc 12 số.
    public String getIdcard() {
        boolean idCardCorrect = false;
        String idCard = "";
        do {
            idCard = scanner.nextLine();
            if (idCard.length() == 9 || idCard.length() == 12) {
                try {
                    long id = Long.parseLong(idCard);
                    if (id >=  0) {
                        idCardCorrect = true;
                    }else {
                        idCardCorrect = false;
                        System.out.println("Error!!!Please, re-enter ID card");
                    }
                }catch (Exception e) {
                    idCardCorrect = false;
                    System.out.println("Error!!!Please, re-enter ID card");
                }
            }else {
                idCardCorrect = false;
                System.out.println("ID card incluses 9 or 12 numbers!!! ");
            }
        }while (!idCardCorrect);
        return idCard;
    }
    //-	Số điện thoại phải bắt đầu từ 0 và đủ 10 số.
    public String getPhoneNumber() {
        boolean correct = false;
        String phonenumber = "";
        do {
            try {
                phonenumber = scanner.nextLine();
                if (phonenumber.charAt(0) == '0' && phonenumber.length() == 10) {
                    if (Integer.parseInt(phonenumber.substring(1))>0) {
                        correct = true;
                    }else {
                        throw new Exception();
                    }
                }else {
                    throw new Exception();
                }
            }catch (Exception e) {
                System.out.println("Please! Re-enter: 0XXXXXXXXX");
                correct = false;
            }
        }while (!correct);
        return phonenumber;
    }
}
