package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n81  reason: default package */
/* loaded from: classes.dex */
public final class n81 extends n24 {
    public final RectF r;

    public n81(n81 n81Var) {
        super(n81Var);
        this.r = n81Var.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p24, o81, android.graphics.drawable.Drawable] */
    @Override // defpackage.n24, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? p24Var = new p24(this);
        p24Var.C0 = this;
        p24Var.invalidateSelf();
        return p24Var;
    }

    public n81(me6 me6Var, RectF rectF) {
        super(me6Var);
        this.r = rectF;
    }
}
