package Builder;

public class BuilderMain {

    public static void main(String[] args) {
        UserNoBuilder userNoB1 = new UserNoBuilder("Jose", "Jimenez", 13, "TI", "0987654321");
        System.out.println(userNoB1);
        
        UserNoBuilder userNoB2 = new UserNoBuilder("HErnan", "Jimenez", 40, "CC", "1029384756");
        System.out.println(userNoB2);
        
        User user1 = new User.Builder()
                .name("Cristian")
                .lastName("Jimenez")
                .age(19)
                .typeDocument("CC")
                .build();
        System.out.println(user1);
        
        User user2 = new User.Builder()
                .name("Silvia")
                .typeDocument("CC")
                .numberDocument("5647382910")
                .build();
        System.out.println(user2);
    }
    
}
