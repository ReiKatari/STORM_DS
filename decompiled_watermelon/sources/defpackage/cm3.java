package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cm3  reason: default package */
/* loaded from: classes.dex */
public final class cm3 extends yy3 implements jv0, fm2 {
    public yh j0;
    public hm3 k0;
    public bq6 l0;
    public final tj4 m0 = me2.G(null);

    public cm3(yh yhVar, hm3 hm3Var, bq6 bq6Var) {
        this.j0 = yhVar;
        this.k0 = hm3Var;
        this.l0 = bq6Var;
    }

    @Override // defpackage.yy3
    public final void J0() {
        yh yhVar = this.j0;
        if (yhVar.a != null) {
            pz2.c("Expected textInputModifierNode to be null");
        }
        yhVar.a = this;
    }

    @Override // defpackage.yy3
    public final void K0() {
        this.j0.k(this);
    }

    @Override // defpackage.fm2
    public final void y(m74 m74Var) {
        this.m0.setValue(m74Var);
    }
}
