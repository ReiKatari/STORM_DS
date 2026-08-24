package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n81  reason: default package */
/* loaded from: classes.dex */
public final class n81 extends defpackage.n24 {
    public final android.graphics.RectF r;

    public n81(defpackage.me6 r1, android.graphics.RectF r2) {
            r0 = this;
            r0.<init>(r1)
            r0.r = r2
            return
    }

    public n81(defpackage.n81 r1) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.RectF r1 = r1.r
            r0.r = r1
            return
    }

    @Override // defpackage.n24, android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            o81 r0 = new o81
            r0.<init>(r1)
            r0.C0 = r1
            r0.invalidateSelf()
            return r0
    }
}
