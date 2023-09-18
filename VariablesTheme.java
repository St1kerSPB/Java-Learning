public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.\n");
        byte memory = 4;
        short ram = 2;
        System.out.println("ОЗУ: " + ram + "x" + memory + "GB");
        int mhz = 3470;
        byte cpu = 5;
        char model = 'i';
        System.out.println("ЦП: " + model + cpu + "-" + mhz);
        long ssd = 106522841088L;
        System.out.println("SSD: " + ssd + " байт");
        float hdd1 = 1.81f;
        System.out.println("HDD: " + hdd1 + "TB");
        double hdd2 = 935.2d;
        System.out.println("HDD: " + hdd2 + "GB");
        boolean os = true;
        System.out.println("Windows activate = " + os + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой.\n");
        int pen = 100;
        int book = 200;
        int fullPrice = pen + book;
        System.out.println("Общая стоимость товаров без скидки:" + fullPrice + " руб.");
        int discount = ((pen + book) / 100) * 89;
        int sum = fullPrice - discount;
        System.out.println("Сумма скидки: " + sum + " руб.");
        System.out.println("Общая стоимость товаров со скидкой:" + discount + " руб.\n");

        System.out.println("3. Вывод слова Java.\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов.\n");
        byte num1 = 127;
        System.out.println("byte " + num1);
        num1++;
        System.out.println(num1);
        num1--;
        num1--;
        System.out.println(num1 + "\n");
        short num2 = 32767;
        System.out.println("short " + num2);
        num2++;
        System.out.println(num2);
        num2--;
        num2--;
        System.out.println(num2 + "\n");
        int num3 = 2147483647;
        System.out.println("int " + num3);
        num3++;
        System.out.println(num3);
        num3--;
        num3--;
        System.out.println(num3 + "\n");
        long num4 = 9223372036854775807L;
        System.out.println("long " + num4);
        num4++;
        System.out.println(num4);
        num4--;
        num4--;
        System.out.println(num4 + "\n");

        System.out.println("5. Перестановка значений переменных.\n");
        System.out.println("Перестановка с помощью третьей переменной");
        int num5 = 2;
        int num6 = 5;
        System.out.println("Исходные значения переменной: " + num5 + " и " + num6);
        int num7 = num5;
        num5 = num6;
        num6 = num7;
        System.out.println("Новые значения переменной: " + num5 + " и " + num6 + "\n");
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения переменной: " + num5 + " и " + num6);
        num5 = num5 + num6;
        num6 = num5 - num6;
        num5 = num5 - num6;
        System.out.println("Новые значения переменной: " + num5 + " и " + num6 + "\n");
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения переменной: " + num5 + " и " + num6);
        num6 = num5^num6;
        num5 = num5^num6;
        num6 = num5^num6;
        System.out.println("Новые значения переменной: " + num5 + " и " + num6 + "\n");

        System.out.println("6. Вывод символов и их кодов.\n");
        char dollar = '$';
        System.out.println("36" + " " + dollar);
        char asterisk = '*';
        System.out.println("42" + " " + asterisk);
        char atSign = '@';
        System.out.println("64" + " " + atSign);
        char bar = '|';
        System.out.println("124" + " " + bar);
        char tilde = '~';
        System.out.println("126" + " " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASII-арт Дюка.\n");
        char slash = '/';
        char backslash = '\\';
        System.out.println("     " + slash + backslash + "    ");
        System.out.println("    " + slash + "  " + backslash + "   ");
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.print("   " + slash + underscore + leftParenthesis + " " + rightParenthesis);
        System.out.println(backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.print(" " + slash + underscore + underscore + underscore + underscore);
        System.out.println("" + slash + backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа.\n");
        int num = 123;
        System.out.println("Число " + num + " содержит:");
        int hundred = num / 100;
        System.out.println(" сотен - " + hundred);
        int tens = num % 11;
        System.out.println(" десятков - " + tens);
        int unit = num % 10;
        System.out.println(" единиц - " + unit);
        int price = hundred + tens + unit;
        System.out.println("Сумма его цифр = " + price);
        int product = hundred * tens * unit;
        System.out.println("Произведение = " + product + "\n");

        System.out.println("9. Вывод времени.\n");
        int time = 86399;
        int hour = (time / 60) / 60;
        int minutes = (time / 60) % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minutes + ":" + second);
   }
}