package Singleton.code;

public class SingletonWithVars {
    private static SingletonWithVars instance;
    private final String name;

    private SingletonWithVars(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public synchronized static SingletonWithVars getInstance(String name) {
        if (instance == null) {
            instance = new SingletonWithVars(name);
        }
        return instance;
    }
    
}
