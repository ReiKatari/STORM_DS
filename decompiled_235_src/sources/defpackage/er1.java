package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er1  reason: default package */
/* loaded from: classes.dex */
public final class er1 implements nk7 {
    public final vs4 a;

    public er1(vs4 vs4Var) {
        this.a = vs4Var;
    }

    @Override // defpackage.nk7
    public final Object a(xv4 xv4Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof er1) && this.a == ((er1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
