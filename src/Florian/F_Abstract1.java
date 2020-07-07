package Florian;

abstract class F_Abstract {

    abstract public void drink();


        public void drinks(){

            for(int x = 1; x < 4; x++){

                System.out.print(x + " ");
                drink();
                System.out.println();
            }
                System.out.println();
        }



}
