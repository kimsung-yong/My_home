package chapter5ex;

public class PersonJameson {
	private int personAge;
	private String name;
	private boolean married;
	private int childrunNum;
	private String marriedTemp;
	
	public PersonJameson() {
		marriedTest();
	}
	
	public PersonJameson(int personAge,String name, boolean married, int childrunNum ) {
		this.personAge = personAge;
		this.name = name;
		this.married = married;
		this.childrunNum = childrunNum;
		marriedTest();
	}
	
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getChildrunNum() {
		return childrunNum;
	}
	public void setChildrunNum(int childrunNum) {
		this.childrunNum = childrunNum;
	}
	
	public void showInfo() {
		System.out.println(name + "���� ���̴�" + personAge + "�̸� ��ȥ�� " + marriedTemp + "�̸�, " + "�ڳ��� ���ڴ�" + childrunNum + "�� �Դϴ�");
	}
	
	public void marriedTest() {
		if(married == true) {
			this.marriedTemp = "����";
		}
		else this.marriedTemp = "������";
	}
	
	
}
