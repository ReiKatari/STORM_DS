package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m93  reason: default package */
/* loaded from: classes.dex */
public final class m93 {
    public static final defpackage.m93 e = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
            m93 r0 = new m93
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            defpackage.m93.e = r0
            return
    }

    public m93(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.d
            int r1 = r1.b
            int r0 = r0 - r1
            return r0
    }

    public final long b() {
            r6 = this;
            int r0 = r6.a
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r6 = r6.b
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.m93
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m93 r5 = (defpackage.m93) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.d
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IntRect.fromLTRB("
            r0.<init>(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.c
            r0.append(r2)
            r0.append(r1)
            int r3 = r3.d
            r1 = 41
            java.lang.String r3 = defpackage.xg6.q(r0, r3, r1)
            return r3
    }
}
