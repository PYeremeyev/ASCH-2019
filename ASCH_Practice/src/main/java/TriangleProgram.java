public class TriangleProgram {

    public String triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return "Yes";

        } else {
            return "No";
        }
    }
}
