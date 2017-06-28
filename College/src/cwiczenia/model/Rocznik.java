package cwiczenia.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cwiczenia.model.interfaces.IStudent;

public class Rocznik {
		private String name;
		private List<IStudent> studenci = new ArrayList<>();
		public Rocznik(String name, IStudent... studenci){
			this.name = name;
			Collections.addAll(this.studenci, studenci);
		}
			@Override
		    public String toString() {
		        String result = String.format("Group '%s' consists of:", name);
		        for (IStudent student : studenci)
		            result += "\n" + student;
		        result += "\nEfektywnosc zespolu = " + getLearningTimeOfGroup();
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
		
}