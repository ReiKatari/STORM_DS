package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l83  reason: default package */
/* loaded from: classes.dex */
public final class l83 extends e74 {
    public final tt7 a;

    public l83(tt7 tt7Var) {
        this.a = tt7Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new n83(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l83)) {
            return false;
        }
        return nb3.k(((l83) obj).a, this.a);
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        n83 n83Var = (n83) z64Var;
        tt7 tt7Var = n83Var.m0;
        tt7 tt7Var2 = this.a;
        if (!nb3.k(tt7Var2, tt7Var)) {
            n83Var.m0 = tt7Var2;
            n83Var.S0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
