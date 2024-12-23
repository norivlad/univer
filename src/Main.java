import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryExecutor executor = new QueryExecutor();

        System.out.println("Получение учителей по дню и классу:");
        List<Teacher> teachers = executor.getTeachersByDayAndClassroom("Monday", "608");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullName());
        }

        System.out.println("Получение учителей, не работающих в понедельник:");
        teachers = executor.getTeachersNotWorkingOnDay("Monday");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullName());
        }

        System.out.println("Получение дней с количеством классов:");
        List<String> days = executor.getDaysWithClassroomCount(3);
        for (String day : days) {
            System.out.println(day);
        }

        System.out.println("Получение дней с количеством предметов:");
        days = executor.getDaysWithSubjectCount(4);
        for (String day : days) {
            System.out.println(day);
        }

        System.out.println("Перемещение первого занятия в конец списка:");
        executor.moveFirstClassToEnd("Monday", "Saturday");
    }
}