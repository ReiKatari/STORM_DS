package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: al3  reason: default package */
/* loaded from: classes.dex */
public final class al3 {
    public final kl3 a;
    public final zk3 b;
    public final long c;

    public al3(kl3 kl3Var, zk3 zk3Var, long j) {
        zk3Var.getClass();
        this.a = kl3Var;
        this.b = zk3Var;
        this.c = j;
    }

    public static al3 a(al3 al3Var, zk3 zk3Var, long j) {
        kl3 kl3Var = al3Var.a;
        zk3Var.getClass();
        return new al3(kl3Var, zk3Var, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof al3) {
                al3 al3Var = (al3) obj;
                if (!this.a.equals(al3Var.a) || this.b != al3Var.b || this.c != al3Var.c) {
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
        return Long.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(key=");
        sb.append(this.a);
        sb.append(", phase=");
        sb.append(this.b);
        sb.append(", lastSequence=");
        return wh1.n(sb, this.c, ")");
    }
}
