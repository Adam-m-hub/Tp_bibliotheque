package erc.com.biblio.model;

public class Isbn {
    private final String value;
    public Isbn(String value){
  
        if (value == null) {
            throw new IllegalArgumentException("L'ISBN ne peut pas etre null");
        }
        value = value.trim();

        if (value.isEmpty()) {
            throw new IllegalArgumentException("L'ISBN ne peut pas etre vide");
        }

        if (!(value.matches("\\d{10}") || value.matches("\\d{13}"))) {
            throw new IllegalArgumentException("Format ISBN invalide : doit contenir 10 ou 13 chiffres");
        }
          this.value = value;
    }
    
            @Override
            public String toString() {
                return "Isbn{value='" + value + "'}";
            }

            @Override
             public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Isbn isbn = (Isbn) o;

            return value.equals(isbn.value);
        }

            @Override
            public int hashCode() {
                return value.hashCode();
            }



}
    