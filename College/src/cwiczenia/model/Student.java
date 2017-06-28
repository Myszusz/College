package cwiczenia.model;

import cwiczenia.model.interfaces.IStudent;

public class Student extends Osoba implements IStudent {
	private static final int AVERAGE_LEARNING_HOURS_PER_DAY = 4;
	private String topic;
	private Integer mark;
	
	public Student(String firstname, String surname, int age, String topic, int mark){
		
		super(firstname, surname, age);
		this.topic = topic;
		this.mark = mark;
	}
	
	public int getLearningTime(){
		return AVERAGE_LEARNING_HOURS_PER_DAY;
	}
	public int getMark(){
		return mark;
	}
	@Override
	public String toString(){
		return super.toString() + ", topic: " + topic + ", mark from main class: " + mark;
	}
	@Override
	public void sayYourName(){
		super.sayYourName();
		System.out.println(", I study:" + topic + ", mark form my main class is: " + mark);
	}
}
