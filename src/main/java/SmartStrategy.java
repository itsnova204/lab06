import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringDrink> drinks;
    private List<StringRecipe> recipes;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()){ bar.order(drink,recipe); return;}
        drinks.add(drink);
        recipes.add(recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        int n = drinks.size();
        for (int i = 0; i < n; i++){
            bar.order(drinks.get(i),recipes.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
