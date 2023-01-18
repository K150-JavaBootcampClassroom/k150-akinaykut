package week_3.GreengrocerApp;

// Kişiler için oluşturulan class
public class Person {

    // Adı ve soyadı alan değişkenler
    private String name;
    private String surname;

    // Constructor metodu
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    // Getter ve Setter metotları

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
