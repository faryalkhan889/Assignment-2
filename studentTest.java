import java.lang.String;
import java.util.Scanner;
import java.util.regex.Pattern;

public class studentTest<Class_st> {
    public static void main(String[] args) {
        System.out.println("Student Details, Department of ILT");
        System.out.println("Enter number of students:");
        Scanner in = new Scanner(System.in);
        int numSt = in.nextInt();
        student[] so = new student[numSt];

        //create num stud
        for (int n = 0; n < numSt; n++) {
            so[n] = new student();
            so[n].getinfo();
            System.out.println(so[n].displayinfo());
            System.out.println("Number of Students:" + student.incremeC());
            so[n].displayinfo();
            String iemail = so[n].getEmail();
        }
    }


    private static boolean isValid(String iemail) {
        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pat = Pattern.compile(emailRegex);
        return iemail.matches(regex);

    }
}












