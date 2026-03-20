// Q8. Define interface Filterable with methods apply_filter() and reset_filter()
// Implement in ImageProcessor and DataAnalyzer classes
interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Image filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Reset image filter");
    }
}