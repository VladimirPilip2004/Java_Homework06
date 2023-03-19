package HW_06.Class_Notebook;

public class Notebook {
    String name;
    int ram;
    int ssd;
    String os;
    String color;

    public Notebook(String name, int ram, int ssd, String os, String color){
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("Модель: %s, ОЗУ: %d ГБ, SSD: %d ГБ, OS: %s, Цвет: %s", name, ram, ssd, os, color);
    }

    public boolean equals(Object obj) {
        Notebook tru = (Notebook) obj;
        return name == tru.name;
    }
}