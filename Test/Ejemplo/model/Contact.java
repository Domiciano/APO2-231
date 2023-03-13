package model;

import excepctions.InvalidNumberException;

public class Contact {

    private String name;
    private String phone;

    private String email;

    public Contact(String name, String phone, String email) throws InvalidNumberException {
        //Regular expresions
        try {
            this.name = name;
            this.phone = phone;
            this.email = email;
            Integer.parseInt(phone);
        }catch (NumberFormatException ex){
            throw new InvalidNumberException();
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
