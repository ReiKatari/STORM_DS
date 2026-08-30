package com.google.android.material.carousel;

import a0.j;
import aa.a;
import aa.b;
import aa.c;
import aa.d;
import aa.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c1.h2;
import j7.e1;
import j7.f1;
import j7.u0;
import j7.v0;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends u0 implements e1 {

    /* renamed from: p  reason: collision with root package name */
    public final f f3007p;

    /* renamed from: q  reason: collision with root package name */
    public d f3008q;

    /* renamed from: r  reason: collision with root package name */
    public final View.OnLayoutChangeListener f3009r;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i10) {
        new c();
        this.f3009r = new a(0, this);
        this.f3007p = new f();
        o0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13151b);
            obtainStyledAttributes.getInt(0, 0);
            o0();
            G0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // j7.u0
    public final void A0(RecyclerView recyclerView, int i2) {
        b bVar = new b(this, recyclerView.getContext());
        bVar.f7507a = i2;
        B0(bVar);
    }

    public final float D0(float f8, float f10) {
        if (F0()) {
            return f8 - f10;
        }
        return f8 + f10;
    }

    public final boolean E0() {
        if (this.f3008q.f682a == 0) {
            return true;
        }
        return false;
    }

    public final boolean F0() {
        if (E0() && this.f7709b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void G0(int i2) {
        d dVar;
        if (i2 != 0 && i2 != 1) {
            j.h(w.d.l(i2, "invalid orientation:"));
            return;
        }
        c(null);
        d dVar2 = this.f3008q;
        if (dVar2 != null && i2 == dVar2.f682a) {
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                dVar = new d(this, 0);
            } else {
                j.h("invalid orientation");
                return;
            }
        } else {
            dVar = new d(this, 1);
        }
        this.f3008q = dVar;
        o0();
    }

    @Override // j7.u0
    public final boolean K() {
        return true;
    }

    @Override // j7.u0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        f fVar = this.f3007p;
        float f8 = fVar.f685a;
        if (f8 <= 0.0f) {
            f8 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        fVar.f685a = f8;
        float f10 = fVar.f686b;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        fVar.f686b = f10;
        o0();
        recyclerView.addOnLayoutChangeListener(this.f3009r);
    }

    @Override // j7.u0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3009r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r6 == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (F0() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r6 == 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        if (F0() != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // j7.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r4, int r5, c1.h2 r6, j7.f1 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            aa.d r6 = r3.f3008q
            int r6 = r6.f682a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.F0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.F0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = j7.u0.G(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = j7.u0.G(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.B()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            aa.d r4 = r3.f3008q
            r4.a()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.F0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.u(r6)
            return r4
        L8b:
            int r4 = j7.u0.G(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = j7.u0.G(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.B()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            aa.d r4 = r3.f3008q
            r4.a()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.F0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, c1.h2, j7.f1):android.view.View");
    }

    @Override // j7.u0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(u0.G(u(0)));
            accessibilityEvent.setToIndex(u0.G(u(v() - 1)));
        }
    }

    @Override // j7.u0
    public final void Y(int i2, int i10) {
        B();
    }

    @Override // j7.u0
    public final void Z() {
        B();
    }

    @Override // j7.e1
    public final PointF a(int i2) {
        return null;
    }

    @Override // j7.u0
    public final void b0(int i2, int i10) {
        B();
    }

    @Override // j7.u0
    public final boolean d() {
        return E0();
    }

    @Override // j7.u0
    public final void d0(h2 h2Var, f1 f1Var) {
        int i2;
        if (f1Var.b() > 0) {
            if (E0()) {
                i2 = this.f7720n;
            } else {
                i2 = this.f7721o;
            }
            if (i2 > 0.0f) {
                F0();
                h2Var.e(0);
                j.p("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        j0(h2Var);
    }

    @Override // j7.u0
    public final boolean e() {
        return !E0();
    }

    @Override // j7.u0
    public final void e0(f1 f1Var) {
        if (v() == 0) {
            return;
        }
        u0.G(u(0));
    }

    @Override // j7.u0
    public final int j(f1 f1Var) {
        v();
        return 0;
    }

    @Override // j7.u0
    public final int k(f1 f1Var) {
        return 0;
    }

    @Override // j7.u0
    public final int l(f1 f1Var) {
        return 0;
    }

    @Override // j7.u0
    public final int m(f1 f1Var) {
        v();
        return 0;
    }

    @Override // j7.u0
    public final int n(f1 f1Var) {
        return 0;
    }

    @Override // j7.u0
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override // j7.u0
    public final int o(f1 f1Var) {
        return 0;
    }

    @Override // j7.u0
    public final int p0(int i2, h2 h2Var, f1 f1Var) {
        if (!E0() || v() == 0 || i2 == 0) {
            return 0;
        }
        h2Var.e(0);
        j.p("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // j7.u0
    public final v0 r() {
        return new v0(-2, -2);
    }

    @Override // j7.u0
    public final int r0(int i2, h2 h2Var, f1 f1Var) {
        if (!e() || v() == 0 || i2 == 0) {
            return 0;
        }
        h2Var.e(0);
        j.p("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // j7.u0
    public final void y(View view, Rect rect) {
        RecyclerView.N(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // j7.u0
    public final void q0(int i2) {
    }

    public CarouselLayoutManager() {
        f fVar = new f();
        new c();
        this.f3009r = new a(0, this);
        this.f3007p = fVar;
        o0();
        G0(0);
    }
}
