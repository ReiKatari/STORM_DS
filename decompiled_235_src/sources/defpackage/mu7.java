package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu7  reason: default package */
/* loaded from: classes.dex */
public class mu7 extends lu7 {
    public e83 s;
    public e83 t;
    public e83 u;

    public mu7(vu7 vu7Var, WindowInsets windowInsets) {
        super(vu7Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.ru7
    public e83 j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = e83.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.ru7
    public e83 l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = e83.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.ru7
    public e83 n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = e83.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.ju7, defpackage.ru7
    public vu7 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return vu7.g(null, inset);
    }

    @Override // defpackage.ku7, defpackage.ru7
    public void x(e83 e83Var) {
    }
}
