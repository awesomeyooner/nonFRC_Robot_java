package misc_files;
public class test{

    int i;

    private static test instance = new test();

    public test(){
        i = 0;
    }
   
    public static test getInstance(){
        return instance;
    }

    public void printstuff(){
        i++;
        System.out.println(i);
    }
}