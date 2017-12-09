import java.util.ArrayList;

class DataBase {
    private static ArrayList<String> figures = new ArrayList<>();
    DataBase(String s){
        if (figures.contains(s)){
            System.out.println("This figure is already!");
        }
        figures.add(s);

        // for (String d : figures){ System.out.println(d); }
    }
}
