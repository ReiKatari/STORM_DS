package l3;

import a4.n;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import b4.x;
import i3.q;
import i3.r;
import i3.s;
import i3.z;
import java.util.concurrent.atomic.AtomicBoolean;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicBoolean f8707x = new AtomicBoolean(true);

    /* renamed from: b  reason: collision with root package name */
    public final r f8708b;

    /* renamed from: c  reason: collision with root package name */
    public final k3.b f8709c;

    /* renamed from: d  reason: collision with root package name */
    public final RenderNode f8710d;

    /* renamed from: e  reason: collision with root package name */
    public long f8711e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f8712f;

    /* renamed from: g  reason: collision with root package name */
    public Matrix f8713g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8714h;

    /* renamed from: i  reason: collision with root package name */
    public long f8715i;

    /* renamed from: j  reason: collision with root package name */
    public int f8716j;

    /* renamed from: k  reason: collision with root package name */
    public int f8717k;

    /* renamed from: l  reason: collision with root package name */
    public float f8718l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public float f8719n;

    /* renamed from: o  reason: collision with root package name */
    public float f8720o;

    /* renamed from: p  reason: collision with root package name */
    public float f8721p;

    /* renamed from: q  reason: collision with root package name */
    public long f8722q;

    /* renamed from: r  reason: collision with root package name */
    public long f8723r;

    /* renamed from: s  reason: collision with root package name */
    public float f8724s;

    /* renamed from: t  reason: collision with root package name */
    public float f8725t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8726u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8727v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8728w;

    public e(x xVar, r rVar, k3.b bVar) {
        this.f8708b = rVar;
        this.f8709c = bVar;
        RenderNode create = RenderNode.create("Compose", xVar);
        this.f8710d = create;
        this.f8711e = 0L;
        this.f8715i = 0L;
        if (f8707x.getAndSet(false)) {
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
                k.c(create, k.a(create));
                k.d(create, k.b(create));
            }
            j.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.f8716j = 0;
        this.f8717k = 3;
        this.f8718l = 1.0f;
        this.f8719n = 1.0f;
        this.f8720o = 1.0f;
        long j2 = s.f6681b;
        this.f8722q = j2;
        this.f8723r = j2;
        this.f8725t = 8.0f;
    }

    @Override // l3.d
    public final void A(float f8) {
        this.f8720o = f8;
        this.f8710d.setScaleY(f8);
    }

    @Override // l3.d
    public final Matrix B() {
        Matrix matrix = this.f8713g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f8713g = matrix;
        }
        this.f8710d.getMatrix(matrix);
        return matrix;
    }

    @Override // l3.d
    public final void C(x4.c cVar, m mVar, b bVar, a4.a aVar) {
        Canvas start = this.f8710d.start(Math.max((int) (this.f8711e >> 32), (int) (this.f8715i >> 32)), Math.max((int) (this.f8711e & 4294967295L), (int) (this.f8715i & 4294967295L)));
        try {
            i3.b bVar2 = this.f8708b.f6680a;
            Canvas canvas = bVar2.f6615a;
            bVar2.f6615a = start;
            k3.b bVar3 = this.f8709c;
            n nVar = bVar3.B;
            long T = zb.k.T(this.f8711e);
            x4.c q10 = nVar.q();
            m r5 = nVar.r();
            q p10 = nVar.p();
            long t5 = nVar.t();
            b bVar4 = (b) nVar.L;
            nVar.H(cVar);
            nVar.I(mVar);
            nVar.G(bVar2);
            nVar.J(T);
            nVar.L = bVar;
            bVar2.p();
            aVar.k(bVar3);
            bVar2.m();
            nVar.H(q10);
            nVar.I(r5);
            nVar.G(p10);
            nVar.J(t5);
            nVar.L = bVar4;
            bVar2.f6615a = canvas;
            this.f8710d.end(start);
        } catch (Throwable th2) {
            this.f8710d.end(start);
            throw th2;
        }
    }

    @Override // l3.d
    public final float D() {
        return 0.0f;
    }

    @Override // l3.d
    public final void E(float f8) {
        this.f8725t = f8;
        this.f8710d.setCameraDistance(-f8);
    }

    @Override // l3.d
    public final float F() {
        return this.f8721p;
    }

    @Override // l3.d
    public final boolean G() {
        return this.f8710d.isValid();
    }

    @Override // l3.d
    public final float H() {
        return this.f8720o;
    }

    @Override // l3.d
    public final float I() {
        return this.f8724s;
    }

    @Override // l3.d
    public final int J() {
        return this.f8717k;
    }

    @Override // l3.d
    public final void K(long j2) {
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            this.m = true;
            this.f8710d.setPivotX(((int) (this.f8711e >> 32)) / 2.0f);
            this.f8710d.setPivotY(((int) (4294967295L & this.f8711e)) / 2.0f);
            return;
        }
        this.m = false;
        this.f8710d.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
        this.f8710d.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // l3.d
    public final long L() {
        return this.f8722q;
    }

    @Override // l3.d
    public final void M(q qVar) {
        Canvas canvas = i3.c.f6619a;
        DisplayListCanvas displayListCanvas = ((i3.b) qVar).f6615a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f8710d);
    }

    public final void N() {
        boolean z10;
        boolean z11 = this.f8726u;
        boolean z12 = false;
        if (z11 && !this.f8714h) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 && this.f8714h) {
            z12 = true;
        }
        if (z10 != this.f8727v) {
            this.f8727v = z10;
            this.f8710d.setClipToBounds(z10);
        }
        if (z12 != this.f8728w) {
            this.f8728w = z12;
            this.f8710d.setClipToOutline(z12);
        }
    }

    public final void O(int i2) {
        RenderNode renderNode = this.f8710d;
        if (i2 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f8712f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i2 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f8712f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f8712f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i2 = this.f8716j;
        if (i2 != 1 && this.f8717k == 3) {
            O(i2);
        } else {
            O(1);
        }
    }

    @Override // l3.d
    public final float a() {
        return this.f8718l;
    }

    @Override // l3.d
    public final void b() {
        this.f8710d.setRotationX(0.0f);
    }

    @Override // l3.d
    public final void c(float f8) {
        this.f8718l = f8;
        this.f8710d.setAlpha(f8);
    }

    @Override // l3.d
    public final float d() {
        return this.f8719n;
    }

    @Override // l3.d
    public final void e(float f8) {
        this.f8721p = f8;
        this.f8710d.setElevation(f8);
    }

    @Override // l3.d
    public final float f() {
        return 0.0f;
    }

    @Override // l3.d
    public final void g() {
        this.f8710d.setTranslationY(0.0f);
    }

    @Override // l3.d
    public final void h(float f8) {
        this.f8724s = f8;
        this.f8710d.setRotation(f8);
    }

    @Override // l3.d
    public final void i() {
        this.f8710d.setRotationY(0.0f);
    }

    @Override // l3.d
    public final long j() {
        return this.f8723r;
    }

    @Override // l3.d
    public final void k(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8722q = j2;
            k.c(this.f8710d, z.y(j2));
        }
    }

    @Override // l3.d
    public final void l(Outline outline, long j2) {
        boolean z10;
        this.f8715i = j2;
        this.f8710d.setOutline(outline);
        if (outline != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8714h = z10;
        N();
    }

    @Override // l3.d
    public final void m() {
        P();
    }

    @Override // l3.d
    public final void n(float f8) {
        this.f8719n = f8;
        this.f8710d.setScaleX(f8);
    }

    @Override // l3.d
    public final void o(int i2) {
        if (this.f8717k == i2) {
            return;
        }
        this.f8717k = i2;
        Paint paint = this.f8712f;
        if (paint == null) {
            paint = new Paint();
            this.f8712f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(z.C(i2)));
        P();
    }

    @Override // l3.d
    public final float p() {
        return this.f8725t;
    }

    @Override // l3.d
    public final void q() {
        j.a(this.f8710d);
    }

    @Override // l3.d
    public final void r(long j2, int i2, int i10) {
        int i11 = (int) (j2 >> 32);
        int i12 = (int) (4294967295L & j2);
        this.f8710d.setLeftTopRightBottom(i2, i10, i2 + i11, i10 + i12);
        if (!x4.l.b(this.f8711e, j2)) {
            if (this.m) {
                this.f8710d.setPivotX(i11 / 2.0f);
                this.f8710d.setPivotY(i12 / 2.0f);
            }
            this.f8711e = j2;
        }
    }

    @Override // l3.d
    public final float s() {
        return 0.0f;
    }

    @Override // l3.d
    public final void t() {
        this.f8710d.setTranslationX(0.0f);
    }

    @Override // l3.d
    public final void u(boolean z10) {
        this.f8726u = z10;
        N();
    }

    @Override // l3.d
    public final int v() {
        return this.f8716j;
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
        this.f8716j = i2;
        P();
    }

    @Override // l3.d
    public final void z(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8723r = j2;
            k.d(this.f8710d, z.y(j2));
        }
    }
}
