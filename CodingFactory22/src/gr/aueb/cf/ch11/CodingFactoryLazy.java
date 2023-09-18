package gr.aueb.cf.ch11;

/*
*   Lazy instatiation
*   Singleton pattern
*/
public class CodingFactoryLazy {

    private static CodingFactoryLazy INSTANCE = new CodingFactoryLazy();

    private CodingFactoryLazy(){}

    public static CodingFactoryLazy getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CodingFactoryLazy();
        }

        return INSTANCE;
    }

    public void sayHello(){
        System.out.println("Hello Coding Factory");
    }
}
