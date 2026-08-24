package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai2  reason: default package */
/* loaded from: classes.dex */
public final class ai2 extends e74 {
    public final r94 a;

    public ai2(r94 r94Var) {
        this.a = r94Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new di2(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai2)) {
            return false;
        }
        if (nb3.k(this.a, ((ai2) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((di2) z64Var).V0(this.a);
    }

    public final int hashCode() {
        r94 r94Var = this.a;
        if (r94Var != null) {
            return r94Var.hashCode();
        }
        return 0;
    }
}
