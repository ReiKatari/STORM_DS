package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tr2  reason: default package */
/* loaded from: classes.dex */
public final class tr2 {
    public final y55 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public tr2(y55 y55Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = y55Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tr2) {
                tr2 tr2Var = (tr2) obj;
                if (!this.a.equals(tr2Var.a) || this.b != tr2Var.b || this.c != tr2Var.c || this.d != tr2Var.d || this.e != tr2Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ej6.c(ej6.c(ej6.c(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.a);
        sb.append(", isFlat=");
        sb.append(this.b);
        sb.append(", isVertical=");
        sb.append(this.c);
        sb.append(", isSeparating=");
        sb.append(this.d);
        sb.append(", isOccluding=");
        return ej6.h(sb, this.e, ')');
    }
}
