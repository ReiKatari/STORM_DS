package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jv6  reason: default package */
/* loaded from: classes.dex */
public final class jv6 extends ep0 {
    public boolean I0;
    public mi2 J0;
    public final t06 K0;

    public jv6(boolean z, l14 l14Var, boolean z2, og5 og5Var, mi2 mi2Var) {
        super(l14Var, null, false, z2, null, og5Var, new sx0(mi2Var, z, 3));
        this.I0 = z;
        this.J0 = mi2Var;
        this.K0 = new t06(11, this);
    }

    @Override // defpackage.g0
    public final void U0(rz5 rz5Var) {
        lv6 lv6Var;
        ch chVar;
        AutofillValue forToggle;
        if (this.I0) {
            lv6Var = lv6.On;
        } else {
            lv6Var = lv6.Off;
        }
        l93[] l93VarArr = pz5.a;
        qz5 qz5Var = mz5.K;
        l93[] l93VarArr2 = pz5.a;
        l93 l93Var = l93VarArr2[26];
        rz5Var.b(qz5Var, lv6Var);
        bf bfVar = sn1.Z;
        qz5 qz5Var2 = mz5.s;
        l93 l93Var2 = l93VarArr2[9];
        rz5Var.b(qz5Var2, bfVar);
        boolean z = this.I0;
        if (Build.VERSION.SDK_INT >= 26) {
            forToggle = AutofillValue.forToggle(z);
            chVar = new ch(forToggle);
        } else {
            chVar = null;
        }
        if (chVar != null) {
            qz5 qz5Var3 = mz5.t;
            l93 l93Var3 = l93VarArr2[10];
            rz5Var.b(qz5Var3, chVar);
        }
        rz5Var.b(dz5.h, new w1(null, new n95(23, rz5Var)));
    }
}
