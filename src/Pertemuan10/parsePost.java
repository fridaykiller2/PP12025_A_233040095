package Pertemuan10;


public class parsePost {
    private MyStack stack;
    private String input;

    public parsePost(String input) {
        super();
        this.input = input;
    }

    public int doParse() {
    stack = new MyStack(20);
    char ch;
    int i;
    int bil1, bil2, hasilOps = 0;

    for (i = 0; i < input.length(); i++) {
        ch = input.charAt(i);
        stack.displayStack("" + ch + " ");

        if (ch >= '0' && ch <= '9') {
            stack.push(ch - '0');
        } else {
            bil2 = stack.pop();
            bil1 = stack.pop();

            switch (ch) {
                case '+': hasilOps = bil1 + bil2; break;
                case '-': hasilOps = bil1 - bil2; break;
                case '*': hasilOps = bil1 * bil2; break;
                case '/': hasilOps = bil1 / bil2; break;
                default: hasilOps = 0;
            }
            stack.push(hasilOps);
        }
    }
    hasilOps = stack.pop();
    return stack.pop();
}
}