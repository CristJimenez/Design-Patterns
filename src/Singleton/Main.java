package Singleton;

public class Main {

    public static void main(String[] args) {
        SingletonNoVar singletonNV = SingletonNoVar.getInstance();
        SingletonNoVar singletonNV2 = SingletonNoVar.getInstance();
        System.out.println("Singleton without variables");
        System.out.println(singletonNV);
        System.out.println(singletonNV2);
        System.out.println(singletonNV == singletonNV2);
        SingletonWithVars singletonWV = SingletonWithVars.getInstance("paco");
        SingletonWithVars singletonWV2 = SingletonWithVars.getInstance("luis");
        System.out.println("\nSingleton with variables");
        System.out.println(singletonWV);
        System.out.println(singletonWV2);
        System.out.println(singletonWV == singletonWV2);
    }
    
}
