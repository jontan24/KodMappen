package ovningar;

public class Ovning46 {

		String name;
		int age;
		
	public String getName() {
			return name;
	}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
	}
		public class Parameters4 {
				public static void main(string[] args) {
					Person p = new Person();
					p.setName("Mats");
					p.setAge(29);
					
					System.out.println("1. " +p.getName() +" " + p.getAge());
					System.out.println("3. "+ p.getName() + " "+ p.getAge());
					
				}
				public static void change(Person p) {
					p.setName("Erdogan");
					p.setAge(35);
					System.out.println("2. "+p.getName()+ " "+ p.getAge());
					
				}
	}
	
