package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu2  reason: default package */
/* loaded from: classes.dex */
public final class bu2 implements wt2 {
    public final ak0 b;
    public final zj0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public m50 w;
    public int x;

    public bu2() {
        ak0 ak0Var = new ak0();
        zj0 zj0Var = new zj0();
        this.b = ak0Var;
        this.c = zj0Var;
        RenderNode f = au2.f();
        this.d = f;
        this.e = 0L;
        f.setClipToBounds(false);
        Q(f, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = kt0.b;
        this.p = j;
        this.q = j;
        this.s = 8.0f;
        this.x = 0;
    }

    @Override // defpackage.wt2
    public final float A() {
        return this.s;
    }

    @Override // defpackage.wt2
    public final void B(long j, int i, int i2) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = qo2.S(j);
    }

    @Override // defpackage.wt2
    public final float C() {
        return this.m;
    }

    @Override // defpackage.wt2
    public final void D(m50 m50Var) {
        RenderEffect renderEffect;
        this.w = m50Var;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = this.d;
            if (m50Var != null) {
                renderEffect = m50Var.a();
            } else {
                renderEffect = null;
            }
            renderNode.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.wt2
    public final void E(boolean z) {
        this.t = z;
        P();
    }

    @Override // defpackage.wt2
    public final float F() {
        return RecyclerView.B1;
    }

    @Override // defpackage.wt2
    public final void G(qh1 qh1Var, kk3 kk3Var, ut2 ut2Var, mc mcVar) {
        RecordingCanvas beginRecording;
        zj0 zj0Var = this.c;
        beginRecording = this.d.beginRecording();
        try {
            ak0 ak0Var = this.b;
            wd wdVar = ak0Var.a;
            Canvas canvas = wdVar.a;
            wdVar.a = beginRecording;
            bt btVar = zj0Var.B;
            btVar.W(qh1Var);
            btVar.X(kk3Var);
            btVar.L = ut2Var;
            btVar.Y(this.e);
            btVar.V(wdVar);
            mcVar.g(zj0Var);
            ak0Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.wt2
    public final void H(int i) {
        this.x = i;
        R();
    }

    @Override // defpackage.wt2
    public final void I(float f) {
        this.m = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.wt2
    public final void J(long j) {
        this.q = j;
        this.d.setSpotShadowColor(hv.b0(j));
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
        this.s = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.wt2
    public final float M() {
        return this.o;
    }

    @Override // defpackage.wt2
    public final float N() {
        return this.l;
    }

    @Override // defpackage.wt2
    public final int O() {
        return this.j;
    }

    public final void P() {
        boolean z;
        boolean z2 = this.t;
        boolean z3 = false;
        if (z2 && !this.h) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.h) {
            z3 = true;
        }
        if (z != this.u) {
            this.u = z;
            this.d.setClipToBounds(z);
        }
        if (z3 != this.v) {
            this.v = z3;
            this.d.setClipToOutline(z3);
        }
    }

    public final void Q(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.x;
        if (i != 1 && this.j == 3 && this.w == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // defpackage.wt2
    public final float a() {
        return this.i;
    }

    @Override // defpackage.wt2
    public final float b() {
        return this.k;
    }

    @Override // defpackage.wt2
    public final void c(float f) {
        this.o = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.wt2
    public final m50 d() {
        return this.w;
    }

    @Override // defpackage.wt2
    public final void e(float f) {
        this.r = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.wt2
    public final void f(float f) {
        this.n = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.wt2
    public final void g(Outline outline, long j) {
        boolean z;
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
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(f04.S(i));
        R();
    }

    @Override // defpackage.wt2
    public final void i() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.wt2
    public final void j(xj0 xj0Var) {
        Canvas canvas = xd.a;
        ((wd) xj0Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.wt2
    public final int k() {
        return this.x;
    }

    @Override // defpackage.wt2
    public final z40 l() {
        return null;
    }

    @Override // defpackage.wt2
    public final void m(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.wt2
    public final float n() {
        return RecyclerView.B1;
    }

    @Override // defpackage.wt2
    public final boolean o() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.wt2
    public final float p() {
        return this.r;
    }

    @Override // defpackage.wt2
    public final void q(long j) {
        int i = ((9223372034707292159L & j) > 9205357640488583168L ? 1 : ((9223372034707292159L & j) == 9205357640488583168L ? 0 : -1));
        RenderNode renderNode = this.d;
        if (i == 0) {
            renderNode.resetPivot();
            return;
        }
        renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.wt2
    public final long r() {
        return this.p;
    }

    @Override // defpackage.wt2
    public final void s() {
        this.d.setRotationX(RecyclerView.B1);
    }

    @Override // defpackage.wt2
    public final void t(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.wt2
    public final float u() {
        return this.n;
    }

    @Override // defpackage.wt2
    public final void v() {
        this.d.setRotationY(RecyclerView.B1);
    }

    @Override // defpackage.wt2
    public final long w() {
        return this.q;
    }

    @Override // defpackage.wt2
    public final void x(long j) {
        this.p = j;
        this.d.setAmbientShadowColor(hv.b0(j));
    }

    @Override // defpackage.wt2
    public final void y() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // defpackage.wt2
    public final void z(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }
}
