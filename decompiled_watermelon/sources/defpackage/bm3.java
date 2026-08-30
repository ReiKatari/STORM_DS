package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm3  reason: default package */
/* loaded from: classes.dex */
public final class bm3 extends dz3 {
    public final yh a;
    public final hm3 b;
    public final bq6 c;

    public bm3(yh yhVar, hm3 hm3Var, bq6 bq6Var) {
        this.a = yhVar;
        this.b = hm3Var;
        this.c = bq6Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new cm3(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm3) {
            bm3 bm3Var = (bm3) obj;
            if (b53.x(this.a, bm3Var.a) && this.b == bm3Var.b && this.c == bm3Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        cm3 cm3Var = (cm3) yy3Var;
        if (cm3Var.i0) {
            cm3Var.j0.g();
            cm3Var.j0.k(cm3Var);
        }
        yh yhVar = this.a;
        cm3Var.j0 = yhVar;
        if (cm3Var.i0) {
            if (yhVar.a != null) {
                pz2.c("Expected textInputModifierNode to be null");
            }
            yhVar.a = cm3Var;
        }
        cm3Var.k0 = this.b;
        cm3Var.l0 = this.c;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
