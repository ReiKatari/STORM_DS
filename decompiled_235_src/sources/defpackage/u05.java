package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u05  reason: default package */
/* loaded from: classes.dex */
public final class u05 extends kj2 {
    public final Object i;
    public final long j;

    public u05(long j, Object obj) {
        this.i = obj;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u05) {
                u05 u05Var = (u05) obj;
                if (!this.i.equals(u05Var.i) || this.j != u05Var.j) {
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
        return "PredictiveBackHandlerInfo(owner=" + this.i + ", compositeKey=" + this.j + ')';
    }
}
