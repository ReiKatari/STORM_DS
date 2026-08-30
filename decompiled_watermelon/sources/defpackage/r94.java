package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r94  reason: default package */
/* loaded from: classes.dex */
public final class r94 {
    public final q94 a;
    public final int b;
    public final int c;
    public final x94 d;
    public final Long e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ r94(defpackage.q94 r9, defpackage.x94 r10, boolean r11, boolean r12, int r13) {
        /*
            r8 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L6
            q94 r9 = defpackage.q94.DISABLED_NOT_LOGGED_IN
        L6:
            r1 = r9
            r9 = r13 & 8
            if (r9 == 0) goto Ld
            x94 r10 = defpackage.x94.EMPTY
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
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r94.<init>(q94, x94, boolean, boolean, int):void");
    }

    public static r94 a(r94 r94Var, boolean z) {
        q94 q94Var = r94Var.a;
        int i = r94Var.b;
        int i2 = r94Var.c;
        x94 x94Var = r94Var.d;
        Long l = r94Var.e;
        boolean z2 = r94Var.f;
        r94Var.getClass();
        q94Var.getClass();
        x94Var.getClass();
        return new r94(q94Var, i, i2, x94Var, l, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r94)) {
            return false;
        }
        r94 r94Var = (r94) obj;
        if (this.a == r94Var.a && this.b == r94Var.b && this.c == r94Var.c && this.d == r94Var.d && b53.x(this.e, r94Var.e) && this.f == r94Var.f && this.g == r94Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        Long l = this.e;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return Boolean.hashCode(this.g) + ej6.c((hashCode2 + hashCode) * 31, this.f, 31);
    }

    public final String toString() {
        return "OfflineAchievementsUiState(availability=" + this.a + ", pendingSoftcoreUnlockCount=" + this.b + ", pendingLedgerUnlockCount=" + this.c + ", ledgerIntegrity=" + this.d + ", ledgerExpiresInMs=" + this.e + ", isOnline=" + this.f + ", isSyncing=" + this.g + ")";
    }

    public r94(q94 q94Var, int i, int i2, x94 x94Var, Long l, boolean z, boolean z2) {
        q94Var.getClass();
        x94Var.getClass();
        this.a = q94Var;
        this.b = i;
        this.c = i2;
        this.d = x94Var;
        this.e = l;
        this.f = z;
        this.g = z2;
    }
}
