/***/
package basic.collection;

import java.util.Collections;
import java.util.List;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class Exercise1 {
    public static void main(String[] args) {

        List<String> countries = (List<String>) CountriesList.getAllCountries();
        Collections.reverse(countries);
        System.out.print(countries);
    }
}
