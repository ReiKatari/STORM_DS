package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k3  reason: default package */
/* loaded from: classes.dex */
public final class k3 extends v3 {
    public final o75 a;
    public final bt b;
    public final long c;

    public k3(o75 o75Var, bt btVar, long j) {
        this.a = o75Var;
        this.b = btVar;
        this.c = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k3) {
                k3 k3Var = (k3) obj;
                if (this.a.equals(k3Var.a) && this.b == k3Var.b && this.c == k3Var.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AchievementPrimed(achievement=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", uiInstanceId=");
        return lb1.p(sb, this.c, ")");
    }
}
