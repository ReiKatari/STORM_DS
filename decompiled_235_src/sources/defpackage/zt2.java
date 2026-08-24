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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt2  reason: default package */
/* loaded from: classes.dex */
public final class zt2 implements wt2 {
    public static final AtomicBoolean A = new AtomicBoolean(true);
    public final ak0 b;
    public final zj0 c;
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
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public m50 z;

    public zt2(te teVar, ak0 ak0Var, zj0 zj0Var) {
        this.b = ak0Var;
        this.c = zj0Var;
        RenderNode create = RenderNode.create("Compose", teVar);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (A.getAndSet(false)) {
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
                kj5.c(create, kj5.a(create));
                kj5.d(create, kj5.b(create));
            }
            jj5.a(create);
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
        long j = kt0.b;
        this.s = j;
        this.t = j;
        this.v = 8.0f;
    }

    @Override // defpackage.wt2
    public final float A() {
        return this.v;
    }

    @Override // defpackage.wt2
    public final void B(long j, int i, int i2) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (!q93.b(this.e, j)) {
            if (this.m) {
                this.d.setPivotX(i3 / 2.0f);
                this.d.setPivotY(i4 / 2.0f);
            }
            this.e = j;
        }
    }

    @Override // defpackage.wt2
    public final float C() {
        return this.p;
    }

    @Override // defpackage.wt2
    public final void D(m50 m50Var) {
        this.z = m50Var;
    }

    @Override // defpackage.wt2
    public final void E(boolean z) {
        this.w = z;
        P();
    }

    @Override // defpackage.wt2
    public final float F() {
        return RecyclerView.B1;
    }

    @Override // defpackage.wt2
    public final void G(qh1 qh1Var, kk3 kk3Var, ut2 ut2Var, mc mcVar) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            wd wdVar = this.b.a;
            Canvas canvas = wdVar.a;
            wdVar.a = start;
            zj0 zj0Var = this.c;
            bt btVar = zj0Var.B;
            long S = qo2.S(this.e);
            qh1 I = btVar.I();
            kk3 K = btVar.K();
            xj0 G = btVar.G();
            long L = btVar.L();
            ut2 ut2Var2 = (ut2) btVar.L;
            btVar.W(qh1Var);
            btVar.X(kk3Var);
            btVar.V(wdVar);
            btVar.Y(S);
            btVar.L = ut2Var;
            wdVar.h();
            mcVar.g(zj0Var);
            wdVar.p();
            btVar.W(I);
            btVar.X(K);
            btVar.V(G);
            btVar.Y(L);
            btVar.L = ut2Var2;
            wdVar.a = canvas;
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.wt2
    public final void H(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.wt2
    public final void I(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.wt2
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            kj5.d(this.d, hv.b0(j));
        }
    }

    @Override // defpackage.wt2
    public final Matrix K() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.wt2
    public final void L(float f) {
        this.v = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.wt2
    public final float M() {
        return this.r;
    }

    @Override // defpackage.wt2
    public final float N() {
        return this.o;
    }

    @Override // defpackage.wt2
    public final int O() {
        return this.k;
    }

    public final void P() {
        boolean z;
        boolean z2 = this.w;
        boolean z3 = false;
        if (z2 && !this.h) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.h) {
            z3 = true;
        }
        if (z != this.x) {
            this.x = z;
            this.d.setClipToBounds(z);
        }
        if (z3 != this.y) {
            this.y = z3;
            this.d.setClipToOutline(z3);
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

    @Override // defpackage.wt2
    public final float a() {
        return this.l;
    }

    @Override // defpackage.wt2
    public final float b() {
        return this.n;
    }

    @Override // defpackage.wt2
    public final void c(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.wt2
    public final m50 d() {
        return this.z;
    }

    @Override // defpackage.wt2
    public final void e(float f) {
        this.u = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.wt2
    public final void f(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.wt2
    public final void g(Outline outline, long j) {
        boolean z;
        this.i = j;
        this.d.setOutline(outline);
        if (outline != null) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        P();
    }

    @Override // defpackage.wt2
    public final void h(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(f04.T(i)));
        R();
    }

    @Override // defpackage.wt2
    public final void i() {
        jj5.a(this.d);
    }

    @Override // defpackage.wt2
    public final void j(xj0 xj0Var) {
        Canvas canvas = xd.a;
        DisplayListCanvas displayListCanvas = ((wd) xj0Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.wt2
    public final int k() {
        return this.j;
    }

    @Override // defpackage.wt2
    public final z40 l() {
        return null;
    }

    @Override // defpackage.wt2
    public final void m(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.wt2
    public final float n() {
        return RecyclerView.B1;
    }

    @Override // defpackage.wt2
    public final boolean o() {
        return this.d.isValid();
    }

    @Override // defpackage.wt2
    public final float p() {
        return this.u;
    }

    @Override // defpackage.wt2
    public final void q(long j) {
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

    @Override // defpackage.wt2
    public final long r() {
        return this.s;
    }

    @Override // defpackage.wt2
    public final void s() {
        this.d.setRotationX((float) RecyclerView.B1);
    }

    @Override // defpackage.wt2
    public final void t(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.wt2
    public final float u() {
        return this.q;
    }

    @Override // defpackage.wt2
    public final void v() {
        this.d.setRotationY((float) RecyclerView.B1);
    }

    @Override // defpackage.wt2
    public final long w() {
        return this.t;
    }

    @Override // defpackage.wt2
    public final void x(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            kj5.c(this.d, hv.b0(j));
        }
    }

    @Override // defpackage.wt2
    public final void y() {
        R();
    }

    @Override // defpackage.wt2
    public final void z(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }
}
