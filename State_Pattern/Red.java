package State_Pattern;

public class Red implements RoadSignal{
    @Override
    public void road_Light(State state) {
        System.out.println("Red Light Glow");
        state.setState(new Yellow());
    }
}
