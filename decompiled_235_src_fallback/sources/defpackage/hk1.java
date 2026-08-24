package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk1  reason: default package */
/* loaded from: classes.dex */
public final class hk1 extends defpackage.lz6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ java.lang.Object f;

    public hk1(defpackage.af5 r3) {
            r2 = this;
            r0 = 2
            r2.e = r0
            r2.f = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.m
            java.lang.String r1 = " writer"
            java.lang.String r3 = defpackage.i61.n(r0, r3, r1)
            r0 = 1
            r2.<init>(r3, r0)
            return
    }

    public /* synthetic */ hk1(java.lang.String r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.e = r2
            r0.f = r3
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.lz6
    public final long a() {
            r21 = this;
            r0 = r21
            int r1 = r0.e
            r2 = 0
            r3 = 1
            switch(r1) {
                case 0: goto Le5;
                case 1: goto L1f;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r0.f
            r1 = r0
            af5 r1 = (defpackage.af5) r1
            boolean r0 = r1.g()     // Catch: java.io.IOException -> L17
            if (r0 == 0) goto L1c
            r4 = 0
            goto L1e
        L17:
            r0 = move-exception
            r2 = 2
            defpackage.af5.c(r1, r0, r2)
        L1c:
            r4 = -1
        L1e:
            return r4
        L1f:
            java.lang.Object r0 = r0.f
            ls1 r0 = (defpackage.ls1) r0
            long r8 = java.lang.System.nanoTime()
            long r10 = r0.a
            long r10 = r8 - r10
            r12 = 1
            long r10 = r10 + r12
            java.io.Serializable r1 = r0.d
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r12
            r15 = r13
            r13 = r10
            r11 = r17
            r10 = r2
        L46:
            boolean r18 = r1.hasNext()
            if (r18 == 0) goto L7b
            java.lang.Object r18 = r1.next()
            r4 = r18
            ke5 r4 = (defpackage.ke5) r4
            r4.getClass()
            monitor-enter(r4)
            int r5 = r0.c(r4, r8)     // Catch: java.lang.Throwable -> L78
            if (r5 <= 0) goto L63
            int r10 = r10 + 1
            r19 = -1
            goto L76
        L63:
            r19 = -1
            long r6 = r4.q     // Catch: java.lang.Throwable -> L78
            int r5 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r5 >= 0) goto L6d
            r11 = r4
            r13 = r6
        L6d:
            int r2 = r2 + 1
            int r5 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r5 >= 0) goto L76
            r17 = r4
            r15 = r6
        L76:
            monitor-exit(r4)
            goto L46
        L78:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L7b:
            r19 = -1
            if (r11 == 0) goto L81
            r12 = r11
            goto L8a
        L81:
            r1 = 5
            if (r2 <= r1) goto L88
            r13 = r15
            r12 = r17
            goto L8a
        L88:
            r13 = r19
        L8a:
            if (r12 == 0) goto Ld5
            monitor-enter(r12)
            java.util.ArrayList r1 = r12.p     // Catch: java.lang.Throwable -> Ld2
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto L99
        L95:
            monitor-exit(r12)
        L96:
            r4 = 0
            goto Le4
        L99:
            long r1 = r12.q     // Catch: java.lang.Throwable -> Ld2
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 == 0) goto La0
            goto L95
        La0:
            r12.j = r3     // Catch: java.lang.Throwable -> Ld2
            java.io.Serializable r1 = r0.d     // Catch: java.lang.Throwable -> Ld2
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1     // Catch: java.lang.Throwable -> Ld2
            r1.remove(r12)     // Catch: java.lang.Throwable -> Ld2
            monitor-exit(r12)
            java.net.Socket r1 = r12.e
            defpackage.az7.c(r1)
            java.io.Serializable r1 = r0.d
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L96
            java.lang.Object r0 = r0.b
            pz6 r0 = (defpackage.pz6) r0
            qz6 r1 = r0.a
            monitor-enter(r1)
            boolean r2 = r0.a()     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto Lce
            qz6 r2 = r0.a     // Catch: java.lang.Throwable -> Lcc
            r2.c(r0)     // Catch: java.lang.Throwable -> Lcc
            goto Lce
        Lcc:
            r0 = move-exception
            goto Ld0
        Lce:
            monitor-exit(r1)
            goto L96
        Ld0:
            monitor-exit(r1)
            throw r0
        Ld2:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        Ld5:
            if (r17 == 0) goto Ldd
            long r0 = r0.a
            long r15 = r15 + r0
            long r4 = r15 - r8
            goto Le4
        Ldd:
            if (r10 <= 0) goto Le2
            long r4 = r0.a
            goto Le4
        Le2:
            r4 = r19
        Le4:
            return r4
        Le5:
            r19 = -1
            java.lang.Object r0 = r0.f
            r1 = r0
            kk1 r1 = (defpackage.kk1) r1
            monitor-enter(r1)
            boolean r0 = r1.i0     // Catch: java.lang.Throwable -> Lfa
            if (r0 == 0) goto L11f
            boolean r0 = r1.j0     // Catch: java.lang.Throwable -> Lfa
            if (r0 == 0) goto Lf6
            goto L11f
        Lf6:
            r1.J()     // Catch: java.lang.Throwable -> Lfa java.io.IOException -> Lfc
            goto Lfe
        Lfa:
            r0 = move-exception
            goto L121
        Lfc:
            r1.k0 = r3     // Catch: java.lang.Throwable -> Lfa
        Lfe:
            boolean r0 = r1.u()     // Catch: java.lang.Throwable -> Lfa java.io.IOException -> L10a
            if (r0 == 0) goto L11f
            r1.D()     // Catch: java.lang.Throwable -> Lfa java.io.IOException -> L10a
            r1.f0 = r2     // Catch: java.lang.Throwable -> Lfa java.io.IOException -> L10a
            goto L11f
        L10a:
            r1.l0 = r3     // Catch: java.lang.Throwable -> Lfa
            ee5 r0 = r1.d0     // Catch: java.lang.Throwable -> Lfa
            if (r0 == 0) goto L113
            defpackage.yy7.b(r0)     // Catch: java.lang.Throwable -> Lfa
        L113:
            y40 r0 = new y40     // Catch: java.lang.Throwable -> Lfa
            r0.<init>()     // Catch: java.lang.Throwable -> Lfa
            ee5 r2 = new ee5     // Catch: java.lang.Throwable -> Lfa
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lfa
            r1.d0 = r2     // Catch: java.lang.Throwable -> Lfa
        L11f:
            monitor-exit(r1)
            return r19
        L121:
            monitor-exit(r1)
            throw r0
    }
}
