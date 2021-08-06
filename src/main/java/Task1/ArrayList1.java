package Task1;

import java.util.ArrayList;


public class ArrayList1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && ! list.get(i).contains("л")) {
                list.remove(list.get(i));
                i--;
            }
            else if (list.get(i).contains("л") && ! list.get(i).contains("р")){
                list.add(i + 1, list.get(i));
                i++;
            }
            else if (list.get(i).contains("р") && list.get(i).contains("л")) {
                continue;
            }
        }
        return list;
    }
}


