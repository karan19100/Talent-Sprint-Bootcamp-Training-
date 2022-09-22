
public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomer karan = new CabCustomer(1,"KARAN","Dahisar","Goregaon",219,76123456);
        CabCustomer mohit = new CabCustomer(2,"MOHIT","Dahisar","Andheri",8,723456);
        CabCustomer anjali = new CabCustomer(3,"MOHIT","Andheri","Dahisar",21,723456);

        CabCustomerService cs = new CabCustomerService();

        cs.addCabCustomer(karan);
        cs.addCabCustomer(mohit);
        cs.addCabCustomer(anjali);

        cs.printBill();
    }
}
