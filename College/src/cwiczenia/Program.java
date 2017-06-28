package cwiczenia;

import cwiczenia.model.Dziekanat;
import cwiczenia.model.Kierunek;
import cwiczenia.model.Osoba;
import cwiczenia.model.Student;
import cwiczenia.model.SuperStudent;
import cwiczenia.model.Wyk³adowca;
import cwiczenia.model.interfaces.IKierunek;


public class Program {
		public static void main(String[] args){
			Student student1 = new Student ("Jan", "Kowalski", 20, "Chemistry", 5);
			Student student2 = new Student ("Mariusz", "Zieliñski", 22, "Biology", 3);
			Student student3 = new Student ("Ewelina", "Krawczyk", 20, "Biology", 4);
			Student student4 = new Student ("Marek", "123", 22, "Biology", 5);
			Student student5 = new SuperStudent ("Magda", "321", 20, "Biology", 3);
			Student student6 = new Student ("Wojtek", "948", 22, "Chemistry", 4);
			Wyk³adowca wykladowca1 = new Wyk³adowca ("Marian", "Krawiec", 45, " Chemistry");
			Wyk³adowca wykladowca2 = new Wyk³adowca ("Jan", "Florek", 58, " Biology");
			
			System.out.println("Everybody in university:");
			System.out.println(student1);
			System.out.println(student2);
			System.out.println(student3);
			System.out.println(wykladowca1);
			System.out.println(wykladowca2);
			
			System.out.println("\n\nWe created student group...");
	        IKierunek bio = new Kierunek("Chemistry", student3, student2);
	        System.out.println(bio);

	        System.out.println("\n\nWe added a new student...");
	        bio.addStudent(student4);
	        System.out.println(bio);

	        System.out.println("\n\nOne of students left...");
	        bio.deleteStudent(student2);
	        System.out.println(bio);

	        System.out.println("\n\nWe added super student...");
	        System.out.println("We're changing name of group...");
	        bio.addStudent(student5);
	        bio.setName("People on Biology");
	        System.out.println(bio);
	        
	        System.out.println("\nWe're adding teacher of the group...");
	        bio.addWykladowca(wykladowca2);
	        System.out.println(bio);
	        
	        System.out.println("\n\nGroup of students from Chemistry...");
	        IKierunek chem = new Kierunek("Chemistry", student1, student6);
	        System.out.println(chem);
	        
	        System.out.println("Statistics...");
		}
}
