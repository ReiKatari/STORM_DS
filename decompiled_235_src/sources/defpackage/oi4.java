package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi4  reason: default package */
/* loaded from: classes.dex */
public final class oi4 {
    public final ni4 a;
    public final int b;
    public final int c;
    public final ui4 d;
    public final Long e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ oi4(ni4 ni4Var, ui4 ui4Var, boolean z, boolean z2, int i) {
        this(r1, 0, 0, r4, null, r6, r7);
        boolean z3;
        boolean z4;
        ni4 ni4Var2 = (i & 1) != 0 ? ni4.DISABLED_NOT_LOGGED_IN : ni4Var;
        ui4 ui4Var2 = (i & 8) != 0 ? ui4.EMPTY : ui4Var;
        if ((i & 32) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 64) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
    }

    public static oi4 a(oi4 oi4Var, boolean z) {
        ni4 ni4Var = oi4Var.a;
        int i = oi4Var.b;
        int i2 = oi4Var.c;
        ui4 ui4Var = oi4Var.d;
        Long l = oi4Var.e;
        boolean z2 = oi4Var.f;
        oi4Var.getClass();
        ni4Var.getClass();
        ui4Var.getClass();
        return new oi4(ni4Var, i, i2, ui4Var, l, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi4)) {
            return false;
        }
        oi4 oi4Var = (oi4) obj;
        if (this.a == oi4Var.a && this.b == oi4Var.b && this.c == oi4Var.c && this.d == oi4Var.d && nb3.k(this.e, oi4Var.e) && this.f == oi4Var.f && this.g == oi4Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        Long l = this.e;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return Boolean.hashCode(this.g) + xg6.e((hashCode2 + hashCode) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineAchievementsUiState(availability=");
        sb.append(this.a);
        sb.append(", pendingSoftcoreUnlockCount=");
        sb.append(this.b);
        sb.append(", pendingLedgerUnlockCount=");
        sb.append(this.c);
        sb.append(", ledgerIntegrity=");
        sb.append(this.d);
        sb.append(", ledgerExpiresInMs=");
        sb.append(this.e);
        sb.append(", isOnline=");
        sb.append(this.f);
        sb.append(", isSyncing=");
        return i61.o(sb, this.g, ")");
    }

    public oi4(ni4 ni4Var, int i, int i2, ui4 ui4Var, Long l, boolean z, boolean z2) {
        ni4Var.getClass();
        ui4Var.getClass();
        this.a = ni4Var;
        this.b = i;
        this.c = i2;
        this.d = ui4Var;
        this.e = l;
        this.f = z;
        this.g = z2;
    }
}
