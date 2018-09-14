package demo.veracode;
import org.apache.commons.lang.StringUtils;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String a = "hello world";
        String b = StringUtils.substring(a, 2);
        System.out.println(b);
    }
}
