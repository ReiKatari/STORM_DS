package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia5  reason: default package */
/* loaded from: classes.dex */
public final class ia5 {
    public final long a;
    public final defpackage.s83 b;
    public final defpackage.s83 c;
    public final defpackage.s83 d;

    public ia5(long r1, defpackage.s83 r3, defpackage.s83 r4, defpackage.s83 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            return
    }

    public static defpackage.ia5 a(defpackage.ia5 r6, defpackage.s83 r7, defpackage.s83 r8, defpackage.s83 r9, int r10) {
            long r1 = r6.a
            r0 = r10 & 2
            if (r0 == 0) goto L8
            s83 r7 = r6.b
        L8:
            r3 = r7
            r7 = r10 & 4
            if (r7 == 0) goto Lf
            s83 r8 = r6.c
        Lf:
            r4 = r8
            r7 = r10 & 8
            if (r7 == 0) goto L16
            s83 r9 = r6.d
        L16:
            r5 = r9
            r6.getClass()
            ia5 r0 = new ia5
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ia5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ia5 r8 = (defpackage.ia5) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            s83 r1 = r7.b
            s83 r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            s83 r1 = r7.c
            s83 r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            s83 r7 = r7.d
            s83 r8 = r8.d
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            s83 r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            s83 r2 = r3.c
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            s83 r3 = r3.d
            if (r3 != 0) goto L28
            goto L2c
        L28:
            int r1 = r3.hashCode()
        L2c:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RAGameSetMetadata(gameId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", lastAchievementSetUpdated="
            r0.append(r1)
            s83 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", lastSoftcoreUserDataUpdated="
            r0.append(r1)
            s83 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", lastHardcoreUserDataUpdated="
            r0.append(r1)
            s83 r3 = r3.d
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
