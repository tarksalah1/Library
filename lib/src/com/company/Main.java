package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in).useDelimiter("\n");





        HashMap<Long, String> borrow = new HashMap<>();
        ArrayList<member> all_members = new ArrayList<>();
        ArrayList<String> inventory = new ArrayList<>();
        ArrayList<Long> Bids = new ArrayList<>();
        ArrayList<String> Mp = new ArrayList<>();
        ArrayList<String> FS = new ArrayList<>();
        ArrayList<String> HM = new ArrayList<>();
        ArrayList<String> JJ = new ArrayList<>();
        ArrayList<String> JA = new ArrayList<>();
        ArrayList<String> JR = new ArrayList<>();
        ArrayList<String> PC = new ArrayList<>();
        ArrayList<String> AD = new ArrayList<>();
        ArrayList<String> JK = new ArrayList<>();
        ArrayList<String> AG = new ArrayList<>();
        ArrayList<String> JD = new ArrayList<>();
        ArrayList<String> RJ = new ArrayList<>();
        ArrayList<String> LH = new ArrayList<>();


        ArrayList<String> author_availble = new ArrayList<>();


        //adding authors to a list
        author_availble.add("Marcel Proust");
        author_availble.add("F.Scott Fitzgerald");
        author_availble.add("Herman Melville");
        author_availble.add("James Joyce");
        author_availble.add("J.Alice");
        author_availble.add("J. R. R. Tolkien");
        author_availble.add("Paulo Coelho");
        author_availble.add("Antoine de Saint-Exupery");
        author_availble.add("J. K. Rowling");
        author_availble.add("Agatha Christie");
        author_availble.add("J. D. Salinger");
        author_availble.add("Robert James Waller");
        author_availble.add("Louise Hay");


        //binding the list of books that each author wrote to his name to make searching for a book by author possible
        HashMap<String, List> aseasrch = new HashMap<>();
        aseasrch.put("Marcel Proust", Mp);
        aseasrch.put("F.Scott Fitzgerald", FS);
        aseasrch.put("Herman Melville", HM);
        aseasrch.put("James Joyce", JJ);
        aseasrch.put("J.Alice", JA);
        aseasrch.put("J. R. R. Tolkien", JR);
        aseasrch.put("Paulo Coelho", PC);
        aseasrch.put("Antoine de Saint-Exupery", AD);
        aseasrch.put("J. K. Rowling", JK);
        aseasrch.put("Agatha Christie", AG);
        aseasrch.put("J. D. Salinger", JD);
        aseasrch.put("Robert James Waller", RJ);
        aseasrch.put("Louise Hay", LH);


        //creating objects using the constructor
        books book1 = new books("In Search Of Lost Time", "Marcel Proust", "27/5/1980");
        books book2 = new books("The Great Gatsby", "F.Scott Fitzgerald", "7/4/1903");
        books book3 = new books("Moby Dick", "Herman Melville", "2/1/1960");
        books book4 = new books("Ulysses", "James Joyce", "12/12/1997");
        books book5 = new books("Moby Dick", "Herman Melville", "2/1/1960");
        books book6 = new books("The Lord of the Rings", "J. R. R. Tolkien", "2/1/1954");
        books book7 = new books("The Alchemist ", "Paulo Coelho", "4/11/1988");
        books book8 = new books("The Little Prince", "Antoine de Saint-Exupery", "23/12/1943");
        books book9 = new books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "7/8/1997");
        books book10 = new books("The Hobbit", "J. R. R. Tolkien", "2/1/1960");


        //assigning books to respective authors
        Mp.add(book1.title);
        FS.add(book2.title);
        HM.add(book3.title);
        JJ.add(book4.title);
        JR.add(book6.title);
        JR.add(book10.title);
        PC.add(book7.title);
        AD.add(book8.title);
        JK.add(book9.title);


        //adding books to the inventory
        inventory.add(book1.title);
        inventory.add(book2.title);
        inventory.add(book3.title);
        inventory.add(book4.title);
        inventory.add(book5.title);
        inventory.add(book6.title);
        inventory.add(book7.title);
        inventory.add(book8.title);
        inventory.add(book9.title);
        inventory.add(book10.title);


        //ids stored also one of these must be used to access library options
        long member1_id = 14588;
        long member2_id = 8887;
        long member3_id = 441525;
        long member4_id = 124578;
        long member5_id = 99665;


        //list to store member ids
        Bids.add(member1_id);
        Bids.add(member2_id);
        Bids.add(member3_id);
        Bids.add(member4_id);
        Bids.add(member5_id);


        //creating member objects
        member member1 = new member("abdullah", member1_id);
        member member2 = new member("khairy", member2_id);
        member member3 = new member("Aleen", member3_id);
        member member4 = new member("hussien", member4_id);
        member member5 = new member("majd", member5_id);


        ArrayList<String> member_names = new ArrayList<>();
        member_names.add(member1.name);
        member_names.add(member2.name);
        member_names.add(member3.name);
        member_names.add(member4.name);
        member_names.add(member5.name);


        all_members.add(member1);
        all_members.add(member2);
        all_members.add(member3);
        all_members.add(member4);
        all_members.add(member5);


        // they are not in the inventory (borrowed)
        books book22 = new books("And Then There Were None", "Agatha Christie", "7/4/1903");
        books book33 = new books("The Catcher in the Rye", "J. D. Salinger", "2/1/1960");
        books book44 = new books("The Bridges of Madison County", "Robert James Waller", "18/12/1957");
        books book55 = new books("You Can Heal Your Life", "Louise Hay", "2/1/1970");
        books one_of_the_borrowed_book = new books("Journey to the center of the earth", "J.Alice", "19/5/2001");


        //adding the titles of borrowed books to the list of each author
        JA.add(one_of_the_borrowed_book.title);
        AG.add(book22.title);
        JD.add(book33.title);
        RJ.add(book44.title);
        LH.add(book55.title);


        //borrowed books members borrowed
        member1.books_owned = one_of_the_borrowed_book;
        member2.books_owned = book22;
        member3.books_owned = book33;
        member4.books_owned = book44;
        member5.books_owned = book55;




        while (true) {

            System.out.println("Hello and welcome MR Admin " + "\n" +
                    "Which of the following process would you like to use " + "\n" +
                    "(Chose the process by typing the corresponding number)" + "\n" +
                    "1. Add a book to the inventory " + "\n" +
                    "2. Do checkouts for a book " + "\n" +
                    "3. Search for a book in the inventory" + "\n" +
                    "4. search for books by author" + "\n" +
                    "5. check in books that are returned" + "\n" +
                    "6. To search for a user and the book he borrowed" + "\n" +
                    "7. To delete a book form the inventory" + "\n" +
                    "8. To delete a user" + "\n" +
                    "-1. To exit"

            );
            int a = scan.nextInt();



            if (a == 1) {


                System.out.println("Please enter the number of books you are adding");
                int A = scan.nextInt();
                int i = 1;


                while (i <= A) {
                    System.out.println("please enter the title , the author, and the date of publish of book number " + "'" + i + "'" +
                            " in this form (day/month/year) " +
                            "in this order");
                    books book = new books(scan.next(), scan.next(), scan.next());

                    author_availble.add(book.author);
                    ArrayList<String> list;
                    if (aseasrch.containsKey(book.author)) {
                        // if the key has already been used
                        // we'll just grab the array list and add the value to it
                        aseasrch.get(book.author).add(book.title);
                        System.out.println("These are the books by existing author: " + aseasrch.get(book.author));

                    } else {
                        // if the key hasn't been used yet,
                        // we'll create a new ArrayList add the value
                        // and put it in the array list with the new key
                        list = new ArrayList<String>();
                        list.add(book.title);
                        aseasrch.put(book.author, list);
                        System.out.println("This is list of books by the recently added " +
                                "author: " + aseasrch.get(book.author));


                    }
                    inventory.add(book.title);
                    System.out.println(book.title + " has been add to the inventory");


                    i++;

                }


                System.out.println("This is the updated inventory " + inventory+ "\n");



                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }

            }


