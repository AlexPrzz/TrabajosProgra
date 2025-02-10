package Ej1;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        if (myNumber.length() == 9) {
            this.myNumber = myNumber;
        } else {
            throw new IllegalArgumentException("El número de teléfono debe contener 9 dígitos.");
        }
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto contacto) {
        if (findContact(contacto.getName()) >= 0) {
            System.out.println("El contacto " + contacto.getName() + " ya existe.");
            return false;
        }
        myContacts.add(contacto);
        return true;
    }

    public boolean updateContact(Contacto oldContact, Contacto newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            return false;
        }
        if (findContact(newContact.getName()) != -1) {
            return false;
        }
        myContacts.set(foundPosition, newContact);
        return true;
    }

    public boolean removeContact(Contacto contacto) {
        int foundPosition = findContact(contacto);
        if (foundPosition < 0) {
            return false;
        }
        myContacts.remove(foundPosition);
        return true;
    }

    private int findContact(Contacto contacto) {
        return myContacts.indexOf(contacto);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto contacto = myContacts.get(i);
            if (contacto.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contacto queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto contacto = myContacts.get(i);
            System.out.println((i + 1) + ". " + contacto.getName() + " -> " + contacto.getPhoneNumber());
        }
    }
}





