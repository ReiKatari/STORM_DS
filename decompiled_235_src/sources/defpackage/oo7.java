package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo7  reason: default package */
/* loaded from: classes.dex */
public final class oo7 extends View {
    public static final kj1 j0 = new kj1(2);
    public final ko1 A;
    public final ak0 B;
    public final zj0 L;
    public boolean R;
    public Outline d0;
    public boolean e0;
    public qh1 f0;
    public kk3 g0;
    public qn2 h0;
    public ut2 i0;

    public oo7(ko1 ko1Var, ak0 ak0Var, zj0 zj0Var) {
        super(ko1Var.getContext());
        this.A = ko1Var;
        this.B = ak0Var;
        this.L = zj0Var;
        setOutlineProvider(j0);
        this.e0 = true;
        this.f0 = hv.f;
        this.g0 = kk3.Ltr;
        wt2.a.getClass();
        this.h0 = hh2.Y;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ak0 ak0Var = this.B;
        wd wdVar = ak0Var.a;
        Canvas canvas2 = wdVar.a;
        wdVar.a = canvas;
        qh1 qh1Var = this.f0;
        kk3 kk3Var = this.g0;
        long floatToRawIntBits = (Float.floatToRawIntBits(getHeight()) & 4294967295L) | (Float.floatToRawIntBits(getWidth()) << 32);
        ut2 ut2Var = this.i0;
        qn2 qn2Var = this.h0;
        zj0 zj0Var = this.L;
        qh1 I = zj0Var.i0().I();
        kk3 K = zj0Var.i0().K();
        xj0 G = zj0Var.i0().G();
        long L = zj0Var.i0().L();
        ut2 ut2Var2 = (ut2) zj0Var.i0().L;
        bt i0 = zj0Var.i0();
        i0.W(qh1Var);
        i0.X(kk3Var);
        i0.V(wdVar);
        i0.Y(floatToRawIntBits);
        i0.L = ut2Var;
        wdVar.h();
        try {
            qn2Var.g(zj0Var);
            wdVar.p();
            bt i02 = zj0Var.i0();
            i02.W(I);
            i02.X(K);
            i02.V(G);
            i02.Y(L);
            i02.L = ut2Var2;
            ak0Var.a.a = canvas2;
            this.R = false;
        } catch (Throwable th) {
            wdVar.p();
            bt i03 = zj0Var.i0();
            i03.W(I);
            i03.X(K);
            i03.V(G);
            i03.Y(L);
            i03.L = ut2Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.e0;
    }

    public final ak0 getCanvasHolder() {
        return this.B;
    }

    public final View getOwnerView() {
        return this.A;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.e0;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.R) {
            this.R = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.R = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
