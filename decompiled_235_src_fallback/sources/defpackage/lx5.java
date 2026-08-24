package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx5  reason: default package */
/* loaded from: classes.dex */
public final class lx5 {
    public final java.lang.String a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;

    public lx5(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final java.lang.String a() {
            r2 = this;
            boolean r0 = r2.e
            java.lang.String r1 = r2.a
            if (r0 == 0) goto L11
            java.lang.String r2 = r2.b()
            java.lang.String r0 = "_"
            java.lang.String r2 = defpackage.lb1.m(r1, r0, r2)
            return r2
        L11:
            return r1
    }

    public final java.lang.String b() {
            r5 = this;
            r0 = 16
            defpackage.g04.y(r0)
            int r5 = r5.b
            long r1 = (long) r5
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            java.lang.String r5 = defpackage.jx2.R(r0, r1)
            r0 = 8
            java.lang.String r5 = defpackage.qs6.B0(r0, r5)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toUpperCase(r0)
            r5.getClass()
            return r5
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.lx5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lx5 r5 = (defpackage.lx5) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L3b
            return r2
        L3b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r3 = r3.e
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.b
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = ", headerChecksum="
            java.lang.String r2 = ", gameTitle="
            java.lang.String r3 = "RomInfo(gameCode="
            java.lang.String r4 = r5.a
            java.lang.StringBuilder r0 = defpackage.i61.u(r3, r4, r1, r0, r2)
            java.lang.String r1 = ", gameName="
            java.lang.String r2 = ", isDsiWareTitle="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.e
            java.lang.String r5 = defpackage.i61.o(r0, r5, r1)
            return r5
    }
}
