package com.javapractice.javacollection;

public class IteratorPractice {
	/*
	 * Java iterator is an interface belongs to collection framework allow us to
	 * traverse the collection and access the data element of collection without
	 * bothering the user about specific implementation of that collection it.
	 * Basically List and set collection provides the iterator. You can get
	 * Iterator from ArrayList, LinkedList, and TreeSet etc. Map implementation
	 * such as HashMap doesn’t provide Iterator directory but you can get there
	 * keySet or Value Set and can iterator through that collection.
	 * 
	 * Iterator in Java is nothing but a traversing object, made specifically
	 * for Collection objects like List and Set.
	 * 
	 */

	/*
	 * Syntax: It comes inside java.util package. as public interface Iterator
	 * and contains three methods:
	 * 
	 * boolean hasNext(): this method returns true if this Iterator has more
	 * element to iterate.
	 * 
	 * Object next(): return the next element in the collection until the
	 * hasNext() method return true. Its always recommended to call hasNext()
	 * method before calling next() method to avoid
	 * java.util.NoSuchElementException: Hashtable Iterator
	 * 
	 * remove(): method remove the last element return by the iterator this
	 * method only calls once per call to next().
	 * 
	 */

	/*
	 * Why use Iterator when we have Enumerator: Both Iterator and Enumerator is
	 * used for traversing of collection but Iterator is more enhanced in terms
	 * of extra method remove () it provide us for modify the collection which
	 * is not available in enumeration along with that it is more secure it
	 * doesn’t allow another thread to modify the collection when some another
	 * thread is iterating the collection and throws
	 * concurrentModificationException. Along with this method name are also
	 * very convenient in Iterator which is not major difference but make use of
	 * iterator more easy.
	 * 
	 * Enumeration is also a legacy class and not all Collection supports it
	 * e.g. Vector supports Enumeration but ArrayList doesn't. On the other hand
	 * Iterator is the standard class for iteration and traversal.
	 * 
	 * Enumeration acts as Read-only interface, because it has the methods only
	 * to traverse and fetch the objects, where as by using Iterator we can
	 * manipulate the objects like adding and removing the objects from
	 * collection e.g. Arraylist.
	 * 
	 * Enumeration: hasMoreElement() nextElement() N/A
	 * 
	 * 
	 * Iterator: hasNext() next() remove()
	 * 
	 * So Enumeration is used when ever we want to make Collection objects as
	 * Read-only.
	 * 
	 * 
	 * 
	 * What is List Iterator in Java? ListIterator in Java is an Iterator which
	 * allows user to traverse Collection like ArrayList and HashSet in both
	 * direction by using method previous() and next (). You can obtain
	 * ListIterator from all List implementation including ArrayList and
	 * LinkedList. ListIterator doesn’t keep current index and its current
	 * position is determined by call to next() or previous() based on direction
	 * of traversing.
	 * 
	 * 
	 * 
	 */

}
