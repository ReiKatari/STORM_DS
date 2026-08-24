package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx2  reason: default package */
/* loaded from: classes.dex */
public class gx2 extends l21 {
    public l21[] t0 = new l21[4];
    public int u0 = 0;

    public final void S(l21 l21Var) {
        if (l21Var != this && l21Var != null) {
            int i = this.u0 + 1;
            l21[] l21VarArr = this.t0;
            if (i > l21VarArr.length) {
                this.t0 = (l21[]) Arrays.copyOf(l21VarArr, l21VarArr.length * 2);
            }
            l21[] l21VarArr2 = this.t0;
            int i2 = this.u0;
            l21VarArr2[i2] = l21Var;
            this.u0 = i2 + 1;
        }
    }

    public final void T(int i, zs7 zs7Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.u0; i2++) {
            l21 l21Var = this.t0[i2];
            ArrayList arrayList2 = zs7Var.a;
            if (!arrayList2.contains(l21Var)) {
                arrayList2.add(l21Var);
            }
        }
        for (int i3 = 0; i3 < this.u0; i3++) {
            kj2.x(this.t0[i3], i, arrayList, zs7Var);
        }
    }

    @Override // defpackage.l21
    public void g(l21 l21Var, HashMap hashMap) {
        super.g(l21Var, hashMap);
        gx2 gx2Var = (gx2) l21Var;
        this.u0 = 0;
        int i = gx2Var.u0;
        for (int i2 = 0; i2 < i; i2++) {
            S((l21) hashMap.get(gx2Var.t0[i2]));
        }
    }

    public void U() {
    }
}
