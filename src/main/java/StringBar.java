public class StringBar extends Bar{
    StringRecipe recipe;

    public StringBar(){}

    public void order(StringDrink drink, StringRecipe recipe){
        this.recipe = recipe;
        recipe.mix(drink);
    }

    @Override
    public void happyHourStarted(Bar bar) {
    }

    @Override
    public void happyHourEnded(Bar bar) {

    }
}
