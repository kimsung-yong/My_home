package thisex;

class Person1{
	String name;
	int age;
	
	Person1(){
	   this("�̸�����",1);	
	}
	
	Person1(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	Person1 returnItSelf() {
		return this;
	}
}

public class CallAnotherCont {

	public static void main(String[] argvs) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person1 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		System.out.println(noName);
		
	}
}
