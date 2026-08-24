package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en5  reason: default package */
/* loaded from: classes.dex */
public final class en5 {
    public final defpackage.ln5 a;
    public final defpackage.ln5 b;
    public final defpackage.dn5 c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public en5(defpackage.ln5 r1, defpackage.ln5 r2, defpackage.dn5 r3, java.lang.String r4, java.lang.String r5, long r6, boolean r8, boolean r9, boolean r10) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r8
            r0.h = r9
            r0.i = r10
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.en5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            en5 r8 = (defpackage.en5) r8
            ln5 r1 = r7.a
            ln5 r3 = r8.a
            if (r1 == r3) goto L13
            return r2
        L13:
            ln5 r1 = r7.b
            ln5 r3 = r8.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            dn5 r1 = r7.c
            dn5 r3 = r8.c
            if (r1 == r3) goto L21
            return r2
        L21:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2c
            return r2
        L2c:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L37
            return r2
        L37:
            long r3 = r7.f
            long r5 = r8.f
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L40
            return r2
        L40:
            boolean r1 = r7.g
            boolean r3 = r8.g
            if (r1 == r3) goto L47
            return r2
        L47:
            boolean r1 = r7.h
            boolean r3 = r8.h
            if (r1 == r3) goto L4e
            return r2
        L4e:
            boolean r7 = r7.i
            boolean r8 = r8.i
            if (r7 == r8) goto L55
            return r2
        L55:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            ln5 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            ln5 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            dn5 r0 = r4.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L20
            r3 = r2
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L2b
            goto L2f
        L2b:
            int r2 = r3.hashCode()
        L2f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r2 = r4.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r4 = r4.i
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RetroAchievementsEndpointSnapshot(backendSelected="
            r0.<init>(r1)
            ln5 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", backendEffective="
            r0.append(r1)
            ln5 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", hostSource="
            r0.append(r1)
            dn5 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", apiUrl="
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", nativeClientHost="
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", generation="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", externalActivationActive="
            r0.append(r1)
            boolean r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", builtInLedgerEnabled="
            r0.append(r1)
            boolean r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", builtInSyncEnabled="
            r0.append(r1)
            boolean r3 = r3.i
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
