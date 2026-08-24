package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx7  reason: default package */
/* loaded from: classes.dex */
public final class xx7 implements yx0, fu3 {
    public final te A;
    public final ey0 B;
    public boolean L;
    public ut3 R;
    public eo2 X = ow0.a;

    public xx7(te teVar, ey0 ey0Var) {
        this.A = teVar;
        this.B = ey0Var;
    }

    public final void a() {
        if (!this.L) {
            this.L = true;
            this.A.getView().setTag(R.id.wrapped_composition_tag, null);
            ut3 ut3Var = this.R;
            if (ut3Var != null) {
                ut3Var.c(this);
            }
            this.R = null;
        }
        this.B.m();
    }

    public final void b(eo2 eo2Var) {
        this.A.setOnReadyForComposition(new qj(8, this, eo2Var));
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        if (st3Var == st3.ON_DESTROY) {
            a();
        } else if (st3Var == st3.ON_CREATE && !this.L) {
            b(this.X);
        }
    }
}
