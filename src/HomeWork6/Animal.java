package HomeWork6;

public class Animal {
    protected String type;
    protected String name;
    protected int run;
    protected int swim;
    public static int count;

    public Animal(String type, String name, int run, int swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
        ++count;
    }
    String getInfo(){
        return this.type + " " +
                this.name + " " +
                this.run + " " +
                this.swim;
    }

    protected void run(int distanceRun) {
        if (run >= distanceRun) {
            System.out.println(this.type + " - " + this.name + "  - successfull ran " + run + "ì.");
        } else {
            System.out.println(this.type + " - " + this.name + " ---- failed ---- ");
        }
    }
    protected void swim(int distanceSwim) {
        if (swim >= distanceSwim) {
            System.out.println(this.type + " - " + this.name + "   - successfull ran " + swim + "ì.");
        } else {
            System.out.println(this.type + " - " + this.name + " ---- failed ---- ");
        }
    }
}
