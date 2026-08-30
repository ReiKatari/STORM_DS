package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t35  reason: default package */
/* loaded from: classes.dex */
public final class t35 {
    public final v35 a;
    public final b35 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final b35 h;
    public final boolean i;

    public t35(v35 v35Var, b35 b35Var, int i, int i2, int i3, int i4, int i5, b35 b35Var2, boolean z) {
        v35Var.getClass();
        this.a = v35Var;
        this.b = b35Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = b35Var2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t35) {
                t35 t35Var = (t35) obj;
                if (this.a != t35Var.a || !this.b.equals(t35Var.b) || this.c != t35Var.c || this.d != t35Var.d || this.e != t35Var.e || this.f != t35Var.f || this.g != t35Var.g || !this.h.equals(t35Var.h) || this.i != t35Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int a = wh1.a(this.g, wh1.a(this.f, wh1.a(this.e, wh1.a(this.d, wh1.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RaPendingSyncResult(source=");
        sb.append(this.a);
        sb.append(", before=");
        sb.append(this.b);
        sb.append(", submittedAchievements=");
        b31.A(sb, this.c, ", submittedLeaderboardEntries=", this.d, ", alreadyAccepted=");
        b31.A(sb, this.e, ", failedAchievements=", this.f, ", failedLeaderboardEntries=");
        sb.append(this.g);
        sb.append(", remaining=");
        sb.append(this.h);
        sb.append(", transientFailure=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
