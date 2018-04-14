package dard.justhzd.leanspring.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author 洪志达
 * @date 2018/4/14
 */
public class DemoEvent extends ApplicationEvent{
    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
