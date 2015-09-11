package za.ac.cput.Chapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class MusicMap {
    public Map musicTemp;

    public MusicMap()
    {
        musicTemp = new HashMap();
    }

    public void addMusic(String artist, String song)
    {
        musicTemp.put(artist, song);
        musicTemp.put("Aka", "AllEyesOnMe");
    }

    public void removeMusic(String artist)
    {
        musicTemp.remove(artist);
    }

}
