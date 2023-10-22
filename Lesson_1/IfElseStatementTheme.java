public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        boolean maleGender = true; 
        if (!maleGender) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        int age = 16;
        if (age > 18) {
            System.out.println("Совершеннолетний(-яя)");
        } else {
            System.out.println("Несовершеннолетний(-яя)");
        }

        float height = 1.9f;
        if (height < 1.8) {
            System.out.println("Рост: средний");
        } else {
            System.out.println("Рост: высокий");
        }

        char firstLetterName = "Andrey".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на букву M");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на букву I");
        } else {
            System.out.println("Имя начинается ни с буквы M, ни с буквы I" + "\n");
        }

        System.out.println("2. Поиск большего числа\n");
        int a = 56;
        int b = 68;
        if (a == b) {
            System.out.println("Число " + a + " равно числу " + b);
        } else if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else {
            System.out.println("Число " + b + " больше числа " + a +"\n");
        }

        System.out.println("3. Проверка числа\n");
        int number = -120;
        if (number == 0) {
            System.out.println("Число равно 0");
        } else {
            if (number < 0) {
                System.out.print("Число " + number + " является отрицательным и ");
            } else{
                System.out.print("Число " + number + " является положительным и ");
            }
            if (number % 2 == 0) {
                System.out.print("четным\n");
            } else {
                System.out.print("нечетным\n");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int number1 = 546;
        int number2 = 223;
        int hundreds1 = number1 / 100;
        int hundreds2 = number2 / 100;
        int tens1 = (number1 % 100) / 10;
        int tens2 = (number2 % 100) / 10;
        int ones1 = number1 % 10;
        int ones2 = number2 % 10;
        boolean equalNumbers = (hundreds1 != hundreds2) && (tens1 != tens2) && (ones1 != ones2);
        System.out.println("Исходные числа " + number1 + " и " + number2);
        if (equalNumbers) {
            System.out.println("Равных цифр в разрядах нет");
        } else {
            System.out.println("В числах одинаковые цифры: ");
            if (hundreds1 == hundreds2) {
                System.out.println(hundreds1 + " в разряде сотен");
            }
            if (tens1 == tens2) {
                System.out.println(tens1 + " в разряде десяток");
            }
            if (ones1 == ones2) {
                System.out.println(ones1 + " в разряде единиц");
            }
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char symbol = '\u0057';
        System.out.print("Символ " + symbol + " является ");
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькой буквой");
        } else if (symbol >= 'A' && symbol <= 'Z'){
            System.out.println("большой буквой");
        } else if (symbol >= '0' && symbol <= '9'){
            System.out.println("цифрой");
        } else {
            System.out.println(" ни буквой, ни цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        double depositAmount = 301_000d;
        double interestRate = depositAmount * 1.05;
        if (depositAmount >= 100_000 && depositAmount < 300_000) {
            interestRate = depositAmount * 1.07;
        } else if (depositAmount > 300_000) {
            interestRate = depositAmount * 1.10;
        }
        System.out.println("Сумма вклада: " + depositAmount + " руб.");
        System.out.println("Сумма начисленных %: " + (interestRate - depositAmount));
        System.out.println("Итоговая сумма, включая % по вкладу: " + interestRate);

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        System.out.println("История: " + historyGrade);
        int programmingPercent = 92;
        int programmmingGrade = 5;
        if (programmingPercent <= 59) {
            programmmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmmingGrade = 4;
        }
        System.out.println("Программирование: " + programmmingGrade);
        float averageGrades = (historyGrade + programmmingGrade) / 2f;
        float averagePercent = (historyPercent + programmingPercent) / 2f;
        System.out.println("Средний балл оценок по предметам: " + averageGrades);
        System.out.println("Средний процент по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли\n");
        int salesPerMonth = 13_000;
        int rentPerMonth = 5_000;
        int costPrice = 9_000;
        int profit = (salesPerMonth - rentPerMonth - costPrice) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profit + " руб.");
        }
    }
}