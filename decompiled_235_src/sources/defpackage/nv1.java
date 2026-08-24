package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv1  reason: default package */
/* loaded from: classes.dex */
public final class nv1 implements ov1 {
    public final String a;
    public final kw3 b;

    public nv1(String str, kw3 kw3Var) {
        this.a = str;
        this.b = kw3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nv1) {
                nv1 nv1Var = (nv1) obj;
                if (!this.a.equals(nv1Var.a) || !this.b.equals(nv1Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Submenu(title=" + this.a + ", entries=" + this.b + ")";
    }
}
