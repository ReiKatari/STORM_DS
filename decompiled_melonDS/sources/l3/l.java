package l3;

import a4.n;
import a5.g0;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import i3.q;
import i3.r;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends View {

    /* renamed from: h0  reason: collision with root package name */
    public static final g0 f8770h0 = new g0(3);
    public final m3.a A;
    public final r B;
    public final k3.b L;
    public boolean R;

    /* renamed from: b0  reason: collision with root package name */
    public Outline f8771b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f8772c0;

    /* renamed from: d0  reason: collision with root package name */
    public x4.c f8773d0;

    /* renamed from: e0  reason: collision with root package name */
    public m f8774e0;

    /* renamed from: f0  reason: collision with root package name */
    public mc.l f8775f0;

    /* renamed from: g0  reason: collision with root package name */
    public b f8776g0;

    public l(m3.a aVar, r rVar, k3.b bVar) {
        super(aVar.getContext());
        this.A = aVar;
        this.B = rVar;
        this.L = bVar;
        setOutlineProvider(f8770h0);
        this.f8772c0 = true;
        this.f8773d0 = k3.c.f7959a;
        this.f8774e0 = m.Ltr;
        d.f8706a.getClass();
        this.f8775f0 = a.R;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.B;
        i3.b bVar = rVar.f6680a;
        Canvas canvas2 = bVar.f6615a;
        bVar.f6615a = canvas;
        x4.c cVar = this.f8773d0;
        m mVar = this.f8774e0;
        long floatToRawIntBits = (Float.floatToRawIntBits(getHeight()) & 4294967295L) | (Float.floatToRawIntBits(getWidth()) << 32);
        b bVar2 = this.f8776g0;
        mc.l lVar = this.f8775f0;
        k3.b bVar3 = this.L;
        x4.c q10 = bVar3.E().q();
        m r5 = bVar3.E().r();
        q p10 = bVar3.E().p();
        long t5 = bVar3.E().t();
        b bVar4 = (b) bVar3.E().L;
        n E = bVar3.E();
        E.H(cVar);
        E.I(mVar);
        E.G(bVar);
        E.J(floatToRawIntBits);
        E.L = bVar2;
        bVar.p();
        try {
            lVar.k(bVar3);
            bVar.m();
            n E2 = bVar3.E();
            E2.H(q10);
            E2.I(r5);
            E2.G(p10);
            E2.J(t5);
            E2.L = bVar4;
            rVar.f6680a.f6615a = canvas2;
            this.R = false;
        } catch (Throwable th2) {
            bVar.m();
            n E3 = bVar3.E();
            E3.H(q10);
            E3.I(r5);
            E3.G(p10);
            E3.J(t5);
            E3.L = bVar4;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f8772c0;
    }

    public final r getCanvasHolder() {
        return this.B;
    }

    public final View getOwnerView() {
        return this.A;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f8772c0;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.R) {
            this.R = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z10) {
        if (this.f8772c0 != z10) {
            this.f8772c0 = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.R = z10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
    }
}
