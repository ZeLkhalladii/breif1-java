package Tarif;
import java.util.Scanner;


public class tarif {

	 String nom,PreNom;
	 
		int NHeure,Tarif;

		static int Textra;

		static int NvH;

		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner typs = new Scanner(System.in);
	    System.out.println("    Bienvenue dans votre entreprise");
	    System.out.println("               ** :) **"+"\n");

	    System.out.println("-- Quel est votre nom ?");
	    String nom = typs.next();
	    
	    System.out.println("-- Quel est votre prénom ?");
	    String Prenom = typs.next();
	    
			System.out.println("  ~~Bienvenu "+ nom+" " + Prenom +"~~");
			
			System.out.println("--> Entrez votre Nombre d'heure de travaillées :");
			int NHeure = typs.nextInt();
			
			
	if(NHeure<=60 ) {
		
		System.out.println("--> Entrer le tarif par heure :");
		int Tarif = typs.nextInt();
		
	if(NHeure>=40) {
		
		Textra = (int) (Tarif +(0.5*Tarif));
		
		System.out.println("¤ votre salaire est : "+Textra+"MAD");
		
		NvH = NHeure - 40;
		
		Textra = (int) ((NHeure*Tarif) + 0.5*(NvH*Tarif)); 
		
		System.out.println("¤ votre indemnisation est : " +40 * Tarif + " MAD");
		
		System.out.println("¤ votre Tarif Extra est : " + Textra + " MAD");

		System.out.println("¤ votre plus heure  est : " +NvH +"heure");

	}else {
		System.out.println("votre indemnisation est  " + NHeure *Tarif+ " MAD");

	}
	
	}else{
			
			System.out.println("information erronés ");

		}
		
	typs.close();
	}
  }
