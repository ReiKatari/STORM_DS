package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re  reason: default package */
/* loaded from: classes.dex */
public final class re extends e74 {
    public final /* synthetic */ te a;

    public re(te teVar) {
        this.a = teVar;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new ie(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final /* bridge */ /* synthetic */ void g(z64 z64Var) {
        ie ieVar = (ie) z64Var;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
