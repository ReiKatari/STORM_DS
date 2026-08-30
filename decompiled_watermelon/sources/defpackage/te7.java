package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: te7  reason: default package */
/* loaded from: classes.dex */
public final class te7 implements View.OnApplyWindowInsetsListener {
    public final yv4 a;
    public vf7 b;

    public te7(View view, yv4 yv4Var) {
        vf7 vf7Var;
        if7 af7Var;
        this.a = yv4Var;
        WeakHashMap weakHashMap = aa7.a;
        vf7 a = t97.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                af7Var = new hf7(a);
            } else if (i >= 35) {
                af7Var = new gf7(a);
            } else if (i >= 34) {
                af7Var = new ff7(a);
            } else if (i >= 31) {
                af7Var = new ef7(a);
            } else if (i >= 30) {
                af7Var = new df7(a);
            } else if (i >= 29) {
                af7Var = new cf7(a);
            } else {
                af7Var = new af7(a);
            }
            vf7Var = af7Var.b();
        } else {
            vf7Var = null;
        }
        this.b = vf7Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        if (!view.isLaidOut()) {
            this.b = vf7.g(view, windowInsets);
            return ue7.j(view, windowInsets);
        }
        vf7 g = vf7.g(view, windowInsets);
        rf7 rf7Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = aa7.a;
            this.b = t97.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return ue7.j(view, windowInsets);
        }
        yv4 k = ue7.k(view);
        if (k != null && Objects.equals((vf7) k.B, g)) {
            return ue7.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        vf7 vf7Var = this.b;
        int i = 1;
        while (i <= 512) {
            x13 h = rf7Var.h(i);
            x13 h2 = vf7Var.a.h(i);
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
            return ue7.j(view, windowInsets);
        }
        vf7 vf7Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = ue7.e;
        } else if ((i11 & 8) != 0) {
            interpolator = ue7.f;
        } else if ((i10 & 519) != 0) {
            interpolator = ue7.g;
        } else if ((i11 & 519) != 0) {
            interpolator = ue7.h;
        } else {
            interpolator = null;
        }
        if ((i12 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        ze7 ze7Var = new ze7(i12, interpolator, j);
        ze7Var.a.e(RecyclerView.A1);
        ValueAnimator duration = ValueAnimator.ofFloat(RecyclerView.A1, 1.0f).setDuration(ze7Var.a.b());
        x13 h3 = rf7Var.h(i12);
        x13 h4 = vf7Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        wv6 wv6Var = new wv6(7, x13.c(min, min2, min3, Math.min(i17, i18)), x13.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        ue7.g(view, ze7Var, g, false);
        duration.addUpdateListener(new se7(ze7Var, g, vf7Var2, i12, view));
        duration.addListener(new xw6(ze7Var, view));
        hd4.a(view, new wi0(view, ze7Var, wv6Var, duration));
        this.b = g;
        return ue7.j(view, windowInsets);
    }
}
