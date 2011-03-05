/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.emilianbold.javaeditor.blinkrate;

import javax.swing.text.EditorKit;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.editor.Settings;
import org.netbeans.editor.SettingsNames;

/**
 *
 * @author eaqua
 */
public class BlinkUtil {

    public static void setBlink(int blinkMs) {
        if (blinkMs >= 0) {
            Settings.setValue(MimeLookup.getLookup(MimePath.get("text/x-java")).lookup(EditorKit.class).getClass(),
                    SettingsNames.CARET_BLINK_RATE,
                    blinkMs);
        }
    }
    public static int getBlink() {
            return (Integer)Settings.getValue(MimeLookup.getLookup(MimePath.get("text/x-java")).lookup(EditorKit.class).getClass(),
                    SettingsNames.CARET_BLINK_RATE);
    }
}
