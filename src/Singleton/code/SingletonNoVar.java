package Singleton.code;

public class SingletonNoVar {
    private static final SingletonNoVar instance = new SingletonNoVar();
    private SingletonNoVar() {}
    
    public synchronized static SingletonNoVar getInstance() {
        return instance;
    }
}
