package a6;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: b  reason: collision with root package name */
    public static final i2 f478b;

    /* renamed from: a  reason: collision with root package name */
    public final d2 f479a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            f478b = c2.f446s;
        } else if (i2 >= 30) {
            f478b = a2.f444r;
        } else {
            f478b = d2.f450b;
        }
    }

    public i2(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            this.f479a = new c2(this, windowInsets);
        } else if (i2 >= 31) {
            this.f479a = new b2(this, windowInsets);
        } else if (i2 >= 30) {
            this.f479a = new a2(this, windowInsets);
        } else if (i2 >= 29) {
            this.f479a = new z1(this, windowInsets);
        } else if (i2 >= 28) {
            this.f479a = new y1(this, windowInsets);
        } else {
            this.f479a = new x1(this, windowInsets);
        }
    }

    public static q5.b e(q5.b bVar, int i2, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f12283a - i2);
        int max2 = Math.max(0, bVar.f12284b - i10);
        int max3 = Math.max(0, bVar.f12285c - i11);
        int max4 = Math.max(0, bVar.f12286d - i12);
        if (max == i2 && max2 == i10 && max3 == i11 && max4 == i12) {
            return bVar;
        }
        return q5.b.c(max, max2, max3, max4);
    }

    public static i2 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        i2 i2Var = new i2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = x0.f533a;
            i2 a10 = q0.a(view);
            d2 d2Var = i2Var.f479a;
            d2Var.r(a10);
            d2Var.d(view.getRootView());
            d2Var.t(view.getWindowSystemUiVisibility());
        }
        return i2Var;
    }

    public final int a() {
        return this.f479a.k().f12286d;
    }

    public final int b() {
        return this.f479a.k().f12283a;
    }

    public final int c() {
        return this.f479a.k().f12285c;
    }

    public final int d() {
        return this.f479a.k().f12284b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return Objects.equals(this.f479a, ((i2) obj).f479a);
    }

    public final WindowInsets f() {
        d2 d2Var = this.f479a;
        if (d2Var instanceof w1) {
            return ((w1) d2Var).f527c;
        }
        return null;
    }

    public final int hashCode() {
        d2 d2Var = this.f479a;
        if (d2Var == null) {
            return 0;
        }
        return d2Var.hashCode();
    }

    public i2() {
        this.f479a = new d2(this);
    }
}
