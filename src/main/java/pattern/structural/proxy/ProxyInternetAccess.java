package pattern.structural.proxy;

/**
 * Created by thangnguyen-imac on 4/25/16.
 */
public class ProxyInternetAccess implements IOfficeInternetAccess {

    private String employeeName;

    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }


    public void grantInternetAccess() {
        if(getRole(employeeName) < 4){
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getRole(String employeeName) {
        return 9;
    }

}
