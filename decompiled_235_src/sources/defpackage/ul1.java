package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul1  reason: default package */
/* loaded from: classes.dex */
public final class ul1 {
    public final rl1 a;
    public final long b;
    public final long c;

    public ul1(rl1 rl1Var, long j, long j2) {
        rl1Var.getClass();
        this.a = rl1Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul1)) {
            return false;
        }
        ul1 ul1Var = (ul1) obj;
        if (this.a == ul1Var.a && this.b == ul1Var.b && this.c == ul1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncEntryState(kind=");
        sb.append(this.a);
        sb.append(", lastModified=");
        sb.append(this.b);
        return lb1.r(sb, ", length=", this.c, ")");
    }
}
