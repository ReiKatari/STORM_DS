package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x21  reason: default package */
/* loaded from: classes.dex */
public final class x21 extends xc1 implements gz5 {
    public uw6 l0;
    public oq6 m0;
    public hm3 n0;
    public boolean o0;
    public boolean p0;
    public pb4 q0;
    public bq6 r0;
    public hx2 s0;
    public wc2 t0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void U0(hm3 hm3Var, String str, boolean z) {
        if (!z) {
            return;
        }
        er6 er6Var = hm3Var.e;
        o21 o21Var = hm3Var.v;
        if (er6Var != null) {
            oq6 p = hm3Var.d.p(l07.c0(new Object(), new cs0(str, 1)));
            er6Var.a(null, p);
            o21Var.n(p);
            return;
        }
        int length = str.length();
        o21Var.n(new oq6(str, 4, ve2.g(length, length)));
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        ch chVar;
        AutofillValue forText;
        boolean z = this.p0;
        to toVar = this.m0.a;
        l93[] l93VarArr = pz5.a;
        qz5 qz5Var = mz5.F;
        l93[] l93VarArr2 = pz5.a;
        l93 l93Var = l93VarArr2[18];
        rz5Var.b(qz5Var, toVar);
        to toVar2 = this.l0.a;
        qz5 qz5Var2 = mz5.G;
        l93 l93Var2 = l93VarArr2[19];
        rz5Var.b(qz5Var2, toVar2);
        long j = this.m0.b;
        qz5 qz5Var3 = mz5.H;
        l93 l93Var3 = l93VarArr2[20];
        rz5Var.b(qz5Var3, new vr6(j));
        bf bfVar = sn1.Y;
        qz5 qz5Var4 = mz5.s;
        l93 l93Var4 = l93VarArr2[9];
        rz5Var.b(qz5Var4, bfVar);
        to toVar3 = this.m0.a;
        if (Build.VERSION.SDK_INT >= 26) {
            forText = AutofillValue.forText(toVar3);
            chVar = new ch(forText);
        } else {
            chVar = null;
        }
        if (chVar != null) {
            qz5 qz5Var5 = mz5.t;
            l93 l93Var5 = l93VarArr2[10];
            rz5Var.b(qz5Var5, chVar);
        }
        rz5Var.b(dz5.h, new w1(null, new w21(this, 0)));
        int i = this.s0.d;
        if (i == 6) {
            w01.a.getClass();
            pz5.c(rz5Var, v01.d);
        } else if (i == 7 || i == 8) {
            w01.a.getClass();
            pz5.c(rz5Var, v01.c);
        } else if (i == 4) {
            w01.a.getClass();
            pz5.c(rz5Var, v01.e);
        }
        boolean z2 = this.o0;
        o27 o27Var = o27.a;
        if (!z2) {
            rz5Var.b(mz5.j, o27Var);
        }
        if (z) {
            rz5Var.b(mz5.L, o27Var);
        }
        boolean z3 = this.o0;
        qz5 qz5Var6 = mz5.O;
        l93 l93Var6 = l93VarArr2[28];
        rz5Var.b(qz5Var6, Boolean.valueOf(z3));
        pz5.a(rz5Var, new w21(this, 1));
        if (z3) {
            rz5Var.b(dz5.k, new w1(null, new w21(this, 2)));
            rz5Var.b(dz5.o, new w1(null, new w21(this, rz5Var)));
        }
        rz5Var.b(dz5.j, new w1(null, new km4(5, this)));
        int i2 = this.s0.e;
        v21 v21Var = new v21(this, 6);
        rz5Var.b(mz5.I, new gx2(i2));
        rz5Var.b(dz5.p, new w1(null, v21Var));
        rz5Var.b(dz5.b, new w1(null, new v21(this, 7)));
        rz5Var.b(dz5.c, new w1(null, new v21(this, 1)));
        if (!vr6.c(this.m0.b) && !z) {
            rz5Var.b(dz5.q, new w1(null, new v21(this, 2)));
            if (this.o0) {
                rz5Var.b(dz5.r, new w1(null, new v21(this, 3)));
            }
        }
        if (this.o0) {
            rz5Var.b(dz5.s, new w1(null, new v21(this, 5)));
        }
    }

    @Override // defpackage.gz5
    public final boolean t0() {
        return true;
    }
}
