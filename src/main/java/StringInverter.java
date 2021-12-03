public class StringInverter implements StringTransformer {
    public void execute(StringDrink d){
        StringBuilder temp = new StringBuilder(d.getText());

        d.setText(temp.reverse().toString());
    }
}
