package dard.justhzd.leanspring.ch3.conditional;

/**
 * Created by 洪志达 on 2018/4/15.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
