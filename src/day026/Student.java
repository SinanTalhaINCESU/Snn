package day026;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public int[] grades;

    public void showInfo(){
        System.out.printf("%s %s [%d]",firstName,lastName,age);
    }

    public double getGPA(){
        double sum=0;
        for (int i = 0; i < grades.length; i++) {
            sum+=grades[i];
        }
        double avg = sum/ grades.length;
        return avg;
    }



    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();

        st1.firstName="Musa";
        st1.lastName="Cambaz";
        st1.age=23;
        st1.grades=new int[]{40,80};

        st2.firstName="İsa";
        st2.lastName="Doruk";
        st2.age=27;
        st2.grades=new int[]{50,90};


        if (st1.getGPA()> st2.getGPA()){
            st1.showInfo();
        }else {
            st2.showInfo();
        }
    }
}
