import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Chef {

    List<String> items = new ArrayList<String>();
    int current_table;
    while(items.notEmpty()) {
        items.remove(0);
    }
    int done_order() {
        System.out.println("The food for table number"+current_table+"is done");
        return current_table;
    }}
