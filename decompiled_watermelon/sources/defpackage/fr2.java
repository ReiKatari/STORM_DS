package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr2  reason: default package */
/* loaded from: classes.dex */
public class fr2 extends gz0 {
    public gz0[] t0 = new gz0[4];
    public int u0 = 0;

    public final void S(gz0 gz0Var) {
        if (gz0Var != this && gz0Var != null) {
            int i = this.u0 + 1;
            gz0[] gz0VarArr = this.t0;
            if (i > gz0VarArr.length) {
                this.t0 = (gz0[]) Arrays.copyOf(gz0VarArr, gz0VarArr.length * 2);
            }
            gz0[] gz0VarArr2 = this.t0;
            int i2 = this.u0;
            gz0VarArr2[i2] = gz0Var;
            this.u0 = i2 + 1;
        }
    }

    public final void T(int i, yd7 yd7Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.u0; i2++) {
            gz0 gz0Var = this.t0[i2];
            ArrayList arrayList2 = yd7Var.a;
            if (!arrayList2.contains(gz0Var)) {
                arrayList2.add(gz0Var);
            }
        }
        for (int i3 = 0; i3 < this.u0; i3++) {
            oo2.E(this.t0[i3], i, arrayList, yd7Var);
        }
    }

    @Override // defpackage.gz0
    public void g(gz0 gz0Var, HashMap hashMap) {
        super.g(gz0Var, hashMap);
        fr2 fr2Var = (fr2) gz0Var;
        this.u0 = 0;
        int i = fr2Var.u0;
        for (int i2 = 0; i2 < i; i2++) {
            S((gz0) hashMap.get(fr2Var.t0[i2]));
        }
    }

    public void U() {
    }
}
