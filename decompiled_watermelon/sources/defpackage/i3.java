package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i3  reason: default package */
/* loaded from: classes.dex */
public final class i3 extends t3 {
    public final dy4 a;
    public final os b;
    public final long c;

    public i3(dy4 dy4Var, os osVar, long j) {
        this.a = dy4Var;
        this.b = osVar;
        this.c = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i3) {
                i3 i3Var = (i3) obj;
                if (this.a.equals(i3Var.a) && this.b == i3Var.b && this.c == i3Var.c) {
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
        return wh1.n(sb, this.c, ")");
    }
}
