/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weiss.nonstandard;

import DS.Book;

/**
 *
 * @author CS
 */
public class TestProgram {
    public static void main( String [ ] args )
    {

        /// Stack operations
        System.out.println("Stack Operations");
        System.out.println("Array Implementation");
        testStackArray();


        System.out.println("LinkedList Implementation");
        testStackList();


//        testQueueArray();
//        testQueueList();
//        testLinkedList();

        //testBinarySearchTree();

    }



    

 public static void testStackArray(){
        ArrayStack<Book> myBooks = new ArrayStack<Book>();
        
        Book b1 = new Book("Karamazov Brothers",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Crime and Punishment",8000);
        Book b4 = new Book("Notes from Undergroundt",7000);

        myBooks.push(b1);
        myBooks.push(b2);
        myBooks.push(b3);
        myBooks.push(b4);

        System.out.println("ShowElements");
       // myBooks.showElements();

//        System.out.println("Showinverse");
//        myBooks.showInverse();
//
//        System.out.println("Clone");
//        ArrayStack<Book> cloneBooks = myBooks.Clone();
//        cloneBooks.showElements();
//
//        System.out.println("Swap");
//        myBooks.swap();
//        myBooks.showElements();
    }


    public static void testStackList(){
        ListStack<Book> myBooks = new ListStack<Book>();
        
        Book b1 = new Book("Karamazov Brothers",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Crime and Punishment",8000);

        myBooks.push(b1);
        myBooks.push(b2);
        myBooks.push(b3);

        System.out.println("ShowElements");
        myBooks.showElements();
        myBooks.showElements();
//
//        System.out.println("Showinverse");
//        myBooks.showInverse();
//
//        System.out.println("Clone");
//        ListStack<Book> cloneBooks = myBooks.Clone();
//        cloneBooks.showElements();
//
//        System.out.println("Swap");
//        myBooks.swap();
//        myBooks.showElements();
    }


   
}
