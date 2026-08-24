package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug7  reason: default package */
/* loaded from: classes.dex */
public final class ug7 extends android.graphics.drawable.RippleDrawable {
    public final boolean A;
    public defpackage.kt0 B;
    public boolean L;

    public ug7(boolean r5) {
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.A = r5
            return
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
            r2 = this;
            boolean r0 = r2.A
            if (r0 != 0) goto L7
            r0 = 1
            r2.L = r0
        L7:
            android.graphics.Rect r0 = super.getDirtyBounds()
            r1 = 0
            r2.L = r1
            return r0
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
            r0 = this;
            boolean r0 = r0.L
            return r0
    }
}
