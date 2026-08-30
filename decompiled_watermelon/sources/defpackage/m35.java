package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m35  reason: default package */
/* loaded from: classes.dex */
public final class m35 implements n35 {
    public final long a;
    public final b35 b;
    public final i35 c;

    public m35(long j, b35 b35Var, i35 i35Var) {
        i35Var.getClass();
        this.a = j;
        this.b = b35Var;
        this.c = i35Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m35) {
                m35 m35Var = (m35) obj;
                if (this.a != m35Var.a || !this.b.equals(m35Var.b) || this.c != m35Var.c) {
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
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Syncing(requestId=" + this.a + ", pending=" + this.b + ", priority=" + this.c + ")";
    }
}
