package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba1  reason: default package */
/* loaded from: classes.dex */
public final class ba1 extends fa1 {
    public final cz0 a;

    public ba1(cz0 cz0Var) {
        cz0Var.getClass();
        this.a = cz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ba1) && this.a == ((ba1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DSiSetupInvalid(status=" + this.a + ")";
    }
}
