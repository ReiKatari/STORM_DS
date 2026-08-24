package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt7  reason: default package */
/* loaded from: classes.dex */
public final class vt7 implements View.OnApplyWindowInsetsListener {
    public final f55 a;
    public vu7 b;

    public vt7(View view, f55 f55Var) {
        vu7 vu7Var;
        iu7 bu7Var;
        this.a = f55Var;
        WeakHashMap weakHashMap = ao7.a;
        vu7 a = tn7.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                bu7Var = new hu7(a);
            } else if (i >= 35) {
                bu7Var = new gu7(a);
            } else if (i >= 34) {
                bu7Var = new fu7(a);
            } else if (i >= 31) {
                bu7Var = new eu7(a);
            } else if (i >= 30) {
                bu7Var = new du7(a);
            } else if (i >= 29) {
                bu7Var = new cu7(a);
            } else {
                bu7Var = new bu7(a);
            }
            vu7Var = bu7Var.b();
        } else {
            vu7Var = null;
        }
        this.b = vu7Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        if (!view.isLaidOut()) {
            this.b = vu7.g(view, windowInsets);
            return wt7.j(view, windowInsets);
        }
        vu7 g = vu7.g(view, windowInsets);
        ru7 ru7Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = ao7.a;
            this.b = tn7.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return wt7.j(view, windowInsets);
        }
        f55 k = wt7.k(view);
        if (k != null && Objects.equals((vu7) k.B, g)) {
            return wt7.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        vu7 vu7Var = this.b;
        int i = 1;
        while (i <= 512) {
            e83 h = ru7Var.h(i);
            e83 h2 = vu7Var.a.h(i);
            int i2 = h.a;
            int i3 = h.d;
            int i4 = h.c;
            int i5 = h.b;
            int i6 = h2.a;
            int i7 = h2.d;
            int i8 = h2.c;
            int i9 = h2.b;
            if (i2 <= i6 && i5 <= i9 && i4 <= i8 && i3 <= i7) {
                iArr = iArr2;
                z = false;
            } else {
                iArr = iArr2;
                z = true;
            }
            if (i2 >= i6 && i5 >= i9 && i4 >= i8 && i3 >= i7) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = g;
            return wt7.j(view, windowInsets);
        }
        vu7 vu7Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = wt7.e;
        } else if ((i11 & 8) != 0) {
            interpolator = wt7.f;
        } else if ((i10 & 519) != 0) {
            interpolator = wt7.g;
        } else if ((i11 & 519) != 0) {
            interpolator = wt7.h;
        } else {
            interpolator = null;
        }
        if ((i12 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        au7 au7Var = new au7(i12, interpolator, j);
        au7Var.a.e(RecyclerView.B1);
        ValueAnimator duration = ValueAnimator.ofFloat(RecyclerView.B1, 1.0f).setDuration(au7Var.a.b());
        e83 h3 = ru7Var.h(i12);
        e83 h4 = vu7Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        rr6 rr6Var = new rr6(14, e83.c(min, min2, min3, Math.min(i17, i18)), e83.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        wt7.g(view, au7Var, g, false);
        duration.addUpdateListener(new ut7(au7Var, g, vu7Var2, i12, view));
        duration.addListener(new t97(au7Var, view));
        fm4.a(view, new el0(view, au7Var, rr6Var, duration));
        this.b = g;
        return wt7.j(view, windowInsets);
    }
}
