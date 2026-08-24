package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m3  reason: default package */
/* loaded from: classes.dex */
public final class m3 extends v3 {
    public final o75 a;
    public final n3 b;
    public final bt c;
    public final long d;

    public m3(o75 o75Var, n3 n3Var, bt btVar, long j) {
        o75Var.getClass();
        n3Var.getClass();
        this.a = o75Var;
        this.b = n3Var;
        this.c = btVar;
        this.d = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m3) {
                m3 m3Var = (m3) obj;
                if (nb3.k(this.a, m3Var.a) && this.b == m3Var.b && this.c == m3Var.c && this.d == m3Var.d) {
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
