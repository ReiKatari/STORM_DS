package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp6  reason: default package */
/* loaded from: classes.dex */
public final class mp6 implements defpackage.eh6 {
    public final long A;
    public final long B;

    public mp6(long r4, long r6) {
            r3 = this;
            r3.<init>()
            r3.A = r4
            r3.B = r6
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = " ms) cannot be negative"
            if (r3 < 0) goto L1f
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L14
            return
        L14:
            java.lang.String r3 = "replayExpiration("
            java.lang.String r3 = defpackage.lb1.i(r6, r3, r2)
            defpackage.i.f(r3)
            r3 = 0
            throw r3
        L1f:
            java.lang.String r3 = "stopTimeout("
            java.lang.String r3 = defpackage.lb1.i(r4, r3, r2)
            defpackage.i.f(r3)
            r3 = 0
            throw r3
    }

    @Override // defpackage.eh6
    public final defpackage.le2 d(defpackage.yt6 r4) {
            r3 = this;
            lp6 r0 = new lp6
            r1 = 0
            r0.<init>(r3, r1)
            cm0 r3 = defpackage.f04.V(r4, r0)
            m8 r4 = new m8
            r0 = 2
            r2 = 9
            r4.<init>(r0, r1, r2)
            cf2 r0 = new cf2
            r1 = 1
            r0.<init>(r3, r4, r1)
            le2 r3 = defpackage.f04.z(r0)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mp6
            if (r0 == 0) goto L18
            mp6 r5 = (defpackage.mp6) r5
            long r0 = r5.A
            long r2 = r4.A
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            long r0 = r4.B
            long r4 = r5.B
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L18
            r4 = 1
            return r4
        L18:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.A
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.B
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r7 = this;
            kw3 r0 = new kw3
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            long r3 = r7.A
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            java.lang.String r2 = "ms"
            if (r1 <= 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "stopTimeout="
            r1.<init>(r5)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L24:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r5 = r7.B
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L43
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "replayExpiration="
            r7.<init>(r1)
            r7.append(r5)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        L43:
            kw3 r1 = defpackage.hf.A(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "SharingStarted.WhileSubscribed("
            r7.<init>(r0)
            r5 = 0
            r6 = 63
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r0 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            r1 = 41
            java.lang.String r7 = defpackage.lb1.q(r7, r0, r1)
            return r7
    }
}
