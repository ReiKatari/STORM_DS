package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f00  reason: default package */
/* loaded from: classes.dex */
public final class f00 extends kj2 {
    public final Object i;
    public final long j;

    public f00(long j, Object obj) {
        this.i = obj;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f00) {
                f00 f00Var = (f00) obj;
                if (!this.i.equals(f00Var.i) || this.j != f00Var.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + (this.i.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.i + ", compositeKey=" + this.j + ')';
    }
}
