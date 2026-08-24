package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq7  reason: default package */
/* loaded from: classes.dex */
public abstract class dq7 {
    public static final gq7 a;
    public static final ml0 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, gq7] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, gq7] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Object();
        } else {
            a = new Object();
        }
        b = new ml0("translationAlpha", 6, Float.class);
        new ml0("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.b0(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.c0(view, i);
    }
}
