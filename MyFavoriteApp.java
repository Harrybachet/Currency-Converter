import java.util.Scanner;

public class MyFavoriteApp {
    public static void main(String[] args) {

        // Taking the amount input from the user //

        int amount;
        String currency;
        String convertCurrency;
        double formula = 0.0;

        // American to Other Currency //
        double americanDollarToEuroRate = 0.92;
        double americanDollarToNepaliRate = 132.96;
        double americanDollarToAustralianRate = 1.51;
        double americanDollarJapaneseRate = 156.99;
        double americanDollarToMexicanRate = 16.67;

        // Euro to Other Currency //
        double euroToAmericanRate = 1.08;
        double euroToNepaliRate = 144.20;
        double euroToAustralianRate = 1.64;
        double euroJapaneseRate = 170.26;
        double euroToMexicanRate = 18.07;

        // NepaliRupee to Other Currency //
        double nepaliRupeeToEuroRate = 0.0069;
        double nepaliRupeeToAmericanRate = 0.0075;
        double nepaliRupeeToAustralianRate = 0.011;
        double nepaliRupeeToJapaneseRate = 1.18;
        double nepaliRupeeToMexicanRate = 0.13;

        // Australian Dollar to Other Currency //
        double AustralianToEuroRate = 0.61;
        double AustralianToAmericanRate = 0.66;
        double AustralianToNepaliRupee = 88.11;
        double AustralianToJapaneseRate = 104.04;
        double AustralianToMexicanRate = 11.04;

        // Japanese Yen to Other Currency //
        double japaneseToEuroRate = 0.0059;
        double japaneseToAmericanRate = 0.0064;
        double japaneseToNepaliRate = 0.85;
        double japaneseToAustralianRate = 0.0096;
        double japaneseToMexicanRate = 0.11;

        // Mexican Peso to Other Currency //
        double mexicanToEuroRate = 0.055;
        double mexicanToAmericanRate = 0.060;
        double mexicanToNepaliRate = 7.95;
        double mexicanToAustralianRate = 0.090;
        double mexicanToJapaneseRate = 9.38;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount $: ");
        amount = scanner.nextInt();

        System.out.print("Enter the Currency of the amount you wrote, TYPE EXACTLY AS SHOWN: Dollars, Euros, Nepali Rupees, Australian Dollars, Mexican Pesos, Japanese Yen: ");
        currency = scanner.nextLine();
        currency = scanner.nextLine();

        System.out.print("Enter the Currency you want to convert it to, TYPE EXACTLY AS SHOWN: Dollars, Euros, Nepali Rupees, Australian Dollars, Mexican Pesos, Japanese Yen: ");
        convertCurrency = scanner.nextLine();


        // American Dollars to Other Currency Algorithm//

        if (currency.equals("Dollars") && convertCurrency.equalsIgnoreCase("Euros")) {
            formula = amount * americanDollarToEuroRate;
        } else if (currency.equals("Dollars") && convertCurrency.equalsIgnoreCase("Nepali Rupees")) {
            formula = amount * americanDollarToNepaliRate;
        } else if (currency.equals("Dollars") && convertCurrency.equalsIgnoreCase("Australian Dollars")) {
            formula = amount * americanDollarToAustralianRate;
        } else if (currency.equals("Dollars") && convertCurrency.equalsIgnoreCase("Japanese Yen")) {
            formula = amount * americanDollarJapaneseRate;
        } else if (currency.equals("Dollars") && convertCurrency.equalsIgnoreCase("Mexican Pesos")) {
            formula = amount * americanDollarToMexicanRate;
        }

        // Euros to Other currencies Algorithm //

        if (currency.equals("Euros") && convertCurrency.equalsIgnoreCase("Dollars")) {
            formula = amount * euroToAmericanRate;
        } else if (currency.equals("Euros") && convertCurrency.equalsIgnoreCase("Nepali Rupees")) {
            formula = amount * euroToNepaliRate;
        } else if (currency.equals("Euros") && convertCurrency.equalsIgnoreCase("Australian Dollars")) {
            formula = amount * euroToAustralianRate;
        } else if (currency.equals("Euros") && convertCurrency.equalsIgnoreCase("Mexican Pesos")) {
            formula = amount * euroToMexicanRate;
        } else if (currency.equals("Euros") && convertCurrency.equalsIgnoreCase("Japanese Yen")) {
            formula = amount * euroJapaneseRate;
        }

        // Nepali Rupees to Other Currency Algorithm //

        if (currency.equals("Nepali Rupees") && convertCurrency.equalsIgnoreCase("Dollars")) {
            formula = amount * nepaliRupeeToAmericanRate;
        } else if (currency.equals("Nepali Rupees") && convertCurrency.equalsIgnoreCase("Euros")) {
            formula = amount * nepaliRupeeToEuroRate;
        } else if (currency.equals("Nepali Rupees") && convertCurrency.equalsIgnoreCase("Australian Dollars")) {
            formula = amount * nepaliRupeeToAustralianRate;
        } else if (currency.equals("Nepali Rupees") && convertCurrency.equalsIgnoreCase("Mexican Pesos")) {
            formula = amount * nepaliRupeeToMexicanRate;
        } else if (currency.equals("Nepali Rupees") && convertCurrency.equalsIgnoreCase("Japanese Yen")) {
            formula = amount * nepaliRupeeToJapaneseRate;
        }

        // Australian Dollar to Other Currency Algorithm //

        if (currency.equals("Australian Dollars") && convertCurrency.equalsIgnoreCase("Dollars")) {
            formula = amount * AustralianToAmericanRate;
        } else if (currency.equals("Australian Dollars") && convertCurrency.equalsIgnoreCase("Euros")) {
            formula = amount * AustralianToEuroRate;
        } else if (currency.equals("Australian Dollars") && convertCurrency.equalsIgnoreCase("Nepali Rupees")) {
            formula = amount * AustralianToNepaliRupee;
        } else if (currency.equals("Australian Dollars") && convertCurrency.equalsIgnoreCase("Mexican Pesos")) {
            formula = amount * AustralianToMexicanRate;
        } else if (currency.equals("Australian Dollars") && convertCurrency.equalsIgnoreCase("Japanese Yen")) {
            formula = amount * AustralianToJapaneseRate;
        }

        // Japanese Yen to Other Currency Algorithm //

        if (currency.equals("Japanese Yen") && convertCurrency.equalsIgnoreCase("Dollars")) {
            formula = amount * japaneseToAmericanRate;
        } else if (currency.equals("Japanese Yen") && convertCurrency.equalsIgnoreCase("Euros")) {
            formula = amount * japaneseToEuroRate;
        } else if (currency.equals("Japanese Yen") && convertCurrency.equalsIgnoreCase("Nepali Rupees")) {
            formula = amount * japaneseToNepaliRate;
        } else if (currency.equals("Japanese Yen") && convertCurrency.equalsIgnoreCase("Mexican Pesos")) {
            formula = amount * japaneseToMexicanRate;
        } else if (currency.equals("Japanese Yen") && convertCurrency.equalsIgnoreCase("Australian Dollars")) {
            formula = amount * japaneseToAustralianRate;
        }

        // Mexican Peso to Other Currency Algorithm //

        if (currency.equals("Mexican Pesos") && convertCurrency.equalsIgnoreCase("Dollars")) {
            formula = amount * mexicanToAmericanRate;
        } else if (currency.equals("Mexican Pesos") && convertCurrency.equalsIgnoreCase("Euros")) {
            formula = amount * mexicanToEuroRate;
        } else if (currency.equals("Mexican Pesos") && convertCurrency.equalsIgnoreCase("Nepali Rupees")) {
            formula = amount * mexicanToNepaliRate;
        } else if (currency.equals("Mexican Pesos") && convertCurrency.equalsIgnoreCase("Japanese Yen")) {
            formula = amount * mexicanToJapaneseRate;
        } else if (currency.equals("Mexican Pesos") && convertCurrency.equalsIgnoreCase("Australian Dollars")) {
            formula = amount * mexicanToAustralianRate;
        }


        System.out.printf("Here is your converted currency: %.2f ", formula);
        System.out.print(convertCurrency);


        // Thoughts on the program //


        // In this Currency Converter project, I feel like I can do more with it and make it really powerful with some really huge data.
        // I could have used methods to split the codes, but I didn't want to use methods, I also could have used classes and objects to make my code neat and clean.
        // Maybe this program needs looping because I am using a lot of if statements, this program could be short if I used arrays, but it was getting complicated, so I dropped the idea
        // In the future, I would like to make this program with some new concepts such as Object oriented programming or Data Structures.


        // END //

    }
}


