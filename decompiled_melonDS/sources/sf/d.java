package sf;

import aj.g;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.List;
import l.i;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List f12891a = t.y("HiddenDisplay", "WebRTC_ScreenCapture");

    public static Display a(i iVar) {
        Display B = g.B(iVar);
        B.getClass();
        DisplayManager displayManager = (DisplayManager) iVar.getSystemService(DisplayManager.class);
        if (displayManager != null) {
            Display[] displays = displayManager.getDisplays("android.hardware.display.category.PRESENTATION");
            displays.getClass();
            for (Display display : displays) {
                if (display.getDisplayId() != B.getDisplayId() && !f12891a.contains(display.getName())) {
                    return display;
                }
            }
            return null;
        }
        return null;
    }
}
