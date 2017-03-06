/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2016 
// PROJECT:          GameApp
// FILE:             Game.java
//
// Authors: Zexing Li (Richard), Bryan Watson, Changhao Sun, Jonas Klare, Mason Gomm, Joshua DuBois,
//
// Author1: Zexing Li (Richard), zli674@wisc.edu, zexing, lec001
// Author2: Bryan Watson, bmwatson2@wisc.edu, bmwatson2, lec001
// Author3: Joshua DuBois, jdubois3@wisc.edu, jdubois3, lec001
// Author4: Changhao Sun, csun78@wisc.edu, csun78, lec001
// Author5: Mason Gomm, Mgomm@wisc.edu, mgomm, lec001
// Author6: Jonas Klare, klare@wisc.edu, klare, Lec001
//
//
// ---------------- OTHER ASSISTANCE CREDITS 
// Persons: N/a
// 
// Online sources: N/a
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * This is the structure for a singly linked list node
 * Consists of the data to be stored in the node
 * and the link to the next node in the list
 * @param <E>
 */
public class Listnode<E>{

    /** The data members
     * data: Holds the value of each node in the list
     * next: Holds the link to the next node in list
     */
    private E data;
    private Listnode<E> next;
    //Variables

    //Constructor
    public Listnode(E data) {
        this.data = data;
        this.next = null;
    }

    public Listnode(E data, Listnode<E> next) {
        this.data = data;
        this.next = next;
    }
    //Constructor

    /**
    * Simple getter for data. 
    */
    public E getData() {
        return data;
    }

    /**
    * Simple setter for data
    */
    public void setData(E data) {
        this.data = data;
    }

    /**
    * Simple getter for the next node.
    */
    public Listnode<E> getNext() {
        return next;
    }

    /**
    * Simple setter for next node. 
    */
    public void setNext(Listnode<E> next) {
        this.next = next;
    }
}
