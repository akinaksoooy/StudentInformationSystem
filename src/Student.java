public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3, int performanceNote1, int performanceNote2,int performanceNote3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if(performanceNote1 >= 0 && performanceNote1 <= 100){
            this.c1.performanceNote = performanceNote1;
        }
        if(performanceNote2 >= 0 && performanceNote2 <= 100){
            this.c2.performanceNote = performanceNote2;
        }
        if(performanceNote3 >= 0 && performanceNote3 <= 100){
            this.c3.performanceNote = performanceNote3;
        }

    }
    void isPass(){
        System.out.println("====================");
        System.out.println(this.name);
        calcAvarage();
        if(this.avarage > 55){
            System.out.println("You pass the class.");
            this.isPass = true;
        }else{
            System.out.println("You did not pass the class.");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Note \t:" + this.c1.note);
        System.out.println(this.c2.name + " Note \t:" + this.c2.note);
        System.out.println(this.c3.name + " Note \t:" + this.c3.note);
        System.out.println(this.c1.name + " Performance Note \t:" + this.c1.performanceNote);
        System.out.println(this.c2.name + " Performance Note \t:" + this.c2.performanceNote);
        System.out.println(this.c3.name + " Performance Note \t:" + this.c3.performanceNote);
        System.out.println("Your avarage is " + this.avarage);
    }
    void calcAvarage(){
        this.avarage =
                ((this.c1.note * 0.80 + this.c1.performanceNote * 0.20) +
                (this.c2.note * 0.80 + this.c2.performanceNote * 0.20) +
                (this.c3.note * 0.80 + this.c3.performanceNote * 0.20)) / 3;

    }


}
