package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {

        // не понимаю, как организовать препятсвия и поэтому не знаю, как быть дальше

        // еще приношу извинения, что поздно очень скидываю, сейчас завал с экзаменам в вузе((
        // но обязательно исправюсь!!!

        Human human1 = new Human ("Alex");
        Cat cat1 = new Cat ("Gable");
        Robot robot1 = new Robot ("R2D2");

        human1.run(100);
        human1.jump(5);
        System.out.println();

        cat1.run(50);
        cat1.jump(10);
        System.out.println();

        robot1.run(300);
        robot1.jump(20);
        System.out.println();

    }


}
