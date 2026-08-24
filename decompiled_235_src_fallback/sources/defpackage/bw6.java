package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw6  reason: default package */
/* loaded from: classes.dex */
public final class bw6 {
    public final java.lang.Object a;
    public final android.util.Size b;
    public final defpackage.yq1 c;
    public final boolean d;
    public final defpackage.tb0 e;
    public final defpackage.qb0 f;
    public final defpackage.tb0 g;
    public final defpackage.qb0 h;
    public final defpackage.qb0 i;
    public final defpackage.o33 j;
    public defpackage.cz k;
    public defpackage.pk0 l;
    public defpackage.ov2 m;

    static {
            android.util.Range r0 = defpackage.yy.h
            return
    }

    public bw6(android.util.Size r9, boolean r10, defpackage.yq1 r11, defpackage.kv6 r12) {
            r8 = this;
            java.lang.String r0 = "-Surface"
            java.lang.String r1 = "-status"
            java.lang.String r2 = "-cancellation"
            r8.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r8.a = r3
            r8.b = r9
            r8.d = r10
            boolean r10 = r11.b()
            java.lang.String r3 = "SurfaceRequest's DynamicRange must always be fully specified."
            defpackage.np2.s(r3, r10)
            r8.c = r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "SurfaceRequest[size: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r11 = ", id: "
            r10.append(r11)
            int r11 = r8.hashCode()
            r10.append(r11)
            java.lang.String r11 = "]"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.util.concurrent.atomic.AtomicReference r11 = new java.util.concurrent.atomic.AtomicReference
            r3 = 0
            r11.<init>(r3)
            qb0 r4 = new qb0
            r4.<init>()
            hl5 r5 = new hl5
            r5.<init>()
            r4.c = r5
            tb0 r5 = new tb0
            r5.<init>(r4)
            r4.b = r5
            java.lang.Class<i61> r6 = defpackage.i61.class
            r4.a = r6
            r11.set(r4)     // Catch: java.lang.Exception -> L65
            java.lang.String r2 = r10.concat(r2)     // Catch: java.lang.Exception -> L65
            r4.a = r2     // Catch: java.lang.Exception -> L65
            goto L69
        L65:
            r2 = move-exception
            r5.b(r2)
        L69:
            java.lang.Object r11 = r11.get()
            qb0 r11 = (defpackage.qb0) r11
            r11.getClass()
            r8.i = r11
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>(r3)
            qb0 r4 = new qb0
            r4.<init>()
            hl5 r7 = new hl5
            r7.<init>()
            r4.c = r7
            tb0 r7 = new tb0
            r7.<init>(r4)
            r4.b = r7
            r4.a = r6
            r2.set(r4)     // Catch: java.lang.Exception -> L98
            java.lang.String r1 = r10.concat(r1)     // Catch: java.lang.Exception -> L98
            r4.a = r1     // Catch: java.lang.Exception -> L98
            goto L9c
        L98:
            r1 = move-exception
            r7.b(r1)
        L9c:
            r8.g = r7
            rr6 r1 = new rr6
            r4 = 3
            r1.<init>(r4, r11, r5)
            uj1 r11 = defpackage.u24.j()
            uo2 r4 = new uo2
            r5 = 0
            r4.<init>(r5, r7, r1)
            r7.a(r11, r4)
            java.lang.Object r11 = r2.get()
            qb0 r11 = (defpackage.qb0) r11
            r11.getClass()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r3)
            qb0 r2 = new qb0
            r2.<init>()
            hl5 r4 = new hl5
            r4.<init>()
            r2.c = r4
            tb0 r4 = new tb0
            r4.<init>(r2)
            r2.b = r4
            r2.a = r6
            r1.set(r2)     // Catch: java.lang.Exception -> Lde
            java.lang.String r0 = r10.concat(r0)     // Catch: java.lang.Exception -> Lde
            r2.a = r0     // Catch: java.lang.Exception -> Lde
            goto Le2
        Lde:
            r0 = move-exception
            r4.b(r0)
        Le2:
            r8.e = r4
            java.lang.Object r0 = r1.get()
            qb0 r0 = (defpackage.qb0) r0
            r0.getClass()
            r8.f = r0
            o33 r0 = new o33
            r0.<init>(r8, r9)
            r8.j = r0
            tb0 r9 = r0.e
            gx3 r9 = defpackage.l.F(r9)
            m44 r0 = new m44
            r1 = 23
            r0.<init>(r9, r11, r10, r1)
            uj1 r10 = defpackage.u24.j()
            uo2 r11 = new uo2
            r11.<init>(r5, r4, r0)
            r4.a(r10, r11)
            of1 r10 = new of1
            r11 = 1
            r10.<init>(r8, r11)
            uj1 r11 = defpackage.u24.j()
            r9.a(r11, r10)
            uj1 r9 = defpackage.u24.j()
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference
            r10.<init>(r3)
            pk0 r11 = new pk0
            r0 = 8
            r11.<init>(r0, r8, r10)
            tb0 r11 = defpackage.ak7.W(r11)
            s35 r0 = new s35
            r0.<init>(r12)
            uo2 r12 = new uo2
            r12.<init>(r5, r11, r0)
            r11.a(r9, r12)
            java.lang.Object r9 = r10.get()
            qb0 r9 = (defpackage.qb0) r9
            r9.getClass()
            r8.h = r9
            return
    }

    public final void a(android.view.Surface r4, java.util.concurrent.Executor r5, defpackage.b31 r6) {
            r3 = this;
            boolean r0 = r4.isValid()
            r1 = 0
            if (r0 != 0) goto L10
            zv6 r3 = new zv6
            r3.<init>(r6, r4, r1)
            r5.execute(r3)
            return
        L10:
            qb0 r0 = r3.f
            boolean r0 = r0.a(r4)
            if (r0 != 0) goto L42
            tb0 r0 = r3.e
            boolean r2 = r0.isCancelled()
            if (r2 == 0) goto L21
            goto L42
        L21:
            sb0 r3 = r0.B
            boolean r3 = r3.isDone()
            r1 = 0
            defpackage.np2.A(r1, r3)
            r0.get()     // Catch: java.lang.Throwable -> L38
            zv6 r3 = new zv6     // Catch: java.lang.Throwable -> L38
            r0 = 1
            r3.<init>(r6, r4, r0)     // Catch: java.lang.Throwable -> L38
            r5.execute(r3)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            zv6 r3 = new zv6
            r0 = 2
            r3.<init>(r6, r4, r0)
            r5.execute(r3)
            return
        L42:
            rr6 r0 = new rr6
            r2 = 4
            r0.<init>(r2, r6, r4)
            uo2 r4 = new uo2
            tb0 r3 = r3.g
            r4.<init>(r1, r3, r0)
            r3.a(r5, r4)
            return
    }

    public final void b() {
            r2 = this;
            se0 r0 = new se0
            java.lang.String r1 = "Surface request will not complete."
            r0.<init>(r1)
            qb0 r2 = r2.f
            r2.c(r0)
            return
    }
}
