public class decToBin {
    public static void main(String[] args) {
        Converter converter = new Converter();
        int result = converter.toDecimal(1000);
        System.out.println(result);
    }
}

class Converter {
    int toDecimal(int binary) {
        int result = 0;
        int index = 0;

        while (binary != 0) {
            int lastDigit = binary % 10;
            result = result + (int) Math.pow(2, index) * lastDigit;
            binary /= 10;
            index += 1;
        }
        return result;
    }
}

// inorder to change binary to decimal we need