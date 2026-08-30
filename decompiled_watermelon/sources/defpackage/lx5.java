package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lx5  reason: default package */
/* loaded from: classes.dex */
public final class lx5 {
    public static final List a = l07.c0("HiddenDisplay", "WebRTC_ScreenCapture");

    public static Display a(xp xpVar) {
        Display y = jv3.y(xpVar);
        y.getClass();
        DisplayManager displayManager = (DisplayManager) xpVar.getSystemService(DisplayManager.class);
        if (displayManager != null) {
            Display[] displays = displayManager.getDisplays("android.hardware.display.category.PRESENTATION");
            displays.getClass();
            for (Display display : displays) {
                if (display.getDisplayId() != y.getDisplayId() && !a.contains(display.getName())) {
                    return display;
                }
            }
            return null;
        }
        return null;
    }
}
