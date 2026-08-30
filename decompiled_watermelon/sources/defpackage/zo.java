package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zo  reason: default package */
/* loaded from: classes.dex */
public final class zo {
    public static final zo a = new Object();

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
