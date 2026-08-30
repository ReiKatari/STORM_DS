package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mf7  reason: default package */
/* loaded from: classes.dex */
public class mf7 extends lf7 {
    public x13 s;
    public x13 t;
    public x13 u;

    public mf7(vf7 vf7Var, WindowInsets windowInsets) {
        super(vf7Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.rf7
    public x13 j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = x13.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.rf7
    public x13 l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = x13.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.rf7
    public x13 n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = x13.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.jf7, defpackage.rf7
    public vf7 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return vf7.g(null, inset);
    }

    @Override // defpackage.kf7, defpackage.rf7
    public void x(x13 x13Var) {
    }
}
