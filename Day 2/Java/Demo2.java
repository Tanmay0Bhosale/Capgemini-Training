class Demo2
{
    public static void main(String[] args) {
        int num1 = 1;
        int num2 =2;
        int result = num1 + num2; // arithematic operators +,,-,*,/,%
        System.out.println(result);

        if(num1<5) //conditional statements
        {
            System.out.println("num1 is less than 5");
        }
        else if(num1 > 5)
        {
            System.out.println("num1 is greater than 5");
        }
        else{
            System.out.println("bye");
        }


        int i =0;
        int z =0;
        while(i<0){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(z);
            z++;
        }while(z<5);
        
        for(int j =0; j<5; j++)
        {
            System.out.println(j);
        }

        int ternary = num1>0?10:5;
        System.out.println(ternary);

        switch(num1)
        {
            case 1: 
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;
        }
    }
}