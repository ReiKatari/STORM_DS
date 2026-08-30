package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kf7  reason: default package */
/* loaded from: classes.dex */
public class kf7 extends jf7 {
    public x13 r;

    public kf7(vf7 vf7Var, WindowInsets windowInsets) {
        super(vf7Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.rf7
    public vf7 b() {
        return vf7.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.rf7
    public vf7 c() {
        return vf7.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.rf7
    public final x13 k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = x13.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.rf7
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.rf7
    public void x(x13 x13Var) {
        this.r = x13Var;
    }
}
