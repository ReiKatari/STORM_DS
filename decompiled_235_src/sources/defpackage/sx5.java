package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx5  reason: default package */
/* loaded from: classes.dex */
public final class sx5 extends wx5 {
    public final oi2 a;

    public sx5(oi2 oi2Var) {
        this.a = oi2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof sx5) || !this.a.equals(((sx5) obj).a)) {
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
        return "DSiWareTitleValidationFailed(reason=" + this.a + ")";
    }
}
