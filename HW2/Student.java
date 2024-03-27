import java.util.ArrayList;

public class Student implements Comparable<Student> {

		private int studentID;
		private String firstName;
		private String lastName;
		private double gpa;
		private ArrayList<Student> studentArray;

		public Student(String first, String last, int id, double gpa) {
				this.firstName = first;
				this.lastName = last;
				this.studentID = id;
				this.gpa = gpa;
				this.studentArray = new ArrayList<Student>();
		}

		public String getFirstName() {
				return this.firstName;
		}

		public String getLastName() {
				return this.lastName;
		}

		public int getID() {
				return this.studentID;
		}

		public double getGPA() {
				return this.gpa;
		}

		@Override
		public boolean equals(Object other) {
			if (other instanceof Student) {
				Student o = (Student)other;
				if (o.getFirstName().equals(firstName) &&
					o.getLastName().equals(lastName) &&
					o.getID() == studentID &&
					Math.abs(o.getGPA() - gpa) < 0.005 )
						return true;
			}
			return false;

		}

		@Override
		public int compareTo(Student other) {
			return this.studentID - other.getID();
		}

		public static int singleDigitMultiply(final int i1, final int i2){
			// base case
			if (i1 == 0 || i2 == 0){
				return 0;
			} else { // add multiplier 1
				return i1 + (singleDigitMultiply(i1, i2 - 1)); 
			}
		}

		public static Student findMinimum(final ArrayList<Student> studentArray){
			if (studentArray.isEmpty()) 
				throw new IndexOutOfBoundsException("There are no students.");
			
			Student minimum = studentArray.get(0);

			for (int i = 1; i < studentArray.size(); i++){
				Student other = studentArray.get(i);
				if (other.compareTo(minimum) < 0) {
					minimum = other;
				}
			}

			return minimum;

		}

		private static Student minimum(Student s1, Student s2){
			if (s1.compareTo(s2) < 0){
				return s1;
			} else return s2;
		}

} // end class
