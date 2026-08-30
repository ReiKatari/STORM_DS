package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dt6  reason: default package */
/* loaded from: classes.dex */
public final class dt6 {
    public final int a;
    public final zx b;
    public final x c;
    public dt6 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ et6 h;

    public dt6(et6 et6Var, int i, zx zxVar, x xVar) {
        this.h = et6Var;
        this.a = i;
        this.b = zxVar;
        this.c = xVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        r85 r85Var;
        r85 r85Var2;
        long P;
        long j5 = this.h.f;
        zx zxVar = this.b;
        m74 N = l.N(zxVar, 2);
        vf3 P2 = l.P(zxVar);
        boolean I = P2.I();
        zc0 zc0Var = P2.A0;
        if (!I) {
            r85Var2 = null;
        } else {
            if (((m74) zc0Var.e) != N) {
                long floatToRawIntBits = Float.floatToRawIntBits((int) (j >> 32));
                long j6 = N.L;
                m74 m74Var = (m74) zc0Var.e;
                m74Var.getClass();
                r85Var = new r85(mj2.P(m74Var.R(N, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (floatToRawIntBits << 32), true)), (4294967295L & (((int) (P & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (P >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, zxVar);
            } else {
                r85Var = new r85(j, j2, j3, j4, j5, fArr, zxVar);
            }
            r85Var2 = r85Var;
        }
        if (r85Var2 == null) {
            return;
        }
        this.c.n(r85Var2);
    }

    public final void b() {
        dt6 dt6Var;
        et6 et6Var = this.h;
        j14 j14Var = et6Var.a;
        int i = this.a;
        dt6 dt6Var2 = (dt6) j14Var.g(i);
        if (dt6Var2 != null) {
            if (dt6Var2 != this) {
                int d = j14Var.d(i);
                Object[] objArr = j14Var.c;
                Object obj = objArr[d];
                j14Var.b[d] = i;
                objArr[d] = dt6Var2;
                while (true) {
                    dt6 dt6Var3 = dt6Var2.d;
                    if (dt6Var3 == null) {
                        break;
                    } else if (dt6Var3 == this) {
                        dt6Var2.d = this.d;
                        this.d = null;
                        return;
                    } else {
                        dt6Var2 = dt6Var3;
                    }
                }
            } else {
                dt6 dt6Var4 = this.d;
                this.d = null;
                if (dt6Var4 != null) {
                    int d2 = j14Var.d(i);
                    Object[] objArr2 = j14Var.c;
                    Object obj2 = objArr2[d2];
                    j14Var.b[d2] = i;
                    objArr2[d2] = dt6Var4;
                    return;
                }
                vf3 P = l.P(this.b.A);
                if (P.Z) {
                    ((ee) yf3.a(P)).getRectManager().b.k(P.B, false);
                    return;
                }
                return;
            }
        }
        dt6 dt6Var5 = et6Var.b;
        if (dt6Var5 == this) {
            et6Var.b = dt6Var5.d;
            this.d = null;
            return;
        }
        if (dt6Var5 != null) {
            dt6Var = dt6Var5.d;
        } else {
            dt6Var = null;
        }
        while (true) {
            dt6 dt6Var6 = dt6Var5;
            dt6Var5 = dt6Var;
            if (dt6Var5 != null) {
                if (dt6Var5 == this) {
                    if (dt6Var6 != null) {
                        dt6Var6.d = dt6Var5.d;
                    }
                    this.d = null;
                    return;
                }
                dt6Var = dt6Var5.d;
            } else {
                return;
            }
        }
    }
}
