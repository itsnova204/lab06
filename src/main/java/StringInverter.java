public class StringInverter implements StringTransformer {
    public void execute(StringDrink d){
        StringBuilder temp = new StringBuilder(d.getText());
        temp.reverse();

    }
}
