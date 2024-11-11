public class Route {

    private String pick_up_address;
    private String destination_address;
    private double price;

    public Route(String pick_up_address, String destination_address, double price) {
        this.pick_up_address = pick_up_address;
        this.destination_address = destination_address;
        this.price = price;
    }

    public String getPick_up_address() {
        return pick_up_address;
    }

    public void setPick_up_address(String pick_up_address) {
        this.pick_up_address = pick_up_address;
    }

    public String getDestination_address() {
        return destination_address;
    }

    public void setDestination_address(String destination_address) {
        this.destination_address = destination_address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
