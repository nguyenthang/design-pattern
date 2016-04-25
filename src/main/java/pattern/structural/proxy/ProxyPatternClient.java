package pattern.structural.proxy;

/**
 * Created by thangnguyen-imac on 4/25/16.
 */
public class ProxyPatternClient {

    public static void main(String[] args){
        IOfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}
