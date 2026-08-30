package a5;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f435a = new Object();

    public final int a(Window window) {
        int i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i11 = rect.top;
        int i12 = rect.bottom;
        if (i12 > i10) {
            i2 = i12 - i10;
        } else {
            i2 = 0;
        }
        return i10 - (i11 + i2);
    }
}
