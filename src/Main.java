import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        Developer dev1 = new Developer("John Doe",35000, 20, 500,0);
        staffs.add(dev1);
        Developer dev2 = new Developer("Marry Ann",35000, 10, 300, 0);
        staffs.add(dev2);
        CEO ceo1 = new CEO("Elon Musk", 150000, 4, 20000, 0);
        staffs.add(ceo1);
        Marketing marketing1 = new Marketing("Sara Wong",30000,2,500,0);
        staffs.add(marketing1);
        Driver driver1 = new Driver("Driver", 500, 40);
        Cleaner cleaner1 = new Cleaner("Cleaner", 500, 30);
        OtherPayment otherPayment1 = new OtherPayment(200, 30, 2, 500);


        int totalPayment = 0;
        System.out.println("Staff payment : ");
        for (Staff staff : staffs) {
            System.out.println(staff.getName() + " = " + staff.getPayment());
            System.out.println("tax : "+staff.getTax());
            totalPayment += staff.getPayment();
        }
//      System.out.println("Staff payment : " +totalPayment );
        totalPayment = totalPayment + driver1.getPayment() + cleaner1.getPayment() + otherPayment1.getPayment();
        System.out.println("");
        System.out.println(driver1.getName() + " = " + driver1.getPayment());
        System.out.println(cleaner1.getName() + " = " + cleaner1.getPayment());
        System.out.println("----------------------------");
        System.out.println("Monthly payment : ");
        System.out.println("Rental : " +otherPayment1.getRental());
        System.out.println("Electric : " +otherPayment1.getElectricity());
        System.out.println("Internet : " +otherPayment1.getInternetAccess());
        System.out.println("Total Payment: " + totalPayment);
    }
}