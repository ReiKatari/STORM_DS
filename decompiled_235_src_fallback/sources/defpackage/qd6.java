package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd6  reason: default package */
/* loaded from: classes.dex */
public final class qd6 {
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public java.util.BitSet g;
    public int h;
    public int i;

    public final void a(int r5) {
            r4 = this;
            int r0 = r4.i
            if (r0 <= 0) goto Lf
            int r1 = r4.f
            if (r1 == 0) goto L9
            goto Lf
        L9:
            java.lang.String r4 = "archive with entries but no folders"
            defpackage.e41.i(r4)
            return
        Lf:
            long r0 = (long) r0
            long r2 = r4.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L29
            long r0 = r4.b()
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            long r2 = (long) r5
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L23
            return
        L23:
            gb2 r4 = new gb2
            r4.<init>(r5, r0)
            throw r4
        L29:
            java.lang.String r4 = "archive doesn't contain enough substreams for entries"
            defpackage.e41.i(r4)
            return
    }

    public final long b() {
            r10 = this;
            int r0 = r10.a
            long r1 = (long) r0
            r3 = 16
            long r1 = r1 * r3
            int r5 = r0 / 8
            long r5 = (long) r5
            long r1 = r1 + r5
            int r5 = r10.f
            long r6 = (long) r5
            r8 = 30
            long r6 = r6 * r8
            long r6 = r6 + r1
            long r1 = r10.b
            r8 = 22
            long r1 = r1 * r8
            long r1 = r1 + r6
            long r6 = r10.c
            long r8 = (long) r5
            long r8 = r6 - r8
            long r8 = r8 * r3
            long r8 = r8 + r1
            long r1 = r10.d
            long r1 = r1 - r6
            long r3 = (long) r5
            long r1 = r1 + r3
            r3 = 8
            long r1 = r1 * r3
            long r1 = r1 + r8
            long r6 = r6 * r3
            long r6 = r6 + r1
            int r10 = r10.h
            long r1 = (long) r10
            r3 = 100
            long r1 = r1 * r3
            long r1 = r1 + r6
            int r5 = r5 * 8
            int r0 = r0 * 8
            int r0 = r0 + r5
            int r10 = r10 * 4
            int r10 = r10 + r0
            long r3 = (long) r10
            long r1 = r1 + r3
            r3 = 2
            long r1 = r1 * r3
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Archive with "
            r0.<init>(r1)
            int r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = " entries in "
            r0.append(r1)
            int r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = " folders. Estimated size "
            r0.append(r1)
            long r1 = r5.b()
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 / r3
            java.lang.String r5 = " kB."
            java.lang.String r5 = defpackage.lb1.p(r0, r1, r5)
            return r5
    }
}
