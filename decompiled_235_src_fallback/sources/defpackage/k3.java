package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k3  reason: default package */
/* loaded from: classes.dex */
public final class k3 extends defpackage.v3 {
    public final defpackage.o75 a;
    public final defpackage.bt b;
    public final long c;

    public k3(defpackage.o75 r1, defpackage.bt r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.v3
    public final defpackage.bt a() {
            r0 = this;
            bt r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof defpackage.k3
            r1 = 0
            if (r0 != 0) goto L9
            goto L25
        L9:
            k3 r5 = (defpackage.k3) r5
            o75 r0 = r4.a
            o75 r2 = r5.a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L16
            goto L25
        L16:
            bt r0 = r4.b
            bt r2 = r5.b
            if (r0 == r2) goto L1d
            return r1
        L1d:
            long r2 = r4.c
            long r4 = r5.c
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L26
        L25:
            return r1
        L26:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            o75 r0 = r4.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            bt r1 = r4.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.c
            int r4 = java.lang.Long.hashCode(r2)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AchievementPrimed(achievement="
            r0.<init>(r1)
            o75 r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            bt r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", uiInstanceId="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r4.c
            java.lang.String r4 = defpackage.lb1.p(r0, r2, r1)
            return r4
    }
}
