
public class TrafficLightLogic {
    public enum Color { Red, Green, Yellow }
    
    private Color currentColor;
    
    public TrafficLightLogic() {
        currentColor = Color.Red;
    }
    
    public void change() {
        currentColor = switch (currentColor) {
            case Red    -> Color.Green;
            case Green  -> Color.Yellow;
            case Yellow -> Color.Red;
        };
    }
}
