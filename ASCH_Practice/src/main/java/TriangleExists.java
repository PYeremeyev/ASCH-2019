public class TriangleExists {

    public String triangleExists(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return "Yes";

        } else {
            return "No";
        }
    }
}
