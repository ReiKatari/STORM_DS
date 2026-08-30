package c8;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f2636a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f2637b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, c8.f0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, c8.f0] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2636a = new Object();
        } else {
            f2636a = new Object();
        }
        f2637b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i2, int i10, int i11, int i12) {
        f2636a.L(view, i2, i10, i11, i12);
    }

    public static void b(View view, int i2) {
        f2636a.M(view, i2);
    }
}
