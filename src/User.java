public static class User {
}private String surname;
private String firstname;
private String midlename;

public void User(String surname, String firstname, String patronymic) {
    this.surname = surname;
    this.firstname = firstname;
    this.midlename = midlename;
}

public void setSurname(String surname) {
    this.surname = surname;
}

public void setFirstname(String firstname) {
    this.firstname = firstname;
}

public void setPatronymic(String midlename) {
    this.midlename = midlename;
}

public String getSurname(){
    return surname;
}

public String getFirstname(){
    return firstname;
}

public String getPatronymic(){
    return midlename;
}

@Override
public String toString() {
    return "User{" + "surname='";
}


