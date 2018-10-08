package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Library {
    static HashSet<Book> books=new HashSet<>();
    static HashMap<String,String> myMap=new HashMap<String,String>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

	 menuList();
    }
    public static void menuList() {
        boolean exit = false;
        while (exit == false) {
            System.out.println("1. List Books\n2. Adding Books\n3. Borrowing Books\n4. Returning Books\n5. Exit");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    listBooks();
                    printList();

                    break;
                }
                case "2": {
                    addingBooks();
                    break;
                }
                case "3": {
                    borowingBooks();
                    break;
                }
                case "4": {
                    returningBooks();
                    break;
                }
                case "5": {
                    System.out.println("Thank you for using this APP");
                    exit = true;
                    break;
                }

            }
        }

    }
    public static HashSet<Book> listBooks(){

        Book book1=new Book();
        book1.setTitle("book1");
        book1.setAuthor("Author 1");
        book1.setYear("year 1");
        book1.setIsbn("ISBN 1");
        book1.setId("001");
        book1.setStatus(true);
        myMap.put(book1.getId(),book1.getTitle());
        Book book2=new Book();
        book2.setTitle("book2");
        book2.setAuthor("Author 2");
        book2.setYear("year 2");
        book2.setIsbn("ISBN 2");
        book2.setId("002");
        book2.setStatus(true);

        myMap.put(book2.getId(),book2.getTitle());

        Book book3=new Book();
        book3.setTitle("book3");
        book3.setAuthor("Author 3");
        book3.setYear("year 3");
        book3.setIsbn("ISBN 3");
        book3.setId("003");
        book3.setStatus(true);

        myMap.put(book3.getId(),book3.getTitle());

        Book book4=new Book();
        book4.setTitle("book4");
        book4.setAuthor("Author 4");
        book4.setYear("year 4");
        book4.setIsbn("ISBN 4");
        book4.setId("004");
        book4.setStatus(true);
        myMap.put(book4.getId(),book4.getTitle());


        Book book44=new Book();
        book44.setTitle("book4");
        book44.setAuthor("Author 4");
        book44.setYear("year 4");
        book44.setIsbn("ISBN 6");
        book44.setId("006");
        book44.setStatus(true);
        myMap.put(book44.getId(),book44.getTitle());


        Book book5=new Book();
        book5.setTitle("book5");
        book5.setAuthor("Author 5");
        book5.setYear("year 5");
        book5.setIsbn("ISBN 5");
        book5.setId("005");
        book5.setStatus(true);

        myMap.put(book5.getId(),book5.getTitle());

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book44);

     return books;
    }
    public static void printList(){
        System.out.println("Title\t\t\t\t" + "Author\t\t\t\t\t" + "Year of publication\t\t" + "ID\t\t\t" + "Status\n");
        for (Book eachBook:books){
            String status;
            if (eachBook.isStatus()){
                status="Available";
            }
            else
                status="Not Available";

            System.out.println(eachBook.getTitle()+"\t\t\t\t " + eachBook.getAuthor() + "\t\t\t\t\t" +eachBook.getYear() +"\t\t\t\t\t" + eachBook.getId() +"\t\t\t\t" + status);
        }
    }


    public static void addingBooks(){
        Book newBook=new Book();
        System.out.println("Title of the book:");
        String title=sc.nextLine();
        newBook.setTitle(title);
        System.out.println("The Author of the book:");
        String author=sc.nextLine();
        newBook.setAuthor(author);
        System.out.println("Year of Publication:");
        String year=sc.nextLine();
        newBook.setYear(year);
        System.out.println("ISBN of the book");
        String isbn=sc.nextLine();
        newBook.setIsbn(isbn);
        System.out.println("ID of the book");
        String id=sc.nextLine();
        newBook.setId(id);
         books.add(newBook);
         myMap.put(newBook.getId(),newBook.getTitle());

    }
    public static void borowingBooks(){
        printList();
        System.out.println("Title of the book you want to borrow");
        String title=sc.nextLine();
        for(Book eachBook:books) {
            if (title.equals(eachBook.getTitle()) && eachBook.isStatus()) {
                eachBook.setStatus(false);
            }
            else
                System.out.println("You only can borrow books in the list Write the Title correctly");
        }


    }
    public static void returningBooks(){

    }
}
