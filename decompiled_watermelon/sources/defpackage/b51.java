package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b51  reason: default package */
/* loaded from: classes.dex */
public final class b51 extends ev3 {
    public final RectF r;

    public b51(b51 b51Var) {
        super(b51Var);
        this.r = b51Var.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gv3, android.graphics.drawable.Drawable, c51] */
    @Override // defpackage.ev3, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? gv3Var = new gv3(this);
        gv3Var.B0 = this;
        gv3Var.invalidateSelf();
        return gv3Var;
    }

    public b51(a36 a36Var, RectF rectF) {
        super(a36Var);
        this.r = rectF;
    }
}
