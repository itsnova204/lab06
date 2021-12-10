
public class StringReplacer implements StringTransformer{
    char a,b;

    public StringReplacer(Character a, Character b){
        this.a = a;
        this.b = b;
    }

    public void execute(StringDrink drink){
        String temp = drink.getText();
        drink.setText(temp.replace(a,b));
    }
}
