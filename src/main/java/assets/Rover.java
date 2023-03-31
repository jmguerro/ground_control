package assets;

import assets.cardinal.Location;
import assets.exceptions.OrderNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Rover {

    private Location location;


    public void executeOrder(String orders) {

        for (char order : orders.toCharArray()) {
            orderSelector(order);
        }
    }

    public void executeOrderVersion2(Character[] commands) {

        for (char order : commands) {
            orderSelector(order);
        }
    }


    public void orderSelector(char order) {

        switch (order) {
            case 'F' -> location.fordward();
            case 'B' -> location.backwards();
            case 'L' -> location.turnleft();
            case 'R' -> location.turnRigth();
            default -> throw new OrderNotFoundException("Command does not met requirement expected.");


        }
    }




}
