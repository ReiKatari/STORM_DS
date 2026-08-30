package l3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import i3.q;
import i3.r;
import i3.s;
import i3.z;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: x  reason: collision with root package name */
    public static final h f8748x = new Canvas();

    /* renamed from: b  reason: collision with root package name */
    public final m3.a f8749b;

    /* renamed from: c  reason: collision with root package name */
    public final r f8750c;

    /* renamed from: d  reason: collision with root package name */
    public final l f8751d;

    /* renamed from: e  reason: collision with root package name */
    public final Resources f8752e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f8753f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f8754g;

    /* renamed from: h  reason: collision with root package name */
    public int f8755h;

    /* renamed from: i  reason: collision with root package name */
    public int f8756i;

    /* renamed from: j  reason: collision with root package name */
    public long f8757j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8758k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8759l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public int f8760n;

    /* renamed from: o  reason: collision with root package name */
    public int f8761o;

    /* renamed from: p  reason: collision with root package name */
    public float f8762p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8763q;

    /* renamed from: r  reason: collision with root package name */
    public float f8764r;

    /* renamed from: s  reason: collision with root package name */
    public float f8765s;

    /* renamed from: t  reason: collision with root package name */
    public float f8766t;

    /* renamed from: u  reason: collision with root package name */
    public long f8767u;

    /* renamed from: v  reason: collision with root package name */
    public long f8768v;

    /* renamed from: w  reason: collision with root package name */
    public float f8769w;

    public i(m3.a aVar) {
        r rVar = new r();
        k3.b bVar = new k3.b();
        this.f8749b = aVar;
        this.f8750c = rVar;
        l lVar = new l(aVar, rVar, bVar);
        this.f8751d = lVar;
        this.f8752e = aVar.getResources();
        this.f8753f = new Rect();
        aVar.addView(lVar);
        lVar.setClipBounds(null);
        this.f8757j = 0L;
        View.generateViewId();
        this.f8760n = 3;
        this.f8761o = 0;
        this.f8762p = 1.0f;
        this.f8764r = 1.0f;
        this.f8765s = 1.0f;
        long j2 = s.f6681b;
        this.f8767u = j2;
        this.f8768v = j2;
    }

    @Override // l3.d
    public final void A(float f8) {
        this.f8765s = f8;
        this.f8751d.setScaleY(f8);
    }

    @Override // l3.d
    public final Matrix B() {
        return this.f8751d.getMatrix();
    }

    @Override // l3.d
    public final void C(x4.c cVar, m mVar, b bVar, a4.a aVar) {
        l lVar = this.f8751d;
        ViewParent parent = lVar.getParent();
        m3.a aVar2 = this.f8749b;
        if (parent == null) {
            aVar2.addView(lVar);
        }
        lVar.f8773d0 = cVar;
        lVar.f8774e0 = mVar;
        lVar.f8775f0 = aVar;
        lVar.f8776g0 = bVar;
        if (lVar.isAttachedToWindow()) {
            lVar.setVisibility(4);
            lVar.setVisibility(0);
            try {
                r rVar = this.f8750c;
                h hVar = f8748x;
                i3.b bVar2 = rVar.f6680a;
                Canvas canvas = bVar2.f6615a;
                bVar2.f6615a = hVar;
                aVar2.a(bVar2, lVar, lVar.getDrawingTime());
                rVar.f6680a.f6615a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // l3.d
    public final float D() {
        return 0.0f;
    }

    @Override // l3.d
    public final void E(float f8) {
        this.f8751d.setCameraDistance(f8 * this.f8752e.getDisplayMetrics().densityDpi);
    }

    @Override // l3.d
    public final float F() {
        return this.f8766t;
    }

    @Override // l3.d
    public final float H() {
        return this.f8765s;
    }

    @Override // l3.d
    public final float I() {
        return this.f8769w;
    }

    @Override // l3.d
    public final int J() {
        return this.f8760n;
    }

    @Override // l3.d
    public final void K(long j2) {
        int i2 = ((9223372034707292159L & j2) > 9205357640488583168L ? 1 : ((9223372034707292159L & j2) == 9205357640488583168L ? 0 : -1));
        l lVar = this.f8751d;
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                lVar.resetPivot();
                return;
            }
            this.f8763q = true;
            lVar.setPivotX(((int) (this.f8757j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (this.f8757j & 4294967295L)) / 2.0f);
            return;
        }
        this.f8763q = false;
        lVar.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
        lVar.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Override // l3.d
    public final long L() {
        return this.f8767u;
    }

    @Override // l3.d
    public final void M(q qVar) {
        Rect rect;
        boolean z10 = this.f8758k;
        l lVar = this.f8751d;
        if (z10) {
            if ((this.m || lVar.getClipToOutline()) && !this.f8759l) {
                rect = this.f8753f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        Canvas canvas = i3.c.f6619a;
        if (((i3.b) qVar).f6615a.isHardwareAccelerated()) {
            this.f8749b.a(qVar, lVar, lVar.getDrawingTime());
        }
    }

    public final void N(int i2) {
        l lVar = this.f8751d;
        boolean z10 = true;
        if (i2 == 1) {
            lVar.setLayerType(2, this.f8754g);
        } else {
            Paint paint = this.f8754g;
            if (i2 == 2) {
                lVar.setLayerType(0, paint);
                z10 = false;
            } else {
                lVar.setLayerType(0, paint);
            }
        }
        lVar.setCanUseCompositingLayer$ui_graphics(z10);
    }

    public final void O() {
        int i2 = this.f8761o;
        if (i2 != 1 && this.f8760n == 3) {
            N(i2);
        } else {
            N(1);
        }
    }

    @Override // l3.d
    public final float a() {
        return this.f8762p;
    }

    @Override // l3.d
    public final void b() {
        this.f8751d.setRotationX(0.0f);
    }

    @Override // l3.d
    public final void c(float f8) {
        this.f8762p = f8;
        this.f8751d.setAlpha(f8);
    }

    @Override // l3.d
    public final float d() {
        return this.f8764r;
    }

    @Override // l3.d
    public final void e(float f8) {
        this.f8766t = f8;
        this.f8751d.setElevation(f8);
    }

    @Override // l3.d
    public final float f() {
        return 0.0f;
    }

    @Override // l3.d
    public final void g() {
        this.f8751d.setTranslationY(0.0f);
    }

    @Override // l3.d
    public final void h(float f8) {
        this.f8769w = f8;
        this.f8751d.setRotation(f8);
    }

    @Override // l3.d
    public final void i() {
        this.f8751d.setRotationY(0.0f);
    }

    @Override // l3.d
    public final long j() {
        return this.f8768v;
    }

    @Override // l3.d
    public final void k(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8767u = j2;
            this.f8751d.setOutlineAmbientShadowColor(z.y(j2));
        }
    }

    @Override // l3.d
    public final void l(Outline outline, long j2) {
        l lVar = this.f8751d;
        lVar.f8771b0 = outline;
        lVar.invalidateOutline();
        boolean z10 = false;
        if ((this.m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.f8758k = true;
            }
        }
        if (outline != null) {
            z10 = true;
        }
        this.f8759l = z10;
    }

    @Override // l3.d
    public final void m() {
        Paint paint = this.f8754g;
        if (paint == null) {
            paint = new Paint();
            this.f8754g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // l3.d
    public final void n(float f8) {
        this.f8764r = f8;
        this.f8751d.setScaleX(f8);
    }

    @Override // l3.d
    public final void o(int i2) {
        this.f8760n = i2;
        Paint paint = this.f8754g;
        if (paint == null) {
            paint = new Paint();
            this.f8754g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(z.C(i2)));
        O();
    }

    @Override // l3.d
    public final float p() {
        return this.f8751d.getCameraDistance() / this.f8752e.getDisplayMetrics().densityDpi;
    }

    @Override // l3.d
    public final void q() {
        this.f8749b.removeViewInLayout(this.f8751d);
    }

    @Override // l3.d
    public final void r(long j2, int i2, int i10) {
        boolean b10 = x4.l.b(this.f8757j, j2);
        l lVar = this.f8751d;
        if (!b10) {
            if (this.m || lVar.getClipToOutline()) {
                this.f8758k = true;
            }
            int i11 = (int) (j2 >> 32);
            int i12 = (int) (4294967295L & j2);
            lVar.layout(i2, i10, i2 + i11, i10 + i12);
            this.f8757j = j2;
            if (this.f8763q) {
                lVar.setPivotX(i11 / 2.0f);
                lVar.setPivotY(i12 / 2.0f);
            }
        } else {
            int i13 = this.f8755h;
            if (i13 != i2) {
                lVar.offsetLeftAndRight(i2 - i13);
            }
            int i14 = this.f8756i;
            if (i14 != i10) {
                lVar.offsetTopAndBottom(i10 - i14);
            }
        }
        this.f8755h = i2;
        this.f8756i = i10;
    }

    @Override // l3.d
    public final float s() {
        return 0.0f;
    }

    @Override // l3.d
    public final void t() {
        this.f8751d.setTranslationX(0.0f);
    }

    @Override // l3.d
    public final void u(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10 && !this.f8759l) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.m = z11;
        this.f8758k = true;
        if (z10 && this.f8759l) {
            z12 = true;
        }
        this.f8751d.setClipToOutline(z12);
    }

    @Override // l3.d
    public final int v() {
        return this.f8761o;
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
        this.f8761o = i2;
        O();
    }

    @Override // l3.d
    public final void z(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8768v = j2;
            this.f8751d.setOutlineSpotShadowColor(z.y(j2));
        }
    }
}
