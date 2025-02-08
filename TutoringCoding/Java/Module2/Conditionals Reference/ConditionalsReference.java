class ConditionalsReference {
    public static void main(String[] args) {
    boolean Hello = true;

        if (Hello == true) {
            System.out.println("Hello");
        }
        else{ 
            System.out.println("Goodbye");
        }

        if (!Hello || 5 > 4) {
            System.out.println("math is fun");
        } else {
            System.out.println("math isn't real");
        }

        boolean isCold = false;
        boolean isRaining = true;

        if (isCold) { // equivalent to checking isCold == true
            System.out.println("Wear a sweater!");
            if (isRaining) {
                System.out.println("bring an umbrella");
            }
        } else if (!isRaining) { // logically equivalent to checking isRaining == false
            System.out.println("let's go to the beach!");
        } else {
            System.out.println("warm rain?");
        }
        if(isCold && isRaining){
            System.out.println("                                              ");
        }

    }
}