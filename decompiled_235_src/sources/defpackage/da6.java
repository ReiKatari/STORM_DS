package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da6  reason: default package */
/* loaded from: classes.dex */
public final class da6 {
    public final jl5 a;
    public final int b;
    public final long c;

    public da6(jl5 jl5Var, int i, long j) {
        this.a = jl5Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da6)) {
            return false;
        }
        da6 da6Var = (da6) obj;
        if (this.a == da6Var.a && this.b == da6Var.b && this.c == da6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + lb1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
