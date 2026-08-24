package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o81  reason: default package */
/* loaded from: classes.dex */
public final class o81 extends defpackage.p24 {
    public static final /* synthetic */ int D0 = 0;
    public defpackage.n81 C0;

    @Override // defpackage.p24
    public final void f(android.graphics.Canvas r4) {
            r3 = this;
            n81 r0 = r3.C0
            android.graphics.RectF r0 = r0.r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            super.f(r4)
            return
        Le:
            r4.save()
            int r0 = android.os.Build.VERSION.SDK_INT
            n81 r1 = r3.C0
            r2 = 26
            if (r0 < r2) goto L1f
            android.graphics.RectF r0 = r1.r
            defpackage.au.m(r4, r0)
            goto L26
        L1f:
            android.graphics.RectF r0 = r1.r
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r4.clipRect(r0, r1)
        L26:
            super.f(r4)
            r4.restore()
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r2 = this;
            n81 r0 = new n81
            n81 r1 = r2.C0
            r0.<init>(r1)
            r2.C0 = r0
            return r2
    }

    public final void t(float r3, float r4, float r5, float r6) {
            r2 = this;
            n81 r0 = r2.C0
            android.graphics.RectF r0 = r0.r
            float r1 = r0.left
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.top
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.right
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.bottom
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            r0.set(r3, r4, r5, r6)
            r2.invalidateSelf()
            return
    }
}
