package Main.model.entity;


import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder

public class Car {
    private String license_plate;




    @Override
    public String toString()  {return new Gson().toJson(this);}

}
