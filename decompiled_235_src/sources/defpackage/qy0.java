package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy0  reason: default package */
/* loaded from: classes.dex */
public final class qy0 implements nk7 {
    public final qn2 a;

    public qy0(qn2 qn2Var) {
        this.a = qn2Var;
    }

    @Override // defpackage.nk7
    public final Object a(xv4 xv4Var) {
        return this.a.g(xv4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qy0) || !this.a.equals(((qy0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