//don't forget to implement the ask for how many days the borrowing took to and make a penalty for it


            if (a == 2) {
                System.out.println("Please enter your name and id");
                member user = new member(scan.next(), scan.nextLong());
                boolean z = false;
                System.out.println("These are the titles in the library");
                System.out.println(inventory);


                for (member all_member : all_members) {
                    if (((user.ide == all_member.ide)) && (user.name.equals(all_member.name))) {

                        System.out.println("Enter the name of the book you want to borrow ");
                        String needed_book = scan.next();


                        if (inventory.contains(needed_book)) {


                            System.out.println("The book is in the inventory and is available for borrowing " +
                                    "and must be returned within 14 days" + "\n" + "\n");


                            int occurrences = Collections.frequency(inventory, needed_book);
                            System.out.println("And There are " + occurrences + " copies of the book in the library");


                            borrow.put(user.ide, needed_book);  //should be stored somewhere to link the id to the borrowed book
                            System.out.println(user.name + " " + user.ide + " has borrowed: " + needed_book + " and should return it " +
                                    "within 14 days");


                            inventory.remove(needed_book);
                            System.out.println("Current books in the library: ");
                            System.out.println(inventory);

                        } else {
                            System.out.println("The book is not available");
                        }


                        z = true;
                    }
                }


                for (member all_member : all_members) {
                    if (((user.ide != all_member.ide)) && (!user.name.equals(all_member.name) && !z)) {
                        System.out.println("Member does not match id or member does not exist");
                        break;

                    }


                }
                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }


            }







            if (a == 3) {
                System.out.println("please enter your id");
                if (Bids.contains(scan.nextLong())) {
                    System.out.print("please enter the name of the book you are looking for: ");
                    String book_search = scan.next();
                    if (inventory.contains(book_search)) {
                        System.out.println("The book your are looking for " + "'" + book_search + "'" + " is found in the library");
                        int occurrences = Collections.frequency(inventory, book_search);
                        System.out.println("And There are " + occurrences + " copies of the book ");
                    } else {
                        System.out.println("The book you are looking for is currently not available or someone is borrowing it");
                    }


                } else {
                    System.out.println("you are not a member");
                }
                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }

            }







            if (a == 4) {
                System.out.println("please enter your id");
                if (Bids.contains(scan.nextLong())) {
                    System.out.println("enter the name the author you want to see his books");
                    String au = scan.next();

                    if (author_availble.contains(au)) {
                        System.out.println("These are the books by the author: " + au);
                        System.out.println(aseasrch.get(au));
                        System.out.println("Now choose a book from the list");

                        //if its on the list then its in the inventory but there may not be available copies
                        //so search inventory

                        String book_search = scan.next();
                        if (inventory.contains(book_search)) {
                            System.out.println("The book your are looking for " + "'" + book_search + "'" + " is found in the library");
                            int occurrences = Collections.frequency(inventory, book_search);
                            System.out.println("And There are " + occurrences + " copies of the book ");
                        } else {
                            System.out.println("The book you are looking for is currently not available or someone is borrowing it");
                        }
                    } else {
                        System.out.println("author is not available");
                    }


                } else {
                    System.out.println("you are not a member");
                }
                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }


            }







            if (a == 5) {
                System.out.println("please enter your id ");
                long ID = scan.nextLong();
                if (Bids.contains(ID)) {

                    System.out.println("please enter the name of thr book you want to return");
                    String return_book = scan.next();
                    if (Bids.contains(ID)) {
                        inventory.add(return_book);
                        System.out.println(inventory);

                    } else {
                        System.out.println("Your id is not in the list");
                    }


                } else {
                    System.out.println("you are not a member");
                }
                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }
            }





            if (a == 6) {
                System.out.println("please enter your id");
                long ID = scan.nextLong();
                if (Bids.contains(ID)) {
                    System.out.println("please enter the name and id of the member you want to inspect");
                    member user = new member(scan.next(), scan.nextLong());
                    boolean z = false;


                    for (member all_member : all_members) {
                        if (((user.ide == all_member.ide)) && (user.name.equals(all_member.name))) {

                            System.out.println("the user " + user.name + " " + user.ide + " has borrowed: " + all_member.books_owned.title);

                            z = true;
                        }
                    }


                    for (member all_member : all_members) {
                        if (((user.ide != all_member.ide)) && (!user.name.equals(all_member.name) && !z)) {
                            System.out.println("members does not match id or member does not exist");
                            break;

                        }


                    }

                } else {
                    System.out.println("you are not a user");
                }
                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }
            }







            if (a == 7) {
                System.out.println("please enter your id");
                if (Bids.contains(scan.nextLong())) {

                    System.out.println("These are the books currently in the inventory");
                    System.out.println(inventory);
                    System.out.println("please select a book to remove");
                    String re = scan.next();

                    if (inventory.contains(re)) {
                        inventory.remove(re);
                    } else {
                        System.out.println("the book is not in the inventory to be removed");
                    }

                    System.out.println("The current library is");
                    System.out.println(inventory);


                } else {
                    System.out.println("The id is invalid you are not a member");
                }
                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }
            }








            if (a == 8) {
                System.out.println("please enter your id");
                if (Bids.contains(scan.nextLong())) {
                    System.out.println("these are the members and their ids");

                    for (int i = 0; i < all_members.size(); i++) {
                        System.out.println(all_members.get(i).name + " " + all_members.get(i).ide);
                    }
                    System.out.println("choose a user id to delete");
                    long du = scan.nextLong();
                    for (int i = 0; i < all_members.size(); i++) {
                        if ((du == all_members.get(i).ide)) {

                            all_members.remove(i);

                        }
                        Bids.remove(du);
                    }
                    System.out.println("the current user are updated");
                    for (int i = 0; i < all_members.size(); i++) {
                        System.out.println(all_members.get(i).name + " " + all_members.get(i).ide);

                    }

                } else {
                    System.out.println("The id is invalid. You are not a member");
                }

                System.out.println("if you want to exit press 0 if not press 1");
                int q = scan.nextInt();
                if (q == 0) {
                    System.exit(0);
                }else if(q==1){
                    continue;

                }
            }


            if (a == -1) {
                System.exit(0);
            }




        }

    }
}




class books {
    String author;
    String title;
    String date_of_publish;

    books(String t, String a, String dof) {
        this.author = a;
        this.title = t;
        this.date_of_publish = dof;
    }

}
class member{

    String name;
    books books_owned;
    long ide;
    member( String q,Long v){
        this.ide = v;

        this.name = q;
    }
}