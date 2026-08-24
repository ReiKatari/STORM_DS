package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa2  reason: default package */
/* loaded from: classes.dex */
public final class aa2 implements ca2 {
    public final di7 a;

    public aa2(di7 di7Var) {
        this.a = di7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof aa2) || !this.a.equals(((aa2) obj).a)) {
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
        return "UnsupportedUseCase(unsupportedUseCase=" + this.a + ')';
    }
}
