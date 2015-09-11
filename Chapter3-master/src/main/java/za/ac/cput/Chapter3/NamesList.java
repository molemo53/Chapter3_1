package za.ac.cput.Chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class NamesList {

    public List lista;

    public NamesList()
    {
        lista = new ArrayList();
    }

    public void addValue(String namesStr)
    {
        lista.add(namesStr);
        lista.add(1, "Molemo");
        lista.add(2, "Kevin");

    }

    public void removeValue(int i)
    {
        lista.remove(i);
    }
}
