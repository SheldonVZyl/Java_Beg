package ex09_1_exercise;
//Exercise 9-1
//
//1. Encapsulate this class.  Change access modifiers so that fields can
//     be read or changed on through public methods.  
//     The ssn field should be READ ONLY.

public class Customer {

    public String name;
    public String ssn;

    // Encapsulate this class.  Make ssn read only.
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getSsn() {
        return ssn;
    }
}
