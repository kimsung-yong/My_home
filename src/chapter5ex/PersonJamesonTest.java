package chapter5ex;

public class PersonJamesonTest {
	
	public static void main(String[] argvs) {
	PersonJameson jameson = new PersonJameson();
	jameson.setPersonAge(34);
	jameson.setName("ȫ�浿");
	jameson.setMarried(true);
	jameson.setChildrunNum(3);
	System.out.println(jameson.isMarried());
	jameson.showInfo();
	
	PersonJameson lee = new PersonJameson(25,"�̼���",false,0);
	lee.showInfo();
}
	
}
