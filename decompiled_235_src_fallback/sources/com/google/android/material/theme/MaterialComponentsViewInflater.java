package com.google.android.material.theme;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends defpackage.ys {
    public MaterialComponentsViewInflater() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.ys
    public final defpackage.kq a(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            p14 r0 = new p14
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.ys
    public final defpackage.lq b(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.ys
    public final defpackage.nq c(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            i24 r0 = new i24
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.ys
    public final defpackage.qr d(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            l24 r7 = new l24
            r0 = 2132018385(0x7f1404d1, float:1.9675075E38)
            r4 = 2130969680(0x7f040450, float:1.7548049E38)
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r4, r0)
            r7.<init>(r8, r9)
            android.content.Context r1 = r7.getContext()
            r8 = 0
            int[] r6 = new int[r8]
            int[] r3 = defpackage.a75.q
            r5 = 2132018385(0x7f1404d1, float:1.9675075E38)
            r2 = r9
            android.content.res.TypedArray r9 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            boolean r0 = r9.hasValue(r8)
            if (r0 == 0) goto L2d
            android.content.res.ColorStateList r0 = defpackage.np2.S(r1, r9, r8)
            r7.setButtonTintList(r0)
        L2d:
            r0 = 1
            boolean r8 = r9.getBoolean(r0, r8)
            r7.e0 = r8
            r9.recycle()
            return r7
    }

    @Override // defpackage.ys
    public final defpackage.qs e(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            t24 r7 = new t24
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1 = 0
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r0, r1)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            r2 = 2130969926(0x7f040546, float:1.7548548E38)
            r3 = 1
            boolean r2 = defpackage.qo2.N(r8, r2, r3)
            if (r2 == 0) goto L5d
            android.content.res.Resources$Theme r2 = r8.getTheme()
            int[] r4 = defpackage.a75.u
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r9, r4, r0, r1)
            r6 = 2
            int[] r3 = new int[]{r3, r6}
            int r8 = defpackage.t24.g(r8, r5, r3)
            r5.recycle()
            r3 = -1
            if (r8 == r3) goto L35
            goto L5d
        L35:
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r9, r4, r0, r1)
            int r9 = r8.getResourceId(r1, r3)
            r8.recycle()
            if (r9 == r3) goto L5d
            int[] r8 = defpackage.a75.t
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r9, r8)
            android.content.Context r9 = r7.getContext()
            r0 = 4
            int[] r0 = new int[]{r6, r0}
            int r9 = defpackage.t24.g(r9, r8, r0)
            r8.recycle()
            if (r9 < 0) goto L5d
            r7.setLineHeight(r9)
        L5d:
            return r7
    }
}
