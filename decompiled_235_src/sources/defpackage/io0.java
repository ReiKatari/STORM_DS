package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io0  reason: default package */
/* loaded from: classes.dex */
public final class io0 {
    public final long a;
    public final boolean b;

    public io0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io0)) {
            return false;
        }
        io0 io0Var = (io0) obj;
        if (this.a == io0Var.a && this.b == io0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CheatStatusUpdate(id=" + this.a + ", enabled=" + this.b + ")";
    }
}
