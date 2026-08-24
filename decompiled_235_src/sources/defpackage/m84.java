package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m84  reason: default package */
/* loaded from: classes.dex */
public final class m84 extends ng4 {
    public final os0 f;
    public final v80 g;
    public ap6 h;

    public m84(m86 m86Var, os0 os0Var, yv0 yv0Var, qh1 qh1Var) {
        super(m86Var, yv0Var, qh1Var);
        this.f = os0Var;
        this.g = nb3.c(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166 A[PHI: r16 
      PHI: (r16v1 jg7) = (r16v0 jg7), (r16v2 jg7) binds: [B:22:0x00d0, B:39:0x0163] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ah5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m84 m84Var, m86 m86Var, i84 i84Var, float f, float f2, s41 s41Var) {
        j84 j84Var;
        j84 j84Var2;
        Object obj;
        int i;
        jg7 jg7Var;
        ah5 ah5Var;
        float f3;
        m86 m86Var2;
        long k;
        eo2 eo2Var;
        ol7 ol7Var;
        long k2;
        m84 m84Var2 = m84Var;
        m84Var2.getClass();
        yc1 yc1Var = m84Var2.e;
        if (s41Var instanceof j84) {
            j84Var = (j84) s41Var;
            int i2 = j84Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j84Var.e0 = i2 - Integer.MIN_VALUE;
                j84Var2 = j84Var;
                Object obj2 = j84Var2.Z;
                obj = x61.COROUTINE_SUSPENDED;
                i = j84Var2.e0;
                jg7 jg7Var2 = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj2);
                            return jg7Var2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3 = j84Var2.Y;
                    ah5Var = j84Var2.X;
                    m86Var2 = j84Var2.R;
                    oi2.Y(obj2);
                    jg7Var = jg7Var2;
                } else {
                    oi2.Y(obj2);
                    ?? obj3 = new Object();
                    obj3.A = i84Var;
                    long j = i84Var.b;
                    jg7Var = jg7Var2;
                    long j2 = i84Var.a;
                    ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    i84 g = g(m84Var2.g);
                    if (g != null) {
                        long j3 = g.b;
                        long j4 = g.a;
                        ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        obj3.A = ((i84) obj3.A).a(g);
                    }
                    ?? obj4 = new Object();
                    float g2 = m86Var.g(m86Var.e(((i84) obj3.A).a));
                    obj4.A = g2;
                    if (!nj2.f(g2)) {
                        ?? obj5 = new Object();
                        obj5.A = ak7.f(RecyclerView.B1, RecyclerView.B1, 30);
                        m84Var2 = m84Var;
                        eo2 k84Var = new k84(obj4, obj5, obj3, f, m84Var2, f2, m86Var, null);
                        j84Var2.R = m86Var;
                        j84Var2.X = obj4;
                        j84Var2.Y = f2;
                        j84Var2.e0 = 1;
                        if (m84Var2.b(k84Var, j84Var2) != obj) {
                            ah5Var = obj4;
                            f3 = f2;
                            m86Var2 = m86Var;
                        }
                        return obj;
                    }
                    return jg7Var;
                }
                k = qo2.k(((rl7) yc1Var.A).b(Float.MAX_VALUE), ((rl7) yc1Var.B).b(Float.MAX_VALUE));
                if (k == 0) {
                    float d = m86Var2.d(Math.signum(ah5Var.A)) * Math.min(Math.abs(ah5Var.A) / 100.0f, f3) * 1000.0f;
                    if (d == RecyclerView.B1) {
                        k = 0;
                    } else {
                        if (m86Var2.d == lo4.Horizontal) {
                            k2 = qo2.k(d, RecyclerView.B1);
                        } else {
                            k2 = qo2.k(RecyclerView.B1, d);
                        }
                        k = k2;
                    }
                }
                eo2Var = m84Var2.b;
                ol7Var = new ol7(k);
                j84Var2.R = null;
                j84Var2.X = null;
                j84Var2.e0 = 2;
                if (eo2Var.o(ol7Var, j84Var2) != obj) {
                    return obj;
                }
                return jg7Var;
            }
        }
        j84Var = new j84(m84Var2, s41Var);
        j84Var2 = j84Var;
        Object obj22 = j84Var2.Z;
        obj = x61.COROUTINE_SUSPENDED;
        i = j84Var2.e0;
        jg7 jg7Var22 = jg7.a;
        if (i == 0) {
        }
        k = qo2.k(((rl7) yc1Var.A).b(Float.MAX_VALUE), ((rl7) yc1Var.B).b(Float.MAX_VALUE));
        if (k == 0) {
        }
        eo2Var = m84Var2.b;
        ol7Var = new ol7(k);
        j84Var2.R = null;
        j84Var2.X = null;
        j84Var2.e0 = 2;
        if (eo2Var.o(ol7Var, j84Var2) != obj) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(m84 m84Var, dh5 dh5Var, ah5 ah5Var, m86 m86Var, dh5 dh5Var2, long j, s41 s41Var) {
        l84 l84Var;
        int i;
        m86 m86Var2;
        dh5 dh5Var3;
        m84 m84Var2;
        dh5 dh5Var4;
        ah5 ah5Var2;
        i84 i84Var;
        boolean z;
        if (s41Var instanceof l84) {
            l84 l84Var2 = (l84) s41Var;
            int i2 = l84Var2.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l84Var2.f0 = i2 - Integer.MIN_VALUE;
                l84Var = l84Var2;
                Object obj = l84Var.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = l84Var.f0;
                if (i == 0) {
                    if (i == 1) {
                        dh5 dh5Var5 = l84Var.d0;
                        m86 m86Var3 = l84Var.Z;
                        ah5Var2 = l84Var.Y;
                        dh5Var4 = l84Var.X;
                        m84 m84Var3 = l84Var.R;
                        oi2.Y(obj);
                        dh5Var3 = dh5Var5;
                        m86Var2 = m86Var3;
                        m84Var2 = m84Var3;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    ns3 ns3Var = new ns3(m84Var, null, 3);
                    l84Var.R = m84Var;
                    l84Var.X = dh5Var;
                    l84Var.Y = ah5Var;
                    m86Var2 = m86Var;
                    l84Var.Z = m86Var2;
                    dh5Var3 = dh5Var2;
                    l84Var.d0 = dh5Var3;
                    l84Var.f0 = 1;
                    obj = xk2.N(j, ns3Var, l84Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    m84Var2 = m84Var;
                    dh5Var4 = dh5Var;
                    ah5Var2 = ah5Var;
                }
                i84Var = (i84) obj;
                if (i84Var == null) {
                    boolean z2 = ((i84) dh5Var4.A).c;
                    long j2 = i84Var.a;
                    dh5Var4.A = new i84(j2, i84Var.b, z2);
                    ah5Var2.A = m86Var2.i(m86Var2.e(j2));
                    dh5Var3.A = ak7.f(RecyclerView.B1, RecyclerView.B1, 30);
                    yc1 yc1Var = m84Var2.e;
                    long j3 = i84Var.b;
                    long j4 = i84Var.a;
                    ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                    ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                    z = !nj2.f(ah5Var2.A);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        l84Var = new s41(s41Var);
        Object obj2 = l84Var.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = l84Var.f0;
        if (i == 0) {
        }
        i84Var = (i84) obj2;
        if (i84Var == null) {
        }
        return Boolean.valueOf(z);
    }

    public static i84 g(v80 v80Var) {
        i84 i84Var = null;
        rb6 C = qo2.C(new tj2(new h84(v80Var, 0), null, 2));
        while (C.hasNext()) {
            i84 i84Var2 = (i84) C.next();
            if (i84Var != null) {
                i84Var2 = i84Var.a(i84Var2);
            }
            i84Var = i84Var2;
        }
        return i84Var;
    }

    public final float e(k86 k86Var, float f) {
        m86 m86Var = this.a;
        long h = m86Var.h(m86Var.d(f));
        m86 m86Var2 = k86Var.a;
        return m86Var.g(m86Var.e(m86Var2.c(m86Var2.k, h, 1)));
    }

    public final boolean f(oy4 oy4Var) {
        boolean b;
        long P = this.f.P(this.c, oy4Var);
        m86 m86Var = this.a;
        float i = m86Var.i(m86Var.e(P));
        if (i == RecyclerView.B1) {
            b = false;
        } else {
            int i2 = (i > RecyclerView.B1 ? 1 : (i == RecyclerView.B1 ? 0 : -1));
            f86 f86Var = m86Var.a;
            if (i2 > 0) {
                b = f86Var.c();
            } else {
                b = f86Var.b();
            }
        }
        if (b) {
            return !(this.g.c(new i84(P, ((vy4) gt0.H0(oy4Var.a)).b, false)) instanceof fm0);
        }
        return this.d;
    }
}
