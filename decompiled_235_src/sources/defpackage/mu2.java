package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu2  reason: default package */
/* loaded from: classes.dex */
public final class mu2 extends gk7 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = kt0.h;
    public List f;
    public boolean g;
    public hj h;
    public qn2 i;
    public final mc j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public mu2() {
        int i = el7.a;
        this.f = yt1.A;
        this.g = true;
        this.j = new mc(this, 17);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.gk7
    public final void a(no1 no1Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = v24.a();
                this.b = fArr;
            } else {
                v24.d(fArr);
            }
            v24.f(fArr, this.q + this.m, this.r + this.n);
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
            v24.f(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                hj hjVar = this.h;
                if (hjVar == null) {
                    hjVar = lj.a();
                    this.h = hjVar;
                }
                ln2.e0(this.f, hjVar);
            }
            this.g = false;
        }
        bt i0 = no1Var.i0();
        long L = i0.L();
        i0.G().h();
        try {
            bt btVar = (bt) ((os0) i0.B).B;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                btVar.G().l(fArr2);
            }
            hj hjVar2 = this.h;
            if (!this.f.isEmpty() && hjVar2 != null) {
                btVar.G().m(hjVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gk7) arrayList.get(i)).a(no1Var);
            }
        } finally {
            xg6.v(i0, L);
        }
    }

    @Override // defpackage.gk7
    public final qn2 b() {
        return this.i;
    }

    @Override // defpackage.gk7
    public final void d(mc mcVar) {
        this.i = mcVar;
    }

    public final void e(int i, gk7 gk7Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, gk7Var);
        } else {
            arrayList.add(gk7Var);
        }
        g(gk7Var);
        gk7Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = el7.a;
            if (kt0.i(j2) != kt0.i(j) || kt0.h(j2) != kt0.h(j) || kt0.f(j2) != kt0.f(j)) {
                this.d = false;
                this.e = kt0.h;
            }
        }
    }

    public final void g(gk7 gk7Var) {
        if (gk7Var instanceof nt4) {
            nt4 nt4Var = (nt4) gk7Var;
            f80 f80Var = nt4Var.b;
            if (this.d && f80Var != null) {
                if (f80Var instanceof cn6) {
                    f(((cn6) f80Var).a);
                } else {
                    this.d = false;
                    this.e = kt0.h;
                }
            }
            f80 f80Var2 = nt4Var.g;
            if (this.d && f80Var2 != null) {
                if (f80Var2 instanceof cn6) {
                    f(((cn6) f80Var2).a);
                    return;
                }
                this.d = false;
                this.e = kt0.h;
            }
        } else if (gk7Var instanceof mu2) {
            mu2 mu2Var = (mu2) gk7Var;
            if (mu2Var.d && this.d) {
                f(mu2Var.e);
                return;
            }
            this.d = false;
            this.e = kt0.h;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(((gk7) arrayList.get(i)).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
