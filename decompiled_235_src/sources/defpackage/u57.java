package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u57  reason: default package */
/* loaded from: classes.dex */
public final class u57 {
    public final int a;
    public final rz b;
    public final y c;
    public u57 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ v57 h;

    public u57(v57 v57Var, int i, rz rzVar, y yVar) {
        this.h = v57Var;
        this.a = i;
        this.b = rzVar;
        this.c = yVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        gi5 gi5Var;
        gi5 gi5Var2;
        long a0;
        long j5 = this.h.f;
        rz rzVar = this.b;
        eg4 d0 = nc1.d0(rzVar, 2);
        sm3 f0 = nc1.f0(rzVar);
        boolean I = f0.I();
        if0 if0Var = f0.B0;
        if (!I) {
            gi5Var2 = null;
        } else {
            if (((eg4) if0Var.e) != d0) {
                long floatToRawIntBits = Float.floatToRawIntBits((int) (j >> 32));
                long j6 = d0.L;
                eg4 eg4Var = (eg4) if0Var.e;
                eg4Var.getClass();
                gi5Var = new gi5(kn2.a0(eg4Var.R(d0, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (floatToRawIntBits << 32), true)), (4294967295L & (((int) (a0 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (a0 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, rzVar);
            } else {
                gi5Var = new gi5(j, j2, j3, j4, j5, fArr, rzVar);
            }
            gi5Var2 = gi5Var;
        }
        if (gi5Var2 == null) {
            return;
        }
        this.c.g(gi5Var2);
    }

    public final void b() {
        u57 u57Var;
        v57 v57Var = this.h;
        p94 p94Var = v57Var.a;
        int i = this.a;
        u57 u57Var2 = (u57) p94Var.g(i);
        if (u57Var2 != null) {
            if (u57Var2 != this) {
                int d = p94Var.d(i);
                Object[] objArr = p94Var.c;
                Object obj = objArr[d];
                p94Var.b[d] = i;
                objArr[d] = u57Var2;
                while (true) {
                    u57 u57Var3 = u57Var2.d;
                    if (u57Var3 == null) {
                        break;
                    } else if (u57Var3 == this) {
                        u57Var2.d = this.d;
                        this.d = null;
                        return;
                    } else {
                        u57Var2 = u57Var3;
                    }
                }
            } else {
                u57 u57Var4 = this.d;
                this.d = null;
                if (u57Var4 != null) {
                    int d2 = p94Var.d(i);
                    Object[] objArr2 = p94Var.c;
                    Object obj2 = objArr2[d2];
                    p94Var.b[d2] = i;
                    objArr2[d2] = u57Var4;
                    return;
                }
                sm3 f0 = nc1.f0(this.b.A);
                if (f0.Z) {
                    ((te) vm3.a(f0)).getRectManager().b.k(f0.B, false);
                    return;
                }
                return;
            }
        }
        u57 u57Var5 = v57Var.b;
        if (u57Var5 == this) {
            v57Var.b = u57Var5.d;
            this.d = null;
            return;
        }
        if (u57Var5 != null) {
            u57Var = u57Var5.d;
        } else {
            u57Var = null;
        }
        while (true) {
            u57 u57Var6 = u57Var5;
            u57Var5 = u57Var;
            if (u57Var5 != null) {
                if (u57Var5 == this) {
                    if (u57Var6 != null) {
                        u57Var6.d = u57Var5.d;
                    }
                    this.d = null;
                    return;
                }
                u57Var = u57Var5.d;
            } else {
                return;
            }
        }
    }
}
