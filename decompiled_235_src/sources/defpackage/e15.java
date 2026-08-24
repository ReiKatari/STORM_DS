package defpackage;

import android.view.Window;
import android.view.WindowInsets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e15  reason: default package */
/* loaded from: classes.dex */
public abstract class e15 {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
