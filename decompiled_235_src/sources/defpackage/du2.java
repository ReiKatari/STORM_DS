package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du2  reason: default package */
/* loaded from: classes.dex */
public final class du2 implements wt2 {
    public static final cu2 A = new Canvas();
    public final ko1 b;
    public final ak0 c;
    public final oo7 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public long x;
    public float y;
    public m50 z;

    public du2(ko1 ko1Var) {
        ak0 ak0Var = new ak0();
        zj0 zj0Var = new zj0();
        this.b = ko1Var;
        this.c = ak0Var;
        oo7 oo7Var = new oo7(ko1Var, ak0Var, zj0Var);
        this.d = oo7Var;
        this.e = ko1Var.getResources();
        this.f = new Rect();
        ko1Var.addView(oo7Var);
        oo7Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = kt0.b;
        this.w = j;
        this.x = j;
    }

    @Override // defpackage.wt2
    public final float A() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.wt2
    public final void B(long j, int i, int i2) {
        boolean b = q93.b(this.j, j);
        oo7 oo7Var = this.d;
        if (!b) {
            if (this.m || oo7Var.getClipToOutline()) {
                this.k = true;
            }
            int i3 = (int) (j >> 32);
            int i4 = (int) (4294967295L & j);
            oo7Var.layout(i, i2, i + i3, i2 + i4);
            this.j = j;
            if (this.q) {
                oo7Var.setPivotX(i3 / 2.0f);
                oo7Var.setPivotY(i4 / 2.0f);
            }
        } else {
            int i5 = this.h;
            if (i5 != i) {
                oo7Var.offsetLeftAndRight(i - i5);
            }
            int i6 = this.i;
            if (i6 != i2) {
                oo7Var.offsetTopAndBottom(i2 - i6);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.wt2
    public final float C() {
        return this.t;
    }

    @Override // defpackage.wt2
    public final void D(m50 m50Var) {
        RenderEffect renderEffect;
        this.z = m50Var;
        if (Build.VERSION.SDK_INT >= 31) {
            if (m50Var != null) {
                renderEffect = m50Var.a();
            } else {
                renderEffect = null;
            }
            this.d.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.wt2
    public final void E(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z && !this.l) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.m = z2;
        this.k = true;
        if (z && this.l) {
            z3 = true;
        }
        this.d.setClipToOutline(z3);
    }

    @Override // defpackage.wt2
    public final float F() {
        return RecyclerView.B1;
    }

    @Override // defpackage.wt2
    public final void G(qh1 qh1Var, kk3 kk3Var, ut2 ut2Var, mc mcVar) {
        oo7 oo7Var = this.d;
        ViewParent parent = oo7Var.getParent();
        ko1 ko1Var = this.b;
        if (parent == null) {
            ko1Var.addView(oo7Var);
        }
        oo7Var.f0 = qh1Var;
        oo7Var.g0 = kk3Var;
        oo7Var.h0 = mcVar;
        oo7Var.i0 = ut2Var;
        if (oo7Var.isAttachedToWindow()) {
            oo7Var.setVisibility(4);
            oo7Var.setVisibility(0);
            try {
                ak0 ak0Var = this.c;
                cu2 cu2Var = A;
                wd wdVar = ak0Var.a;
                Canvas canvas = wdVar.a;
                wdVar.a = cu2Var;
                ko1Var.a(wdVar, oo7Var, oo7Var.getDrawingTime());
                ak0Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.wt2
    public final void H(int i) {
        this.o = i;
        Q();
    }

    @Override // defpackage.wt2
    public final void I(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.wt2
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            this.d.setOutlineSpotShadowColor(hv.b0(j));
        }
    }

    @Override // defpackage.wt2
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.wt2
    public final void L(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.wt2
    public final float M() {
        return this.v;
    }

    @Override // defpackage.wt2
    public final float N() {
        return this.s;
    }

    @Override // defpackage.wt2
    public final int O() {
        return this.n;
    }

    public final void P(int i) {
        oo7 oo7Var = this.d;
        boolean z = true;
        if (i == 1) {
            oo7Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                oo7Var.setLayerType(0, paint);
                z = false;
            } else {
                oo7Var.setLayerType(0, paint);
            }
        }
        oo7Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // defpackage.wt2
    public final float a() {
        return this.p;
    }

    @Override // defpackage.wt2
    public final float b() {
        return this.r;
    }

    @Override // defpackage.wt2
    public final void c(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.wt2
    public final m50 d() {
        return this.z;
    }

    @Override // defpackage.wt2
    public final void e(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.wt2
    public final void f(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.wt2
    public final void g(Outline outline, long j) {
        oo7 oo7Var = this.d;
        oo7Var.d0 = outline;
        oo7Var.invalidateOutline();
        boolean z = false;
        if ((this.m || oo7Var.getClipToOutline()) && outline != null) {
            oo7Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        if (outline != null) {
            z = true;
        }
        this.l = z;
    }

    @Override // defpackage.wt2
    public final void h(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(f04.T(i)));
        Q();
    }

    @Override // defpackage.wt2
    public final void i() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.wt2
    public final void j(xj0 xj0Var) {
        Rect rect;
        boolean z = this.k;
        oo7 oo7Var = this.d;
        if (z) {
            if ((this.m || oo7Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = oo7Var.getWidth();
                rect.bottom = oo7Var.getHeight();
            } else {
                rect = null;
            }
            oo7Var.setClipBounds(rect);
        }
        Canvas canvas = xd.a;
        if (((wd) xj0Var).a.isHardwareAccelerated()) {
            this.b.a(xj0Var, oo7Var, oo7Var.getDrawingTime());
        }
    }

    @Override // defpackage.wt2
    public final int k() {
        return this.o;
    }

    @Override // defpackage.wt2
    public final z40 l() {
        return null;
    }

    @Override // defpackage.wt2
    public final void m(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.wt2
    public final float n() {
        return RecyclerView.B1;
    }

    @Override // defpackage.wt2
    public final float p() {
        return this.y;
    }

    @Override // defpackage.wt2
    public final void q(long j) {
        int i = ((9223372034707292159L & j) > 9205357640488583168L ? 1 : ((9223372034707292159L & j) == 9205357640488583168L ? 0 : -1));
        oo7 oo7Var = this.d;
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                oo7Var.resetPivot();
                return;
            }
            this.q = true;
            oo7Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            oo7Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
            return;
        }
        this.q = false;
        oo7Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        oo7Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.wt2
    public final long r() {
        return this.w;
    }

    @Override // defpackage.wt2
    public final void s() {
        this.d.setRotationX(RecyclerView.B1);
    }

    @Override // defpackage.wt2
    public final void t(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.wt2
    public final float u() {
        return this.u;
    }

    @Override // defpackage.wt2
    public final void v() {
        this.d.setRotationY(RecyclerView.B1);
    }

    @Override // defpackage.wt2
    public final long w() {
        return this.x;
    }

    @Override // defpackage.wt2
    public final void x(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.d.setOutlineAmbientShadowColor(hv.b0(j));
        }
    }

    @Override // defpackage.wt2
    public final void y() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // defpackage.wt2
    public final void z(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }
}
