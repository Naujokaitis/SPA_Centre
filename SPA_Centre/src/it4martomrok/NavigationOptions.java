package it4martomrok;

import java.util.Date;

/**
 * Created by Tomas on 2015-04-05.
 */
public interface NavigationOptions {
    public void addHour(DateObject Date);

    public void addDay(DateObject Date);

    public void addMonth(DateObject Date);

    public void addYear(DateObject Date);

    public void decHour(DateObject Date);

    public void decDay(DateObject Date);

    public void decMonth(DateObject Date);

    public void decYear(DateObject Date);

}
