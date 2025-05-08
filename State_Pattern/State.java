package State_Pattern;

public class State {
    private RoadSignal object;
    public State(){
        this.object = new Green();
    }

    void setState(RoadSignal signal){
        this.object = signal;
    }

    void checkState(){
        object.road_Light(this);
    }

}
