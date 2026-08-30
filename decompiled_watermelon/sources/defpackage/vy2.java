package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vy2  reason: default package */
/* loaded from: classes.dex */
public final class vy2 {
    public final sj1 a;
    public qy2 b;
    public ty2 c;
    public sy2 d;
    public ry2 e;
    public jk2 f;
    public u57 g;
    public long h = 9205357640488583168L;
    public yj i;
    public final sb j;
    public final sb k;
    public long l;

    public vy2(sj1 sj1Var) {
        this.a = sj1Var;
        sb sbVar = new sb((char) 0, 6);
        sbVar.L = new w14();
        this.j = sbVar;
        sb sbVar2 = new sb((char) 0, 9);
        sbVar2.L = new n14();
        this.k = sbVar2;
        this.l = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sy2] */
    public static void c(vy2 vy2Var, oy2 oy2Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        sj1 sj1Var = vy2Var.a;
        sy2 sy2Var = vy2Var.d;
        sy2 sy2Var2 = sy2Var;
        if (sy2Var == null) {
            ?? obj = new Object();
            obj.d = null;
            obj.e = Long.MAX_VALUE;
            obj.f = false;
            vy2Var.d = obj;
            sy2Var2 = obj;
        }
        sy2Var2.d = oy2Var;
        sy2Var2.e = j;
        yj yjVar = vy2Var.i;
        jf4 jf4Var = sj1Var.l0;
        if (yjVar == null) {
            vy2Var.i = new yj(jf4Var);
        } else {
            yjVar.c = jf4Var;
            yjVar.b = j2;
        }
        sy2Var2.f = false;
        vy2Var.f = sy2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qy2] */
    public final void a() {
        qy2 qy2Var = this.b;
        qy2 qy2Var2 = qy2Var;
        if (qy2Var == null) {
            py2 py2Var = py2.NotInitialized;
            ?? obj = new Object();
            obj.d = py2Var;
            obj.e = false;
            this.b = obj;
            qy2Var2 = obj;
        }
        qy2Var2.d = py2.NotInitialized;
        qy2Var2.e = false;
        this.f = qy2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ry2] */
    public final void b(oy2 oy2Var, long j, yj yjVar) {
        ry2 ry2Var = this.e;
        ry2 ry2Var2 = ry2Var;
        if (ry2Var == null) {
            ?? obj = new Object();
            obj.d = null;
            obj.e = Long.MAX_VALUE;
            this.e = obj;
            ry2Var2 = obj;
        }
        ry2Var2.d = oy2Var;
        ry2Var2.e = j;
        yjVar.b = 0L;
        this.f = ry2Var2;
    }

    public final u57 d() {
        u57 u57Var = this.g;
        if (u57Var != null) {
            return u57Var;
        }
        i.i("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(oy2 oy2Var, ny2 ny2Var, long j) {
        long j2;
        sj1 sj1Var = this.a;
        long a = l.O(sj1Var).a(0L);
        if (!mb4.b(this.h, 9205357640488583168L) && !mb4.b(a, this.h)) {
            this.l = mb4.e(this.l, mb4.d(a, this.h));
        }
        this.h = a;
        jf4 jf4Var = sj1Var.l0;
        jf4Var.getClass();
        xj1 xj1Var = yj1.a;
        if (jf4Var == jf4.Vertical) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j2)) > 2.0f) {
            nk2.m(d(), oy2Var, sj1Var.l0, ny2Var, this.j, this.l);
            sb sbVar = this.k;
            n14 n14Var = (n14) sbVar.L;
            int i = n14Var.b;
            if (i == 3) {
                int i2 = sbVar.B;
                sbVar.B = i2 + 1;
                if (i2 >= 0 && i2 < i) {
                    long[] jArr = n14Var.a;
                    long j3 = jArr[i2];
                    jArr[i2] = j;
                } else {
                    f81.q("Index must be between 0 and size");
                    return;
                }
            } else {
                n14Var.a(j);
            }
            if (sbVar.B == 3) {
                sbVar.B = 0;
            }
            long[] jArr2 = n14Var.a;
            int i3 = n14Var.b;
            float f = RecyclerView.A1;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = n14Var.b;
            float f3 = f2 / i5;
            long[] jArr3 = n14Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            sj1Var.c1(new zi1((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / n14Var.b) & 4294967295L), true));
        }
    }

    public final void f(oy2 oy2Var, oy2 oy2Var2, ny2 ny2Var, long j) {
        if (this.g == null) {
            this.g = new u57();
        }
        this.l = 0L;
        u57 d = d();
        sj1 sj1Var = this.a;
        nk2.m(d, oy2Var, sj1Var.l0, ny2Var, this.j, this.l);
        long d2 = mb4.d(nk2.S(oy2Var2, sj1Var.l0, ny2Var), j);
        if (((Boolean) sj1Var.m0.n(new xp4(1))).booleanValue()) {
            this.h = l.O(sj1Var).a(0L);
            sj1Var.c1(new aj1(d2));
        }
        sb sbVar = this.k;
        sbVar.B = 0;
        ((n14) sbVar.L).b = 0;
    }
}
