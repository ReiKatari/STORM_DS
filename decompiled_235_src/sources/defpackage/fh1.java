package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh1  reason: default package */
/* loaded from: classes.dex */
public final class fh1 {
    public final Object a;
    public final boolean b;

    public fh1(boolean z, Object obj) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fh1) {
                fh1 fh1Var = (fh1) obj;
                if (!nb3.k(this.a, fh1Var.a) || this.b != fh1Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "Deletable(data=" + this.a + ", isDeleted=" + this.b + ")";
    }
}
