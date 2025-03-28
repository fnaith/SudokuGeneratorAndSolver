package vn.com.orismaster;

public final class Form {
    public static final Form CLASSIC_4 = of(4, ClassicLayout.of(2, 2, 2, 2));
    public static final Form CUSTOM_4_1 = of(4, CustomLayout.of(new int[][]{
            {0, 0, 0, 1},
            {0, 2, 1, 1},
            {2, 2, 1, 3},
            {2, 3, 3, 3}
    }));
    public static final Form CUSTOM_4_2 = of(4, CustomLayout.of(new int[][]{
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {2, 2, 2, 3},
            {2, 3, 3, 3}
    }));
    public static final Form CUSTOM_5_1 = of(5, CustomLayout.of(new int[][]{
            {0, 0, 0, 1, 1},
            {0, 0, 2, 1, 1},
            {3, 2, 2, 2, 1},
            {3, 3, 2, 4, 4},
            {3, 3, 4, 4, 4}
    }));
    public static final Form CUSTOM_5_2 = of(5, CustomLayout.of(new int[][]{
            {0, 0, 0, 0, 1},
            {3, 0, 2, 1, 1},
            {3, 2, 2, 2, 1},
            {3, 3, 2, 4, 1},
            {3, 4, 4, 4, 4}
    }));
    public static final Form CUSTOM_5_3 = of(5, CustomLayout.of(new int[][]{
            {0, 0, 0, 0, 1},
            {3, 2, 2, 0, 1},
            {3, 3, 2, 1, 1},
            {3, 4, 2, 2, 1},
            {3, 4, 4, 4, 4}
    }));
    public static final Form CLASSIC_6 = of(6, ClassicLayout.of(2, 3, 3, 2));
    public static final Form CUSTOM_6_1 = of(6, CustomLayout.of(new int[][]{
            {0, 0, 0, 0, 1, 1},
            {0, 0, 2, 1, 1, 1},
            {2, 2, 2, 1, 3, 3},
            {2, 2, 4, 3, 3, 3},
            {4, 4, 4, 3, 5, 5},
            {4, 4, 5, 5, 5, 5}
    }));
    public static final Form CUSTOM_6_2 = of(6, CustomLayout.of(new int[][]{
            {0, 0, 0, 0, 0, 1},
            {2, 0, 2, 1, 1, 1},
            {2, 2, 2, 1, 1, 3},
            {2, 4, 4, 3, 3, 3},
            {4, 4, 4, 3, 5, 3},
            {4, 5, 5, 5, 5, 5}
    }));
    public static final Form CUSTOM_7_1 = of(7, CustomLayout.of(new int[][]{
            {0, 0, 0, 1, 1, 1, 1},
            {0, 0, 0, 1, 1, 1, 4},
            {2, 2, 0, 3, 3, 4, 4},
            {2, 2, 3, 3, 3, 4, 4},
            {2, 2, 3, 3, 6, 4, 4},
            {2, 5, 5, 5, 6, 6, 6},
            {5, 5, 5, 5, 6, 6, 6}
    }));
    public static final Form CUSTOM_7_2 = of(7, CustomLayout.of(new int[][]{
            {0, 0, 1, 1, 1, 1, 2},
            {0, 0, 0, 1, 1, 1, 2},
            {3, 0, 0, 4, 4, 2, 2},
            {3, 3, 4, 4, 4, 2, 2},
            {3, 3, 4, 4, 6, 6, 2},
            {3, 5, 5, 5, 6, 6, 6},
            {3, 5, 5, 5, 5, 6, 6}
    }));
    public static final Form CUSTOM_7_3 = of(7, CustomLayout.of(new int[][]{
            {0, 0, 0, 1, 2, 2, 2},
            {0, 0, 1, 1, 1, 1, 2},
            {0, 0, 4, 1, 4, 1, 2},
            {3, 3, 4, 4, 4, 2, 2},
            {3, 5, 4, 5, 4, 6, 6},
            {3, 5, 5, 5, 5, 6, 6},
            {3, 3, 3, 5, 6, 6, 6}
    }));
    public static final Form CUSTOM_7_4 = of(7, CustomLayout.of(new int[][]{
            {0, 0, 0, 1, 1, 2, 2},
            {0, 0, 1, 1, 1, 2, 2},
            {0, 0, 3, 1, 1, 2, 2},
            {4, 4, 3, 3, 3, 2, 5},
            {4, 4, 3, 3, 3, 5, 5},
            {4, 4, 6, 6, 6, 5, 5},
            {4, 6, 6, 6, 6, 5, 5}
    }));
    public static final Form CUSTOM_7_5 = of(7, CustomLayout.of(new int[][]{
            {0, 0, 0, 0, 0, 0, 1},
            {2, 2, 3, 3, 0, 1, 1},
            {2, 2, 2, 3, 1, 1, 4},
            {2, 5, 5, 3, 1, 1, 4},
            {2, 5, 5, 3, 4, 4, 4},
            {5, 5, 6, 3, 3, 4, 4},
            {5, 6, 6, 6, 6, 6, 6}
    }));
    public static final Form CLASSIC_8 = of(8, ClassicLayout.of(2, 4, 4, 2));
    public static final Form CLASSIC_9 = of(9, ClassicLayout.of(3, 3, 3, 3));
    public static final Form CLASSIC_12 = of(12, ClassicLayout.of(3, 4, 4, 3));
    public static final Form CLASSIC_16 = of(16, ClassicLayout.of(4, 4, 4, 4));
    public static final Form CLASSIC_25 = of(25, ClassicLayout.of(5, 5, 5, 5));

    public static Form of(int size, ClassicLayout classicLayout) {
        return new Form(size, classicLayout, null);
    }

    public static Form of(int size, CustomLayout customLayout) {
        return new Form(size, null, customLayout);
    }

    private final int size;
    private final ClassicLayout classicLayout;
    private final CustomLayout customLayout;

    private Form(int size, ClassicLayout classicLayout, CustomLayout customLayout) {
        this.size = size;
        this.classicLayout = classicLayout;
        this.customLayout = customLayout;
    }

    public int getSize() {
        return size;
    }

    public ClassicLayout getClassicLayout() {
        return classicLayout;
    }

    public CustomLayout getCustomLayout() {
        return customLayout;
    }

    public boolean isClassic() {
        return null != classicLayout;
    }
}
