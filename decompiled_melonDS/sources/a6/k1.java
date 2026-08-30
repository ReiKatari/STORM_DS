package a6;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final pd.g f481a;

    /* renamed from: b  reason: collision with root package name */
    public i2 f482b;

    public k1(View view, pd.g gVar) {
        i2 i2Var;
        v1 q1Var;
        this.f481a = gVar;
        WeakHashMap weakHashMap = x0.f533a;
        i2 a10 = q0.a(view);
        if (a10 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                q1Var = new u1(a10);
            } else if (i2 >= 31) {
                q1Var = new t1(a10);
            } else if (i2 >= 30) {
                q1Var = new s1(a10);
            } else if (i2 >= 29) {
                q1Var = new r1(a10);
            } else {
                q1Var = new q1(a10);
            }
            i2Var = q1Var.b();
        } else {
            i2Var = null;
        }
        this.f482b = i2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j2;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f482b = i2.g(view, windowInsets);
            return l1.j(view, windowInsets);
        }
        i2 g10 = i2.g(view, windowInsets);
        d2 d2Var = g10.f479a;
        if (this.f482b == null) {
            WeakHashMap weakHashMap = x0.f533a;
            this.f482b = q0.a(view);
        }
        if (this.f482b == null) {
            this.f482b = g10;
            return l1.j(view, windowInsets);
        }
        pd.g k10 = l1.k(view);
        if (k10 != null && Objects.equals((i2) k10.A, g10)) {
            return l1.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        i2 i2Var = this.f482b;
        int i2 = 1;
        while (i2 <= 512) {
            q5.b f8 = d2Var.f(i2);
            q5.b f10 = i2Var.f479a.f(i2);
            int i10 = f8.f12283a;
            int i11 = f8.f12286d;
            int i12 = f8.f12285c;
            int i13 = f8.f12284b;
            int i14 = f10.f12283a;
            int i15 = f10.f12286d;
            int i16 = f10.f12285c;
            int i17 = f10.f12284b;
            if (i10 <= i14 && i13 <= i17 && i12 <= i16 && i11 <= i15) {
                iArr = iArr2;
                z10 = false;
            } else {
                iArr = iArr2;
                z10 = true;
            }
            if (i10 >= i14 && i13 >= i17 && i12 >= i16 && i11 >= i15) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 != z11) {
                if (z10) {
                    iArr[0] = iArr[0] | i2;
                } else {
                    iArr3[0] = iArr3[0] | i2;
                }
            }
            i2 <<= 1;
            iArr2 = iArr;
        }
        int i18 = iArr2[0];
        int i19 = iArr3[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f482b = g10;
            return l1.j(view, windowInsets);
        }
        i2 i2Var2 = this.f482b;
        if ((i18 & 8) != 0) {
            interpolator = l1.f483e;
        } else if ((i19 & 8) != 0) {
            interpolator = l1.f484f;
        } else if ((i18 & 519) != 0) {
            interpolator = l1.f485g;
        } else if ((i19 & 519) != 0) {
            interpolator = l1.f486h;
        } else {
            interpolator = null;
        }
        if ((i20 & 8) != 0) {
            j2 = 160;
        } else {
            j2 = 250;
        }
        p1 p1Var = new p1(i20, interpolator, j2);
        p1Var.f502a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(p1Var.f502a.b());
        q5.b f11 = d2Var.f(i20);
        q5.b f12 = i2Var2.f479a.f(i20);
        int min = Math.min(f11.f12283a, f12.f12283a);
        int i21 = f11.f12284b;
        int i22 = f12.f12284b;
        int min2 = Math.min(i21, i22);
        int i23 = f11.f12285c;
        int i24 = f12.f12285c;
        int min3 = Math.min(i23, i24);
        int i25 = f11.f12286d;
        int i26 = f12.f12286d;
        a0.g gVar = new a0.g(5, q5.b.c(min, min2, min3, Math.min(i25, i26)), q5.b.c(Math.max(f11.f12283a, f12.f12283a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        l1.g(view, p1Var, g10, false);
        duration.addUpdateListener(new h1(p1Var, g10, i2Var2, i20, view));
        duration.addListener(new i1(p1Var, view));
        x.a(view, new j1(view, p1Var, gVar, duration));
        this.f482b = g10;
        return l1.j(view, windowInsets);
    }
}
