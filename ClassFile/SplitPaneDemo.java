package ClassFile;

import javafx.geometry.Orientation;
import javafx.scene.control.SplitPane;

public class SplitPaneDemo extends SplitPane {

    public SplitPaneDemo() {
        this.setPrefSize(1500,925);
        this.setOrientation(Orientation.VERTICAL);
        this.setDividerPositions(625.0/925.0);
    }
}
