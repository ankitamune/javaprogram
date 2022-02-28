class pen{
    string color;
    string type;
    public void write(){
        System.out.println("writing something");
    }
}
public class oops{
    public static void main(String args[]){
        Pen Pen1=new Pen();
        Pen.color="blue";

        Pen.type="gel";
        Pen1.write();

    }

}