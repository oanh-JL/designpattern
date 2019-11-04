package adapter;

public class TranslatorAdapter implements VietnameseTarget {

    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {

        System.out.println("reading words...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("sending word...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated !");
        return "こんにちは";
    }
}
