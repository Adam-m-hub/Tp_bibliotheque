package com.biblio.model;
import java.util.Objects;
//import com.biblio.model.Email;
import java.time.LocalDate;

public final class Member {
    private final String id;
    private final String fullName;
    private final Email email;
    private final LocalDate registrationDate;


    public Member(String id, String fullName, Email email, LocalDate registrationDate) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID ne peut pas etre nul ou vide");
        }
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Nom complet ne peut pas etre nul ou vide");
        }
        this.id = id;
        this.fullName = fullName;
        if(email == null) {
            throw new IllegalArgumentException("Email ne peut pas etre nul");
        }
        this.email = email;
        if(registrationDate == null) {
            throw new IllegalArgumentException("Date d'inscription ne peut pas etre nulle");
        }
        this.registrationDate = registrationDate;
    }
    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email=" + email +
                ", registrationDate=" + registrationDate +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id.equals(member.id) &&
                fullName.equals(member.fullName) &&
                email.equals(member.email) &&
                registrationDate.equals(member.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, registrationDate);
    }
}