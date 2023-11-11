class TrimmerDecorator extends Decorator {
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    public String correctName() {
        String name = nameable.getCorrectName();
        if (name.length() > 10) {
            return name.substring(0, 10);
        } else {
            return name;
        }
    }
}