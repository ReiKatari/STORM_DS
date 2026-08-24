package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq7  reason: default package */
/* loaded from: classes.dex */
public abstract class dq7 {
    public static final defpackage.gq7 a = null;
    public static final defpackage.ml0 b = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            hq7 r0 = new hq7
            r0.<init>()
            defpackage.dq7.a = r0
            goto L15
        Le:
            gq7 r0 = new gq7
            r0.<init>()
            defpackage.dq7.a = r0
        L15:
            ml0 r0 = new ml0
            java.lang.String r1 = "translationAlpha"
            r2 = 6
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            r0.<init>(r1, r2, r3)
            defpackage.dq7.b = r0
            ml0 r0 = new ml0
            java.lang.String r1 = "clipBounds"
            r2 = 7
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r0.<init>(r1, r2, r3)
            return
    }

    public static void a(android.view.View r6, int r7, int r8, int r9, int r10) {
            gq7 r0 = defpackage.dq7.a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.b0(r1, r2, r3, r4, r5)
            return
    }

    public static void b(android.view.View r1, int r2) {
            gq7 r0 = defpackage.dq7.a
            r0.c0(r1, r2)
            return
    }
}
