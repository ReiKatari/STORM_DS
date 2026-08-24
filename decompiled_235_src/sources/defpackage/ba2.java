package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba2  reason: default package */
/* loaded from: classes.dex */
public final class ba2 implements ca2 {
    public final String a;
    public final qu2 b;

    public ba2(String str, qu2 qu2Var) {
        qu2Var.getClass();
        this.a = str;
        this.b = qu2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ba2) {
                ba2 ba2Var = (ba2) obj;
                if (!this.a.equals(ba2Var.a) || !nb3.k(this.b, ba2Var.b)) {
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
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}
