package vn.com.orismaster;

public final class ClassicLayout {
    public static ClassicLayout of(int width, int height, int widthOfBox, int heightOfBox) {
        return new ClassicLayout(width, height, widthOfBox, heightOfBox);
    }

    private final int width;
    private final int height;
    private final int widthOfBox;
    private final int heightOfBox;

    private ClassicLayout(int width, int height, int widthOfBox, int heightOfBox) {
        this.width = width;
        this.height = height;
        this.widthOfBox = widthOfBox;
        this.heightOfBox = heightOfBox;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidthOfBox() {
        return widthOfBox;
    }

    public int getHeightOfBox() {
        return heightOfBox;
    }

    public int lowestRowOfBox(int box) {
        return getWidthOfBox() * (box % getWidth());
    }
}
