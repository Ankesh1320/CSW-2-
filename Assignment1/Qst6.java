// Develop a Java-based College Management System to model the relationship between 
// colleges and students. Create a College class with attributes collegeName and
// collegeLoc, and a Student class with studentId, studentName, and a reference to a
// College object. Implement a constructor in Student to initialize these attributes and a
// displayStudentInfo() method to print student and college details. In the MainApp
class College{
    private String collegeName; 
    private String collegeLoc;
    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
     public String getCollegeName() {
       return collegeName;
        }
     public String getCollegeLoc() {
        return collegeLoc;
        }
                }
class Student {
    private int studentId;
    private String studentName;
    private College college;
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
        }
        public int getStudentId() {
            return studentId;
            }
            public String getStudentName() {
                return studentName;
                }
                public College getCollege() {
                    return college;
                }
                public void displayStudentInfo() {
                    System.out.println("Student ID: " + studentId);
                    System.out.println("Student Name: " + studentName);
                    System.out.println("College Name: " + college.getCollegeName());
                    System.out.println("College Location: " + college.getCollegeLoc());
                    }
                    }




public class Qst6 {

    public static void main(String[] args) {
    
        College college = new College("ABC College", "New York");
        Student student = new Student(1, "John Doe", college);
        student.displayStudentInfo();
        
    }
}
