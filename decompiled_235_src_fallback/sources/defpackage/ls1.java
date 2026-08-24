package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls1  reason: default package */
/* loaded from: classes.dex */
public final class ls1 {
    public static final long[] e = null;
    public long a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.io.Serializable d;

    static {
            r0 = 0
            long[] r0 = new long[r0]
            defpackage.ls1.e = r0
            return
    }

    public ls1(defpackage.qz6 r3) {
            r2 = this;
            r3.getClass()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r0.getClass()
            r2.<init>()
            r0 = 300000000000(0x45d964b800, double:1.482196937524E-312)
            r2.a = r0
            pz6 r3 = r3.d()
            r2.b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = defpackage.az7.b
            java.lang.String r1 = " ConnectionPool connection closer"
            java.lang.String r3 = defpackage.i61.n(r3, r0, r1)
            hk1 r0 = new hk1
            r1 = 1
            r0.<init>(r3, r1, r2)
            r2.c = r0
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.d = r3
            return
    }

    public ls1(defpackage.wb6 r5, defpackage.eo2 r6) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            r4.b = r5
            r4.c = r6
            int r5 = r5.f()
            r0 = -1
            r2 = 0
            r6 = 64
            if (r5 > r6) goto L22
            if (r5 != r6) goto L19
            goto L1b
        L19:
            long r2 = r0 << r5
        L1b:
            r4.a = r2
            long[] r5 = defpackage.ls1.e
            r4.d = r5
            return
        L22:
            r4.a = r2
            int r6 = r5 + (-1)
            int r6 = r6 >>> 6
            r2 = r5 & 63
            long[] r3 = new long[r6]
            if (r2 == 0) goto L33
            int r6 = r6 + (-1)
            long r0 = r0 << r5
            r3[r6] = r0
        L33:
            r4.d = r3
            return
    }

    public void a(int r6) {
            r5 = this;
            r0 = 64
            r1 = 1
            if (r6 >= r0) goto Le
            long r3 = r5.a
            long r0 = r1 << r6
            long r0 = r0 | r3
            r5.a = r0
            return
        Le:
            int r0 = r6 >>> 6
            int r0 = r0 + (-1)
            r6 = r6 & 63
            java.io.Serializable r5 = r5.d
            long[] r5 = (long[]) r5
            r3 = r5[r0]
            long r1 = r1 << r6
            long r1 = r1 | r3
            r5[r0] = r1
            return
    }

    public int b() {
            r15 = this;
            java.lang.Object r0 = r15.c
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r1 = r15.b
            wb6 r1 = (defpackage.wb6) r1
            int r2 = r1.f()
        Lc:
            long r3 = r15.a
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 1
            if (r7 == 0) goto L33
            long r3 = ~r3
            int r3 = java.lang.Long.numberOfTrailingZeros(r3)
            long r4 = r15.a
            long r6 = r8 << r3
            long r4 = r4 | r6
            r15.a = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r0.o(r1, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lc
            return r3
        L33:
            r3 = 64
            if (r2 <= r3) goto L69
            java.io.Serializable r15 = r15.d
            long[] r15 = (long[]) r15
            int r2 = r15.length
            r3 = 0
        L3d:
            if (r3 >= r2) goto L69
            int r4 = r3 + 1
            int r7 = r4 * 64
            r10 = r15[r3]
        L45:
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L65
            long r12 = ~r10
            int r12 = java.lang.Long.numberOfTrailingZeros(r12)
            long r13 = r8 << r12
            long r10 = r10 | r13
            int r12 = r12 + r7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r0.o(r1, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L45
            r15[r3] = r10
            return r12
        L65:
            r15[r3] = r10
            r3 = r4
            goto L3d
        L69:
            r15 = -1
            return r15
    }

    public int c(defpackage.ke5 r7, long r8) {
            r6 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            java.util.ArrayList r0 = r7.p
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L4e
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L1b
            int r2 = r2 + 1
            goto L6
        L1b:
            he5 r3 = (defpackage.he5) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "A connection to "
            r4.<init>(r5)
            b26 r5 = r7.c
            ea r5 = r5.a
            i03 r5 = r5.h
            r4.append(r5)
            java.lang.String r5 = " was leaked. Did you forget to close a response body?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            kx4 r5 = defpackage.kx4.a
            kx4 r5 = defpackage.kx4.a
            java.lang.Object r3 = r3.a
            r5.j(r3, r4)
            r0.remove(r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6
            long r2 = r6.a
            long r8 = r8 - r2
            r7.q = r8
            return r1
        L4e:
            int r6 = r0.size()
            return r6
    }
}
