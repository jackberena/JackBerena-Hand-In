public class encryption {
    public static void main(String [] args){
        int key= 1;

        String text ="Hello World";
        System.out.println(text);
        char [] chars = text.toCharArray();

         for (char a : chars){
            a += key;

            System.out.print(a);}
         //replace "Hello world" with Ifmmp!Xpsme
        //change a+= key to a-= key in order to decrypt the code





    }


    }
