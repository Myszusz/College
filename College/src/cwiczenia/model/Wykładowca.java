package cwiczenia.model;

import cwiczenia.model.interfaces.IWyk�adowca;

public class Wyk�adowca extends Osoba implements IWyk�adowca{
		private static final int AVERAGE_TEACHING_HOURS_PER_DAY = 10;
		private String topic;
		
		public Wyk�adowca(String firstname, String surname, int age, String topic){
			
			super(firstname, surname, age);
			this.topic = topic;
		}
		public int getTeachingTime(){
			return AVERAGE_TEACHING_HOURS_PER_DAY;
		}
		@Override
		public String toString(){
			return super.toString() + ", topic:" + topic;
		}
		@Override
		public void sayYourName(){
			super.sayYourName();
			System.out.println(", I teach:" + topic);
			
			
		}
}
