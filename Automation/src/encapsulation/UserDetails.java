package encapsulation;

public class UserDetails {
// right click source => generate getter setter=> select age =>generate.
        private int age;
		//private String Name;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age>0)
			this.age = age;
		}

		
		
}
