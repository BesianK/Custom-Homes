package kodra_guicustomhomes;

/**
 * @author besian kodra
 */
public class Order {

    String name;
    String address;
    String phoneNum;
    String plot;
    String type;
    String addons;
    int addonsCount;

    double orderTotal;
    double costStandard = 200000.00;
    double costLuxury = 300000.00;
    double costCustom = 400000.00;
    double costNewSub = 30000.00;
    double costGraniteCounter = 50000.00;
    double costJacuzzi = 50000.00;
    double costBrickPatio = 50000.00;
    double costSmartHome = 50000.00;
    double costCustLanscape = 50000.00;
    double costFinishedBasement = 50000.00;
    double costAddons = 0;

    public Order() {
    }

    public Order(String name, String address, String phoneNum, String plot, String type, String addons) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.plot = plot;
        this.type = type;
        this.addons = addons;
    }

    public Order(String name, String address, String phoneNum, String plot, String type, String addons, double orderTotal) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.plot = plot;
        this.type = type;
        this.addons = addons;
        this.orderTotal = orderTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phoneNum;
    }

    public void setPhone(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getSize() {
        return type;
    }

    public void setSize(String type) {
        this.type = type;
    }

    public String getAddons() {
        return addons;
    }

    public void setAddons(String addons) {
        this.addons = addons;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}