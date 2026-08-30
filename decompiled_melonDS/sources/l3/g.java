package l3;

import a4.n;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import i3.q;
import i3.r;
import i3.s;
import i3.z;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b  reason: collision with root package name */
    public final r f8729b;

    /* renamed from: c  reason: collision with root package name */
    public final k3.b f8730c;

    /* renamed from: d  reason: collision with root package name */
    public final RenderNode f8731d;

    /* renamed from: e  reason: collision with root package name */
    public long f8732e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f8733f;

    /* renamed from: g  reason: collision with root package name */
    public Matrix f8734g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8735h;

    /* renamed from: i  reason: collision with root package name */
    public float f8736i;

    /* renamed from: j  reason: collision with root package name */
    public int f8737j;

    /* renamed from: k  reason: collision with root package name */
    public float f8738k;

    /* renamed from: l  reason: collision with root package name */
    public float f8739l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public long f8740n;

    /* renamed from: o  reason: collision with root package name */
    public long f8741o;

    /* renamed from: p  reason: collision with root package name */
    public float f8742p;

    /* renamed from: q  reason: collision with root package name */
    public float f8743q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8744r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8745s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8746t;

    /* renamed from: u  reason: collision with root package name */
    public int f8747u;

    public g() {
        r rVar = new r();
        k3.b bVar = new k3.b();
        this.f8729b = rVar;
        this.f8730c = bVar;
        RenderNode c4 = f.c();
        this.f8731d = c4;
        this.f8732e = 0L;
        c4.setClipToBounds(false);
        O(c4, 0);
        this.f8736i = 1.0f;
        this.f8737j = 3;
        this.f8738k = 1.0f;
        this.f8739l = 1.0f;
        long j2 = s.f6681b;
        this.f8740n = j2;
        this.f8741o = j2;
        this.f8743q = 8.0f;
        this.f8747u = 0;
    }

    @Override // l3.d
    public final void A(float f8) {
        this.f8739l = f8;
        this.f8731d.setScaleY(f8);
    }

    @Override // l3.d
    public final Matrix B() {
        Matrix matrix = this.f8734g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f8734g = matrix;
        }
        this.f8731d.getMatrix(matrix);
        return matrix;
    }

    @Override // l3.d
    public final void C(x4.c cVar, m mVar, b bVar, a4.a aVar) {
        RecordingCanvas beginRecording;
        k3.b bVar2 = this.f8730c;
        beginRecording = this.f8731d.beginRecording();
        try {
            r rVar = this.f8729b;
            i3.b bVar3 = rVar.f6680a;
            Canvas canvas = bVar3.f6615a;
            bVar3.f6615a = beginRecording;
            n nVar = bVar2.B;
            nVar.H(cVar);
            nVar.I(mVar);
            nVar.L = bVar;
            nVar.J(this.f8732e);
            nVar.G(bVar3);
            aVar.k(bVar2);
            rVar.f6680a.f6615a = canvas;
        } finally {
            this.f8731d.endRecording();
        }
    }

    @Override // l3.d
    public final float D() {
        return 0.0f;
    }

    @Override // l3.d
    public final void E(float f8) {
        this.f8743q = f8;
        this.f8731d.setCameraDistance(f8);
    }

    @Override // l3.d
    public final float F() {
        return this.m;
    }

    @Override // l3.d
    public final boolean G() {
        boolean hasDisplayList;
        hasDisplayList = this.f8731d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // l3.d
    public final float H() {
        return this.f8739l;
    }

    @Override // l3.d
    public final float I() {
        return this.f8742p;
    }

    @Override // l3.d
    public final int J() {
        return this.f8737j;
    }

    @Override // l3.d
    public final void K(long j2) {
        int i2 = ((9223372034707292159L & j2) > 9205357640488583168L ? 1 : ((9223372034707292159L & j2) == 9205357640488583168L ? 0 : -1));
        RenderNode renderNode = this.f8731d;
        if (i2 == 0) {
            renderNode.resetPivot();
            return;
        }
        renderNode.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
        this.f8731d.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // l3.d
    public final long L() {
        return this.f8740n;
    }

    @Override // l3.d
    public final void M(q qVar) {
        Canvas canvas = i3.c.f6619a;
        ((i3.b) qVar).f6615a.drawRenderNode(this.f8731d);
    }

    public final void N() {
        boolean z10;
        boolean z11 = this.f8744r;
        boolean z12 = false;
        if (z11 && !this.f8735h) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 && this.f8735h) {
            z12 = true;
        }
        if (z10 != this.f8745s) {
            this.f8745s = z10;
            this.f8731d.setClipToBounds(z10);
        }
        if (z12 != this.f8746t) {
            this.f8746t = z12;
            this.f8731d.setClipToOutline(z12);
        }
    }

    public final void O(RenderNode renderNode, int i2) {
        Paint paint = this.f8733f;
        if (i2 == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i2 == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i2 = this.f8747u;
        if (i2 != 1 && this.f8737j == 3) {
            O(this.f8731d, i2);
        } else {
            O(this.f8731d, 1);
        }
    }

    @Override // l3.d
    public final float a() {
        return this.f8736i;
    }

    @Override // l3.d
    public final void b() {
        this.f8731d.setRotationX(0.0f);
    }

    @Override // l3.d
    public final void c(float f8) {
        this.f8736i = f8;
        this.f8731d.setAlpha(f8);
    }

    @Override // l3.d
    public final float d() {
        return this.f8738k;
    }

    @Override // l3.d
    public final void e(float f8) {
        this.m = f8;
        this.f8731d.setElevation(f8);
    }

    @Override // l3.d
    public final float f() {
        return 0.0f;
    }

    @Override // l3.d
    public final void g() {
        this.f8731d.setTranslationY(0.0f);
    }

    @Override // l3.d
    public final void h(float f8) {
        this.f8742p = f8;
        this.f8731d.setRotationZ(f8);
    }

    @Override // l3.d
    public final void i() {
        this.f8731d.setRotationY(0.0f);
    }

    @Override // l3.d
    public final long j() {
        return this.f8741o;
    }

    @Override // l3.d
    public final void k(long j2) {
        this.f8740n = j2;
        this.f8731d.setAmbientShadowColor(z.y(j2));
    }

    @Override // l3.d
    public final void l(Outline outline, long j2) {
        boolean z10;
        this.f8731d.setOutline(outline);
        if (outline != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8735h = z10;
        N();
    }

    @Override // l3.d
    public final void m() {
        Paint paint = this.f8733f;
        if (paint == null) {
            paint = new Paint();
            this.f8733f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // l3.d
    public final void n(float f8) {
        this.f8738k = f8;
        this.f8731d.setScaleX(f8);
    }

    @Override // l3.d
    public final void o(int i2) {
        this.f8737j = i2;
        Paint paint = this.f8733f;
        if (paint == null) {
            paint = new Paint();
            this.f8733f = paint;
        }
        paint.setBlendMode(z.v(i2));
        P();
    }

    @Override // l3.d
    public final float p() {
        return this.f8743q;
    }

    @Override // l3.d
    public final void q() {
        this.f8731d.discardDisplayList();
    }

    @Override // l3.d
    public final void r(long j2, int i2, int i10) {
        this.f8731d.setPosition(i2, i10, ((int) (j2 >> 32)) + i2, ((int) (4294967295L & j2)) + i10);
        this.f8732e = zb.k.T(j2);
    }

    @Override // l3.d
    public final float s() {
        return 0.0f;
    }

    @Override // l3.d
    public final void t() {
        this.f8731d.setTranslationX(0.0f);
    }

    @Override // l3.d
    public final void u(boolean z10) {
        this.f8744r = z10;
        N();
    }

    @Override // l3.d
    public final int v() {
        return this.f8747u;
    }

    @Override // l3.d
    public final float w() {
        return 0.0f;
    }

    @Override // l3.d
    public final i3.l x() {
        return null;
    }

    @Override // l3.d
    public final void y(int i2) {
        this.f8747u = i2;
        P();
    }

    @Override // l3.d
    public final void z(long j2) {
        this.f8741o = j2;
        this.f8731d.setSpotShadowColor(z.y(j2));
    }
}
