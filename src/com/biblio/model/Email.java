package com.biblio.model;

public class Email {

    private final String address;
    public Email (String address){
        if(address==null){
            throw new IllegalArgumentException("Email ne peut pas etre nul");
        }
        if(!(address.contains("@"))){
            throw new IllegalArgumentException("L'email doit contenir '@' ");
        }
            if (!(address.contains("."))){
            throw new IllegalArgumentException("L'email doit contenir '.' ");
        }
            if (address.contains(" ")) {
            throw new IllegalArgumentException("L'email ne doit pas contenir un space ");
        }

            int at = address.indexOf("@");
            int dot = address.lastIndexOf(".");
            if (dot < at) {
                throw new IllegalArgumentException("Le point doit etre apres le '@'");
            }

    }
            @Override
            public String toString() {
                return "Email{address='" + address + "'}";
            }
            
            @Override
             public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Email email = (Email) o;

            return address.equals(email.address);
        }

            @Override
            public int hashCode() {
                return address.hashCode();
            }
    
}
