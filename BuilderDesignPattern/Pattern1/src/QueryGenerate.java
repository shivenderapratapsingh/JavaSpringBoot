import java.util.ArrayList;

public class QueryGenerate {
    ArrayList<String> List=new ArrayList<>();
    QueryGenerate(Builder b){
        this.List=b.getColumn();
    }
    String Generate(){
        StringBuilder sb=new StringBuilder();
        sb.append("Select");
        for(String s:List){
            sb.append(s);
            sb.append(",");
        }
        return sb.toString();
    }
}
