package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq5  reason: default package */
/* loaded from: classes.dex */
public abstract class lq5 {
    public static final int[] a = null;
    public static final java.lang.String b = null;

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0, r1}
            defpackage.lq5.a = r0
            java.lang.Class<lq5> r0 = defpackage.lq5.class
            java.lang.String r0 = r0.getSimpleName()
            defpackage.lq5.b = r0
            return
    }

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList r3) {
            r0 = 0
            if (r3 == 0) goto L27
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            if (r1 > r2) goto L26
            int r1 = r3.getDefaultColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 != 0) goto L26
            int[] r1 = defpackage.lq5.a
            int r0 = r3.getColorForState(r1, r0)
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L26
            java.lang.String r0 = defpackage.lq5.b
            java.lang.String r1 = "Use a non-transparent color for the default color as it will be used to finish ripple animations."
            android.util.Log.w(r0, r1)
        L26:
            return r3
        L27:
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            return r3
    }
}
