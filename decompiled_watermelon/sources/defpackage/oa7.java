package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oa7  reason: default package */
/* loaded from: classes.dex */
public final class oa7 extends View {
    public static final gf1 i0 = new gf1(2);
    public final ek1 A;
    public final sh0 B;
    public final rh0 L;
    public boolean R;
    public Outline c0;
    public boolean d0;
    public od1 e0;
    public sd3 f0;
    public mi2 g0;
    public pn2 h0;

    public oa7(ek1 ek1Var, sh0 sh0Var, rh0 rh0Var) {
        super(ek1Var.getContext());
        this.A = ek1Var;
        this.B = sh0Var;
        this.L = rh0Var;
        setOutlineProvider(i0);
        this.d0 = true;
        this.e0 = tq5.k;
        this.f0 = sd3.Ltr;
        rn2.a.getClass();
        this.g0 = qc2.X;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sh0 sh0Var = this.B;
        id idVar = sh0Var.a;
        Canvas canvas2 = idVar.a;
        idVar.a = canvas;
        od1 od1Var = this.e0;
        sd3 sd3Var = this.f0;
        long floatToRawIntBits = (Float.floatToRawIntBits(getHeight()) & 4294967295L) | (Float.floatToRawIntBits(getWidth()) << 32);
        pn2 pn2Var = this.h0;
        mi2 mi2Var = this.g0;
        rh0 rh0Var = this.L;
        od1 v = rh0Var.I().v();
        sd3 A = rh0Var.I().A();
        oh0 s = rh0Var.I().s();
        long E = rh0Var.I().E();
        pn2 pn2Var2 = (pn2) rh0Var.I().L;
        os I = rh0Var.I();
        I.O(od1Var);
        I.P(sd3Var);
        I.N(idVar);
        I.Q(floatToRawIntBits);
        I.L = pn2Var;
        idVar.m();
        try {
            mi2Var.n(rh0Var);
            idVar.j();
            os I2 = rh0Var.I();
            I2.O(v);
            I2.P(A);
            I2.N(s);
            I2.Q(E);
            I2.L = pn2Var2;
            sh0Var.a.a = canvas2;
            this.R = false;
        } catch (Throwable th) {
            idVar.j();
            os I3 = rh0Var.I();
            I3.O(v);
            I3.P(A);
            I3.N(s);
            I3.Q(E);
            I3.L = pn2Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.d0;
    }

    public final sh0 getCanvasHolder() {
        return this.B;
    }

    public final View getOwnerView() {
        return this.A;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.d0;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.R) {
            this.R = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
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
