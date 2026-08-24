package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p75  reason: default package */
/* loaded from: classes.dex */
public final class p75 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final int h;
    public final int i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final java.lang.String l;
    public final int m;

    public p75(long r1, long r3, long r5, int r7, int r8, java.lang.String r9, java.lang.String r10, int r11, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
            r0 = this;
            r9.getClass()
            r10.getClass()
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.g = r10
            r0.h = r11
            r0.i = r12
            r0.j = r13
            r0.k = r14
            r0.l = r15
            r1 = r16
            r0.m = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.p75
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p75 r8 = (defpackage.p75) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L27
            return r2
        L27:
            int r1 = r7.d
            int r3 = r8.d
            if (r1 == r3) goto L2e
            return r2
        L2e:
            int r1 = r7.e
            int r3 = r8.e
            if (r1 == r3) goto L35
            return r2
        L35:
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L40
            return r2
        L40:
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4b
            return r2
        L4b:
            int r1 = r7.h
            int r3 = r8.h
            if (r1 == r3) goto L52
            return r2
        L52:
            int r1 = r7.i
            int r3 = r8.i
            if (r1 == r3) goto L59
            return r2
        L59:
            java.lang.String r1 = r7.j
            java.lang.String r3 = r8.j
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r7.k
            java.lang.String r3 = r8.k
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r7.l
            java.lang.String r3 = r8.l
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            int r7 = r7.m
            int r8 = r8.m
            if (r7 == r8) goto L81
            return r2
        L81:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r2 = r4.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.e
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r2 = r4.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.g
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r2 = r4.h
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.i
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r2 = r4.j
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.k
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.l
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r4 = r4.m
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "RAAchievementEntity(id="
            java.lang.String r1 = ", gameId="
            long r2 = r5.a
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", setId="
            java.lang.String r2 = ", totalAwardsCasual="
            long r3 = r5.c
            defpackage.xg6.B(r0, r1, r3, r2)
            java.lang.String r1 = ", totalAwardsHardcore="
            java.lang.String r2 = ", title="
            int r3 = r5.d
            int r4 = r5.e
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", description="
            java.lang.String r2 = ", points="
            java.lang.String r3 = r5.f
            java.lang.String r4 = r5.g
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", displayOrder="
            java.lang.String r2 = ", badgeUrlUnlocked="
            int r3 = r5.h
            int r4 = r5.i
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", badgeUrlLocked="
            java.lang.String r2 = ", memoryAddress="
            java.lang.String r3 = r5.j
            java.lang.String r4 = r5.k
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.l
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r5 = r5.m
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
