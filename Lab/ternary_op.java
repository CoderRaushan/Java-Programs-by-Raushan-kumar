public class ternary_op 
{
    int marks=98;
    String grade;
    String print_ternary()
    {
        // if(marks >= 90) 
        // {
        //  return grade = "A";
        // } 
        // else if(marks >= 80) 
        // {
        //     return grade = "B";
        // } 
        // else 
        // {
        //  return grade = "C";
        // }

        return (marks>=90?"A":marks>=80?"B":"C");
    }
    public static void main(String[] args) 
    {
        ternary_op obj=new ternary_op();
        System.out.println(obj.print_ternary());
    }
}
