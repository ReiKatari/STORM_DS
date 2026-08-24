package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur  reason: default package */
/* loaded from: classes.dex */
public final class ur extends defpackage.u63 {
    public final defpackage.tr Y;
    public android.graphics.drawable.Drawable Z;
    public android.content.res.ColorStateList d0;
    public android.graphics.PorterDuff.Mode e0;
    public boolean f0;
    public boolean g0;

    public ur(defpackage.tr r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.d0 = r0
            r1.e0 = r0
            r0 = 0
            r1.f0 = r0
            r1.g0 = r0
            r1.Y = r2
            return
    }

    public final void J() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.Z
            if (r0 == 0) goto L39
            boolean r1 = r2.f0
            if (r1 != 0) goto Lc
            boolean r1 = r2.g0
            if (r1 == 0) goto L39
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.Z = r0
            boolean r1 = r2.f0
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.d0
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.g0
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.Z
            android.graphics.PorterDuff$Mode r1 = r2.e0
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.Z
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r2.Z
            tr r2 = r2.Y
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L39:
            return
    }

    public final void K(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.Z
            if (r0 == 0) goto L60
            tr r0 = r7.Y
            int r1 = r0.getMax()
            r2 = 1
            if (r1 <= r2) goto L60
            android.graphics.drawable.Drawable r3 = r7.Z
            int r3 = r3.getIntrinsicWidth()
            android.graphics.drawable.Drawable r4 = r7.Z
            int r4 = r4.getIntrinsicHeight()
            if (r3 < 0) goto L1e
            int r3 = r3 / 2
            goto L1f
        L1e:
            r3 = r2
        L1f:
            if (r4 < 0) goto L23
            int r2 = r4 / 2
        L23:
            android.graphics.drawable.Drawable r4 = r7.Z
            int r5 = -r3
            int r6 = -r2
            r4.setBounds(r5, r6, r3, r2)
            int r2 = r0.getWidth()
            int r3 = r0.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r0.getPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r3 = (float) r1
            float r2 = r2 / r3
            int r3 = r8.save()
            int r4 = r0.getPaddingLeft()
            float r4 = (float) r4
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r8.translate(r4, r0)
            r0 = 0
        L4f:
            if (r0 > r1) goto L5d
            android.graphics.drawable.Drawable r4 = r7.Z
            r4.draw(r8)
            r4 = 0
            r8.translate(r2, r4)
            int r0 = r0 + 1
            goto L4f
        L5d:
            r8.restoreToCount(r3)
        L60:
            return
    }

    @Override // defpackage.u63
    public final void r(android.util.AttributeSet r8, int r9) {
            r7 = this;
            r5 = 2130969717(0x7f040475, float:1.7548124E38)
            super.r(r8, r5)
            tr r0 = r7.Y
            android.content.Context r9 = r0.getContext()
            int[] r2 = defpackage.m75.g
            m44 r9 = defpackage.m44.A(r9, r8, r2, r5)
            java.lang.Object r1 = r9.L
            r6 = r1
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r9.L
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r3 = r8
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            r8 = 0
            android.graphics.drawable.Drawable r8 = r9.l(r8)
            if (r8 == 0) goto L2e
            r0.setThumb(r8)
        L2e:
            r8 = 1
            android.graphics.drawable.Drawable r1 = r9.k(r8)
            android.graphics.drawable.Drawable r2 = r7.Z
            if (r2 == 0) goto L3b
            r3 = 0
            r2.setCallback(r3)
        L3b:
            r7.Z = r1
            if (r1 == 0) goto L59
            r1.setCallback(r0)
            int r2 = r0.getLayoutDirection()
            r1.setLayoutDirection(r2)
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L56
            int[] r2 = r0.getDrawableState()
            r1.setState(r2)
        L56:
            r7.J()
        L59:
            r0.invalidate()
            r0 = 3
            boolean r1 = r6.hasValue(r0)
            if (r1 == 0) goto L72
            r1 = -1
            int r0 = r6.getInt(r0, r1)
            android.graphics.PorterDuff$Mode r1 = r7.e0
            android.graphics.PorterDuff$Mode r0 = defpackage.bp1.c(r0, r1)
            r7.e0 = r0
            r7.g0 = r8
        L72:
            r0 = 2
            boolean r1 = r6.hasValue(r0)
            if (r1 == 0) goto L81
            android.content.res.ColorStateList r0 = r9.g(r0)
            r7.d0 = r0
            r7.f0 = r8
        L81:
            r9.D()
            r7.J()
            return
    }
}
