import java.util.Scanner;
import java.util.regex.Pattern;
public class student {
    private static String firstname;
    private static String lastname;
    private static String email;
    private static  String studentId;
    private static String Class_st;
    private static int H_n;
     private static String address;
     private static String city;
     private static String state;
     private static int Zi;
    private int Num;
    public static int scount;
    private static String Freshman;
    private static String Sophomore;
    private static String Junior;
    private static String Senior;



    public static void getinfo(){
       Scanner il= new Scanner(System.in);
       System.out.println("Enter your first name");
       firstname = il.nextLine();
       System.out.println("Enter your last name");
       lastname = il.nextLine();
       System.out.println("Enter your class standing(type either of these 4 options only: freshman,sophomore, junior,senior");
       String c= Class_st;
       String freshman= Freshman;
       String sophomore= Sophomore;
       String junior= Junior;
       String senior= Senior;
       c=il.nextLine();
       if(c==freshman){
           System.out.println("Freshman");
       }
       else if (c==sophomore){
           System.out.println("Sophomore");

       }
       else if (c==junior){
           System.out.println("Junior");

       }
       else if (c==senior) {
           System.out.println("Senior");

       }

       System.out.println("Enter your Peoplesoft id");
       String s=studentId;
       s= il.nextLine();
       if(s.length()<7||s.length()>7) {
           System.out.println("Invalid Id");
           System.exit(0);
       }
       System.out.println("Enter your House number ");
      H_n = il.nextInt();
       address = il.nextLine();
       System.out.println("Enter your street");
     address = il.nextLine();
       System.out.println("Enter city");
       city = il.nextLine();
       System.out.println("Enter State: AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, GA, HI, IA, ID, IL, IN, KS, KY, LA, MA, MD, ME, MI, MN,MO, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VA, VT, WA, WI, WV, WY");
     state = il.nextLine();
       System.out.println("Enter Zip code");
       Zi = il.nextInt();
       email = il.nextLine();
       System.out.println("Enter Email:");
       email = il.nextLine();

   }

    private void setZi(){
        Zi++;
        for(int i=0;i<=5;i++){
            i=i+Zi;
            this.Zi=Zi;
        }
    }

    public void setH_n(int h_n) {
        H_n = h_n;
    }

    public void setAddress(String c){
        address=c;
    }
    public void setCity(String d){
        city=d;
    }
    public void setState(String e){
        state=e;
    }
    public void setEmail(){
        this.email=email;

    }

    public void setClass_st(String class_st) {

        Class_st = class_st;
    }

    public int getH_n() {
        return H_n;
    }

    public String getClass_st() {
        return Class_st;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;

    }
    public String getCity(){
        return city;
    }

    public int getZi() {
        return Zi;
    }

    public String getState() {
        return state;
    }
    public String displayinfo(){
        return "Student id"+" "+ studentId+ "\n"+"first name" + firstname+ "\n"+"lastname:"+ " "+ lastname+ "\n"+"address:"+H_n+" "+address+ "\n"+"city:"+" "+city+"\n"+"State:"+" "+state+"\n"+"Zip code:"+Zi+"\n"+"Email:"+" "+email;
    }

    public String getEmail() {
       Scanner po= new Scanner (System.in);
        String emailRegex ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pat = Pattern.compile(emailRegex);
        return emailRegex;
    }
    public static int incremeC(){
       scount=scount+1;
       return(scount);
    }


}



