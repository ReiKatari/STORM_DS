package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu7  reason: default package */
/* loaded from: classes.dex */
public final class vu7 {
    public static final vu7 b;
    public final ru7 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = pu7.w;
        } else if (i >= 30) {
            b = nu7.v;
        } else {
            b = ru7.b;
        }
    }

    public vu7(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new qu7(this, windowInsets);
        } else if (i >= 34) {
            this.a = new pu7(this, windowInsets);
        } else if (i >= 31) {
            this.a = new ou7(this, windowInsets);
        } else if (i >= 30) {
            this.a = new nu7(this, windowInsets);
        } else if (i >= 29) {
            this.a = new mu7(this, windowInsets);
        } else if (i >= 28) {
            this.a = new lu7(this, windowInsets);
        } else {
            this.a = new ku7(this, windowInsets);
        }
    }

    public static e83 e(e83 e83Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, e83Var.a - i);
        int max2 = Math.max(0, e83Var.b - i2);
        int max3 = Math.max(0, e83Var.c - i3);
        int max4 = Math.max(0, e83Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return e83Var;
        }
        return e83.c(max, max2, max3, max4);
    }

    public static vu7 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        vu7 vu7Var = new vu7(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ao7.a;
            vu7 a = tn7.a(view);
            ru7 ru7Var = vu7Var.a;
            ru7Var.w(a);
            View rootView = view.getRootView();
            ru7Var.d(rootView);
            ru7Var.o(rootView);
            ru7Var.p();
            ru7Var.y(view.getWindowSystemUiVisibility());
        }
        return vu7Var;
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
        if (!(obj instanceof vu7)) {
            return false;
        }
        return Objects.equals(this.a, ((vu7) obj).a);
    }

    public final WindowInsets f() {
        ru7 ru7Var = this.a;
        if (ru7Var instanceof ju7) {
            return ((ju7) ru7Var).c;
        }
        return null;
    }

    public final int hashCode() {
        ru7 ru7Var = this.a;
        if (ru7Var == null) {
            return 0;
        }
        return ru7Var.hashCode();
    }

    public vu7() {
        this.a = new ru7(this);
    }
}
