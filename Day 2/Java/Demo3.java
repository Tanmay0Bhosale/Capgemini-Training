class Demo3
{
    class Keyboard
    {
        int keys;
        String name;
        public void type()
        {
            System.out.println("Typing!");
        }
    }
    class advKeyboard extends Keyboard
    {
        public void throwIt()
        {
            System.out.println("Throw it");
        }
    }
    public static void main(String[] args) {
        Keyboard obj;
        obj = new Keyboard();
    }
}