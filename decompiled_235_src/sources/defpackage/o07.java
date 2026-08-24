package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o07  reason: default package */
/* loaded from: classes.dex */
public final class o07 extends e74 {
    public final j27 a;

    public o07(j27 j27Var) {
        this.a = j27Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new q07(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o07) {
                if (this.a != ((o07) obj).a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((q07) z64Var).m0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
