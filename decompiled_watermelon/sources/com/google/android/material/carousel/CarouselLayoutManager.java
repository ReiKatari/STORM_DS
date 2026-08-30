package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends q65 implements b75 {
    public final ou p;
    public vi0 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new ui0();
        this.r = new si0(0, this);
        this.p = new ou();
        o0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.b);
            obtainStyledAttributes.getInt(0, 0);
            o0();
            G0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.q65
    public final void A0(RecyclerView recyclerView, int i) {
        ti0 ti0Var = new ti0(this, recyclerView.getContext());
        ti0Var.a = i;
        B0(ti0Var);
    }

    public final float D0(float f, float f2) {
        if (F0()) {
            return f - f2;
        }
        return f + f2;
    }

    public final boolean E0() {
        if (this.q.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean F0() {
        if (E0() && this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void G0(int i) {
        vi0 vi0Var;
        if (i != 0 && i != 1) {
            i.i(wh1.g(i, "invalid orientation:"));
            return;
        }
        c(null);
        vi0 vi0Var2 = this.q;
        if (vi0Var2 != null && i == vi0Var2.a) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                vi0Var = new vi0(this, 0);
            } else {
                i.i("invalid orientation");
                return;
            }
        } else {
            vi0Var = new vi0(this, 1);
        }
        this.q = vi0Var;
        o0();
    }

    @Override // defpackage.q65
    public final boolean K() {
        return true;
    }

    @Override // defpackage.q65
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        ou ouVar = this.p;
        float f = ouVar.a;
        if (f <= RecyclerView.A1) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ouVar.a = f;
        float f2 = ouVar.b;
        if (f2 <= RecyclerView.A1) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ouVar.b = f2;
        o0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.q65
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r7 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (F0() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r7 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (F0() != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // defpackage.q65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r5, int r6, defpackage.w65 r7, defpackage.c75 r8) {
        /*
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L9
            goto L96
        L9:
            vi0 r7 = r4.q
            int r7 = r7.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L47
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L4c
            r3 = 33
            if (r6 == r3) goto L49
            r3 = 66
            if (r6 == r3) goto L3f
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L39:
            r6 = r0
            goto L55
        L3b:
            if (r7 != r2) goto L39
        L3d:
            r6 = r2
            goto L55
        L3f:
            if (r7 != 0) goto L39
            boolean r6 = r4.F0()
            if (r6 == 0) goto L3d
        L47:
            r6 = r1
            goto L55
        L49:
            if (r7 != r2) goto L39
            goto L47
        L4c:
            if (r7 != 0) goto L39
            boolean r6 = r4.F0()
            if (r6 == 0) goto L47
            goto L3d
        L55:
            if (r6 != r0) goto L58
            goto L96
        L58:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = defpackage.q65.G(r5)
            if (r5 != 0) goto L62
            goto L96
        L62:
            android.view.View r5 = r4.u(r7)
            int r5 = defpackage.q65.G(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.B()
            if (r5 < r6) goto L74
            goto L7a
        L74:
            vi0 r4 = r4.q
            r4.a()
            throw r8
        L7a:
            boolean r5 = r4.F0()
            if (r5 == 0) goto L86
            int r5 = r4.v()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.u(r7)
            return r4
        L8b:
            int r5 = defpackage.q65.G(r5)
            int r6 = r4.B()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
        L96:
            return r8
        L97:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = defpackage.q65.G(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.B()
            if (r5 < r6) goto Lae
            goto Lb4
        Lae:
            vi0 r4 = r4.q
            r4.a()
            throw r8
        Lb4:
            boolean r5 = r4.F0()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.v()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r4 = r4.u(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, w65, c75):android.view.View");
    }

    @Override // defpackage.q65
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(q65.G(u(0)));
            accessibilityEvent.setToIndex(q65.G(u(v() - 1)));
        }
    }

    @Override // defpackage.q65
    public final void Y(int i, int i2) {
        B();
    }

    @Override // defpackage.q65
    public final void Z() {
        B();
    }

    @Override // defpackage.b75
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.q65
    public final void b0(int i, int i2) {
        B();
    }

    @Override // defpackage.q65
    public final boolean d() {
        return E0();
    }

    @Override // defpackage.q65
    public final void d0(w65 w65Var, c75 c75Var) {
        int i;
        if (c75Var.b() > 0) {
            if (E0()) {
                i = this.n;
            } else {
                i = this.o;
            }
            if (i > RecyclerView.A1) {
                F0();
                w65Var.e(0);
                i.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        j0(w65Var);
    }

    @Override // defpackage.q65
    public final boolean e() {
        return !E0();
    }

    @Override // defpackage.q65
    public final void e0(c75 c75Var) {
        if (v() == 0) {
            return;
        }
        q65.G(u(0));
    }

    @Override // defpackage.q65
    public final int j(c75 c75Var) {
        v();
        return 0;
    }

    @Override // defpackage.q65
    public final int k(c75 c75Var) {
        return 0;
    }

    @Override // defpackage.q65
    public final int l(c75 c75Var) {
        return 0;
    }

    @Override // defpackage.q65
    public final int m(c75 c75Var) {
        v();
        return 0;
    }

    @Override // defpackage.q65
    public final int n(c75 c75Var) {
        return 0;
    }

    @Override // defpackage.q65
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.q65
    public final int o(c75 c75Var) {
        return 0;
    }

    @Override // defpackage.q65
    public final int p0(int i, w65 w65Var, c75 c75Var) {
        if (!E0() || v() == 0 || i == 0) {
            return 0;
        }
        w65Var.e(0);
        i.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.q65
    public final r65 r() {
        return new r65(-2, -2);
    }

    @Override // defpackage.q65
    public final int r0(int i, w65 w65Var, c75 c75Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        w65Var.e(0);
        i.n("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.q65
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.q65
    public final void q0(int i) {
    }

    public CarouselLayoutManager() {
        ou ouVar = new ou();
        new ui0();
        this.r = new si0(0, this);
        this.p = ouVar;
        o0();
        G0(0);
    }
}
