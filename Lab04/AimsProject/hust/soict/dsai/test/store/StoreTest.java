package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
	    
	    Store myStore = new Store(5);

	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	    DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Science Fiction", 25.65f);
	    DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", 12.54f);
	    DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romantic", 15.25f);

	    myStore.addDVD(dvd1);
	    myStore.addDVD(dvd2);
	    myStore.addDVD(dvd3);
	    myStore.addDVD(dvd4);
	    myStore.addDVD(dvd5);
	    myStore.addDVD(dvd6);

	    System.out.println("Các mục trong cửa hàng:");
	    for (DigitalVideoDisc dvd : myStore.getItemsInStore()) {
	        if (dvd != null) {
	            System.out.println(dvd.toString());
	        }
	    }

	    myStore.removeDVD(1);

	    System.out.println("Các mục trong cửa hàng sau khi loại bỏ:");
	    for (DigitalVideoDisc dvd : myStore.getItemsInStore()) {
	        if (dvd != null) {
	            System.out.println(dvd.toString());
	        }
	    }
	}


}
