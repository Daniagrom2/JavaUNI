package com.company;
import java.util.*;

public class Main {

    public static int averageLength(String[] words, int count) {

        int countedLength = 0;


        for(int i = 0; i < words.length; i++) {
            countedLength += words[i].length();

        }

        return (int)countedLength / count;
    }
 static  class Sortbyroll implements Comparator<String> {
        // Used for sorting in ascending order
        public int compare(String a, String b)
        {
            return a.length() - b.length();
        }
    }
    public static void main(String[] args) {
        // 01. Ввести n рядків з консолі, знайти найкоротший рядок. Вивести цей рядок і
        //його довжину.
        Scanner in = new Scanner(System.in);
        int n = 5;
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {

            System.out.print("Input a string: ");
            arr[i] = in.nextLine();
        }
        String shortest = arr[0];
        for (int i = 0; i < n; i++) {
            if (shortest.length() > arr[i].length()) {
                shortest = arr[i];
            }
        }
        System.out.println("Shortest is :" + shortest + "\n Lenth:" + shortest.length());

        //02. Ввести n рядків з консолі. Упорядкувати і вивести рядки в порядку
        //зростання їх довжин.
        System.out.println("\n\n\n\n");
        Arrays.sort(arr, new Sortbyroll());
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        //03. Ввести n рядків з консолі. Вивести на консоль ті рядки, довжина яких менша
        //за середню, а також їх довжини.
        System.out.println("\n\n\n\n");
        int avarage_lenth = averageLength(arr, n);

        System.out.println(avarage_lenth);
        for (int i = 0; i < n; i++) {
            if (arr[i].length() < avarage_lenth) {
                System.out.println(arr[i] + '\t' + arr[i].length());
            }
        }


        //04. У кожному слові тексту k-у букву замінити заданим символом. Якщо k
        //більше довжини слова, коригування не виконувати.
        int k = 4;
        String text = "This article is contributed by Vaibhav Bajpai. If you like GeeksforGeeks and would like to contribute, you can also write an article using write.geeksforgeeks.org or mail your article to review-team@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks. Please write comments if you find anything incorrect or you want to share more information about the topic discussed above.";
        String wordsArr[] = text.split(" ");
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].length() >= k) {
                char boof[] = wordsArr[i].toCharArray();
                boof[k - 1] = '$';
                String word = "";
                for (int j = 0; j < boof.length; j++) {
                    word += boof[j];
                }
                wordsArr[i] = word;
            }
        }
        text = "";
        for (int i = 0; i < wordsArr.length; i++) {
            text += wordsArr[i];
            text += " ";
        }
        System.out.print(text);


        //05. У тексті кожну букву замінити її номером в алфавіті. В одному рядку
        //друкувати текст з двома пробілами між буквами, в наступному рядку внизу
        //під кожною буквою друкувати її номер.
        System.out.println();
        System.out.println();
        Map<Character, Integer> alphabet = new HashMap<Character, Integer>();
        alphabet.put('a', 1);
        alphabet.put('b', 2);
        alphabet.put('c', 3);
        alphabet.put('d', 4);
        alphabet.put('e', 5);
        alphabet.put('f', 6);
        alphabet.put('g', 7);
        alphabet.put('h', 8);
        alphabet.put('j', 9);
        alphabet.put('k', 10);
        alphabet.put('l', 11);
        alphabet.put('m', 12);
        alphabet.put('n', 13);
        alphabet.put('o', 14);
        alphabet.put('p', 15);
        alphabet.put('q', 16);
        alphabet.put('r', 17);
        alphabet.put('s', 18);
        alphabet.put('t', 19);
        alphabet.put('u', 20);
        alphabet.put('v', 21);
        alphabet.put('w', 22);
        alphabet.put('x', 23);
        alphabet.put('y', 24);
        alphabet.put('z', 25);


        String line = "JAVA - good language";

        char arr2[] = line.toCharArray();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");

        }
        arr2 = line.toLowerCase().toCharArray();
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != ' ' || arr2[i] != '-') {
                System.out.print(alphabet.get(arr2[i]) + "  ");
            }
        }
        System.out.println();
        System.out.println();
