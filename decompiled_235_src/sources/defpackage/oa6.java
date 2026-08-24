package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa6  reason: default package */
/* loaded from: classes.dex */
public final class oa6 {
    public final fv2 a;
    public final long b;
    public final na6 c;
    public final boolean d;

    public oa6(fv2 fv2Var, long j, na6 na6Var, boolean z) {
        this.a = fv2Var;
        this.b = j;
        this.c = na6Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oa6) {
                oa6 oa6Var = (oa6) obj;
                if (this.a != oa6Var.a || !jk4.c(this.b, oa6Var.b) || this.c != oa6Var.c || this.d != oa6Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = i61.c(this.b, this.a.hashCode() * 31, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) jk4.h(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return xg6.r(sb, this.d, ')');
    }
}
