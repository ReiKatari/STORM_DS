package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l24  reason: default package */
/* loaded from: classes.dex */
public final class l24 extends defpackage.qr {
    public static final int[][] f0 = null;
    public android.content.res.ColorStateList d0;
    public boolean e0;

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r0, r1}
            r3 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r0 = new int[]{r0, r3}
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r1 = new int[]{r4, r1}
            int[] r3 = new int[]{r4, r3}
            int[][] r0 = new int[][]{r2, r0, r1, r3}
            defpackage.l24.f0 = r0
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r6 = this;
            android.content.res.ColorStateList r0 = r6.d0
            if (r0 != 0) goto L3e
            r0 = 2130968847(0x7f04010f, float:1.754636E38)
            int r0 = defpackage.mp2.B(r6, r0)
            r1 = 2130968867(0x7f040123, float:1.75464E38)
            int r1 = defpackage.mp2.B(r6, r1)
            r2 = 2130968890(0x7f04013a, float:1.7546446E38)
            int r2 = defpackage.mp2.B(r6, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = defpackage.mp2.Q(r3, r2, r0)
            r3 = 1057635697(0x3f0a3d71, float:0.54)
            int r3 = defpackage.mp2.Q(r3, r2, r1)
            r4 = 1052938076(0x3ec28f5c, float:0.38)
            int r5 = defpackage.mp2.Q(r4, r2, r1)
            int r1 = defpackage.mp2.Q(r4, r2, r1)
            int[] r0 = new int[]{r0, r3, r5, r1}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r2 = defpackage.l24.f0
            r1.<init>(r2, r0)
            r6.d0 = r1
        L3e:
            android.content.res.ColorStateList r6 = r6.d0
            return r6
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.e0
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r0 = r1.getButtonTintList()
            if (r0 != 0) goto L11
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L11:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.e0 = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            r0.setButtonTintList(r1)
            return
        Lc:
            r1 = 0
            r0.setButtonTintList(r1)
            return
    }
}
