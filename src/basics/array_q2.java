public class array_q2 {
    public static void main(String[] args) {
        //question2 --whether a int is there or not in array
        int [] marks = {45, 67,63,99,15};
        float num = 15;
        boolean isInArray=false;
        for (float i:marks){
            if (num==i){
                isInArray=true;
                break;

            }
        }
        if (isInArray){
            System.out.println("This is present in array");
        }
        else {
            System.out.println("This is not present in array");
        }
    }
}
