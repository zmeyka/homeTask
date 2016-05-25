package homeTask.homeTask16;

/**
 Создать классы, описывающие 5 любых предметов (например - электрочайник, книгу, телефон, гелевую ручку,
 купюру в 10 гривен, и тп).
 */
public class homeTask16_4 {

    public class Bottle
    {
        public String material = "glass";
        public int volume = 1;
        public String forWhat = "water";
        public String capMaterial = "steel";
        public boolean forOpener = false;

    }
    public class Desk
    {
        public int deskSides = 2;
        public boolean magnetic = true;
        public String color = "white";
        public int size = 100;
        public int partnumber = 4320;
        public String made = "Ukraine";
    }
    public class CapHolder
    {
        public boolean universal = true;
        public int weight = 20;
        public String material = "cork";
        public int tempLimit = 80;
        public int depth = 1;
    }
    public class Watch
    {
        public String brand = "iWatch";
        public String model = "Sport";
        public int size = 38;
        public int price = 399;
        public boolean call = false;
        public boolean sms = true;
        public boolean bluetooth = true;
    }
    public class banknote {
        public int nominal = 10;
        public int printDate = 1992;
        public String color = "blue";
        public String aversImage = "Mazepa Ivan";
        public String reversImage = "Kiev-Pechersk Lavra";
        public int sizeHeight = 70;
        public int sizeWidth =  135;
        public String country = "Ukraine";
    }
}
