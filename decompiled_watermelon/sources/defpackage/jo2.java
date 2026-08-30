package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jo2  reason: default package */
/* loaded from: classes.dex */
public final class jo2 extends j67 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = xq0.h;
    public List f;
    public boolean g;
    public vi h;
    public mi2 i;
    public final yb j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public jo2() {
        int i = f77.a;
        this.f = pp1.A;
        this.g = true;
        this.j = new yb(18, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.j67
    public final void a(hk1 hk1Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = kv3.a();
                this.b = fArr;
            } else {
                kv3.d(fArr);
            }
            kv3.f(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            kv3.f(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                vi viVar = this.h;
                if (viVar == null) {
                    viVar = zi.a();
                    this.h = viVar;
                }
                hk2.T(this.f, viVar);
            }
            this.g = false;
        }
        os I = hk1Var.I();
        long E = I.E();
        I.s().m();
        try {
            os osVar = (os) ((bq0) I.B).B;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                osVar.s().s(fArr2);
            }
            vi viVar2 = this.h;
            if (!this.f.isEmpty() && viVar2 != null) {
                osVar.s().u(viVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((j67) arrayList.get(i)).a(hk1Var);
            }
        } finally {
            wh1.u(I, E);
        }
    }

    @Override // defpackage.j67
    public final mi2 b() {
        return this.i;
    }

    @Override // defpackage.j67
    public final void d(yb ybVar) {
        this.i = ybVar;
    }

    public final void e(int i, j67 j67Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, j67Var);
        } else {
            arrayList.add(j67Var);
        }
        g(j67Var);
        j67Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = f77.a;
            if (xq0.h(j2) != xq0.h(j) || xq0.g(j2) != xq0.g(j) || xq0.e(j2) != xq0.e(j)) {
                this.d = false;
                this.e = xq0.h;
            }
        }
    }

    public final void g(j67 j67Var) {
        if (j67Var instanceof lk4) {
            lk4 lk4Var = (lk4) j67Var;
            b60 b60Var = lk4Var.b;
            if (this.d && b60Var != null) {
                if (b60Var instanceof mb6) {
                    f(((mb6) b60Var).a);
                } else {
                    this.d = false;
                    this.e = xq0.h;
                }
            }
            b60 b60Var2 = lk4Var.g;
            if (this.d && b60Var2 != null) {
                if (b60Var2 instanceof mb6) {
                    f(((mb6) b60Var2).a);
                    return;
                }
                this.d = false;
                this.e = xq0.h;
            }
        } else if (j67Var instanceof jo2) {
            jo2 jo2Var = (jo2) j67Var;
            if (jo2Var.d && this.d) {
                f(jo2Var.e);
                return;
            }
            this.d = false;
            this.e = xq0.h;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(((j67) arrayList.get(i)).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
