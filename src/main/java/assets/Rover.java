package assets;

import assets.exceptions.orderNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rover {


    public void executeOrder(String orders) {

        for (char order : orders.toCharArray()) {
            orderSelector(order);
        }
    }

    public void orderSelector(char order) {

        switch (order) {
            case 'F' -> System.out.println("xdddd");
            case 'B' -> System.out.println("xd2");
            case 'L' -> System.out.println("bruh");
            case 'R' -> System.out.println("madude");
            default -> throw new orderNotFoundException("Command does not met requirement expected.");


        }
    }


}
