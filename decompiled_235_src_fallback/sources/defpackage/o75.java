package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o75  reason: default package */
/* loaded from: classes.dex */
public final class o75 {
    public final long a;
    public final long b;
    public final long c;
    public final java.lang.Integer d;
    public final java.lang.Integer e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final int h;
    public final int i;
    public final java.net.URL j;
    public final java.net.URL k;
    public final java.lang.String l;
    public final defpackage.n75 m;

    public o75(long r1, long r3, long r5, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, int r11, int r12, java.net.URL r13, java.net.URL r14, java.lang.String r15, defpackage.n75 r16) {
            r0 = this;
            r9.getClass()
            r10.getClass()
            r15.getClass()
            r16.getClass()
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

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r1 = r1.f
            java.lang.String r0 = "[m]"
            java.lang.String r1 = defpackage.qs6.E0(r1, r0)
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public final boolean b() {
            r2 = this;
            java.lang.String r0 = "[m]"
            r1 = 0
            java.lang.String r2 = r2.f
            boolean r2 = defpackage.xs6.Y(r2, r0, r1)
            return r2
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            goto L8d
        L4:
            boolean r0 = r7 instanceof defpackage.o75
            r1 = 0
            if (r0 != 0) goto Lb
            goto L8c
        Lb:
            o75 r7 = (defpackage.o75) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L17
            goto L8c
        L17:
            long r2 = r6.b
            long r4 = r7.b
            boolean r0 = defpackage.ga5.a(r2, r4)
            if (r0 != 0) goto L23
            goto L8c
        L23:
            long r2 = r6.c
            long r4 = r7.c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L8f
            java.lang.Integer r0 = r6.d
            java.lang.Integer r2 = r7.d
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L36
            goto L8c
        L36:
            java.lang.Integer r0 = r6.e
            java.lang.Integer r2 = r7.e
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L41
            goto L8c
        L41:
            java.lang.String r0 = r6.f
            java.lang.String r2 = r7.f
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L4c
            goto L8c
        L4c:
            java.lang.String r0 = r6.g
            java.lang.String r2 = r7.g
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L57
            goto L8c
        L57:
            int r0 = r6.h
            int r2 = r7.h
            if (r0 == r2) goto L5e
            goto L8c
        L5e:
            int r0 = r6.i
            int r2 = r7.i
            if (r0 == r2) goto L65
            goto L8c
        L65:
            java.net.URL r0 = r6.j
            java.net.URL r2 = r7.j
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L70
            goto L8c
        L70:
            java.net.URL r0 = r6.k
            java.net.URL r2 = r7.k
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L7b
            goto L8c
        L7b:
            java.lang.String r0 = r6.l
            java.lang.String r2 = r7.l
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L86
            goto L8c
        L86:
            n75 r6 = r6.m
            n75 r7 = r7.m
            if (r6 == r7) goto L8d
        L8c:
            return r1
        L8d:
            r6 = 1
            return r6
        L8f:
            return r1
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
            r2 = 0
            java.lang.Integer r3 = r4.d
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.e
            if (r3 != 0) goto L27
            goto L2b
        L27:
            int r2 = r3.hashCode()
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.g
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r2 = r4.h
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.i
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.net.URL r2 = r4.j
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.net.URL r0 = r4.k
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.l
            int r0 = defpackage.xg6.d(r0, r1, r2)
            n75 r4 = r4.m
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.b
            java.lang.String r0 = defpackage.ga5.b(r0)
            long r1 = r5.c
            java.lang.String r1 = defpackage.mp2.a0(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RAAchievement(id="
            r2.<init>(r3)
            long r3 = r5.a
            r2.append(r3)
            java.lang.String r3 = ", gameId="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", setId="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", totalAwardsCasual="
            r2.append(r0)
            java.lang.Integer r0 = r5.d
            r2.append(r0)
            java.lang.String r0 = ", totalAwardsHardcore="
            r2.append(r0)
            java.lang.Integer r0 = r5.e
            r2.append(r0)
            java.lang.String r0 = ", title="
            r2.append(r0)
            java.lang.String r0 = r5.f
            r2.append(r0)
            java.lang.String r0 = ", description="
            r2.append(r0)
            java.lang.String r0 = r5.g
            r2.append(r0)
            java.lang.String r0 = ", points="
            r2.append(r0)
            int r0 = r5.h
            r2.append(r0)
            java.lang.String r0 = ", displayOrder="
            r2.append(r0)
            int r0 = r5.i
            r2.append(r0)
            java.lang.String r0 = ", badgeUrlUnlocked="
            r2.append(r0)
            java.net.URL r0 = r5.j
            r2.append(r0)
            java.lang.String r0 = ", badgeUrlLocked="
            r2.append(r0)
            java.net.URL r0 = r5.k
            r2.append(r0)
            java.lang.String r0 = ", memoryAddress="
            r2.append(r0)
            java.lang.String r0 = r5.l
            r2.append(r0)
            java.lang.String r0 = ", type="
            r2.append(r0)
            n75 r5 = r5.m
            r2.append(r5)
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
    }
}
