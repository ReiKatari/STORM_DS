package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv3  reason: default package */
/* loaded from: classes.dex */
public final class nv3 extends pv3 {
    public final String a;
    public final g47 b;

    public nv3(String str, g47 g47Var) {
        this.a = str;
        this.b = g47Var;
    }

    @Override // defpackage.pv3
    public final g47 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv3)) {
            return false;
        }
        nv3 nv3Var = (nv3) obj;
        if (nb3.k(this.a, nv3Var.a) && nb3.k(this.b, nv3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        g47 g47Var = this.b;
        if (g47Var != null) {
            i = g47Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return lb1.q(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
