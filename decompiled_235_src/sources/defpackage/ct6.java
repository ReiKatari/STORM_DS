package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct6  reason: default package */
/* loaded from: classes.dex */
public final class ct6 extends e74 {
    public final on2 a;

    public ct6(on2 on2Var) {
        this.a = on2Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new dt6(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct6)) {
            return false;
        }
        if (this.a == ((ct6) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((dt6) z64Var).m0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
