package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp6  reason: default package */
/* loaded from: classes.dex */
public final class gp6 implements defpackage.to {
    public final defpackage.to a;
    public final long b;

    public gp6(defpackage.rc2 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.to
    public final defpackage.il7 a(defpackage.wc7 r4) {
            r3 = this;
            to r0 = r3.a
            il7 r4 = r0.a(r4)
            hp6 r0 = new hp6
            long r1 = r3.b
            r0.<init>(r4, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.gp6
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            gp6 r7 = (defpackage.gp6) r7
            long r2 = r7.b
            long r4 = r6.b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1c
            to r7 = r7.a
            to r6 = r6.a
            boolean r6 = defpackage.nb3.k(r7, r6)
            if (r6 == 0) goto L1c
            r6 = 1
            return r6
        L1c:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            to r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }
}
