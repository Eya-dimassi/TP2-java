package segment;
import java.util.Scanner;

public class test_date {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Madate d1= new Madate(10,4,2005);
		Madate d2= new Madate(6,7,2023);
		Madate d3=new Madate(30,7,2024);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		d1.setmois(9);
		d2.setjours(15);
		d3.setannée(2004);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("Vous devez choisir un operation :"
				+ "\n1-Ajout d'un jour "
				+ "\n2-Ajout de pusieurs jours"
				+ "\n3-Ajout d'un mois"
				+ "\n4-Ajout d'un année");
		int x=s.nextInt();
		switch(x) {
		case 1:
			d3.ajouterUnJour();
			System.out.println(d3);
			
			break;
		case 2:
			d3.ajouterPluseursJours(5);
			System.out.println(d3);
			
			break;
		case 3:
			d3.ajouterUnMois();
			System.out.println(d3);
			
			break;
		case 4:
			d3.ajouterUnAn();
			System.out.println(d3);
			
            break;
		}

		
		
	}

}
