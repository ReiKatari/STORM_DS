package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf7  reason: default package */
/* loaded from: classes.dex */
public final class vf7 {
    public static final vf7 b;
    public final rf7 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = pf7.w;
        } else if (i >= 30) {
            b = nf7.v;
        } else {
            b = rf7.b;
        }
    }

    public vf7(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new qf7(this, windowInsets);
        } else if (i >= 34) {
            this.a = new pf7(this, windowInsets);
        } else if (i >= 31) {
            this.a = new of7(this, windowInsets);
        } else if (i >= 30) {
            this.a = new nf7(this, windowInsets);
        } else if (i >= 29) {
            this.a = new mf7(this, windowInsets);
        } else if (i >= 28) {
            this.a = new lf7(this, windowInsets);
        } else {
            this.a = new kf7(this, windowInsets);
        }
    }

    public static x13 e(x13 x13Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, x13Var.a - i);
        int max2 = Math.max(0, x13Var.b - i2);
        int max3 = Math.max(0, x13Var.c - i3);
        int max4 = Math.max(0, x13Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return x13Var;
        }
        return x13.c(max, max2, max3, max4);
    }

    public static vf7 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        vf7 vf7Var = new vf7(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = aa7.a;
            vf7 a = t97.a(view);
            rf7 rf7Var = vf7Var.a;
            rf7Var.w(a);
            View rootView = view.getRootView();
            rf7Var.d(rootView);
            rf7Var.o(rootView);
            rf7Var.p();
            rf7Var.y(view.getWindowSystemUiVisibility());
        }
        return vf7Var;
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf7)) {
            return false;
        }
        return Objects.equals(this.a, ((vf7) obj).a);
    }

    public final WindowInsets f() {
        rf7 rf7Var = this.a;
        if (rf7Var instanceof jf7) {
            return ((jf7) rf7Var).c;
        }
        return null;
    }

    public final int hashCode() {
        rf7 rf7Var = this.a;
        if (rf7Var == null) {
            return 0;
        }
        return rf7Var.hashCode();
    }

    public vf7() {
        this.a = new rf7(this);
    }
}
