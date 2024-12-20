package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.*;

public class CartTest {
	public static void main(String[] args) {
        
        Cart cart = new Cart();
        
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Science Fiction", 25.65f);
        cart.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", 12.54f);
        cart.addDigitalVideoDisc(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romantic", 15.25f);
        cart.addDigitalVideoDisc(dvd6);

    
        cart.printCart();

        
        cart.searchByID(1);
        cart.searchByID(3);

        
        cart.searchByTitle("the matrix");
        cart.searchByTitle("titanic");

    }
	

}
