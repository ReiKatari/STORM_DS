package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa7  reason: default package */
/* loaded from: classes.dex */
public class qa7 extends ea7 {
    public int C0;
    public ea7[] F0;
    public ArrayList A0 = new ArrayList();
    public boolean B0 = true;
    public boolean D0 = false;
    public int E0 = 0;

    @Override // defpackage.ea7
    public final void B(View view) {
        super.B(view);
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ((ea7) this.A0.get(i)).B(view);
        }
    }

    @Override // defpackage.ea7
    public final void C() {
        this.t0 = 0L;
        pa7 pa7Var = new pa7(this, 0);
        for (int i = 0; i < this.A0.size(); i++) {
            ea7 ea7Var = (ea7) this.A0.get(i);
            ea7Var.a(pa7Var);
            ea7Var.C();
            long j = ea7Var.t0;
            boolean z = this.B0;
            long j2 = this.t0;
            if (z) {
                this.t0 = Math.max(j2, j);
            } else {
                ea7Var.v0 = j2;
                this.t0 = j2 + j;
            }
        }
    }

    @Override // defpackage.ea7
    public final ea7 D(da7 da7Var) {
        super.D(da7Var);
        return this;
    }

    @Override // defpackage.ea7
    public final void E(View view) {
        for (int i = 0; i < this.A0.size(); i++) {
            ((ea7) this.A0.get(i)).E(view);
        }
        this.Y.remove(view);
    }

    @Override // defpackage.ea7
    public final void F(View view) {
        super.F(view);
        ea7[] ea7VarArr = this.F0;
        this.F0 = null;
        if (ea7VarArr == null) {
            ea7VarArr = new ea7[this.A0.size()];
        }
        ea7[] ea7VarArr2 = (ea7[]) this.A0.toArray(ea7VarArr);
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ea7VarArr2[i].F(view);
        }
        Arrays.fill(ea7VarArr2, (Object) null);
        this.F0 = ea7VarArr2;
    }

    @Override // defpackage.ea7
    public final void G() {
        ArrayList arrayList;
        if (this.A0.isEmpty()) {
            O();
            n();
            return;
        }
        pa7 pa7Var = new pa7();
        pa7Var.b = this;
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((ea7) obj).a(pa7Var);
        }
        this.C0 = this.A0.size();
        if (!this.B0) {
            int i3 = 1;
            while (true) {
                int size2 = this.A0.size();
                arrayList = this.A0;
                if (i3 >= size2) {
                    break;
                }
                ((ea7) arrayList.get(i3 - 1)).a(new pa7((ea7) this.A0.get(i3), 2));
                i3++;
            }
            ea7 ea7Var = (ea7) arrayList.get(0);
            if (ea7Var != null) {
                ea7Var.G();
                return;
            }
            return;
        }
        ArrayList arrayList3 = this.A0;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((ea7) obj2).G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ea7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(long j, long j2) {
        boolean z;
        long j3;
        long j4 = this.t0;
        long j5 = 0;
        if (this.e0 != null) {
            if (j >= 0 || j2 >= 0) {
                if (j > j4 && j2 > j4) {
                    return;
                }
            } else {
                return;
            }
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i2 >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.n0 = false;
            A(this, fa6.B, z);
        }
        if (this.B0) {
            for (int i3 = 0; i3 < this.A0.size(); i3++) {
                ((ea7) this.A0.get(i3)).H(j, j2);
            }
        } else {
            int i4 = 1;
            while (true) {
                int size = this.A0.size();
                ArrayList arrayList = this.A0;
                if (i4 < size) {
                    if (((ea7) arrayList.get(i4)).v0 > j2) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = arrayList.size();
                    break;
                }
            }
            int i5 = i4 - 1;
            if (i >= 0) {
                while (i5 < this.A0.size()) {
                    ea7 ea7Var = (ea7) this.A0.get(i5);
                    long j6 = ea7Var.v0;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    ea7Var.H(j7, j2 - j6);
                    i5++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i5 >= 0) {
                    ea7 ea7Var2 = (ea7) this.A0.get(i5);
                    long j8 = ea7Var2.v0;
                    long j9 = j - j8;
                    ea7Var2.H(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    }
                    i5--;
                }
            }
            if (this.e0 == null) {
                int i6 = (j > j4 ? 1 : (j == j4 ? 0 : -1));
                if ((i6 > 0 && j2 <= j4) || (i2 < 0 && j2 >= j3)) {
                    if (i6 > 0) {
                        this.n0 = true;
                    }
                    A(this, fa6.L, z);
                    return;
                }
                return;
            }
            return;
        }
        j3 = j5;
        if (this.e0 == null) {
        }
    }

    @Override // defpackage.ea7
    public final void I(long j) {
        ArrayList arrayList;
        this.L = j;
        if (j >= 0 && (arrayList = this.A0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ea7) this.A0.get(i)).I(j);
            }
        }
    }

    @Override // defpackage.ea7
    public final void J(yh2 yh2Var) {
        this.r0 = yh2Var;
        this.E0 |= 8;
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ((ea7) this.A0.get(i)).J(yh2Var);
        }
    }

    @Override // defpackage.ea7
    public final void K(TimeInterpolator timeInterpolator) {
        this.E0 |= 1;
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ea7) this.A0.get(i)).K(timeInterpolator);
            }
        }
        this.R = timeInterpolator;
    }

    @Override // defpackage.ea7
    public final void L(x31 x31Var) {
        super.L(x31Var);
        this.E0 |= 4;
        if (this.A0 != null) {
            for (int i = 0; i < this.A0.size(); i++) {
                ((ea7) this.A0.get(i)).L(x31Var);
            }
        }
    }

    @Override // defpackage.ea7
    public final void M() {
        this.E0 |= 2;
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ((ea7) this.A0.get(i)).M();
        }
    }

    @Override // defpackage.ea7
    public final void N(long j) {
        this.B = j;
    }

    @Override // defpackage.ea7
    public final String P(String str) {
        String P = super.P(str);
        for (int i = 0; i < this.A0.size(); i++) {
            StringBuilder r = i61.r(P, "\n");
            r.append(((ea7) this.A0.get(i)).P(str.concat("  ")));
            P = r.toString();
        }
        return P;
    }

    public final void Q(ea7 ea7Var) {
        this.A0.add(ea7Var);
        ea7Var.e0 = this;
        long j = this.L;
        if (j >= 0) {
            ea7Var.I(j);
        }
        if ((this.E0 & 1) != 0) {
            ea7Var.K(this.R);
        }
        if ((this.E0 & 2) != 0) {
            ea7Var.M();
        }
        if ((this.E0 & 4) != 0) {
            ea7Var.L(this.s0);
        }
        if ((this.E0 & 8) != 0) {
            ea7Var.J(this.r0);
        }
    }

    public final ea7 R(int i) {
        if (i >= 0 && i < this.A0.size()) {
            return (ea7) this.A0.get(i);
        }
        return null;
    }

    @Override // defpackage.ea7
    public final void b(View view) {
        for (int i = 0; i < this.A0.size(); i++) {
            ((ea7) this.A0.get(i)).b(view);
        }
        this.Y.add(view);
    }

    @Override // defpackage.ea7
    public final void cancel() {
        super.cancel();
        ea7[] ea7VarArr = this.F0;
        this.F0 = null;
        if (ea7VarArr == null) {
            ea7VarArr = new ea7[this.A0.size()];
        }
        ea7[] ea7VarArr2 = (ea7[]) this.A0.toArray(ea7VarArr);
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ea7VarArr2[i].cancel();
        }
        Arrays.fill(ea7VarArr2, (Object) null);
        this.F0 = ea7VarArr2;
    }

    @Override // defpackage.ea7
    public final void d(sa7 sa7Var) {
        View view = sa7Var.b;
        if (y(view)) {
            ArrayList arrayList = this.A0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ea7 ea7Var = (ea7) obj;
                if (ea7Var.y(view)) {
                    ea7Var.d(sa7Var);
                    sa7Var.c.add(ea7Var);
                }
            }
        }
    }

    @Override // defpackage.ea7
    public final void f(sa7 sa7Var) {
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ((ea7) this.A0.get(i)).f(sa7Var);
        }
    }

    @Override // defpackage.ea7
    public final void g(sa7 sa7Var) {
        View view = sa7Var.b;
        if (y(view)) {
            ArrayList arrayList = this.A0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ea7 ea7Var = (ea7) obj;
                if (ea7Var.y(view)) {
                    ea7Var.g(sa7Var);
                    sa7Var.c.add(ea7Var);
                }
            }
        }
    }

    @Override // defpackage.ea7
    /* renamed from: k */
    public final ea7 clone() {
        qa7 qa7Var = (qa7) super.clone();
        qa7Var.A0 = new ArrayList();
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ea7 clone = ((ea7) this.A0.get(i)).clone();
            qa7Var.A0.add(clone);
            clone.e0 = qa7Var;
        }
        return qa7Var;
    }

    @Override // defpackage.ea7
    public final void m(ViewGroup viewGroup, eb ebVar, eb ebVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.B;
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            ea7 ea7Var = (ea7) this.A0.get(i);
            if (j > 0 && (this.B0 || i == 0)) {
                long j2 = ea7Var.B;
                if (j2 > 0) {
                    ea7Var.N(j2 + j);
                } else {
                    ea7Var.N(j);
                }
            }
            ea7Var.m(viewGroup, ebVar, ebVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ea7
    public final boolean u() {
        for (int i = 0; i < this.A0.size(); i++) {
            if (((ea7) this.A0.get(i)).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ea7
    public final boolean v() {
        int size = this.A0.size();
        for (int i = 0; i < size; i++) {
            if (!((ea7) this.A0.get(i)).v()) {
                return false;
            }
        }
        return true;
    }
}
