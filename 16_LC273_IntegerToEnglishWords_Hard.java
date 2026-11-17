
class Solution {

    String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String convert(int num) {
        if (num == 0) {
            return "";
        }

        if (num < 20) {
            return below20[num];
        }

        if (num < 100) {
            return tens[num / 10] +
                (num % 10 != 0 ? " " + convert(num % 10) : "");
        }

        return below20[num / 100] + " Hundred" +
            (num % 100 != 0 ? " " + convert(num % 100) : "");
    }

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String result = "";

        int billion = num / 1000000000;
        int million = (num / 1000000) % 1000;
        int thousand = (num / 1000) % 1000;
        int remainder = num % 1000;

        if (billion != 0) {
            result += convert(billion) + " Billion";
        }

        if (million != 0) {
            result += (result.isEmpty() ? "" : " ")
                    + convert(million) + " Million";
        }

        if (thousand != 0) {
            result += (result.isEmpty() ? "" : " ")
                    + convert(thousand) + " Thousand";
        }

        if (remainder != 0) {
            result += (result.isEmpty() ? "" : " ")
                    + convert(remainder);
        }

        return result;
    }
}
