import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformer;

    public StringTransformerGroup(List<StringTransformer> transformer){
        this.transformer = transformer;
    }

    public void execute(StringDrink drink){
        for (StringTransformer operation : transformer) {
            operation.execute(drink);
        }
    }
}
