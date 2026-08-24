package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro4  reason: default package */
/* loaded from: classes.dex */
public final class ro4 extends mp2 {
    public final u16 f;
    public final hj g;

    public ro4(u16 u16Var) {
        hj hjVar;
        this.f = u16Var;
        if (!mp2.P(u16Var)) {
            hjVar = lj.a();
            hj.c(hjVar, u16Var);
        } else {
            hjVar = null;
        }
        this.g = hjVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ro4) {
                if (!this.f.equals(((ro4) obj).f)) {
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
        u16 u16Var = this.f;
        return new of5(u16Var.a, u16Var.b, u16Var.c, u16Var.d);
    }
}
