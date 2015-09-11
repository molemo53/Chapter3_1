package za.ac.cput.c3question2;
import java.util.*;

/**
 * Created by student on 2015/02/19.
 */
public class BusClass implements BusInterface
{
    @Override
    public Set<String> busSet()
    {
        Set busSet = new HashSet();
        busSet.add("Giant");
        busSet.add("Man");
        busSet.add("Benz");
        return busSet;
    }
}
