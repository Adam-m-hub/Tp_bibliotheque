package com.biblio.model;

public class Email {

    private final String address;
    
    public Email(String address) {
        if(address == null) {
            throw new IllegalArgumentException("Email ne peut pas etre nul");
        }
        if(!address.contains("@")) {
            throw new IllegalArgumentException("L'email doit contenir '@' ");
        }
        if(!address.contains(".")) {
            throw new IllegalArgumentException("L'email doit contenir '.' ");
        }
        if(address.contains(" ")) {
            throw new IllegalArgumentException("L'email ne doit pas contenir un space ");
        }
        
        // Validation de la position du point par rapport au @
        int at = address.indexOf("@");
        int dot = address.lastIndexOf(".");
        if (dot < at) {
            throw new IllegalArgumentException("Le point doit etre apres le '@'");
        }
        
        this.address = address; // Il manquait cette ligne cruciale !
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
} // Accolade fermante de la classe