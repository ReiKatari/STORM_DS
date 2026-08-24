package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi4  reason: default package */
/* loaded from: classes.dex */
public final class oi4 {
    public final defpackage.ni4 a;
    public final int b;
    public final int c;
    public final defpackage.ui4 d;
    public final java.lang.Long e;
    public final boolean f;
    public final boolean g;

    public oi4(defpackage.ni4 r1, int r2, int r3, defpackage.ui4 r4, java.lang.Long r5, boolean r6, boolean r7) {
            r0 = this;
            r1.getClass()
            r4.getClass()
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

    public /* synthetic */ oi4(defpackage.ni4 r9, defpackage.ui4 r10, boolean r11, boolean r12, int r13) {
            r8 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L6
            ni4 r9 = defpackage.ni4.DISABLED_NOT_LOGGED_IN
        L6:
            r1 = r9
            r9 = r13 & 8
            if (r9 == 0) goto Ld
            ui4 r10 = defpackage.ui4.EMPTY
        Ld:
            r4 = r10
            r9 = r13 & 32
            r10 = 0
            if (r9 == 0) goto L15
            r6 = r10
            goto L16
        L15:
            r6 = r11
        L16:
            r9 = r13 & 64
            if (r9 == 0) goto L1c
            r7 = r10
            goto L1d
        L1c:
            r7 = r12
        L1d:
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static defpackage.oi4 a(defpackage.oi4 r8, boolean r9) {
            ni4 r1 = r8.a
            int r2 = r8.b
            int r3 = r8.c
            ui4 r4 = r8.d
            java.lang.Long r5 = r8.e
            boolean r6 = r8.f
            r8.getClass()
            r1.getClass()
            r4.getClass()
            oi4 r0 = new oi4
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.oi4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oi4 r5 = (defpackage.oi4) r5
            ni4 r1 = r4.a
            ni4 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            ui4 r1 = r4.d
            ui4 r3 = r5.d
            if (r1 == r3) goto L28
            return r2
        L28:
            java.lang.Long r1 = r4.e
            java.lang.Long r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L33
            return r2
        L33:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L3a
            return r2
        L3a:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L41
            return r2
        L41:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ni4 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            ui4 r2 = r3.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.Long r0 = r3.e
            if (r0 != 0) goto L23
            r0 = 0
            goto L27
        L23:
            int r0 = r0.hashCode()
        L27:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f
            int r0 = defpackage.xg6.e(r2, r0, r1)
            boolean r3 = r3.g
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflineAchievementsUiState(availability="
            r0.<init>(r1)
            ni4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", pendingSoftcoreUnlockCount="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", pendingLedgerUnlockCount="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", ledgerIntegrity="
            r0.append(r1)
            ui4 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", ledgerExpiresInMs="
            r0.append(r1)
            java.lang.Long r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", isOnline="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", isSyncing="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.g
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
