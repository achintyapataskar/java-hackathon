import java.util.ArrayList;
import java.util.List;

public class Bartender {
    List<String> items=new ArrayList<String>();
    int current_Table;
    while(items.notEmpty())
    {
        items.remove( 0);
    }
    int done_order() {
        System.out.println("The drinks for table number"+current_Table+"is done");
        return current_Table;

}
