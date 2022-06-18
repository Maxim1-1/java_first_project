package homework2;

public class homework2_task3 {
    public static void main(String[] args) {
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = false;

        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному)

        if((chicken) & (vegetables) & (sour)& (toast)){
            System.out.print("Цезарь готов");
        }else if (((vegetables ) & (sausage)) | ((chicken) & (eggs))) {
            System.out.print("Оливье готово");
        }else if (vegetables){
            System.out.print("Овощной салат  готов");
        }
        else {
            System.out.print("У меня ничего нет");
        }
    }
}
