package State_Pattern;

public class Yellow implements RoadSignal{
    @Override
    public void road_Light(State state) {
        System.out.println("Yellow Light Glow");
        state.setState(new Green());
    }
}
