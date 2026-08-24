package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x86  reason: default package */
/* loaded from: classes.dex */
public final class x86 {
    public static final List a = hf.c0("HiddenDisplay", "WebRTC_ScreenCapture", "StormScreenCapture");

    public static Display a(jq jqVar) {
        Display D = ge7.D(jqVar);
        D.getClass();
        DisplayManager displayManager = (DisplayManager) jqVar.getSystemService(DisplayManager.class);
        if (displayManager != null) {
            Display[] displays = displayManager.getDisplays("android.hardware.display.category.PRESENTATION");
            displays.getClass();
            for (Display display : displays) {
                String name = display.getName();
                if (name == null) {
                    name = "";
                }
                if (display.getDisplayId() != D.getDisplayId() && !a.contains(name) && !qs6.j0(name, "ScreenCapture", true) && !qs6.j0(name, "Virtual", true) && !qs6.j0(name, "Record", true)) {
                    return display;
                }
            }
            return null;
        }
        return null;
    }
}
