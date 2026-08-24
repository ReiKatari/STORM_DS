package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ew  reason: default package */
/* loaded from: classes.dex */
public final class ew extends hw {
    public final sr4 a;
    public final b62 b;

    public ew(sr4 sr4Var, b62 b62Var) {
        this.a = sr4Var;
        this.b = b62Var;
    }

    @Override // defpackage.hw
    public final sr4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ew) {
                ew ewVar = (ew) obj;
                if (!nb3.k(this.a, ewVar.a) || !this.b.equals(ewVar.b)) {
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
        sr4 sr4Var = this.a;
        if (sr4Var == null) {
            hashCode = 0;
        } else {
            hashCode = sr4Var.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
