import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Create 2 routes and assign each of them to a different Car object
        Route route1=new Route("Twauiq academy","international Book fair",80);
        Car car1=new Car("111",route1,4);
        Route route2=new Route("Riyadh park","Airport",100);
        Car car2=new Car("222",route2,0);

        //Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
        ArrayList <Passenger> passengerArrayList=new ArrayList<>();
        Passenger subscriber=new Subscribers("Kalied alameen","9988");
        subscriber.reserve_car(car1);
        passengerArrayList.add(subscriber);
        //non-Sub
        Passenger nonSubscriber=new NonSubscribers("Sara ahmed","1122",true);
        nonSubscriber.reserve_car(car1);
        passengerArrayList.add(nonSubscriber);

        Passenger subscriber2=new Subscribers("Fahad","4455");
        subscriber2.reserve_car(car2);


        //test array
        System.out.println("***The confirmed booking number is: "+passengerArrayList.size()+" ***");
        //test capacity
        System.out.println("***The capacity of car1 after 2 booking is: "+car1.getCapacity()+" ***");











    }
}