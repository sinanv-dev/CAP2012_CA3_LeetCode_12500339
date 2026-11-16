
class Solution {
public:
    string below20[20] = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };

    string tens[10] = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    string convert(int num) {
        if (num == 0) return "";

        if (num < 20) return below20[num];

        if (num < 100) {
            return tens[num / 10] +
                (num % 10 ? " " + convert(num % 10) : "");
        }

        return below20[num / 100] + " Hundred" +
            (num % 100 ? " " + convert(num % 100) : "");
    }

    string numberToWords(int num) {
        if (num == 0) return "Zero";

        string result = "";

        int billion = num / 1000000000;
        int million = (num / 1000000) % 1000;
        int thousand = (num / 1000) % 1000;
        int remainder = num % 1000;

        if (billion) result += convert(billion) + " Billion";
        if (million) result += (result.empty() ? "" : " ") + convert(million) + " Million";
        if (thousand) result += (result.empty() ? "" : " ") + convert(thousand) + " Thousand";
        if (remainder) result += (result.empty() ? "" : " ") + convert(remainder);

        return result;
    }
};
