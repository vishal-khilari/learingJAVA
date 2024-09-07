import java.util.Arrays;

class  practice{
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 96;
        marks[1] = 98;
        marks[2] = 90;
        System.out.println(marks[0]); //before assending order
        Arrays.sort(marks);  //makes assending order
        System.out.println(marks.length);
        System.out.println(marks[0]); //after assending order
    }
}