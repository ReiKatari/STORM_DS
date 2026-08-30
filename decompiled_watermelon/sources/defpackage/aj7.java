package defpackage;

import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aj7  reason: default package */
/* loaded from: classes.dex */
public final class aj7 implements cv0, dn3 {
    public final ee A;
    public final iv0 B;
    public boolean L;
    public rm3 R;
    public aj2 X = st0.a;

    public aj7(ee eeVar, iv0 iv0Var) {
        this.A = eeVar;
        this.B = iv0Var;
    }

    public final void a() {
        if (!this.L) {
            this.L = true;
            this.A.getView().setTag(R.id.wrapped_composition_tag, null);
            rm3 rm3Var = this.R;
            if (rm3Var != null) {
                rm3Var.c(this);
            }
            this.R = null;
        }
        this.B.m();
    }

    public final void b(aj2 aj2Var) {
        this.A.setOnReadyForComposition(new ej(8, this, aj2Var));
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        if (pm3Var == pm3.ON_DESTROY) {
            a();
        } else if (pm3Var == pm3.ON_CREATE && !this.L) {
            b(this.X);
        }
    }
}
