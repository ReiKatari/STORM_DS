package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qe4  reason: default package */
/* loaded from: classes.dex */
public final class qe4 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final int f;
    public final int g;

    public qe4(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, int r6, int r7) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4c
        L3:
            boolean r0 = r3 instanceof defpackage.qe4
            if (r0 != 0) goto L8
            goto L4a
        L8:
            qe4 r3 = (defpackage.qe4) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4a
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4a
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L4a
        L2b:
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4a
        L36:
            int r0 = r2.e
            int r1 = r3.e
            if (r0 == r1) goto L3d
            goto L4a
        L3d:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 == r1) goto L44
            goto L4a
        L44:
            int r2 = r2.g
            int r3 = r3.g
            if (r2 == r3) goto L4c
        L4a:
            r2 = 0
            return r2
        L4c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r2 = r3.e
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.f
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.g
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", hostName="
            java.lang.String r1 = ", gameTitle="
            java.lang.String r2 = "NetplayRoom(id="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", serverType="
            java.lang.String r2 = ", currentPlayers="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", maxPlayers="
            java.lang.String r2 = ", pingMs="
            int r3 = r5.e
            int r4 = r5.f
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            int r5 = r5.g
            java.lang.String r5 = defpackage.lb1.o(r0, r5, r1)
            return r5
    }
}
