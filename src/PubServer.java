public class PubServer {
    int tables_served = -1;
    Order[] orders = new Order[3];
    void take_new_order(Order new_order) {
        for(int i = 0; i < 3; i++)
            if(orders[i].table_number == -1)
                break;
            
    }
    int test_age(int new_table_number) {
        if(orders[new_table_number] < 21 && orders[new_table_number].drink.isNotEmpty()) {
            System.out.println("Underage Drinking, This is not UK");
            return 1;
        }
        return 0;
    }
    void pass_order_to_chef(int new_table_number) {
        for(String item : orders[new_table_number].food) {
            chefObject.items.add(item);
        }
        chefObject.current_table = orders[new_table_number].table_number;
    }
    void pass_order_to_bartender(int new_table_number) {
        if(test_age(new_table_number) == 1)
            return;
        for(String item : orders[new_table_number].drink) {
            bartenderObject.items.add(item);
        }
        bartenderObject.current_table = orders[new_table_number].table_number;
    }
    PubServer(int start) {
        tables_served = start;
        for(int i = 0; i < 3; i++)
            orders[i].table_number = -1;
    }

}
