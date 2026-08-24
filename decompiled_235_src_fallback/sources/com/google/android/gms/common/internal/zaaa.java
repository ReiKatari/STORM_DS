package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaaa extends android.widget.Button {
    public zaaa(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 16842824(0x1010048, float:2.369376E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    private static final int zab(int r0, int r1, int r2, int r3) {
            if (r0 == 0) goto L15
            r1 = 1
            if (r0 == r1) goto L14
            r1 = 2
            if (r0 != r1) goto L9
            return r3
        L9:
            java.lang.String r1 = "Unknown color scheme: "
            java.lang.String r0 = defpackage.lb1.g(r0, r1)
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L14:
            return r2
        L15:
            return r1
    }

    public final void zaa(android.content.res.Resources r6, int r7, int r8) {
            r5 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r0)
            android.util.DisplayMetrics r0 = r6.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r5.setMinHeight(r0)
            r5.setMinWidth(r0)
            r0 = 2131230897(0x7f0800b1, float:1.807786E38)
            r1 = 2131230902(0x7f0800b6, float:1.807787E38)
            int r0 = zab(r8, r0, r1, r1)
            r1 = 2131230906(0x7f0800ba, float:1.8077878E38)
            r2 = 2131230911(0x7f0800bf, float:1.8077888E38)
            int r1 = zab(r8, r1, r2, r2)
            java.lang.String r2 = "Unknown button size: "
            r3 = 2
            r4 = 1
            if (r7 == 0) goto L44
            if (r7 == r4) goto L44
            if (r7 != r3) goto L3c
            goto L45
        L3c:
            java.lang.String r5 = defpackage.lb1.g(r7, r2)
            defpackage.i.m(r5)
            return
        L44:
            r0 = r1
        L45:
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r1 = 2131099714(0x7f060042, float:1.781179E38)
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            r0.setTintList(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setTintMode(r1)
            r5.setBackgroundDrawable(r0)
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            r1 = 2131099709(0x7f06003d, float:1.7811779E38)
            int r8 = zab(r8, r0, r1, r1)
            android.content.res.ColorStateList r8 = r6.getColorStateList(r8)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            android.content.res.ColorStateList r8 = (android.content.res.ColorStateList) r8
            r5.setTextColor(r8)
            r8 = 0
            if (r7 == 0) goto L90
            if (r7 == r4) goto L85
            if (r7 != r3) goto L7d
            r5.setText(r8)
            goto L9a
        L7d:
            java.lang.String r5 = defpackage.lb1.g(r7, r2)
            defpackage.i.m(r5)
            return
        L85:
            r7 = 2131951814(0x7f1300c6, float:1.9540053E38)
            java.lang.String r6 = r6.getString(r7)
            r5.setText(r6)
            goto L9a
        L90:
            r7 = 2131951813(0x7f1300c5, float:1.9540051E38)
            java.lang.String r6 = r6.getString(r7)
            r5.setText(r6)
        L9a:
            r5.setTransformationMethod(r8)
            android.content.Context r6 = r5.getContext()
            boolean r6 = com.google.android.gms.common.util.DeviceProperties.isWearable(r6)
            if (r6 == 0) goto Lac
            r6 = 19
            r5.setGravity(r6)
        Lac:
            return
    }
}
