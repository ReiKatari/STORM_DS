package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep5  reason: default package */
/* loaded from: classes.dex */
public final class ep5 {
    public final int a;
    public final long b;

    public ep5(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep5)) {
            return false;
        }
        ep5 ep5Var = (ep5) obj;
        if (this.a == ep5Var.a && this.b == ep5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Weight(passCount=" + this.a + ", sourceBytes=" + this.b + ")";
    }
}
