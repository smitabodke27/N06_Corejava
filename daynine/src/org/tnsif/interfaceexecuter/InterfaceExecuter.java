package org.tnsif.interfaceexecuter;
//driver class
public class InterfaceExecuter {

	public static void main(String[] args) {
		//we cant instantiate an interface
		//Sony s=new Sony();
		SonySub s1=new SonySub();
		s1.display();
		s1.show();
		Sony.accept();
		
		ISRO i=new ISRO();
		i.status();
		
		Human h=new Human();
		h.showDrink();
	}

}
