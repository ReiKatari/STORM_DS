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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zn2  reason: default package */
/* loaded from: classes.dex */
public final class zn2 implements rn2 {
    public static final yn2 z = new Canvas();
    public final ek1 b;
    public final sh0 c;
    public final oa7 d;
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
    public long v;
    public long w;
    public float x;
    public o30 y;

    public zn2(ek1 ek1Var) {
        sh0 sh0Var = new sh0();
        rh0 rh0Var = new rh0();
        this.b = ek1Var;
        this.c = sh0Var;
        oa7 oa7Var = new oa7(ek1Var, sh0Var, rh0Var);
        this.d = oa7Var;
        this.e = ek1Var.getResources();
        this.f = new Rect();
        ek1Var.addView(oa7Var);
        oa7Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = xq0.b;
        this.v = j;
        this.w = j;
    }

    @Override // defpackage.rn2
    public final void A(od1 od1Var, sd3 sd3Var, pn2 pn2Var, yb ybVar) {
        oa7 oa7Var = this.d;
        ViewParent parent = oa7Var.getParent();
        ek1 ek1Var = this.b;
        if (parent == null) {
            ek1Var.addView(oa7Var);
        }
        oa7Var.e0 = od1Var;
        oa7Var.f0 = sd3Var;
        oa7Var.g0 = ybVar;
        oa7Var.h0 = pn2Var;
        if (oa7Var.isAttachedToWindow()) {
            oa7Var.setVisibility(4);
            oa7Var.setVisibility(0);
            try {
                sh0 sh0Var = this.c;
                yn2 yn2Var = z;
                id idVar = sh0Var.a;
                Canvas canvas = idVar.a;
                idVar.a = yn2Var;
                ek1Var.a(idVar, oa7Var, oa7Var.getDrawingTime());
                sh0Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.rn2
    public final b30 B() {
        return null;
    }

    @Override // defpackage.rn2
    public final void C(int i) {
        this.o = i;
        Q();
    }

    @Override // defpackage.rn2
    public final void D(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.d.setOutlineSpotShadowColor(mh7.h0(j));
        }
    }

    @Override // defpackage.rn2
    public final void E(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.rn2
    public final Matrix F() {
        return this.d.getMatrix();
    }

    @Override // defpackage.rn2
    public final float G() {
        return RecyclerView.A1;
    }

    @Override // defpackage.rn2
    public final void H(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.rn2
    public final float I() {
        return this.u;
    }

    @Override // defpackage.rn2
    public final float K() {
        return this.s;
    }

    @Override // defpackage.rn2
    public final float L() {
        return this.x;
    }

    @Override // defpackage.rn2
    public final int M() {
        return this.n;
    }

    @Override // defpackage.rn2
    public final void N(long j) {
        int i = ((9223372034707292159L & j) > 9205357640488583168L ? 1 : ((9223372034707292159L & j) == 9205357640488583168L ? 0 : -1));
        oa7 oa7Var = this.d;
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                oa7Var.resetPivot();
                return;
            }
            this.q = true;
            oa7Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            oa7Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
            return;
        }
        this.q = false;
        oa7Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        oa7Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.rn2
    public final long O() {
        return this.v;
    }

    public final void P(int i) {
        oa7 oa7Var = this.d;
        boolean z2 = true;
        if (i == 1) {
            oa7Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                oa7Var.setLayerType(0, paint);
                z2 = false;
            } else {
                oa7Var.setLayerType(0, paint);
            }
        }
        oa7Var.setCanUseCompositingLayer$ui_graphics(z2);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // defpackage.rn2
    public final float a() {
        return this.p;
    }

    @Override // defpackage.rn2
    public final void b() {
        this.d.setRotationX(RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.rn2
    public final float d() {
        return this.r;
    }

    @Override // defpackage.rn2
    public final void e(float f) {
        this.u = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.rn2
    public final float f() {
        return this.t;
    }

    @Override // defpackage.rn2
    public final o30 g() {
        return this.y;
    }

    @Override // defpackage.rn2
    public final void h(float f) {
        this.x = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.rn2
    public final void i() {
        this.d.setRotationY(RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void j(float f) {
        this.t = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.rn2
    public final long k() {
        return this.w;
    }

    @Override // defpackage.rn2
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineAmbientShadowColor(mh7.h0(j));
        }
    }

    @Override // defpackage.rn2
    public final void m(Outline outline, long j) {
        oa7 oa7Var = this.d;
        oa7Var.c0 = outline;
        oa7Var.invalidateOutline();
        boolean z2 = false;
        if ((this.m || oa7Var.getClipToOutline()) && outline != null) {
            oa7Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        if (outline != null) {
            z2 = true;
        }
        this.l = z2;
    }

    @Override // defpackage.rn2
    public final void n() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // defpackage.rn2
    public final void o(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.rn2
    public final void p(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(pu.M(i)));
        Q();
    }

    @Override // defpackage.rn2
    public final float q() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.rn2
    public final void r() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.rn2
    public final void s(long j, int i, int i2) {
        boolean b = i33.b(this.j, j);
        oa7 oa7Var = this.d;
        if (!b) {
            if (this.m || oa7Var.getClipToOutline()) {
                this.k = true;
            }
            int i3 = (int) (j >> 32);
            int i4 = (int) (4294967295L & j);
            oa7Var.layout(i, i2, i + i3, i2 + i4);
            this.j = j;
            if (this.q) {
                oa7Var.setPivotX(i3 / 2.0f);
                oa7Var.setPivotY(i4 / 2.0f);
            }
        } else {
            int i5 = this.h;
            if (i5 != i) {
                oa7Var.offsetLeftAndRight(i - i5);
            }
            int i6 = this.i;
            if (i6 != i2) {
                oa7Var.offsetTopAndBottom(i2 - i6);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.rn2
    public final float t() {
        return RecyclerView.A1;
    }

    @Override // defpackage.rn2
    public final void u(o30 o30Var) {
        RenderEffect renderEffect;
        this.y = o30Var;
        if (Build.VERSION.SDK_INT >= 31) {
            if (o30Var != null) {
                renderEffect = o30Var.a();
            } else {
                renderEffect = null;
            }
            this.d.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.rn2
    public final void v() {
        this.d.setTranslationX(RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void w(oh0 oh0Var) {
        Rect rect;
        boolean z2 = this.k;
        oa7 oa7Var = this.d;
        if (z2) {
            if ((this.m || oa7Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = oa7Var.getWidth();
                rect.bottom = oa7Var.getHeight();
            } else {
                rect = null;
            }
            oa7Var.setClipBounds(rect);
        }
        Canvas canvas = jd.a;
        if (((id) oh0Var).a.isHardwareAccelerated()) {
            this.b.a(oh0Var, oa7Var, oa7Var.getDrawingTime());
        }
    }

    @Override // defpackage.rn2
    public final void x(boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (z2 && !this.l) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.m = z3;
        this.k = true;
        if (z2 && this.l) {
            z4 = true;
        }
        this.d.setClipToOutline(z4);
    }

    @Override // defpackage.rn2
    public final int y() {
        return this.o;
    }

    @Override // defpackage.rn2
    public final float z() {
        return RecyclerView.A1;
    }
}
