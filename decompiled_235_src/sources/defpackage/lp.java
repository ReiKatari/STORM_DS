package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp  reason: default package */
/* loaded from: classes.dex */
public final class lp {
    public static final lp a = new Object();

    public final int a(Window window) {
        int i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (i4 > i2) {
            i = i4 - i2;
        } else {
            i = 0;
        }
        return i2 - (i3 + i);
    }
}
