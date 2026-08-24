package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k57  reason: default package */
/* loaded from: classes.dex */
public abstract class k57 {
    public static final defpackage.gr1 a = null;
    public static final defpackage.z17 b = null;
    public static final defpackage.z17 c = null;
    public static final defpackage.z17 d = null;

    static {
            gr1 r0 = new gr1
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.k57.a = r0
            z17 r0 = new z17
            r1 = 3
            r0.<init>(r1)
            defpackage.k57.b = r0
            z17 r0 = new z17
            r1 = 4
            r0.<init>(r1)
            defpackage.k57.c = r0
            z17 r0 = new z17
            r1 = 5
            r0.<init>(r1)
            defpackage.k57.d = r0
            return
    }

    public static final void a(defpackage.l61 r4, java.lang.Object r5) {
            gr1 r0 = defpackage.k57.a
            if (r5 != r0) goto L5
            goto L25
        L5:
            boolean r0 = r5 instanceof defpackage.q57
            if (r0 == 0) goto L26
            q57 r5 = (defpackage.q57) r5
            l57[] r4 = r5.c
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L25
        L12:
            int r1 = r0 + (-1)
            r2 = r4[r0]
            r2.getClass()
            java.lang.Object[] r3 = r5.b
            r0 = r3[r0]
            r2.a(r0)
            if (r1 >= 0) goto L23
            goto L25
        L23:
            r0 = r1
            goto L12
        L25:
            return
        L26:
            r0 = 0
            z17 r1 = defpackage.k57.c
            java.lang.Object r4 = r4.x(r1, r0)
            r4.getClass()
            l57 r4 = (defpackage.l57) r4
            r4.a(r5)
            return
    }

    public static final java.lang.Object b(defpackage.l61 r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            z17 r1 = defpackage.k57.b
            java.lang.Object r2 = r2.x(r1, r0)
            r2.getClass()
            return r2
    }

    public static final java.lang.Object c(defpackage.l61 r1, java.lang.Object r2) {
            if (r2 != 0) goto L6
            java.lang.Object r2 = b(r1)
        L6:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != r0) goto L10
            gr1 r1 = defpackage.k57.a
            return r1
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L26
            q57 r0 = new q57
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r2, r1)
            z17 r2 = defpackage.k57.d
            java.lang.Object r1 = r1.x(r2, r0)
            return r1
        L26:
            l57 r2 = (defpackage.l57) r2
            java.lang.Object r1 = r2.b()
            return r1
    }
}
