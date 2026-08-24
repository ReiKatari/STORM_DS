package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs3  reason: default package */
/* loaded from: classes.dex */
public final class bs3 {
    public final ls3 a;
    public final as3 b;
    public final long c;

    public bs3(ls3 ls3Var, as3 as3Var, long j) {
        as3Var.getClass();
        this.a = ls3Var;
        this.b = as3Var;
        this.c = j;
    }

    public static bs3 a(bs3 bs3Var, as3 as3Var, long j) {
        ls3 ls3Var = bs3Var.a;
        as3Var.getClass();
        return new bs3(ls3Var, as3Var, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bs3) {
                bs3 bs3Var = (bs3) obj;
                if (!this.a.equals(bs3Var.a) || this.b != bs3Var.b || this.c != bs3Var.c) {
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
        return lb1.p(sb, this.c, ")");
    }
}
