package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yi6  reason: default package */
/* loaded from: classes.dex */
public final class yi6 extends e74 {
    public final io6 a;

    public yi6(io6 io6Var) {
        this.a = io6Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new bj6(this.a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yi6) && ((yi6) obj).a.equals(this.a)) {
            e40 e40Var = d90.L;
            if (e40Var.equals(e40Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((bj6) z64Var).l0 = this.a;
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.a.hashCode() * 31)) * 31;
    }
}
