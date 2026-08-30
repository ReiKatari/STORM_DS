package l;

import android.os.PowerManager;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
