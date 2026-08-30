package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jj0  reason: default package */
/* loaded from: classes.dex */
public final class jj0 {
    public final j20 a;
    public final mi2 b;
    public final y72 c;
    public final boolean d;

    public jj0(j20 j20Var, mi2 mi2Var, y72 y72Var, boolean z) {
        this.a = j20Var;
        this.b = mi2Var;
        this.c = y72Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jj0) {
                jj0 jj0Var = (jj0) obj;
                if (!this.a.equals(jj0Var.a) || !this.b.equals(jj0Var.b) || !b53.x(this.c, jj0Var.c) || this.d != jj0Var.d) {
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
        int hashCode2 = this.c.hashCode();
        return Boolean.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", animationSpec=");
        sb.append(this.c);
        sb.append(", clip=");
        return ej6.h(sb, this.d, ')');
    }
}
