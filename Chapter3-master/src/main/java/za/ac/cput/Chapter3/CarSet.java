package za.ac.cput.Chapter3;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class CarSet {

    public Set carS;

    public CarSet()
    {
        carS = new HashSet();
    }

    public void addCars(String carName)
    {
        carS.add(carName);
        carS.add("BMW");
        carS.add("Audi");
    }

    public void carRemove(String car)
    {
        carS.remove(car);
    }

}
