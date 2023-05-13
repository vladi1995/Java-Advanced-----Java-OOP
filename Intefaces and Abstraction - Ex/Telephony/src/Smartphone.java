import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder result = new StringBuilder();

        for (String url : this.urls) {
            if (!url.matches("^\\D+$")) {
                result.append(String.format("Invalid URL!%n"));
            } else {
                result.append(String.format("Browsing: %s%n", url));
            }
        }
        return result.toString();
    }

    @Override
    public String call() {
        StringBuilder result = new StringBuilder();

        for (String number : this.numbers) {
            if (number.matches("^[0-9]+$")) {
                result.append(String.format("Calling... %s%n", number));
            } else {
                result.append(String.format("Invalid number!%n"));
            }
        }
        return result.toString();
    }
}
