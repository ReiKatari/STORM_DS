package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba  reason: default package */
/* loaded from: classes.dex */
public final class ba extends e74 {
    public final sa5 a;

    public ba(sa5 sa5Var) {
        this.a = sa5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zg1, z64, java.lang.Object, ca] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aa, xg1, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? zg1Var = new zg1();
        zg1Var.m0 = this.a;
        k0 k0Var = new k0((Object) zg1Var, 9);
        ?? z64Var = new z64();
        z64Var.k0 = k0Var;
        zg1Var.R0(z64Var);
        return zg1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ba) {
                if (this.a != ((ba) obj).a) {
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
        ((ca) z64Var).m0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
