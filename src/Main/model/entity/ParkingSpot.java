package Main.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import com.google.gson.Gson;

@Getter
@NoArgsConstructor
@Setter
@SuperBuilder


public class ParkingSpot {

    private int spot_number;
    //parking no occupied
    private boolean is_occupied;
    //time car entry
    private long start_time;

    @Override
    public String toString(){return new Gson().toJson(this);}
}
