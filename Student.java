public class Student {
String surname;
String firstName;
char middleInitial;
int dateOfBirth;
int studentNumber;
String studentEmailAddress;
Boolean iAmAwesome;

public void sayMyStudentNumber() {
    System.out.println( "My student number is" + studentNumber );
}

    public void sayMyEmailAddress() {
        System.out.println( "My email adress is" + studentEmailAddress );
    }

        public void amIAwesome() {
            System.out.println( "I believe I am Awesome " + iAmAwesome );
        }

}
