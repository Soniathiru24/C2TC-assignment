package entityclassassignment1;
import java.util.Scanner;
public class student {
	
		private int studentId;
		private String studentName;
		private String studentCity;
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentCity() {
			return studentCity;
		}
		public void setStudentCity(String studentCity) {
			this.studentCity = studentCity;
		}
		@Override
		public String toString() {
			return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
					+ "]";
		}
		
		
	}


