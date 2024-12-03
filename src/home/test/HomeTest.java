package home.test;

import home.models.House;
import home.models.Kitchen;
import home.models.LivingRoom;

public class HomeTest {
    public static void main(String[] args) {
        // Living Room
        LivingRoom room = new LivingRoom();
        System.out.println(room);
        LivingRoom roomFill = new LivingRoom(3,"Big");
        System.out.println(roomFill);

        //Kitchen
        Kitchen kitchen = new Kitchen();
        System.out.println(kitchen);
        Kitchen kitchenFill = new Kitchen(true, 4);
        System.out.println(kitchenFill);

        //House
        House house = new House();
        System.out.println(house);
        House house3 = new House(5000,"Street 43 32", room, kitchen);
        System.out.println(house3);
        House houseFill = new House(1200.00,"Street 54 34", roomFill, kitchenFill);
        System.out.println(houseFill);

    }
}
