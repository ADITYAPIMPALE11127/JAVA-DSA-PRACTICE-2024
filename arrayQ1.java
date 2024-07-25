public class arrayQ1 {

    public static void main(String args[]){

        // Array syntax:  type arrayName[] = new type[size];

        int  marks[] = new int[3];
        marks [0] = 60;
        marks [1] = 40;
        marks [2] = 90;

//        System.out.println(marks[1]);
//        System.out.print(marks[2]);

        for (int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }
}
