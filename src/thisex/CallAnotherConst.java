package thisex;

class Person{
	String name;
	int age;
	
	Person(){
	   this("�̸�����",1);	
	}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String argvs) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
	}
}
