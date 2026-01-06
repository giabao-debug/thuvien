
package boundary;

import control.CountItemController;

public class CountItemBoundary {

    public void show() {
        CountItemController controller = new CountItemController();
        controller.executeStatistic();
    }
}