//06. З тексту видалити всі символи, крім пробілів, які не є буквами. Між
//послідовностями букв залишити хоча б один пробіл.
        String text2 = "This article is contributed by Vaibhav Bajpai. If you like GeeksforGeeks and would like to contribute, you can also write an article using write.geeksforgeeks.org or mail your article to review-team@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks. Please write comments if you find anything incorrect or you want to share more information about the topic discussed above.";
        String wordsArr2[] = text2.split("[,./'!?@#$%&^*();:]");
        text2 = "";
        for (int i = 0; i < wordsArr2.length; i++) {
            text2 += wordsArr2[i];
        }
        System.out.println(text2);
        System.out.println();
        System.out.println();

        //07. З тексту видалити всі слова заданої довжини, що починаються на задану букву.
        String src = "У кожному У oлові тексту k-у букву oамінити заданим символом. Якщо k більше довжини слова, коригування не виконувати.";

        int length = 9;
        char letter = 'o';
        String arr3[] = src.split(" ");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i].toCharArray()[0] == letter && arr3[i].length() == length) {
                arr3[i] = "";
            }
        }
        src = "";
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] != "") {
                src += arr3[i];
                src += " ";
            }
        }
        System.out.println(src);
        System.out.println();
        System.out.println();

//08. Знайти і вивести, скільки разів повторюється в тексті кожне слово.

        String str = "У кожному слові тексту k-у букву замінити заданим не символом.Якщо k більше довжини слові,коригування не виконувати .";
        var arr4 = str.split("[!.,/?!@#$%^&*()-=+;: ]");
        int counter = 0;
        for (int i = 0; i < arr4.length - 1; ++i) {
            counter = 0;
            for (int j = 0; j < arr4.length; ++j) {
                if (arr4[i] == arr4[j]) {
                    counter++;
                }
            }
            System.out.println(arr4[i] + " " + counter);

        }
        System.out.println();
        String str2 = "AAAAAAAAAAAAAAAAAAAAAAAA, business began to pick up. Not dramatically, but bit by bit. A sack of potatoes here.";

        int count_a = 0;
        int count_b = 0;

        var a = (str2.split("[.!?]"));

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].toCharArray().length; i++) {
                if (a[j].toCharArray()[i] == 'a' || a[j].toCharArray()[i] == 'A' || a[j].toCharArray()[i] == 'E' || a[j].toCharArray()[i] == 'e' || a[j].toCharArray()[i] == 'i' || a[j].toCharArray()[i] == 'I' || a[j].toCharArray()[i] == 'o' || a[j].toCharArray()[i] == 'O' || a[j].toCharArray()[i] == 'U' || a[j].toCharArray()[i] == 'u' || a[j].toCharArray()[i] == 'y' || a[j].toCharArray()[i] == 'Y') {
                    count_a++;
                } else if (a[j].toCharArray()[i] == 'B' || a[j].toCharArray()[i] == 'b' || a[j].toCharArray()[i] == 'C' || a[j].toCharArray()[i] == 'c' ||
                        a[j].toCharArray()[i] == 'D' || a[j].toCharArray()[i] == 'd' || a[j].toCharArray()[i] == 'F' || a[j].toCharArray()[i] == 'f' || a[j].toCharArray()[i] == 'g' ||
                        a[j].toCharArray()[i] == 'G' || a[j].toCharArray()[i] == 'H' || a[j].toCharArray()[i] == 'h' || a[j].toCharArray()[i] == 'J' || a[j].toCharArray()[i] == 'j' || a[j].toCharArray()[i] == 'K' || a[j].toCharArray()[i] == 'k' ||
                        a[j].toCharArray()[i] == 'L' || a[j].toCharArray()[i] == 'l' || a[j].toCharArray()[i] == 'M' || a[j].toCharArray()[i] == 'm' || a[j].toCharArray()[i] == 'N' || a[j].toCharArray()[i] == 'n' || a[j].toCharArray()[i] == 'p' || a[j].toCharArray()[i] == 'P' ||
                        a[j].toCharArray()[i] == 'Q' || a[j].toCharArray()[i] == 'q' || a[j].toCharArray()[i] == 'R' || a[j].toCharArray()[i] == 'r' || a[j].toCharArray()[i] == 's' || a[j].toCharArray()[i] == 'S' || a[j].toCharArray()[i] == 'T' || a[j].toCharArray()[i] == 't' ||
                        a[j].toCharArray()[i] == 'V' || a[j].toCharArray()[i] == 'v' || a[j].toCharArray()[i] == 'W' || a[j].toCharArray()[i] == 'w' || a[j].toCharArray()[i] == 'X' || a[j].toCharArray()[i] == 'x' || a[j].toCharArray()[i] == 'z' || a[j].toCharArray()[i] == 'Z'
                ) {
                    count_b++;
                }
            }
            System.out.println(a[j]);
            if (count_a > count_b) {
                System.out.println("Голосних більше");
            } else {
                System.out.println("Приголосних більше");
            }
            count_a = 0;
            count_b = 0;
        }
    }
            }




