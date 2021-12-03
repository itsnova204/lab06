public class StringCaseChanger implements StringTransformer{
        public void execute(StringDrink d){
            String str = d.getText();
            char c;
            StringBuilder out = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);

                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }else {
                    c = Character.toUpperCase(c);
                }
                out.append(c);
            }
            d.setText(out.toString());
        }
}
