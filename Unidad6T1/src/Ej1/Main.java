package Ej1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil("123456789");

    public static void main(String[] args) {
        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nElige una acción: (6 para mostrar las opciones)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nSaliendo...");
                    quit = true;
                    break;

                case 1:
                    telefonoMovil.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Ingresa el nombre del nuevo contacto:");
        String name = scanner.nextLine();
        System.out.println("Ingresa el número de teléfono:");
        String phoneNumber = scanner.nextLine();

        try {
            Contacto newContact = Contacto.createContact(name, phoneNumber);
            if (telefonoMovil.addNewContact(newContact)) {
                System.out.println("Contacto añadido: " + name + " -> " + phoneNumber);
            } else {
                System.out.println("No se pudo añadir el contacto. " + name + " ya existe.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Inténtalo de nuevo.");
        }
    }



    private static void updateContact() {
        System.out.println("Ingresa el nombre del contacto a actualizar:");
        String oldName = scanner.nextLine();
        Contacto existingContact = telefonoMovil.queryContact(oldName);
        if (existingContact == null) {
            System.out.println("Contacto no encontrado.");
            return;
        }

        System.out.println("Ingresa el nuevo nombre del contacto:");
        String newName = scanner.nextLine();
        System.out.println("Ingresa el nuevo número de teléfono:");
        String newPhoneNumber = scanner.nextLine();
        try {
            Contacto newContact = Contacto.createContact(newName, newPhoneNumber);
            if (telefonoMovil.updateContact(existingContact, newContact)) {
                System.out.println("Contacto actualizado.");
            } else {
                System.out.println("No se pudo actualizar el contacto.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void removeContact() {
        System.out.println("Ingresa el nombre del contacto a eliminar:");
        String name = scanner.nextLine();
        Contacto existingContact = telefonoMovil.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contacto no encontrado.");
            return;
        }

        if (telefonoMovil.removeContact(existingContact)) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se pudo eliminar el contacto.");
        }
    }

    private static void queryContact() {
        System.out.println("Ingresa el nombre del contacto a buscar:");
        String name = scanner.nextLine();
        Contacto contact = telefonoMovil.queryContact(name);
        if (contact == null) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("Nombre: " + contact.getName() + " -> Teléfono: " + contact.getPhoneNumber());
        }
    }

    private static void printActions() {
        System.out.println("\nOpciones disponibles:\n");
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Agregar un nuevo contacto");
        System.out.println("3 - Actualizar un contacto existente");
        System.out.println("4 - Eliminar contacto de la lista");
        System.out.println("5 - Buscar/encontrar contacto por nombre");
        System.out.println("6 - Volver a imprimir la lista de opciones");
    }
}
