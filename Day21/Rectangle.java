package Day21;

public class Rectangle {

    //  Calculate area of a rectangle
    static int rectangleArea(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2 - y1);
    }

    //  Calculate overlapping area between two rectangles
    static int overlapArea(
            int ax1, int ay1, int ax2, int ay2,
            int bx1, int by1, int bx2, int by2) {

        int leftX;
        if (ax1 > bx1)
            leftX = ax1;
        else
            leftX = bx1;

        int rightX;
        if (ax2 < bx2)
            rightX = ax2;
        else
            rightX = bx2;

        int bottomY;
        if (ay1 > by1)
            bottomY = ay1;
        else
            bottomY = by1;

        int topY;
        if (ay2 < by2)
            topY = ay2;
        else
            topY = by2;

        int width = rightX - leftX;
        int height = topY - bottomY;

        if (width <= 0 || height <= 0)
            return 0;

        return width * height;
    }

    // Main function to compute total covered area
    public int computeArea(
            int ax1, int ay1, int ax2, int ay2,
            int bx1, int by1, int bx2, int by2) {

        int areaA = rectangleArea(ax1, ay1, ax2, ay2);
        int areaB = rectangleArea(bx1, by1, bx2, by2);

        int overlap = overlapArea(
                ax1, ay1, ax2, ay2,
                bx1, by1, bx2, by2);

        return areaA + areaB - overlap;
    }
}
//TC=0(1)

