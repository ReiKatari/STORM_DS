package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq2  reason: default package */
/* loaded from: classes.dex */
public final class yq2 implements by0 {
    public final yx0 A;

    public yq2(yx0 yx0Var) {
        this.A = yx0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yq2) {
            if (this.A.equals(((yq2) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() * 31;
    }
}
