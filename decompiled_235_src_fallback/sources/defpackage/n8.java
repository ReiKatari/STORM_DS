package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n8  reason: default package */
/* loaded from: classes.dex */
public final class n8 {
    public final defpackage.vd a;
    public final java.util.Set b;
    public defpackage.pq7 c;
    public final defpackage.ra4 d;

    public n8(defpackage.vd r3, java.util.Set r4, defpackage.w61 r5, defpackage.bg2 r6) {
            r2 = this;
            r3.getClass()
            r5.getClass()
            r2.<init>()
            r2.a = r3
            r2.b = r4
            ra4 r3 = new ra4
            q6 r4 = new q6
            r0 = 5
            r4.<init>(r0, r6, r2)
            r5.getClass()
            r3.<init>()
            r3.d = r5
            r3.e = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r3.c = r4
            monitor-enter(r4)
            ns3 r6 = new ns3     // Catch: java.lang.Throwable -> L43
            r0 = 20
            r1 = 0
            r6.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L43
            r0 = 3
            ap6 r6 = defpackage.hv.L(r5, r1, r1, r6, r0)     // Catch: java.lang.Throwable -> L43
            r3.f = r6     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)
            r2.d = r3
            a6 r3 = new a6
            r4 = 1
            r3.<init>(r2, r1, r4)
            defpackage.hv.L(r5, r1, r1, r3, r0)
            return
        L43:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
    }

    public final defpackage.jb4 a() {
            r4 = this;
            ra4 r4 = r4.d
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            boolean r1 = r4.b     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            int r1 = r4.a     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            int r1 = r1 + r3
            r4.a = r1     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L22
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L1e
            ap6 r1 = (defpackage.ap6) r1     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            r1.h(r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r4 = move-exception
            goto L29
        L20:
            r4.f = r2     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r0)
            jb4 r0 = new jb4
            r0.<init>(r4)
            return r0
        L29:
            monitor-exit(r0)
            throw r4
    }

    public final java.lang.Object b(defpackage.s41 r5) {
            r4 = this;
            vd r4 = r4.a
            tp6 r4 = r4.u
            m8 r0 = new m8
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r1, r3, r2)
            java.lang.Object r4 = defpackage.f04.C(r4, r0, r5)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            jg7 r0 = defpackage.jg7.a
            if (r4 != r5) goto L17
            goto L18
        L17:
            r4 = r0
        L18:
            if (r4 != r5) goto L1b
            return r4
        L1b:
            return r0
    }

    public final void c() {
            r1 = this;
            ra4 r0 = r1.d
            r0.c()
            vd r1 = r1.a
            r1.a()
            return
    }

    public final defpackage.jg7 d(defpackage.pq7 r7, defpackage.jb4 r8) {
            r6 = this;
            jg7 r0 = defpackage.jg7.a
            pq7 r1 = r6.c
            r6.c = r7
            r2 = 0
            if (r1 == 0) goto Lc
            r1.a(r2)
        Lc:
            vd r6 = r6.a
            tp6 r6 = r6.u
            java.lang.Object r1 = r7.e
            monitor-enter(r1)
            boolean r3 = r7.f     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            r8.b()     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r1)
            goto L31
        L1c:
            r6 = move-exception
            goto L34
        L1e:
            w61 r3 = r7.c     // Catch: java.lang.Throwable -> L1c
            bf4 r4 = new bf4     // Catch: java.lang.Throwable -> L1c
            r5 = 26
            r4.<init>(r6, r7, r2, r5)     // Catch: java.lang.Throwable -> L1c
            r6 = 3
            ap6 r6 = defpackage.hv.L(r3, r2, r2, r4, r6)     // Catch: java.lang.Throwable -> L1c
            r7.k = r6     // Catch: java.lang.Throwable -> L1c
            r7.l = r8     // Catch: java.lang.Throwable -> L1c
            goto L1a
        L31:
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            return r0
        L34:
            monitor-exit(r1)
            throw r6
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActiveCamera(cameraId="
            r0.<init>(r1)
            vd r1 = r2.a
            java.lang.String r1 = r1.a
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ")@"
            r0.append(r1)
            int r2 = r2.hashCode()
            r1 = 16
            defpackage.g04.y(r1)
            java.lang.String r2 = java.lang.Integer.toString(r2, r1)
            r2.getClass()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
