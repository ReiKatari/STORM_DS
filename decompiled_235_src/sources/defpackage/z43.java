package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z43  reason: default package */
/* loaded from: classes.dex */
public final class z43 {
    public final yn1 a;
    public u43 b;
    public x43 c;
    public w43 d;
    public v43 e;
    public np2 f;
    public j97 g;
    public long h = 9205357640488583168L;
    public kk i;
    public final zb j;
    public final zb k;
    public long l;

    public z43(yn1 yn1Var) {
        this.a = yn1Var;
        zb zbVar = new zb((char) 0, 6);
        zbVar.L = new ca4();
        this.j = zbVar;
        zb zbVar2 = new zb((char) 0, 9);
        zbVar2.L = new t94();
        this.k = zbVar2;
        this.l = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [np2, w43] */
    public static void c(z43 z43Var, s43 s43Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        yn1 yn1Var = z43Var.a;
        w43 w43Var = z43Var.d;
        w43 w43Var2 = w43Var;
        if (w43Var == null) {
            ?? np2Var = new np2(2);
            np2Var.e = null;
            np2Var.f = Long.MAX_VALUE;
            np2Var.g = false;
            z43Var.d = np2Var;
            w43Var2 = np2Var;
        }
        w43Var2.e = s43Var;
        w43Var2.f = j;
        kk kkVar = z43Var.i;
        lo4 lo4Var = yn1Var.m0;
        if (kkVar == null) {
            z43Var.i = new kk(lo4Var);
        } else {
            kkVar.L = lo4Var;
            kkVar.B = j2;
        }
        w43Var2.g = false;
        z43Var.f = w43Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [np2, u43] */
    public final void a() {
        u43 u43Var = this.b;
        u43 u43Var2 = u43Var;
        if (u43Var == null) {
            t43 t43Var = t43.NotInitialized;
            ?? np2Var = new np2(2);
            np2Var.e = t43Var;
            np2Var.f = false;
            this.b = np2Var;
            u43Var2 = np2Var;
        }
        u43Var2.e = t43.NotInitialized;
        u43Var2.f = false;
        this.f = u43Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [np2, v43] */
    public final void b(s43 s43Var, long j, kk kkVar) {
        v43 v43Var = this.e;
        v43 v43Var2 = v43Var;
        if (v43Var == null) {
            ?? np2Var = new np2(2);
            np2Var.e = null;
            np2Var.f = Long.MAX_VALUE;
            this.e = np2Var;
            v43Var2 = np2Var;
        }
        v43Var2.e = s43Var;
        v43Var2.f = j;
        kkVar.B = 0L;
        this.f = v43Var2;
    }

    public final j97 d() {
        j97 j97Var = this.g;
        if (j97Var != null) {
            return j97Var;
        }
        i.h("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(s43 s43Var, r43 r43Var, long j) {
        long j2;
        yn1 yn1Var = this.a;
        long w = nc1.e0(yn1Var).w(0L);
        if (!jk4.c(this.h, 9205357640488583168L) && !jk4.c(w, this.h)) {
            this.l = jk4.f(this.l, jk4.e(w, this.h));
        }
        this.h = w;
        lo4 lo4Var = yn1Var.m0;
        lo4Var.getClass();
        do1 do1Var = eo1.a;
        if (lo4Var == lo4.Vertical) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j2)) > 2.0f) {
            jx2.h(d(), s43Var, yn1Var.m0, r43Var, this.j, this.l);
            zb zbVar = this.k;
            t94 t94Var = (t94) zbVar.L;
            int i = t94Var.b;
            if (i == 3) {
                int i2 = zbVar.B;
                zbVar.B = i2 + 1;
                if (i2 >= 0 && i2 < i) {
                    long[] jArr = t94Var.a;
                    long j3 = jArr[i2];
                    jArr[i2] = j;
                } else {
                    e41.q("Index must be between 0 and size");
                    return;
                }
            } else {
                t94Var.a(j);
            }
            if (zbVar.B == 3) {
                zbVar.B = 0;
            }
            long[] jArr2 = t94Var.a;
            int i3 = t94Var.b;
            float f = RecyclerView.B1;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = t94Var.b;
            float f3 = f2 / i5;
            long[] jArr3 = t94Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            yn1Var.c1(new fn1((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / t94Var.b) & 4294967295L), true));
        }
    }

    public final void f(s43 s43Var, s43 s43Var2, r43 r43Var, long j) {
        if (this.g == null) {
            this.g = new j97();
        }
        this.l = 0L;
        j97 d = d();
        yn1 yn1Var = this.a;
        jx2.h(d, s43Var, yn1Var.m0, r43Var, this.j, this.l);
        long e = jk4.e(jx2.I(s43Var2, yn1Var.m0, r43Var), j);
        if (((Boolean) yn1Var.n0.g(new bz4(1))).booleanValue()) {
            this.h = nc1.e0(yn1Var).w(0L);
            yn1Var.c1(new gn1(e));
        }
        zb zbVar = this.k;
        zbVar.B = 0;
        ((t94) zbVar.L).b = 0;
    }
}
