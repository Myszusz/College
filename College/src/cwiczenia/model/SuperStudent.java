package cwiczenia.model;

public class SuperStudent extends Student {
	private static final int SUPER_LEARNING_TIME = 2;
	
	public SuperStudent(String firstname, String surname, int age, String topic, int mark){
		super(firstname, surname, age, topic, mark);
	}
	@Override
	public int getLearningTime() {
		return super.getLearningTime() * SUPER_LEARNING_TIME;
	}
}
