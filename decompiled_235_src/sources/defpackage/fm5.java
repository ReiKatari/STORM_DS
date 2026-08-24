package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm5  reason: default package */
/* loaded from: classes.dex */
public final class fm5 {
    public final int a;
    public final uh b;

    public fm5(int i, uh uhVar) {
        this.a = i;
        this.b = uhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fm5) {
                fm5 fm5Var = (fm5) obj;
                if (this.a == fm5Var.a && nb3.k(this.b, fm5Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        uh uhVar = this.b;
        if (uhVar == null) {
            hashCode = 0;
        } else {
            hashCode = uhVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.a + ')')) + ", frameMetadata=" + this.b + ')';
    }
}
