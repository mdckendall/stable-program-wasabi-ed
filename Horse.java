//Create the Horse class here.
public class Horse{
    private String hn;
    private double w;
    private boolean t;


    public Horse (String hn, double w, boolean t){
        this.hn = hn;
        this.w = w;
        this.t = t;
    }

    public String getName(){
        return this.hn;
    }
    public double getWeight(){
        return this.w;
    }
    public boolean getIsTame(){
        return this.t;
    }
}