package ro.emilianbold.javaeditor.blinkrate.option;

import org.netbeans.spi.options.AdvancedOption;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.NbBundle;

public final class BlinkrateAdvancedOption extends AdvancedOption {

    public String getDisplayName() {
        return NbBundle.getMessage(BlinkrateAdvancedOption.class, "AdvancedOption_DisplayName_Blinkrate");
    }

    public String getTooltip() {
        return NbBundle.getMessage(BlinkrateAdvancedOption.class, "AdvancedOption_Tooltip_Blinkrate");
    }

    public OptionsPanelController create() {
        return new BlinkrateOptionsPanelController();
    }
}
