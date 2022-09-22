
import java.util.ArrayList;
import java.util.List;

public class CabCustomerService {

    private List<CabCustomer> cabCustomer = new ArrayList<>();

    public void addCabCustomer(CabCustomer cabCusto) {
        cabCustomer.add(cabCusto);
    }

    public boolean isNewCustomer(CabCustomer cabCusto) {
        int count = 0;
        for(CabCustomer customer: cabCustomer) {
            if(customer.getPhone() == cabCusto.getPhone()) {
                count++;
            }
        }
        if(count == 1)
            return true;

        else
            return false;
    }

    public double calculateBill(CabCustomer cabCusto) {
        if(isNewCustomer(cabCusto)) return 0.0;

        if(cabCusto.getDistance() <= 4) {
            return 80.0;
        }
        return 80 + ((cabCusto.getDistance()-4) * 6);
    }

    public void printBill() {


        int count = 0;
        for(CabCustomer customer: cabCustomer) {
            long phonenum = customer.getPhone();
            if(!isNewCustomer(customer) && phonenum == customer.getPhone()) {
                count++;
                if(count ==2)System.out.println(customer.getCustomerName().toUpperCase()+" Please pay your bill of RS."+calculateBill(customer));
            }else {
                System.out.println(customer.getCustomerName().toUpperCase()+" Please pay your bill of RS."+calculateBill(customer));
            }

        }

    }

}
