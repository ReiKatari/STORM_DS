package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq1  reason: default package */
/* loaded from: classes.dex */
public final class tq1 implements defpackage.gg3 {
    public static final defpackage.tq1 a = null;
    public static final defpackage.x25 b = null;

    static {
            tq1 r0 = new tq1
            r0.<init>()
            defpackage.tq1.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.time.Duration"
            v25 r2 = defpackage.v25.m
            r0.<init>(r1, r2)
            defpackage.tq1.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r5) {
            r4 = this;
            jd1 r4 = defpackage.oq1.B
            java.lang.String r4 = r5.I()
            r4.getClass()
            long r0 = defpackage.n16.H(r4)     // Catch: java.lang.IllegalArgumentException -> L23
            long r2 = defpackage.oq1.X     // Catch: java.lang.IllegalArgumentException -> L23
            boolean r5 = defpackage.oq1.d(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L23
            if (r5 != 0) goto L1b
            oq1 r4 = new oq1
            r4.<init>(r0)
            return r4
        L1b:
            java.lang.String r5 = "invariant failed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L23
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L23
            throw r0     // Catch: java.lang.IllegalArgumentException -> L23
        L23:
            r5 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid ISO duration string format: '"
            java.lang.String r2 = "'."
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r2)
            r0.<init>(r4, r5)
            throw r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r12, java.lang.Object r13) {
            r11 = this;
            oq1 r13 = (defpackage.oq1) r13
            long r0 = r13.A
            jd1 r11 = defpackage.oq1.B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 >= 0) goto L16
            r13 = 45
            r2.append(r13)
        L16:
            java.lang.String r13 = "PT"
            r2.append(r13)
            if (r11 >= 0) goto L22
            long r5 = defpackage.oq1.m(r0)
            goto L23
        L22:
            r5 = r0
        L23:
            uq1 r11 = defpackage.uq1.HOURS
            long r7 = defpackage.oq1.k(r5, r11)
            int r11 = defpackage.oq1.f(r5)
            r9 = r3
            int r3 = defpackage.oq1.h(r5)
            int r4 = defpackage.oq1.g(r5)
            boolean r13 = defpackage.oq1.i(r0)
            if (r13 == 0) goto L41
            r7 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
        L41:
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L49
            r13 = r1
            goto L4a
        L49:
            r13 = r0
        L4a:
            if (r3 != 0) goto L51
            if (r4 == 0) goto L4f
            goto L51
        L4f:
            r5 = r0
            goto L52
        L51:
            r5 = r1
        L52:
            if (r11 != 0) goto L58
            if (r5 == 0) goto L59
            if (r13 == 0) goto L59
        L58:
            r0 = r1
        L59:
            if (r13 == 0) goto L63
            r2.append(r7)
            r1 = 72
            r2.append(r1)
        L63:
            if (r0 == 0) goto L6d
            r2.append(r11)
            r11 = 77
            r2.append(r11)
        L6d:
            if (r5 != 0) goto L73
            if (r13 != 0) goto L7b
            if (r0 != 0) goto L7b
        L73:
            java.lang.String r6 = "S"
            r7 = 1
            r5 = 9
            defpackage.oq1.b(r2, r3, r4, r5, r6, r7)
        L7b:
            java.lang.String r11 = r2.toString()
            r12.d0(r11)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.tq1.b
            return r0
    }
}
