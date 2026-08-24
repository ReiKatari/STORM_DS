package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt3  reason: default package */
/* loaded from: classes.dex */
public final class dt3 extends e74 {
    public final ki a;
    public final jt3 b;
    public final p27 c;

    public dt3(ki kiVar, jt3 jt3Var, p27 p27Var) {
        this.a = kiVar;
        this.b = jt3Var;
        this.c = p27Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new et3(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dt3) {
            dt3 dt3Var = (dt3) obj;
            if (nb3.k(this.a, dt3Var.a) && this.b == dt3Var.b && this.c == dt3Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        et3 et3Var = (et3) z64Var;
        if (et3Var.j0) {
            et3Var.k0.c();
            et3Var.k0.k(et3Var);
        }
        ki kiVar = this.a;
        et3Var.k0 = kiVar;
        if (et3Var.j0) {
            if (kiVar.a != null) {
                s53.c("Expected textInputModifierNode to be null");
            }
            kiVar.a = et3Var;
        }
        et3Var.l0 = this.b;
        et3Var.m0 = this.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
