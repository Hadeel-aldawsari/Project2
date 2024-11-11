public abstract class Passenger {
    private String name;
    private String ID;
    private Car reserved_car;
    private double trip_cost;

    Passenger(){}

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public  abstract void reserve_car(Car reserved_car);

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }


}
