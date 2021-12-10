import java.util.List;

public class StringRecipe{
    List<StringTransformer> transformer;

    public StringRecipe(List<StringTransformer> transformer){
        this.transformer = transformer;
    }

    public void mix(StringDrink drink){
        for (StringTransformer operation : transformer) {
            operation.execute(drink);
        }
    }
}
