package SallysLemonadeStand;

public class Suckers {
    
    Integer age;
    String email;
    String firstName;
    String lastName;
    String phoneNumber;
    String password;

    Address address;
public Suckers() {

}

public Suckers(Integer age, String email, String firstName, String lastName, String phoneNumber, String password) {
    this.age = age;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.password = password;
}

public int getAge() {
    return age;
}

public void setAge(Integer age) {
    this.age = age;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public Address getAddress() {
    return address;
}

public void setAddress(Address address) {
    this.address = address;
}

@Override
public String toString() {
    return "Suckers [age=" + age + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
            + ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
}


}



