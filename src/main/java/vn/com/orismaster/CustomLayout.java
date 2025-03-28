package vn.com.orismaster;

public final class CustomLayout {
    public static CustomLayout of(int[][] layout) {
        return new CustomLayout(layout);
    }

    private final int[][] layout;

    private CustomLayout(int[][] layout) {
        this.layout = layout;
    }

    public int getLayout(int row, int col) {
        return layout[row][col];
    }
}
