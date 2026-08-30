package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k3  reason: default package */
/* loaded from: classes.dex */
public final class k3 extends t3 {
    public final dy4 a;
    public final l3 b;
    public final os c;
    public final long d;

    public k3(dy4 dy4Var, l3 l3Var, os osVar, long j) {
        dy4Var.getClass();
        l3Var.getClass();
        this.a = dy4Var;
        this.b = l3Var;
        this.c = osVar;
        this.d = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k3) {
                k3 k3Var = (k3) obj;
                if (b53.x(this.a, k3Var.a) && this.b == k3Var.b && this.c == k3Var.c && this.d == k3Var.d) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Long.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChallengeResult(achievement=" + this.a + ", result=" + this.b + ", state=" + this.c + ", uiInstanceId=" + this.d + ")";
    }
}
