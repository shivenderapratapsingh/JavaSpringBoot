public class Main {
    public static void main(String[] args) {
        Builder b=new Builder();
        b.addColumn("Name");
        b.addColumn("Class");
        QueryGenerate q=new QueryGenerate(b);
        System.out.println(q.Generate());
    }
}
