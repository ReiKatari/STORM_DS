package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cc7  reason: default package */
/* loaded from: classes.dex */
public abstract class cc7 {
    public static final ec7 a;
    public static final dj0 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [ec7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ec7, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Object();
        } else {
            a = new Object();
        }
        b = new dj0("translationAlpha", 6, Float.class);
        new dj0("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.W(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.X(view, i);
    }
}
