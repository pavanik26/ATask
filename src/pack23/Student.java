package pack23;



public class Student {
	
	private String name; // Private variable to store the name

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
   
    public int age(int teacherYears) {
        return teacherYears; // Return the age of the teacher
    }
    
    public int age(int studentYears, boolean isStudent) {
        return studentYears; // Return the age of the student
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Student student = new Student();
		student.setName("Alice"); // Set the student's name
        System.out.println("Student's Name: " + student.getName());
        
        int teacherAge = student.age(30); // Age of the teacher
        int studentAge = student.age(15, true); // Age of the student

        System.out.println("Teacher's Age: " + teacherAge); // Output: Teacher's Age: 30
        System.out.println("Student's Age: " + studentAge); //

	}

}
