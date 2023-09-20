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
        int pricePen = 100;
        int priceBook = 200;
        int fullPrice = pricePen + priceBook;
        System.out.println("Общая стоимость товаров без скидки:" + fullPrice + " руб.");
        int discountPrice = ((fullPrice / 100) * 11);
        int discount = fullPrice - discountPrice;
        System.out.println("Сумма скидки: " + discountPrice + " руб.");
        System.out.println("Общая стоимость товаров со скидкой:" + discount + " руб.\n");

        System.out.println("3. Вывод слова Java.\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов.\n");
        byte maxByte = 127;
        System.out.println("byte " + maxByte);
        System.out.println(++maxByte);
        System.out.println(--maxByte + "\n");
        short maxShort = 32767;
        System.out.println("short " + maxShort);
        System.out.println(++maxShort);
        System.out.println(--maxShort + "\n");
        int maxInt = 2147483647;
        System.out.println("int " + maxInt);
        System.out.println(++maxInt);
        System.out.println(--maxInt + "\n");
        long maxLong = 9223372036854775807L;
        System.out.println("long " + maxLong);
        System.out.println(++maxLong);
        System.out.println(--maxLong + "\n");

        System.out.println("5. Перестановка значений переменных.\n");
        System.out.println("Перестановка с помощью третьей переменной");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения переменной: " + a + " и " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения переменной: " + a + " и " + b + "\n");
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения переменной: " + a + " и " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новые значения переменной: " + a + " и " + b + "\n");
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println("Исходные значения переменной: " + a + " и " + b);
        b = a^b;
        a = a^b;
        b = a^b;
        System.out.println("Новые значения переменной: " + a + " и " + b + "\n");

        System.out.println("6. Вывод символов и их кодов.\n");
        int codeDollar = 36;
        char dollar = '$';
        System.out.println(codeDollar + " " + dollar);
        int codeAsterisk = 42;
        char asterisk = '*';
        System.out.println(codeAsterisk + " " + asterisk);
        int codeAtSign = 64;
        char atSign = '@';
        System.out.println(codeAtSign + " " + atSign);
        int codeBar = 124;
        char bar = '|';
        System.out.println(codeBar + " " + bar);
        int codeTilde = 126;
        char tilde = '~';
        System.out.println(codeTilde + " " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASII-арт Дюка.\n");
        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.print(" " + slash + underscore + underscore + underscore + underscore);
        System.out.println("" + slash + backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа.\n");
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 11;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + num + " содержит:");
        System.out.println(" сотен - " + hundreds);
        System.out.println(" десятков - " + tens);
        System.out.println(" единиц - " + ones);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product + "\n");

        System.out.println("9. Вывод времени.\n");
        int time = 86399;
        int hour = time / 3600 ;
        int minutes = (time / 60) % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minutes + ":" + second);
   }
}
