public class App {
    public static void main(String[] args) throws Exception {
    
    Student Me = new Student ();

    Me.surname = "Allado";
    Me.firstName = "Abigail";
    Me.middleInitial = 'A';
    Me.dateOfBirth = 3/27/2002;
    Me.studentNumber = 2020101713;
    Me.studentEmailAddress = "alladoa@students.national-u.edu.ph";
    Me.iAmAwesome = true;
   
    Me.sayMyStudentNumber();
    Me.sayMyEmailAddress();
    Me.amIAwesome();

    }
}
