class Solution {

    public static String calc(String txt) {

        // Memisahkan string input ke dalam operand dan operator

        String[] parts = txt.split(" ");

        if (parts.length != 3) {

            throw new IllegalArgumentException("Input harus dalam format: 'operand1 operator operand2'");

        }

        String operand1 = parts[0];

        String operator = parts[1];

        String operand2 = parts[2];

        // Mengonversi titik ke angka

        int num1 = operand1.length();

        int num2 = operand2.length();

        int result;

        // Melakukan operasi berdasarkan operator

        switch (operator) {

            case "+":

                result = num1 + num2;

                break;

            case "-":

                result = num1 - num2;

                break;

            case "*":

                result = num1 * num2;

                break;

            case "//":

                if (num2 == 0) {

                    throw new IllegalArgumentException("Pembagian dengan nol tidak diizinkan");

                }

                result = num1 / num2;

                break;

            default:

                throw new IllegalArgumentException("Operator tidak valid. Gunakan '+', '-', '*', atau '//'");

        }

        // Mengonversi hasil ke string titik, jika hasil 0 maka mengembalikan string kosong

        return ".".repeat(result);

    }

    public static void main(String[] args) {

        // Contoh penggunaan

        System.out.println(calc("..... + ..............."));  // Output: "...................."

        System.out.println(calc("..... - ..."));             // Output: ".."

        System.out.println(calc("..... - ."));               // Output: "...."

        System.out.println(calc("..... * ..."));             // Output: "..............."

        System.out.println(calc("..... * .."));              // Output: ".........."

        System.out.println(calc("..... // .."));             // Output: ".."

        System.out.println(calc("..... // ."));              // Output: "....."

        System.out.println(calc(". // .."));                 // Output: ""

        System.out.println(calc(".. - .."));                 // Output: ""

    }

}