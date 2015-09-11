package za.ac.cput.Chapter3;


import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestCollections {

    private NamesList mylist;
    private CarSet carTemp;
    private MusicMap music;

    @Before
    public void setUp() throws Exception
    {
        mylist = new NamesList();
        carTemp = new CarSet();
        music = new MusicMap();

    }

    @After
    public void tearDown()
    {

    }

    @Test
    public void addValue() throws Exception
    {
        mylist.addValue("AKA");
        Assert.assertEquals("AKA", mylist.lista.get(0));
        System.out.println("AKA Found");


    }

    @Test
    public void removeArrayValue() throws Exception
    {
        mylist.addValue("AKA");
        mylist.addValue("Cassper");

        mylist.removeValue(1);
        Assert.assertEquals("AKA", mylist.lista.get(0) );
        System.out.println("Cassper removed (element 1)");
    }

    @Test
    public void addCar() throws Exception
    {
        carTemp.addCars("Vw");
        carTemp.addCars("Bently");
        carTemp.addCars("Toyota");
        carTemp.addCars("Ford");
        Assert.assertTrue(carTemp.carS.contains("Ford"));
        //Assert.assertEquals("Bently", carTemp.carS.contains("Bently") );
    }

    @Test
    public void removeCars() throws Exception
    {
        carTemp.addCars("BMW");
        carTemp.addCars("Opel");

        Assert.assertTrue(carTemp.carS.remove("BMW"));
        System.out.println("BMW removed");
    }

    @Test
    public void addMap() throws Exception
    {
        music.addMusic("Cassper", "DocShebelza");
        music.addMusic("Kwesta", "DolikeIdo");

        String element = (String) music.musicTemp.get("Cassper");
        Assert.assertEquals(element,music.musicTemp.get("Cassper"));
        System.out.println(element);
    }

    @Test
    public void removeMap() throws Exception
    {
        music.addMusic("Cassper", "DocShebelza");
        music.addMusic("Kwesta", "DolikeIdo");

        music.removeMusic("Kwesta");

        String element1 = (String) music.musicTemp.get("Kwesta");
        System.out.println(element1);
    }

}
