package cwiczenia.model.interfaces;

public interface IKierunek {
	void addStudent(IStudent student);
	void deleteStudent(IStudent student);
	void setName(String name);
	void addWykladowca (IWyk�adowca wykladowca);
	void deleteWykladowca(IWyk�adowca wykladowca);
}
