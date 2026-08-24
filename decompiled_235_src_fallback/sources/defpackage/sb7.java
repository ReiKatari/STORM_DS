package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb7  reason: default package */
/* loaded from: classes.dex */
public final class sb7 {
    public static volatile defpackage.vb1 e;
    public final defpackage.wr0 a;
    public final defpackage.wr0 b;
    public final defpackage.ye1 c;
    public final defpackage.p87 d;

    public sb7(defpackage.wr0 r1, defpackage.wr0 r2, defpackage.ye1 r3, defpackage.p87 r4, defpackage.eb r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            java.lang.Object r0 = r5.B
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            g15 r1 = new g15
            r2 = 27
            r1.<init>(r5, r2)
            r0.execute(r1)
            return
    }

    public static defpackage.sb7 a() {
            vb1 r0 = defpackage.sb7.e
            if (r0 == 0) goto Ld
            n55 r0 = r0.X
            java.lang.Object r0 = r0.get()
            sb7 r0 = (defpackage.sb7) r0
            return r0
        Ld:
            java.lang.String r0 = "Not initialized!"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    public static void b(android.content.Context r2) {
            vb1 r0 = defpackage.sb7.e
            if (r0 != 0) goto L22
            java.lang.Class<sb7> r0 = defpackage.sb7.class
            monitor-enter(r0)
            vb1 r1 = defpackage.sb7.e     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            rh r1 = new rh     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            r1.a = r2     // Catch: java.lang.Throwable -> L1c
            vb1 r2 = r1.d()     // Catch: java.lang.Throwable -> L1c
            defpackage.sb7.e = r2     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
        L22:
            return
    }

    public final defpackage.m44 c(defpackage.fa0 r7) {
            r6 = this;
            m44 r0 = new m44
            boolean r1 = r7 instanceof defpackage.fa0
            if (r1 == 0) goto Ld
            java.util.Set r1 = defpackage.fa0.d
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            goto L18
        Ld:
            c42 r1 = new c42
            java.lang.String r2 = "proto"
            r1.<init>(r2)
            java.util.Set r1 = java.util.Collections.singleton(r1)
        L18:
            bt r2 = defpackage.fz.a()
            r7.getClass()
            java.lang.String r3 = "cct"
            r2.B = r3
            java.lang.String r3 = r7.a
            java.lang.String r7 = r7.b
            if (r7 != 0) goto L2b
            java.lang.String r7 = ""
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "1$"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "\\"
            r4.append(r3)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            byte[] r7 = r7.getBytes(r3)
            r2.L = r7
            fz r7 = r2.A()
            r2 = 25
            r0.<init>(r1, r7, r6, r2)
            return r0
    }
}
