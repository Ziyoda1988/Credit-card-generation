class Main {
  public static void main(String[] args) {
    

// create your method her
        System.out.println("American Express:" + getRandomCreditCardNo(1));
        System.out.println("Visa: " + getRandomCreditCardNo(2));
        System.out.println("Master Card: " + getRandomCreditCardNo(3));
        System.out.println("Discover: " + getRandomCreditCardNo(4));
    }
    public static String getRandomCreditCardNo(int number) {
// implement the method here
        if (number == 1) {
            String AmExps = "3";
            AmExps = AmExps + (int) (Math.random() * 10); //35
            AmExps = AmExps + (int) (Math.random() * 10);//352
            AmExps = AmExps + (int) (Math.random() * 10);//3529
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            AmExps = AmExps + (int) (Math.random() * 10);
            return AmExps;
        }
        if (number == 2) {
            String visa = "4";
            visa = visa + (int) (Math.random() * 10); //35
            visa = visa + (int) (Math.random() * 10);//352
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            visa = visa + (int) (Math.random() * 10);
            return visa;
        }
        if (number == 3) {
            String mastercard = "5";
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            mastercard = mastercard + (int) (Math.random() * 10);
            return mastercard;
        }
        if (number == 4) {
            String discover = "6";
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            discover = discover + (int) (Math.random() * 10);
            return discover;
        }
        return "";
    }
} 