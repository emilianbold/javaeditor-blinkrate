/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.emilianbold.javaeditor.blinkrate;

import java.util.prefs.Preferences;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.api.editor.settings.SimpleValueNames;

/**
 *
 * @author eaqua
 */
public class BlinkUtil {

    private static Preferences prefs() {
        return MimeLookup.getLookup(MimePath.get("text/x-java"))
                .lookup(Preferences.class);
    }
    public static void setBlink(int blinkMs) {
        if (blinkMs >= 0) {
            prefs().putInt(SimpleValueNames.CARET_BLINK_RATE, blinkMs);
        }
    }
    public static int getBlink() {
        int rv = prefs().getInt(SimpleValueNames.CARET_BLINK_RATE, -1);
        return rv >= 0 ? rv : 300; // from editor.lib2.EditorPreferencesDefaults
    }

    private BlinkUtil()
    {
    }
}
