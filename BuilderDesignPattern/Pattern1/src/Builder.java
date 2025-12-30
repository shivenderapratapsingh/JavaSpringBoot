import java.util.ArrayList;

public class Builder {
    ArrayList<String> List=new ArrayList<>();


    public void addColumn(String column){
        List.add(column);
    }
    ArrayList<String> getColumn(){
        return List;
    }

}
