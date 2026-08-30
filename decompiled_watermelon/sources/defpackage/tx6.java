package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tx6  reason: default package */
/* loaded from: classes.dex */
public class tx6 extends ix6 {
    public int B0;
    public ix6[] E0;
    public ArrayList z0 = new ArrayList();
    public boolean A0 = true;
    public boolean C0 = false;
    public int D0 = 0;

    @Override // defpackage.ix6
    public final void B(View view) {
        super.B(view);
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ((ix6) this.z0.get(i)).B(view);
        }
    }

    @Override // defpackage.ix6
    public final void C() {
        this.s0 = 0L;
        sx6 sx6Var = new sx6(this, 0);
        for (int i = 0; i < this.z0.size(); i++) {
            ix6 ix6Var = (ix6) this.z0.get(i);
            ix6Var.a(sx6Var);
            ix6Var.C();
            long j = ix6Var.s0;
            boolean z = this.A0;
            long j2 = this.s0;
            if (z) {
                this.s0 = Math.max(j2, j);
            } else {
                ix6Var.u0 = j2;
                this.s0 = j2 + j;
            }
        }
    }

    @Override // defpackage.ix6
    public final ix6 D(hx6 hx6Var) {
        super.D(hx6Var);
        return this;
    }

    @Override // defpackage.ix6
    public final void E(View view) {
        for (int i = 0; i < this.z0.size(); i++) {
            ((ix6) this.z0.get(i)).E(view);
        }
        this.Y.remove(view);
    }

    @Override // defpackage.ix6
    public final void F(View view) {
        super.F(view);
        ix6[] ix6VarArr = this.E0;
        this.E0 = null;
        if (ix6VarArr == null) {
            ix6VarArr = new ix6[this.z0.size()];
        }
        ix6[] ix6VarArr2 = (ix6[]) this.z0.toArray(ix6VarArr);
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ix6VarArr2[i].F(view);
        }
        Arrays.fill(ix6VarArr2, (Object) null);
        this.E0 = ix6VarArr2;
    }

    @Override // defpackage.ix6
    public final void G() {
        ArrayList arrayList;
        if (this.z0.isEmpty()) {
            O();
            o();
            return;
        }
        sx6 sx6Var = new sx6();
        sx6Var.b = this;
        ArrayList arrayList2 = this.z0;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((ix6) obj).a(sx6Var);
        }
        this.B0 = this.z0.size();
        if (!this.A0) {
            int i3 = 1;
            while (true) {
                int size2 = this.z0.size();
                arrayList = this.z0;
                if (i3 >= size2) {
                    break;
                }
                ((ix6) arrayList.get(i3 - 1)).a(new sx6((ix6) this.z0.get(i3), 2));
                i3++;
            }
            ix6 ix6Var = (ix6) arrayList.get(0);
            if (ix6Var != null) {
                ix6Var.G();
                return;
            }
            return;
        }
        ArrayList arrayList3 = this.z0;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((ix6) obj2).G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ix6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx6.H(long, long):void");
    }

    @Override // defpackage.ix6
    public final void I(long j) {
        ArrayList arrayList;
        this.L = j;
        if (j >= 0 && (arrayList = this.z0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ix6) this.z0.get(i)).I(j);
            }
        }
    }

    @Override // defpackage.ix6
    public final void J(me2 me2Var) {
        this.q0 = me2Var;
        this.D0 |= 8;
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ((ix6) this.z0.get(i)).J(me2Var);
        }
    }

    @Override // defpackage.ix6
    public final void K(TimeInterpolator timeInterpolator) {
        this.D0 |= 1;
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ix6) this.z0.get(i)).K(timeInterpolator);
            }
        }
        this.R = timeInterpolator;
    }

    @Override // defpackage.ix6
    public final void L(so1 so1Var) {
        super.L(so1Var);
        this.D0 |= 4;
        if (this.z0 != null) {
            for (int i = 0; i < this.z0.size(); i++) {
                ((ix6) this.z0.get(i)).L(so1Var);
            }
        }
    }

    @Override // defpackage.ix6
    public final void M() {
        this.D0 |= 2;
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ((ix6) this.z0.get(i)).M();
        }
    }

    @Override // defpackage.ix6
    public final void N(long j) {
        this.B = j;
    }

    @Override // defpackage.ix6
    public final String P(String str) {
        String P = super.P(str);
        for (int i = 0; i < this.z0.size(); i++) {
            StringBuilder t = b31.t(P, "\n");
            t.append(((ix6) this.z0.get(i)).P(str.concat("  ")));
            P = t.toString();
        }
        return P;
    }

    public final void Q(ix6 ix6Var) {
        this.z0.add(ix6Var);
        ix6Var.d0 = this;
        long j = this.L;
        if (j >= 0) {
            ix6Var.I(j);
        }
        if ((this.D0 & 1) != 0) {
            ix6Var.K(this.R);
        }
        if ((this.D0 & 2) != 0) {
            ix6Var.M();
        }
        if ((this.D0 & 4) != 0) {
            ix6Var.L(this.r0);
        }
        if ((this.D0 & 8) != 0) {
            ix6Var.J(this.q0);
        }
    }

    public final ix6 R(int i) {
        if (i >= 0 && i < this.z0.size()) {
            return (ix6) this.z0.get(i);
        }
        return null;
    }

    @Override // defpackage.ix6
    public final void b(View view) {
        for (int i = 0; i < this.z0.size(); i++) {
            ((ix6) this.z0.get(i)).b(view);
        }
        this.Y.add(view);
    }

    @Override // defpackage.ix6
    public final void cancel() {
        super.cancel();
        ix6[] ix6VarArr = this.E0;
        this.E0 = null;
        if (ix6VarArr == null) {
            ix6VarArr = new ix6[this.z0.size()];
        }
        ix6[] ix6VarArr2 = (ix6[]) this.z0.toArray(ix6VarArr);
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ix6VarArr2[i].cancel();
        }
        Arrays.fill(ix6VarArr2, (Object) null);
        this.E0 = ix6VarArr2;
    }

    @Override // defpackage.ix6
    public final void e(vx6 vx6Var) {
        View view = vx6Var.b;
        if (y(view)) {
            ArrayList arrayList = this.z0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ix6 ix6Var = (ix6) obj;
                if (ix6Var.y(view)) {
                    ix6Var.e(vx6Var);
                    vx6Var.c.add(ix6Var);
                }
            }
        }
    }

    @Override // defpackage.ix6
    public final void g(vx6 vx6Var) {
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ((ix6) this.z0.get(i)).g(vx6Var);
        }
    }

    @Override // defpackage.ix6
    public final void h(vx6 vx6Var) {
        View view = vx6Var.b;
        if (y(view)) {
            ArrayList arrayList = this.z0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ix6 ix6Var = (ix6) obj;
                if (ix6Var.y(view)) {
                    ix6Var.h(vx6Var);
                    vx6Var.c.add(ix6Var);
                }
            }
        }
    }

    @Override // defpackage.ix6
    /* renamed from: l */
    public final ix6 clone() {
        tx6 tx6Var = (tx6) super.clone();
        tx6Var.z0 = new ArrayList();
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ix6 clone = ((ix6) this.z0.get(i)).clone();
            tx6Var.z0.add(clone);
            clone.d0 = tx6Var;
        }
        return tx6Var;
    }

    @Override // defpackage.ix6
    public final void n(ViewGroup viewGroup, q9 q9Var, q9 q9Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.B;
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            ix6 ix6Var = (ix6) this.z0.get(i);
            if (j > 0 && (this.A0 || i == 0)) {
                long j2 = ix6Var.B;
                if (j2 > 0) {
                    ix6Var.N(j2 + j);
                } else {
                    ix6Var.N(j);
                }
            }
            ix6Var.n(viewGroup, q9Var, q9Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ix6
    public final boolean v() {
        for (int i = 0; i < this.z0.size(); i++) {
            if (((ix6) this.z0.get(i)).v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ix6
    public final boolean w() {
        int size = this.z0.size();
        for (int i = 0; i < size; i++) {
            if (!((ix6) this.z0.get(i)).w()) {
                return false;
            }
        }
        return true;
    }
}
