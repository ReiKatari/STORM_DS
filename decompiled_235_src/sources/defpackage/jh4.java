package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh4  reason: default package */
/* loaded from: classes.dex */
public final class jh4 implements gg3 {
    public final gg3 a;
    public final xb6 b;

    public jh4(gg3 gg3Var) {
        gg3Var.getClass();
        this.a = gg3Var;
        this.b = new xb6(gg3Var.e());
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        if (sc1Var.M()) {
            return sc1Var.k(this.a);
        }
        return null;
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        if (obj != null) {
            x32Var.j(this.a, obj);
        } else {
            x32Var.f();
        }
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jh4.class == obj.getClass() && nb3.k(this.a, ((jh4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
