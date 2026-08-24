package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp6  reason: default package */
/* loaded from: classes.dex */
public final class hp6 implements defpackage.il7 {
    public final defpackage.il7 A;
    public final long B;

    public hp6(defpackage.il7 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.il7
    public final boolean a() {
            r0 = this;
            il7 r0 = r0.A
            boolean r0 = r0.a()
            return r0
    }

    @Override // defpackage.il7
    public final long b(defpackage.ap r3, defpackage.ap r4, defpackage.ap r5) {
            r2 = this;
            il7 r0 = r2.A
            long r3 = r0.b(r3, r4, r5)
            long r0 = r2.B
            long r3 = r3 + r0
            return r3
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.hp6
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            hp6 r7 = (defpackage.hp6) r7
            long r2 = r7.B
            long r4 = r6.B
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1c
            il7 r7 = r7.A
            il7 r6 = r6.A
            boolean r6 = defpackage.nb3.k(r7, r6)
            if (r6 == 0) goto L1c
            r6 = 1
            return r6
        L1c:
            return r1
    }

    @Override // defpackage.il7
    public final defpackage.ap h(long r4, defpackage.ap r6, defpackage.ap r7, defpackage.ap r8) {
            r3 = this;
            long r0 = r3.B
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r8
        L7:
            il7 r3 = r3.A
            long r4 = r4 - r0
            ap r3 = r3.h(r4, r6, r7, r8)
            return r3
    }

    public final int hashCode() {
            r3 = this;
            il7 r0 = r3.A
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.B
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    @Override // defpackage.il7
    public final defpackage.ap q(long r4, defpackage.ap r6, defpackage.ap r7, defpackage.ap r8) {
            r3 = this;
            long r0 = r3.B
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r6
        L7:
            il7 r3 = r3.A
            long r4 = r4 - r0
            ap r3 = r3.q(r4, r6, r7, r8)
            return r3
    }
}
