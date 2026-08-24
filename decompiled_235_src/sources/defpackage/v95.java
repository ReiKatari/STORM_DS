package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v95  reason: default package */
/* loaded from: classes.dex */
public final class v95 extends ca5 {
    public final ls3 a;
    public final String b;

    public v95(ls3 ls3Var, String str) {
        ls3Var.getClass();
        this.a = ls3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v95) {
                v95 v95Var = (v95) obj;
                if (!nb3.k(this.a, v95Var.a) || !this.b.equals(v95Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardAttemptUpdated(key=" + this.a + ", formattedValue=" + this.b + ")";
    }
}
