package State_Pattern;

public class Green implements RoadSignal{
    @Override
    public void road_Light(State state) {
        System.out.println("Green Light Glow");
        state.setState(new Red());
    }
}
