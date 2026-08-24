package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo4  reason: default package */
/* loaded from: classes.dex */
public final class qo4 extends mp2 {
    public final of5 f;

    public qo4(of5 of5Var) {
        this.f = of5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qo4) {
                if (!this.f.equals(((qo4) obj).f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.mp2
    public final of5 z() {
        return this.f;
    }
}
