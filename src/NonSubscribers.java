public class NonSubscribers extends Passenger{
  boolean discount_coupon=false;

   NonSubscribers(){}

    public NonSubscribers(String name, String ID, boolean discount_coupon) {
        super(name, ID);
        this.discount_coupon = discount_coupon;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    @Override
    public void reserve_car(Car  car_object){
        try {
            if (car_object.getCapacity() == 0) throw new Exception("Sorry Can't add more passenger the capacity of car id: ("+car_object.getCode() +") is full");

            double cost = 0;
            if (discount_coupon) {
                cost = (car_object.getRoute().getPrice());
                cost = cost - (car_object.getRoute().getPrice() * 0.1);
            }else{
                cost = car_object.getRoute().getPrice();
            }
            super.setTrip_cost(cost);
            car_object.setCapacity(car_object.getCapacity()-1);
            System.out.println("---Information of booking---");
            System.out.println("Passenger Name:"+super.getName()+" ,ID:"+super.getID());
            System.out.println("Passenger Category:Non Subscriber, Has discount? "+discount_coupon);
            System.out.println("Car Code:" + car_object.getCode());
            System.out.println("Route Price:" +super.getTrip_cost());
            System.out.println(" ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
