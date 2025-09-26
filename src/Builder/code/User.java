package Builder.code;

public class User {
    
    private final String name;
    private final String lastName;
    private final int age;
    private final String typeDocument;
    private final String numberDocument;

    private User(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.typeDocument = builder.typeDocument;
        this.numberDocument = builder.numberDocument;
    }

    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getTypeDocument() { return typeDocument; }
    public String getNumberDocument() { return numberDocument; }
    
    public String toString() {
        return "User [Name= " + name + ", Last name= " + lastName + ", age= " + age + ", Type document= " + typeDocument + ", Number document= " + numberDocument + "]";
    }
    
    public static class Builder {
        private String name;
        private String lastName;
        private int age;
        private String typeDocument;
        private String numberDocument;
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        public Builder typeDocument(String typeDocument) {
            this.typeDocument = typeDocument;
            return this;
        }
        
        public Builder numberDocument(String numberDocument) {
            this.numberDocument = numberDocument;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
    
}
