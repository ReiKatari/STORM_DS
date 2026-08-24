package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m3  reason: default package */
/* loaded from: classes.dex */
public final class m3 extends defpackage.v3 {
    public final defpackage.o75 a;
    public final defpackage.n3 b;
    public final defpackage.bt c;
    public final long d;

    public m3(defpackage.o75 r1, defpackage.n3 r2, defpackage.bt r3, long r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.v3
    public final defpackage.bt a() {
            r0 = this;
            bt r0 = r0.c
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2d
        L3:
            boolean r0 = r5 instanceof defpackage.m3
            r1 = 0
            if (r0 != 0) goto L9
            goto L2c
        L9:
            m3 r5 = (defpackage.m3) r5
            o75 r0 = r4.a
            o75 r2 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L16
            goto L2c
        L16:
            n3 r0 = r4.b
            n3 r2 = r5.b
            if (r0 == r2) goto L1d
            goto L2c
        L1d:
            bt r0 = r4.c
            bt r2 = r5.c
            if (r0 == r2) goto L24
            return r1
        L24:
            long r2 = r4.d
            long r4 = r5.d
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
        L2c:
            return r1
        L2d:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            o75 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            n3 r1 = r3.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            bt r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.d
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChallengeResult(achievement="
            r0.<init>(r1)
            o75 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", result="
            r0.append(r1)
            n3 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            bt r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", uiInstanceId="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
