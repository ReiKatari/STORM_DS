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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xn2  reason: default package */
/* loaded from: classes.dex */
public final class xn2 implements rn2 {
    public final sh0 b;
    public final rh0 c;
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
    public long o;
    public long p;
    public float q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public o30 v;
    public int w;

    public xn2() {
        sh0 sh0Var = new sh0();
        rh0 rh0Var = new rh0();
        this.b = sh0Var;
        this.c = rh0Var;
        RenderNode e = wn2.e();
        this.d = e;
        this.e = 0L;
        e.setClipToBounds(false);
        Q(e, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = xq0.b;
        this.o = j;
        this.p = j;
        this.r = 8.0f;
        this.w = 0;
    }

    @Override // defpackage.rn2
    public final void A(od1 od1Var, sd3 sd3Var, pn2 pn2Var, yb ybVar) {
        RecordingCanvas beginRecording;
        rh0 rh0Var = this.c;
        beginRecording = this.d.beginRecording();
        try {
            sh0 sh0Var = this.b;
            id idVar = sh0Var.a;
            Canvas canvas = idVar.a;
            idVar.a = beginRecording;
            os osVar = rh0Var.B;
            osVar.O(od1Var);
            osVar.P(sd3Var);
            osVar.L = pn2Var;
            osVar.Q(this.e);
            osVar.N(idVar);
            ybVar.n(rh0Var);
            sh0Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.rn2
    public final b30 B() {
        return null;
    }

    @Override // defpackage.rn2
    public final void C(int i) {
        this.w = i;
        R();
    }

    @Override // defpackage.rn2
    public final void D(long j) {
        this.p = j;
        this.d.setSpotShadowColor(mh7.h0(j));
    }

    @Override // defpackage.rn2
    public final void E(float f) {
        this.l = f;
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
        this.r = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.rn2
    public final float I() {
        return this.n;
    }

    @Override // defpackage.rn2
    public final boolean J() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.rn2
    public final float K() {
        return this.l;
    }

    @Override // defpackage.rn2
    public final float L() {
        return this.q;
    }

    @Override // defpackage.rn2
    public final int M() {
        return this.j;
    }

    @Override // defpackage.rn2
    public final void N(long j) {
        int i = ((9223372034707292159L & j) > 9205357640488583168L ? 1 : ((9223372034707292159L & j) == 9205357640488583168L ? 0 : -1));
        RenderNode renderNode = this.d;
        if (i == 0) {
            renderNode.resetPivot();
            return;
        }
        renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.rn2
    public final long O() {
        return this.o;
    }

    public final void P() {
        boolean z;
        boolean z2 = this.s;
        boolean z3 = false;
        if (z2 && !this.h) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.h) {
            z3 = true;
        }
        if (z != this.t) {
            this.t = z;
            this.d.setClipToBounds(z);
        }
        if (z3 != this.u) {
            this.u = z3;
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
        int i = this.w;
        if (i != 1 && this.j == 3 && this.v == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // defpackage.rn2
    public final float a() {
        return this.i;
    }

    @Override // defpackage.rn2
    public final void b() {
        this.d.setRotationX(RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.rn2
    public final float d() {
        return this.k;
    }

    @Override // defpackage.rn2
    public final void e(float f) {
        this.n = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.rn2
    public final float f() {
        return this.m;
    }

    @Override // defpackage.rn2
    public final o30 g() {
        return this.v;
    }

    @Override // defpackage.rn2
    public final void h(float f) {
        this.q = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.rn2
    public final void i() {
        this.d.setRotationY(RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void j(float f) {
        this.m = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.rn2
    public final long k() {
        return this.p;
    }

    @Override // defpackage.rn2
    public final void l(long j) {
        this.o = j;
        this.d.setAmbientShadowColor(mh7.h0(j));
    }

    @Override // defpackage.rn2
    public final void m(Outline outline, long j) {
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

    @Override // defpackage.rn2
    public final void n() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // defpackage.rn2
    public final void o(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.rn2
    public final void p(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(pu.J(i));
        R();
    }

    @Override // defpackage.rn2
    public final float q() {
        return this.r;
    }

    @Override // defpackage.rn2
    public final void r() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.rn2
    public final void s(long j, int i, int i2) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = hk2.U(j);
    }

    @Override // defpackage.rn2
    public final float t() {
        return RecyclerView.A1;
    }

    @Override // defpackage.rn2
    public final void u(o30 o30Var) {
        RenderEffect renderEffect;
        this.v = o30Var;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = this.d;
            if (o30Var != null) {
                renderEffect = o30Var.a();
            } else {
                renderEffect = null;
            }
            renderNode.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.rn2
    public final void v() {
        this.d.setTranslationX(RecyclerView.A1);
    }

    @Override // defpackage.rn2
    public final void w(oh0 oh0Var) {
        Canvas canvas = jd.a;
        ((id) oh0Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.rn2
    public final void x(boolean z) {
        this.s = z;
        P();
    }

    @Override // defpackage.rn2
    public final int y() {
        return this.w;
    }

    @Override // defpackage.rn2
    public final float z() {
        return RecyclerView.A1;
    }
}
