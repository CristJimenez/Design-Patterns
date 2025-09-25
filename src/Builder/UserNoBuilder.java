package Builder;

public class UserNoBuilder {

    private String name;
    private String lastName;
    private int age;
    private String typeDocument;
    private String numberDocument;

    public UserNoBuilder(
            String name,
            String lastName,
            int age,
            String typeDocument,
            String numberDocument
    ) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.typeDocument = typeDocument;
        this.numberDocument = numberDocument;
    }
    
    public String toString() {
        return "User [Name= " + name + ", Last name= " + lastName + ", age= " + age + ", Type document= " + typeDocument + ", Number document= " + numberDocument + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

}
