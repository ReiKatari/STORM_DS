package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z77  reason: default package */
/* loaded from: classes.dex */
public final class z77 extends or0 {
    public boolean J0;
    public qn2 K0;
    public final t46 L0;

    public z77(boolean z, r94 r94Var, boolean z2, mq5 mq5Var, qn2 qn2Var) {
        super(r94Var, null, false, z2, null, mq5Var, new q01(qn2Var, z, 3));
        this.J0 = z;
        this.K0 = qn2Var;
        this.L0 = new t46(this, 18);
    }

    @Override // defpackage.h0
    public final void U0(gb6 gb6Var) {
        a87 a87Var;
        oh ohVar;
        AutofillValue forToggle;
        if (this.J0) {
            a87Var = a87.On;
        } else {
            a87Var = a87.Off;
        }
        fg3[] fg3VarArr = eb6.a;
        fb6 fb6Var = bb6.K;
        fg3[] fg3VarArr2 = eb6.a;
        fg3 fg3Var = fg3VarArr2[26];
        gb6Var.a(fb6Var, a87Var);
        rf rfVar = xd5.Z;
        fb6 fb6Var2 = bb6.s;
        fg3 fg3Var2 = fg3VarArr2[9];
        gb6Var.a(fb6Var2, rfVar);
        boolean z = this.J0;
        if (Build.VERSION.SDK_INT >= 26) {
            forToggle = AutofillValue.forToggle(z);
            ohVar = new oh(forToggle);
        } else {
            ohVar = null;
        }
        if (ohVar != null) {
            fb6 fb6Var3 = bb6.t;
            fg3 fg3Var3 = fg3VarArr2[10];
            gb6Var.a(fb6Var3, ohVar);
        }
        gb6Var.a(sa6.h, new y1(null, new ro5(gb6Var, 21)));
    }
}
