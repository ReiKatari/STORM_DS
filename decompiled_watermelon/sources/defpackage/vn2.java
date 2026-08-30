package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vn2  reason: default package */
/* loaded from: classes.dex */
public final class vn2 implements rn2 {
    public static final AtomicBoolean z = new AtomicBoolean(true);
    public final sh0 b;
    public final rh0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public o30 y;

    public vn2(ee eeVar, sh0 sh0Var, rh0 rh0Var) {
        this.b = sh0Var;
        this.c = rh0Var;
        RenderNode create = RenderNode.create("Compose", eeVar);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (z.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                s95.c(create, s95.a(create));
                s95.d(create, s95.b(create));
            }
            r95.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = xq0.b;
        this.r = j;
        this.s = j;
        this.u = 8.0f;
    }

    @Override // defpackage.rn2
    public final void A(od1 od1Var, sd3 sd3Var, pn2 pn2Var, yb ybVar) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            id idVar = this.b.a;
            Canvas canvas = idVar.a;
            idVar.a = start;
            rh0 rh0Var = this.c;
            os osVar = rh0Var.B;
            long U = hk2.U(this.e);
            od1 v = osVar.v();
            sd3 A = osVar.A();
            oh0 s = osVar.s();
            long E = osVar.E();
            pn2 pn2Var2 = (pn2) osVar.L;
            osVar.O(od1Var);
            osVar.P(sd3Var);
            osVar.N(idVar);
            osVar.Q(U);
            osVar.L = pn2Var;
            idVar.m();
            ybVar.n(rh0Var);
            idVar.j();
            osVar.O(v);
            osVar.P(A);
            osVar.N(s);
            osVar.Q(E);
            osVar.L = pn2Var2;
            idVar.a = canvas;
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.rn2
    public final b30 B() {
        return null;
    }

    @Override // defpackage.rn2
    public final void C(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.rn2
    public final void D(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            s95.d(this.d, mh7.h0(j));
        }
    }

    @Override // defpackage.rn2
    public final void E(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.rn2
    public final Matrix F() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.rn2
    public final float G() {
        return RecyclerView.A1;
    }

    @Override // defpackage.rn2
    public final void H(float f) {
        this.u = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.rn2
    public final float I() {
        return this.q;
    }

    @Override // defpackage.rn2
    public final boolean J() {
        return this.d.isValid();
    }

    @Override // defpackage.rn2
    public final float K() {
        return this.o;
    }

    @Override // defpackage.rn2
    public final float L() {
        return this.t;
    }

    @Override // defpackage.rn2
    public final int M() {
        return this.k;
    }

    @Override // defpackage.rn2
    public final void N(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
            return;
        }
        this.m = false;
        this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.rn2
    public final long O() {
        return this.r;
    }

    public final void P() {
        boolean z2;
        boolean z3 = this.v;
        boolean z4 = false;
        if (z3 && !this.h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 && this.h) {
            z4 = true;
        }
        if (z2 != this.w) {
            this.w = z2;
            this.d.setClipToBounds(z2);
        }
        if (z4 != this.x) {
            this.x = z4;
            this.d.setClipToOutline(z4);
        }
    }

    public final void Q(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            Q(i);
        } else {
            Q(1);
        }
    }

    @Override // defpackage.rn2
    public final float a() {
        return this.l;
    }

    @Override // defpackage.rn2
    public final void b() {
        this.d.setRotationX((float) RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void c(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.rn2
    public final float d() {
        return this.n;
    }

    @Override // defpackage.rn2
    public final void e(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.rn2
    public final float f() {
        return this.p;
    }

    @Override // defpackage.rn2
    public final o30 g() {
        return this.y;
    }

    @Override // defpackage.rn2
    public final void h(float f) {
        this.t = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.rn2
    public final void i() {
        this.d.setRotationY((float) RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void j(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.rn2
    public final long k() {
        return this.s;
    }

    @Override // defpackage.rn2
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            s95.c(this.d, mh7.h0(j));
        }
    }

    @Override // defpackage.rn2
    public final void m(Outline outline, long j) {
        boolean z2;
        this.i = j;
        this.d.setOutline(outline);
        if (outline != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        P();
    }

    @Override // defpackage.rn2
    public final void n() {
        R();
    }

    @Override // defpackage.rn2
    public final void o(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.rn2
    public final void p(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(pu.M(i)));
        R();
    }

    @Override // defpackage.rn2
    public final float q() {
        return this.u;
    }

    @Override // defpackage.rn2
    public final void r() {
        r95.a(this.d);
    }

    @Override // defpackage.rn2
    public final void s(long j, int i, int i2) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (!i33.b(this.e, j)) {
            if (this.m) {
                this.d.setPivotX(i3 / 2.0f);
                this.d.setPivotY(i4 / 2.0f);
            }
            this.e = j;
        }
    }

    @Override // defpackage.rn2
    public final float t() {
        return RecyclerView.A1;
    }

    @Override // defpackage.rn2
    public final void u(o30 o30Var) {
        this.y = o30Var;
    }

    @Override // defpackage.rn2
    public final void v() {
        this.d.setTranslationX((float) RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void w(oh0 oh0Var) {
        Canvas canvas = jd.a;
        DisplayListCanvas displayListCanvas = ((id) oh0Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.rn2
    public final void x(boolean z2) {
        this.v = z2;
        P();
    }

    @Override // defpackage.rn2
    public final int y() {
        return this.j;
    }

    @Override // defpackage.rn2
    public final float z() {
        return RecyclerView.A1;
    }
}
