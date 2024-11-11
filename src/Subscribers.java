public class Subscribers extends Passenger{

    Subscribers(){}

    public Subscribers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserve_car(Car car_object) {
        try {
            if (car_object.getCapacity() == 0) throw new Exception("Sorry Can't add more passenger the capacity of car id: ("+car_object.getCode() +") is full");
            double cost = 0;
            //50% discount
            cost = (car_object.getRoute().getPrice() / 2);
            super.setTrip_cost(cost);
            car_object.setCapacity(car_object.getCapacity()-1);
            System.out.println("---Information of booking---");
            System.out.println("Passenger Name:"+super.getName()+" ,ID:"+super.getID());
            System.out.println("Passenger Category:Subscriber");
            System.out.println("Car Code:" + car_object.getCode());
            System.out.println("Route Price before discount:" + car_object.getRoute().getPrice());
            System.out.println("Route Price with Subscribers discount:" + super.getTrip_cost());
            System.out.println(" ");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
