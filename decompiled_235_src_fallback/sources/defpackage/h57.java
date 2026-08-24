package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h57  reason: default package */
/* loaded from: classes.dex */
public abstract class h57 {
    public static final java.lang.ThreadLocal a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final int[] g = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.h57.a = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            defpackage.h57.b = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0}
            defpackage.h57.c = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            defpackage.h57.d = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            defpackage.h57.e = r0
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.h57.f = r0
            r0 = 1
            int[] r0 = new int[r0]
            defpackage.h57.g = r0
            return
    }

    public static void a(android.view.View r3, android.content.Context r4) {
            java.lang.String r0 = "View "
            int[] r1 = defpackage.m75.j
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1)
            r1 = 117(0x75, float:1.64E-43)
            boolean r1 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            java.lang.String r1 = "ThemeUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L2b
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r3 = move-exception
            goto L31
        L2d:
            r4.recycle()
            return
        L31:
            r4.recycle()
            throw r3
    }

    public static int b(android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = d(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = defpackage.h57.b
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            java.lang.ThreadLocal r0 = defpackage.h57.a
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L29
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L29:
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r0.resolveAttribute(r2, r1, r3)
            float r0 = r1.getFloat()
            int r4 = c(r4, r5)
            int r5 = android.graphics.Color.alpha(r4)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            int r4 = defpackage.tt0.d(r4, r5)
            return r4
    }

    public static int c(android.content.Context r2, int r3) {
            int[] r0 = defpackage.h57.g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = r2.getColor(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    public static android.content.res.ColorStateList d(android.content.Context r2, int r3) {
            int[] r0 = defpackage.h57.g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0)
            boolean r0 = r3.hasValue(r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1d
            int r0 = r3.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1d
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r2, r0)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L1d
            goto L21
        L1d:
            android.content.res.ColorStateList r2 = r3.getColorStateList(r1)     // Catch: java.lang.Throwable -> L25
        L21:
            r3.recycle()
            return r2
        L25:
            r2 = move-exception
            r3.recycle()
            throw r2
    }
}
