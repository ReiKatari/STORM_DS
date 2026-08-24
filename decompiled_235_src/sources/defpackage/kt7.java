package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt7  reason: default package */
/* loaded from: classes.dex */
public abstract class kt7 {
    public static void a(Window window, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            q2.i(window, z);
        } else if (i2 >= 30) {
            q2.h(window, z);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    public static void b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                u34.x(lb1.g(i2, "at index "));
                return;
            }
        }
    }
}
