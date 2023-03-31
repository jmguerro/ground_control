package assets.cardinal;

import assets.Mars;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private int x;
    private int y;
    private Mars mars;


    public void limitAxis() {

        if (x > Mars.MAX_AXIS_X) {
            System.out.println("eres un jamu");
            setX(3);
        }

    }

}
