// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. минимум 5 NoteBook notebook1 = new NoteBook NoteBook notebook2 = new NoteBook NoteBook notebook3 = new NoteBook NoteBook notebook4 = new NoteBook NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// Далее нужно запросить критерии - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле
// Пример: ----->
// приветствие
// Выбор параметра:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// выбор конкретнее
// 1 ---> Введите колво ---> 16
// вывод всех подходящих ноутбуков по параметру

package HW_06.Class_Notebook;
import java.util.*;

public class Filter {
    public static void main(String[] args) {
    // Список ноутбуков
        Notebook notebook1 = new Notebook("IBM", 16, 256, "Mac OC", "Black");
        Notebook notebook2 = new Notebook("Asus", 32, 512, "Windows", "White");
        Notebook notebook3 = new Notebook("Acer", 64, 1024, "Linux", "Red");
        Notebook notebook4 = new Notebook("Apple", 16, 256, "Mac OC", "Green");
        Notebook notebook5 = new Notebook("Sumsung", 32, 512, "Windows", "Blue");
        Notebook notebook6 = new Notebook("Fujitsu", 64, 1024, "Linux", "Yellow");
        Notebook notebook7 = new Notebook("HP", 16, 256, "Mac OC", "Pink");
        Notebook notebook8 = new Notebook("Dell", 32, 512, "Windows", "Black");
        Notebook notebook9 = new Notebook("Sony", 64, 1024, "Linux", "White");        
        
    // Меню
        System.out.println("Выберите значение в фильтр:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем SSD");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        Scanner scan = new Scanner(System.in,"ibm866");
        Integer choice = scan.nextInt();
            if(choice == 1){
                System.out.printf("Введите значение ОЗУ: ");
                Integer ram = scan.nextInt();
                if(ram == 32){
                    System.out.println(notebook2.toString() + "\n"+ notebook5.toString() + "\n"+ notebook8.toString() + "\n");

                }else if(ram == 16){
                    System.out.println(notebook1.toString() + "\n" + notebook4.toString() + "\n"+ notebook7.toString() + "\n");

                }else if(ram == 64){
                    System.out.println(notebook3.toString() + "\n" + notebook6.toString() + "\n"+ notebook9.toString() + "\n");

                }else System.out.println("Ноутбука нет в наличии!");

            }else if(choice == 2){
                System.out.printf("Введите объем SSD: ");
                Integer ssd = scan.nextInt();
                if(ssd == 512){
                    System.out.println(notebook2.toString() + "\n"+ notebook5.toString() + "\n"+ notebook8.toString() + "\n");

                }else if(ssd == 256){
                    System.out.println(notebook1.toString() + "\n" + notebook4.toString() + "\n"+ notebook7.toString() + "\n");

                }else if(ssd == 1024){
                    System.out.println(notebook3.toString() + "\n" + notebook6.toString() + "\n"+ notebook9.toString() + "\n");
                
                }else System.out.println("Ноутбука нет в наличии!");
            
            }else if(choice == 3){

                System.out.println("Введите название операционной системы:");
                Scanner scan1 = new Scanner(System.in);
                String os = scan1.nextLine();
                if(os.equals("Mac OC")){
                    System.out.println(notebook1.toString() + "\n" + notebook4.toString() + "\n" +
                    notebook7.toString() + "\n");

                }else if(os.equals("Windows")){
                    System.out.println(notebook2.toString() + "\n" + notebook4.toString() + "\n" + 
                    notebook8.toString() + "\n");

                }else if(os.equals("Linux")){
                    System.out.println(notebook3.toString() + "\n" + notebook6.toString() + "\n" + notebook9.toString() + "\n");

                }else System.out.println("Ноутбука нет в наличии!");
                scan1.close();

            }else if(choice == 4){

                System.out.println("Список цветов ноутбука: Black, White, Red, Green, Blue, Yellow, Pink");
                System.out.println("Введите цвет:");
                Scanner scan1 = new Scanner(System.in);
                String color = scan1.nextLine();
                if(color.equals("Black")){
                    System.out.println(notebook1.toString() + "\n" + notebook8.toString());

                }else if(color.equals("White")){
                    System.out.println(notebook2.toString() + "\n" + notebook9.toString());

                }else if(color.equals("Red")){
                    System.out.println(notebook3.toString() + "\n");

                }else if(color.equals("Green")){
                    System.out.println(notebook4.toString() + "\n");

                }else if(color.equals("Blue")){
                    System.out.println(notebook5.toString() + "\n");

                }else if(color.equals("Yellow")){
                    System.out.println(notebook6.toString() + "\n");

                }else if(color.equals("Pink")){
                    System.out.println(notebook7.toString() + "\n");
                    
                }else System.out.println("Ноутбука нет в наличии!");
                
                scan1.close();
                }
            scan.close();
            }
        }