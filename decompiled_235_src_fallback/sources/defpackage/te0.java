package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te0  reason: default package */
/* loaded from: classes.dex */
public final class te0 implements defpackage.ve0 {
    public final defpackage.od2 b;
    public final defpackage.sy7 c;
    public final defpackage.dc0 d;

    public te0(defpackage.sg0 r1, defpackage.e62 r2, defpackage.od2 r3, defpackage.zg2 r4, defpackage.wq6 r5, defpackage.r87 r6, defpackage.wz3 r7, defpackage.qy7 r8, defpackage.sy7 r9, defpackage.dc0 r10, defpackage.gj7 r11, defpackage.kj7 r12, defpackage.ln7 r13) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r0.<init>()
            r0.b = r3
            r0.c = r9
            r0.d = r10
            return
    }

    @Override // defpackage.ve0
    public final void a() {
            r0 = this;
            sy7 r0 = r0.c
            r0.a()
            return
    }

    @Override // defpackage.ve0
    public final void b(defpackage.lc6 r1) {
            r0 = this;
            sy7 r0 = r0.c
            r0.b(r1)
            return
    }

    @Override // defpackage.ve0
    public final void c(defpackage.yy0 r8) {
            r7 = this;
            r8.getClass()
            dc0 r7 = r7.d
            jd0 r0 = new jd0
            r1 = 2
            r0.<init>(r1)
            pk0 r1 = new pk0
            r2 = 0
            r1.<init>(r2, r0, r8)
            r8.h(r1)
            da4 r8 = r0.B
            go4 r8 = defpackage.go4.a(r8)
            r7.getClass()
            ec0 r0 = r7.a
            java.lang.Object r1 = r0.A
            monitor-enter(r1)
            java.util.Set r2 = r8.c()     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L47
        L2a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L49
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L47
            xx r3 = (defpackage.xx) r3     // Catch: java.lang.Throwable -> L47
            r3.getClass()     // Catch: java.lang.Throwable -> L47
            jd0 r4 = r0.L     // Catch: java.lang.Throwable -> L47
            da4 r4 = r4.B     // Catch: java.lang.Throwable -> L47
            xy0 r5 = defpackage.xy0.ALWAYS_OVERRIDE     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r8.e(r3)     // Catch: java.lang.Throwable -> L47
            r4.l(r3, r5, r6)     // Catch: java.lang.Throwable -> L47
            goto L2a
        L47:
            r7 = move-exception
            goto L81
        L49:
            monitor-exit(r1)
            java.lang.String r8 = "addCaptureRequestOptions"
            ec0 r0 = r7.a
            li7 r7 = r7.d
            r1 = 1
            tu0 r7 = r0.a(r7, r1)
            qb0 r0 = new qb0
            r0.<init>()
            hl5 r1 = new hl5
            r1.<init>()
            r0.c = r1
            tb0 r1 = new tb0
            r1.<init>(r0)
            r0.b = r1
            java.lang.Class<i61> r2 = defpackage.i61.class
            r0.a = r2
            y r2 = new y     // Catch: java.lang.Exception -> L79
            r3 = 18
            r2.<init>(r3, r0, r7)     // Catch: java.lang.Exception -> L79
            r7.a0(r2)     // Catch: java.lang.Exception -> L79
            r0.a = r8     // Catch: java.lang.Exception -> L79
            goto L7d
        L79:
            r7 = move-exception
            r1.b(r7)
        L7d:
            defpackage.l.F(r1)
            return
        L81:
            monitor-exit(r1)
            throw r7
    }

    @Override // defpackage.ve0
    public final void d(int r3) {
            r2 = this;
            od2 r0 = r2.b
            r1 = 1
            r0.c(r3, r1)
            if (r3 == r1) goto Lc
            if (r3 != 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            sy7 r2 = r2.c
            r2.c(r1)
            return
    }

    @Override // defpackage.ve0
    public final void e(defpackage.v66 r1) {
            r0 = this;
            od2 r0 = r0.b
            r0.getClass()
            return
    }

    @Override // defpackage.ve0
    public final defpackage.yy0 f() {
            r4 = this;
            dc0 r4 = r4.d
            ec0 r4 = r4.a
            java.lang.Object r0 = r4.A
            monitor-enter(r0)
            jd0 r4 = r4.L     // Catch: java.lang.Throwable -> L29
            kd0 r4 = r4.a()     // Catch: java.lang.Throwable -> L29
            jd0 r1 = new jd0     // Catch: java.lang.Throwable -> L29
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L29
            pk0 r2 = new pk0     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L29
            r4.h(r2)     // Catch: java.lang.Throwable -> L29
            os0 r4 = new os0     // Catch: java.lang.Throwable -> L29
            da4 r1 = r1.B     // Catch: java.lang.Throwable -> L29
            go4 r1 = defpackage.go4.a(r1)     // Catch: java.lang.Throwable -> L29
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return r4
        L29:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.ve0
    public final void g() {
            r5 = this;
            dc0 r5 = r5.d
            ec0 r0 = r5.a
            java.lang.Object r1 = r0.A
            monitor-enter(r1)
            jd0 r2 = new jd0     // Catch: java.lang.Throwable -> L47
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L47
            r0.L = r2     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            java.lang.String r0 = "clearCaptureRequestOptions"
            ec0 r1 = r5.a
            li7 r5 = r5.d
            r2 = 1
            tu0 r5 = r1.a(r5, r2)
            qb0 r1 = new qb0
            r1.<init>()
            hl5 r2 = new hl5
            r2.<init>()
            r1.c = r2
            tb0 r2 = new tb0
            r2.<init>(r1)
            r1.b = r2
            java.lang.Class<i61> r3 = defpackage.i61.class
            r1.a = r3
            y r3 = new y     // Catch: java.lang.Exception -> L3f
            r4 = 18
            r3.<init>(r4, r1, r5)     // Catch: java.lang.Exception -> L3f
            r5.a0(r3)     // Catch: java.lang.Exception -> L3f
            r1.a = r0     // Catch: java.lang.Exception -> L3f
            goto L43
        L3f:
            r5 = move-exception
            r2.b(r5)
        L43:
            defpackage.l.F(r2)
            return
        L47:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
    }
}
