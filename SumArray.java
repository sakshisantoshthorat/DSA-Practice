package JavaPrograms;

public class SumArray {
//    static int sumArray(int[] arr,int n){
//        if(n==0) return arr[0];
//        return arr[n] + sumArray(arr,n-1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int sum = sumArray(arr, arr.length - 1);
//        System.out.println("Sum : " + sum);
//    }

    static int arr[] = {12,3,4,15};
    static int sum(){
        int sum = 0;
        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum : " + sum());
    }

    public static class AddComplexNums {
        int real , image;

        public AddComplexNums(int r, int i){
            this.real = r;
            this.image = i;
        }

        public  void show(){
            System.out.println(this.real + "+i" + this.image);
        }

        public static AddComplexNums add(AddComplexNums n1, AddComplexNums n2){
            AddComplexNums res = new AddComplexNums(0,0);
            res.real = n1.real + n2.real;
            res.image = n1.image + n2.image;
            return res;
        }

        public static void main(String[] args){
            AddComplexNums c1 = new AddComplexNums(4,5);
            AddComplexNums c2 = new AddComplexNums(10,5);

            System.out.println("First complex number : \n");
            c1.show();
            System.out.println("Second Complex number : ");
            c2.show();

            AddComplexNums res = add(c1,c2);
            System.out.println("Addotion is : ");
            res.show();
        }
    }
}
