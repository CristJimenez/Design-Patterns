package Prototype.code;

public class PrototypeMain {

    public static void main(String[] args) {
        User userOriginal = new User(
                "Cristian",
                19
        );
        
        UserClient userClient = new UserClient();
        User user2 = new User(userOriginal.getName(), userOriginal.getAge());
        User editedUser = userClient.editUserAge(userOriginal, 21);
        User editedUser2 = userClient.editUserName(userOriginal, "Jose");
        User editedUserP = userClient.editUserWithPrototypeAge(userOriginal, 34);
        User editedUserP2 = userClient.editUserWithPrototypeName(userOriginal, "Hernan");
        
        System.out.println(userOriginal);
        System.out.println(editedUser);
        System.out.println(editedUser2);
        System.out.println(editedUserP);
        System.out.println(editedUserP2);
    }
    
}

class UserClient {
    public User editUserAge(User user, int age) {
        User editableUser = new User(user.getName(), user.getAge());
        if (age > 0 && age != user.getAge()) {
            editableUser.setAge(age);
        }
        
        return editableUser;
    }
    
    public User editUserName(User user, String name) {
        User editableUser = new User(user.getName(), user.getAge());
        if (name != null && !name.isEmpty() && !name.equals(user.getName())) {
            editableUser.setName(name);
        }
        
        return editableUser;
    }
    
    public User editUserWithPrototypeAge(User user, int age) {
        User editableUser = user.clone();
        if (age > 0 && age != user.getAge()) {
            editableUser.setAge(age);
        }
        
        return editableUser;
    }
    
    public User editUserWithPrototypeName(User user, String name) {
        User editableUser = user.clone();
        if (name != null && !name.isEmpty() && !name.equals(user.getName())) {
            editableUser.setName(name);
        }
        
        return editableUser;
    }
}