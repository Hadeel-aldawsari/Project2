public class Car {
    private String code;
    private  final Route route;
    private int capacity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car(String code, Route route, int capacity) {
        this.code = code;
        this.route = route;
        this.capacity = capacity;
    }
}
