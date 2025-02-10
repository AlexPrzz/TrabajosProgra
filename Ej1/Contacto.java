package Ej1;

public class Contacto {
    private String name;
    private String phoneNumber;

    public Contacto(String name, String phoneNumber) {
        if (!phoneNumber.matches("\\d{9}")) {
            throw new IllegalArgumentException("El número de teléfono debe contener solo 9 dígitos numéricos.");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String name, String phoneNumber) {
        if (phoneNumber.matches("\\d{9}")) {
            return new Contacto(name, phoneNumber);
        } else {
            throw new IllegalArgumentException("El número de teléfono debe contener solo 9 dígitos numéricos.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return name.equalsIgnoreCase(contacto.name) && phoneNumber.equals(contacto.phoneNumber);
    }
}
