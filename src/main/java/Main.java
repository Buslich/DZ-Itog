public class Main {
    public static void main(String[] args) {
        // Данные FormDate
        FormDate birthday = new FormDate();
        birthday.day = 30;
        birthday.month = 11;
        birthday.year = 1994;

        // Данные объекта Post
        Post post = new Post();
        post.name = "Александр";
        post.passport = "4444 № 44444444";
        post.patronymic = "Сергеевич";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Буслаев";
        post.subscription = true;
        post.birthday = birthday;

        // Итоговые данные пользователя
        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Телефон: " + post.phone);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
        System.out.println("Подписка на новости: " + (post.subscription ? "Да" : "Нет"));
    }
}
