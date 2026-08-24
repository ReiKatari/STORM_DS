package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p77  reason: default package */
/* loaded from: classes.dex */
public final class p77 extends x77 {
    public final q77 a;
    public final boolean b;
    public final boolean c;

    public p77(q77 q77Var, boolean z, boolean z2) {
        q77Var.getClass();
        this.a = q77Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p77)) {
            return false;
        }
        p77 p77Var = (p77) obj;
        if (this.a == p77Var.a && this.b == p77Var.b && this.c == p77Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xg6.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetroAchievementsMode(status=");
        sb.append(this.a);
        sb.append(", offlineNoInternetAtStart=");
        sb.append(this.b);
        sb.append(", hardcoreOfflineDisabled=");
        return i61.o(sb, this.c, ")");
    }
}
