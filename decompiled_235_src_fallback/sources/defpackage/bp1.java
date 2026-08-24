package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bp1  reason: default package */
/* loaded from: classes.dex */
public abstract class bp1 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final android.graphics.Rect c = null;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            defpackage.bp1.a = r0
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.bp1.b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            defpackage.bp1.c = r0
            return
    }

    public static void a(android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L32
            r2 = 31
            if (r1 >= r2) goto L32
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            int[] r0 = r3.getState()
            if (r0 == 0) goto L2a
            int r1 = r0.length
            if (r1 != 0) goto L24
            goto L2a
        L24:
            int[] r1 = defpackage.bp1.b
            r3.setState(r1)
            goto L2f
        L2a:
            int[] r1 = defpackage.bp1.a
            r3.setState(r1)
        L2f:
            r3.setState(r0)
        L32:
            return
    }

    public static android.graphics.Rect b(android.graphics.drawable.Drawable r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            android.graphics.Insets r5 = defpackage.yo1.a(r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = defpackage.yz0.v(r5)
            int r2 = defpackage.yz0.z(r5)
            int r3 = defpackage.yz0.B(r5)
            int r5 = defpackage.yz0.D(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
        L20:
            if (r0 >= r1) goto L4d
            boolean r0 = defpackage.xo1.a
            if (r0 == 0) goto L4f
            java.lang.reflect.Method r0 = defpackage.xo1.b     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L4f
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Field r1 = defpackage.xo1.c     // Catch: java.lang.Throwable -> L4f
            int r1 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Field r2 = defpackage.xo1.d     // Catch: java.lang.Throwable -> L4f
            int r2 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Field r3 = defpackage.xo1.e     // Catch: java.lang.Throwable -> L4f
            int r3 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Field r4 = defpackage.xo1.f     // Catch: java.lang.Throwable -> L4f
            int r5 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L4f
            return r0
        L4d:
            boolean r5 = defpackage.xo1.a
        L4f:
            android.graphics.Rect r5 = defpackage.bp1.c
            return r5
    }

    public static android.graphics.PorterDuff.Mode c(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
