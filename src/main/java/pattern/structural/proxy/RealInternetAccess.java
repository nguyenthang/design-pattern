package pattern.structural.proxy;

/**
 * Created by thangnguyen-imac on 4/25/16.
 */
public class RealInternetAccess implements IOfficeInternetAccess {
    private String employeeName;

    public RealInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }


    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }
}
