package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc5  reason: default package */
/* loaded from: classes.dex */
public final class tc5 implements xc5 {
    public final long a;
    public final lc5 b;
    public final mc5 c;

    public tc5(long j, lc5 lc5Var, mc5 mc5Var) {
        lc5Var.getClass();
        mc5Var.getClass();
        this.a = j;
        this.b = lc5Var;
        this.c = mc5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc5)) {
            return false;
        }
        tc5 tc5Var = (tc5) obj;
        if (this.a == tc5Var.a && nb3.k(this.b, tc5Var.b) && this.c == tc5Var.c) {
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
