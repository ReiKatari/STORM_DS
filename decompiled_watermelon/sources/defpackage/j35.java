package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j35  reason: default package */
/* loaded from: classes.dex */
public final class j35 implements n35 {
    public final long a;
    public final b35 b;
    public final c35 c;

    public j35(long j, b35 b35Var, c35 c35Var) {
        b35Var.getClass();
        c35Var.getClass();
        this.a = j;
        this.b = b35Var;
        this.c = c35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j35)) {
            return false;
        }
        j35 j35Var = (j35) obj;
        if (this.a == j35Var.a && b53.x(this.b, j35Var.b) && this.c == j35Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ExitPrompt(requestId=" + this.a + ", pending=" + this.b + ", exitContext=" + this.c + ")";
    }
}
