package Day29;

public class Store {

    public static void main(String[] args) {

        String [] items={"Shoes", "Jackets", "Gloves", "Airpods", "Ipad", "Backpack"};
        double[] prices={89.99, 150.0, 999.99, 250.0, 439.5, 39.99};
        int[] itemIds= {12345, 12346, 12347, 12348, 12349, 12340};

        for (int i=0; i<items.length; i++){
            System.out.println("item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
        }
        System.out.println();

        int indexOfGloves= -1 ;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves")) {
                indexOfGloves = i;
                break;

            }
        }
         System.out.println("index of Gloves: " + indexOfGloves);

        double mostExpensive =prices[0];
        int indexOfMostExpensive=0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > mostExpensive){

                mostExpensive= prices[i];
                indexOfMostExpensive=i;
            }

        }
        System.out.println("The most expensive item : " );
        System.out.println("item: " + items[indexOfMostExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfMostExpensive]);
        System.out.println("Price $: " + prices[indexOfMostExpensive]);



    }
}
