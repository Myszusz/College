package cwiczenia.model;

public class Osoba {
	private String firstname;
	private String surname;
	private Integer age;
	
	public Osoba(String firstname, String surname, Integer age){
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return firstname + " " + surname + ", age: " + age;
	}
	
	public void sayYourName(){
		System.out.print(String.format("My name is %s %s and I'm %d", firstname, surname, age));
	}
	public String getFirstName() {
        return firstname;
    }

    public void setImie(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (firstname != null ? !firstname.equals(osoba.firstname) : osoba.firstname != null) return false;
        if (surname != null ? !surname.equals(osoba.surname) : osoba.surname != null) return false;
        return age != null ? age.equals(osoba.age) : osoba.age == null;
    }
}
