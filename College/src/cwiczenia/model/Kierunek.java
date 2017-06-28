package cwiczenia.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cwiczenia.model.interfaces.IKierunek;
import cwiczenia.model.interfaces.IStudent;
import cwiczenia.model.interfaces.IWyk�adowca;

public class Kierunek implements IKierunek {
	private String name;
	private List<IStudent> studenci = new ArrayList<>();
	private List<IWyk�adowca> wykladowcy = new ArrayList<>();
	
	public Kierunek(String name, IStudent... studenci){
		this.name = name;
		Collections.addAll(this.studenci, studenci);
	}
		@Override
	    public String toString() {
	        String result = String.format("Group '%s' consists of:", name);
	        for (IStudent student : studenci)
	            result += "\n" + student;
	        result += "\nCollective learning hours of group= " + getLearningTimeOfGroup();
	        for (IWyk�adowca wykladowca : wykladowcy)
	            result += "\n" + wykladowca;
	        return result;
	}
	private int getLearningTimeOfGroup() {
		return studenci.stream().mapToInt(IStudent::getLearningTime).sum();
	}
	public void addStudent(IStudent student) {
        studenci.add(student);
    }
	public void deleteStudent(IStudent student) {
        studenci.remove(student);
    }
	public void setName(String name) {
        this.name = name;
    }
	public void addWykladowca (IWyk�adowca wykladowca){
		wykladowcy.add(wykladowca);
	}
	public void deleteWykladowca (IWyk�adowca wykladowca){
		wykladowcy.remove(wykladowca);
	}
}
