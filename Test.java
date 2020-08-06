
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		
		p1.age = 20;
		
		p1.setAge(10);
		
		p1.name= "홍길동";
			
		p1.introduce();
		
	}

}
// 캡슐화
class Person {
	
	int age;
	String name;
	
	public void introduce() {
		System.out.println(age + "살" + name + "입니다");
	}
	
	public void setAge(int age) {
		
		if(age < 0) {
			System.out.println("나이는 음수가 될 수 없습니다.");
			this.age = 0;
			return;
		}
		
		this.age = age;
	}
	
}