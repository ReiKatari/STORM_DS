package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc5  reason: default package */
/* loaded from: classes.dex */
public final class wc5 implements xc5 {
    public final long a;
    public final lc5 b;
    public final sc5 c;

    public wc5(long j, lc5 lc5Var, sc5 sc5Var) {
        sc5Var.getClass();
        this.a = j;
        this.b = lc5Var;
        this.c = sc5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wc5) {
                wc5 wc5Var = (wc5) obj;
                if (this.a != wc5Var.a || !this.b.equals(wc5Var.b) || this.c != wc5Var.c) {
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
