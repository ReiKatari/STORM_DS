package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w27  reason: default package */
/* loaded from: classes.dex */
public final class w27 {
    public defpackage.kk3 a;
    public defpackage.qh1 b;
    public defpackage.ki2 c;
    public defpackage.s47 d;
    public java.lang.Object e;
    public final defpackage.vs4 f;
    public long g;

    public w27(defpackage.kk3 r1, defpackage.qh1 r2, defpackage.ki2 r3, defpackage.s47 r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            vs4 r1 = defpackage.np2.Y(r1)
            r0.f = r1
            ki2 r1 = r0.c
            s47 r2 = r0.d
            qh1 r3 = r0.b
            long r1 = defpackage.l17.b(r2, r3, r1)
            r0.g = r1
            return
    }

    public static void a(defpackage.w27 r3, defpackage.kk3 r4, defpackage.qh1 r5, defpackage.s47 r6, int r7) {
            r0 = r7 & 1
            if (r0 == 0) goto L6
            kk3 r4 = r3.a
        L6:
            r0 = r7 & 2
            if (r0 == 0) goto Lc
            qh1 r5 = r3.b
        Lc:
            ki2 r0 = r3.c
            r7 = r7 & 8
            if (r7 == 0) goto L14
            s47 r6 = r3.d
        L14:
            java.lang.Object r7 = r3.e
            kk3 r1 = r3.a
            vs4 r2 = r3.f
            if (r4 != r1) goto L45
            qh1 r1 = r3.b
            boolean r1 = defpackage.nb3.k(r5, r1)
            if (r1 == 0) goto L45
            ki2 r1 = r3.c
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L45
            s47 r1 = r3.d
            boolean r1 = defpackage.nb3.k(r6, r1)
            if (r1 != 0) goto L35
            goto L45
        L35:
            java.lang.Object r4 = r3.e
            boolean r4 = defpackage.nb3.k(r7, r4)
            if (r4 != 0) goto L44
            r3.e = r7
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.setValue(r3)
        L44:
            return
        L45:
            r3.a = r4
            r3.b = r5
            r3.c = r0
            r3.d = r6
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.setValue(r3)
            return
    }
}
