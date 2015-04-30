package it4martomrok;

/**
 * Created by Roko on 2015-04-30.
 */
public class Spa {
    private String Place;
    private String Service;
    private String Price;

    Spa(String a, String b, String c) {
        this.Place = a;
        this.Service = b;
        this.Price = c;
    }

    public void setPlace(String a)
    {
        this.Place = a;
    }

    public void setService(String a)
    {
        this.Service = a;
    }

    public void setPrice(String a)
    {
        this.Price = a;
    }

    public String getPlace()
    {
        return this.Price;
    }

    public String getService()
    {
        return this.Service;
    }

    public String getPrice()
    {
        return this.Price;
    }
}