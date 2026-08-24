package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nr4 */
/* loaded from: classes.dex */
public abstract class nr4 implements f86 {
    public final qa4 A;
    public final vs4 B;
    public final vs4 C;
    public final vs4 D;
    public final vs4 E;
    public boolean a;
    public cr4 b;
    public final vs4 c;
    public final er4 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final bf1 k;
    public final boolean l;
    public final vs4 m;
    public qh1 n;
    public int o;
    public final r94 p;
    public final ss4 q;
    public final ss4 r;
    public final pq3 s;
    public final uq4 t;
    public final p70 u;
    public final sz v;
    public final vs4 w;
    public final gp3 x;
    public final mq3 y;
    public final qa4 z;

    /* JADX WARN: Type inference failed for: r6v4, types: [sz, java.lang.Object] */
    public nr4(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            s53.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = np2.Y(new jk4(0L));
        this.d = new er4(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new bf1(new qn2(this) { // from class: ir4
            public final /* synthetic */ nr4 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // defpackage.qn2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object g(Object obj) {
                ?? r0;
                cr4 cr4Var;
                boolean z;
                int i2 = r2;
                jg7 jg7Var = jg7.a;
                cr4 cr4Var2 = null;
                qn2 qn2Var = null;
                nr4 nr4Var = this.B;
                switch (i2) {
                    case 0:
                        ?? r15 = (Float) obj;
                        float floatValue = r15.floatValue();
                        long r = ii2.r(nr4Var);
                        float f2 = nr4Var.i + floatValue;
                        long F = u24.F(f2);
                        nr4Var.i = f2 - ((float) F);
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = r + F;
                            long s = gi2.s(j, nr4Var.h, nr4Var.g);
                            boolean z2 = false;
                            if (j != s) {
                                r0 = true;
                            } else {
                                r0 = false;
                            }
                            long j2 = s - r;
                            float f3 = (float) j2;
                            nr4Var.j = f3;
                            int i3 = (Math.abs(j2) > 0L ? 1 : (Math.abs(j2) == 0L ? 0 : -1));
                            float f4 = RecyclerView.B1;
                            if (i3 != 0) {
                                vs4 vs4Var = nr4Var.D;
                                if (f3 > RecyclerView.B1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                vs4Var.setValue(Boolean.valueOf(z));
                                vs4 vs4Var2 = nr4Var.E;
                                if (f3 < RecyclerView.B1) {
                                    z2 = true;
                                }
                                vs4Var2.setValue(Boolean.valueOf(z2));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            cr4 d2 = ((cr4) nr4Var.m.getValue()).d(i5);
                            if (d2 != null && (cr4Var = nr4Var.b) != null) {
                                cr4 d3 = cr4Var.d(i5);
                                if (d3 != null) {
                                    nr4Var.b = d3;
                                }
                                if (cr4Var2 == null) {
                                    nr4Var.h(cr4Var2, nr4Var.a, true);
                                    nr4Var.z.setValue(jg7Var);
                                } else {
                                    er4 er4Var = nr4Var.d;
                                    nr4 nr4Var2 = er4Var.a;
                                    rs4 rs4Var = er4Var.c;
                                    if (nr4Var2.p() != 0) {
                                        f4 = i4 / nr4Var2.p();
                                    }
                                    rs4Var.i(rs4Var.h() + f4);
                                    sm3 sm3Var = (sm3) nr4Var.w.getValue();
                                    if (sm3Var != null) {
                                        sm3Var.k();
                                    }
                                }
                                if (r0 != false) {
                                    r15 = Long.valueOf(j2);
                                }
                                floatValue = r15.floatValue();
                            }
                            cr4Var2 = d2;
                            if (cr4Var2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r15.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        nq3 nq3Var = (nq3) obj;
                        vl6 t = ln2.t();
                        if (t != null) {
                            qn2Var = t.e();
                        }
                        vl6 N = ln2.N(t);
                        try {
                            nq3Var.a(nr4Var.e);
                            return jg7Var;
                        } finally {
                            ln2.V(t, N, qn2Var);
                        }
                }
            }
        });
        this.l = true;
        this.m = new vs4(pr4.b, vs0.j0);
        this.n = pr4.a;
        this.p = new r94();
        this.q = new ss4(-1);
        this.r = new ss4(i);
        xd5 xd5Var = xd5.s0;
        np2.J(new jr4(this, 0), xd5Var);
        np2.J(new jr4(this, 1), xd5Var);
        pq3 pq3Var = new pq3(new qn2(this) { // from class: ir4
            public final /* synthetic */ nr4 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // defpackage.qn2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object g(Object obj) {
                ?? r0;
                cr4 cr4Var;
                boolean z;
                int i2 = r2;
                jg7 jg7Var = jg7.a;
                cr4 cr4Var2 = null;
                qn2 qn2Var = null;
                nr4 nr4Var = this.B;
                switch (i2) {
                    case 0:
                        ?? r15 = (Float) obj;
                        float floatValue = r15.floatValue();
                        long r = ii2.r(nr4Var);
                        float f2 = nr4Var.i + floatValue;
                        long F = u24.F(f2);
                        nr4Var.i = f2 - ((float) F);
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = r + F;
                            long s = gi2.s(j, nr4Var.h, nr4Var.g);
                            boolean z2 = false;
                            if (j != s) {
                                r0 = true;
                            } else {
                                r0 = false;
                            }
                            long j2 = s - r;
                            float f3 = (float) j2;
                            nr4Var.j = f3;
                            int i3 = (Math.abs(j2) > 0L ? 1 : (Math.abs(j2) == 0L ? 0 : -1));
                            float f4 = RecyclerView.B1;
                            if (i3 != 0) {
                                vs4 vs4Var = nr4Var.D;
                                if (f3 > RecyclerView.B1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                vs4Var.setValue(Boolean.valueOf(z));
                                vs4 vs4Var2 = nr4Var.E;
                                if (f3 < RecyclerView.B1) {
                                    z2 = true;
                                }
                                vs4Var2.setValue(Boolean.valueOf(z2));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            cr4 d2 = ((cr4) nr4Var.m.getValue()).d(i5);
                            if (d2 != null && (cr4Var = nr4Var.b) != null) {
                                cr4 d3 = cr4Var.d(i5);
                                if (d3 != null) {
                                    nr4Var.b = d3;
                                }
                                if (cr4Var2 == null) {
                                    nr4Var.h(cr4Var2, nr4Var.a, true);
                                    nr4Var.z.setValue(jg7Var);
                                } else {
                                    er4 er4Var = nr4Var.d;
                                    nr4 nr4Var2 = er4Var.a;
                                    rs4 rs4Var = er4Var.c;
                                    if (nr4Var2.p() != 0) {
                                        f4 = i4 / nr4Var2.p();
                                    }
                                    rs4Var.i(rs4Var.h() + f4);
                                    sm3 sm3Var = (sm3) nr4Var.w.getValue();
                                    if (sm3Var != null) {
                                        sm3Var.k();
                                    }
                                }
                                if (r0 != false) {
                                    r15 = Long.valueOf(j2);
                                }
                                floatValue = r15.floatValue();
                            }
                            cr4Var2 = d2;
                            if (cr4Var2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r15.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        nq3 nq3Var = (nq3) obj;
                        vl6 t = ln2.t();
                        if (t != null) {
                            qn2Var = t.e();
                        }
                        vl6 N = ln2.N(t);
                        try {
                            nq3Var.a(nr4Var.e);
                            return jg7Var;
                        } finally {
                            ln2.V(t, N, qn2Var);
                        }
                }
            }
        });
        this.s = pq3Var;
        this.t = new uq4(new s63(this, 25), pq3Var, new jr4(this, 2));
        this.u = new p70(1);
        this.v = new Object();
        this.w = np2.Y(null);
        this.x = new gp3(this, 2);
        s21.b(0, 0, 0, 0, 15);
        this.y = new mq3();
        this.z = np2.E();
        this.A = np2.E();
        Boolean bool = Boolean.FALSE;
        this.B = np2.Y(bool);
        this.C = np2.Y(bool);
        this.D = np2.Y(bool);
        this.E = np2.Y(bool);
    }

    public static /* synthetic */ Object g(ue1 ue1Var, int i, hw6 hw6Var) {
        return ue1Var.f(i, ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7), hw6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0052, code lost:
        if (r6.i(r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
        if (r9.d(r7, r8, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0076, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(nr4 nr4Var, xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        mr4 mr4Var;
        int i;
        if (s41Var instanceof mr4) {
            mr4Var = (mr4) s41Var;
            int i2 = mr4Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mr4Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj = mr4Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = mr4Var.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            nr4Var = mr4Var.R;
                            oi2.Y(obj);
                            nr4Var.q.i(-1);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eo2Var = (eo2) mr4Var.Y;
                    xa4Var = mr4Var.X;
                    nr4Var = mr4Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    mr4Var.R = nr4Var;
                    mr4Var.X = xa4Var;
                    mr4Var.Y = (hw6) eo2Var;
                    mr4Var.e0 = 1;
                }
                if (!nr4Var.k.a()) {
                    nr4Var.r.i(nr4Var.k());
                }
                bf1 bf1Var = nr4Var.k;
                mr4Var.R = nr4Var;
                mr4Var.X = null;
                mr4Var.Y = null;
                mr4Var.e0 = 2;
            }
        }
        mr4Var = new mr4(nr4Var, s41Var);
        Object obj2 = mr4Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mr4Var.e0;
        if (i == 0) {
        }
        if (!nr4Var.k.a()) {
        }
        bf1 bf1Var2 = nr4Var.k;
        mr4Var.R = nr4Var;
        mr4Var.X = null;
        mr4Var.Y = null;
        mr4Var.e0 = 2;
    }

    @Override // defpackage.f86
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.f86
    public final boolean b() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final boolean c() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final Object d(xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        return s(this, xa4Var, eo2Var, s41Var);
    }

    @Override // defpackage.f86
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, io6 io6Var, s41 s41Var) {
        kr4 kr4Var;
        kr4 kr4Var2;
        Object obj;
        int i2;
        int i3;
        float f;
        io6 io6Var2;
        eo2 lr4Var;
        if (s41Var instanceof kr4) {
            kr4Var = (kr4) s41Var;
            int i4 = kr4Var.d0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kr4Var.d0 = i4 - Integer.MIN_VALUE;
                kr4Var2 = kr4Var;
                Object obj2 = kr4Var2.Y;
                obj = x61.COROUTINE_SUSPENDED;
                i2 = kr4Var2.d0;
                jg7 jg7Var = jg7.a;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj2);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = kr4Var2.R;
                    io6 io6Var3 = kr4Var2.X;
                    oi2.Y(obj2);
                    f = 0.0f;
                    io6Var2 = io6Var3;
                } else {
                    oi2.Y(obj2);
                    if ((i != k() || l() != RecyclerView.B1) && n() != 0) {
                        kr4Var2.X = io6Var;
                        kr4Var2.R = i;
                        kr4Var2.d0 = 1;
                        if (i(kr4Var2) != obj) {
                            i3 = i;
                            f = 0.0f;
                            io6Var2 = io6Var;
                        }
                        return obj;
                    }
                    return jg7Var;
                }
                lr4Var = new lr4(this, j(i3), p() * f, io6Var2, null);
                kr4Var2.X = null;
                kr4Var2.d0 = 2;
                if (d(xa4.Default, lr4Var, kr4Var2) != obj) {
                    return obj;
                }
                return jg7Var;
            }
        }
        kr4Var = new kr4(this, s41Var);
        kr4Var2 = kr4Var;
        Object obj22 = kr4Var2.Y;
        obj = x61.COROUTINE_SUSPENDED;
        i2 = kr4Var2.d0;
        jg7 jg7Var2 = jg7.a;
        if (i2 == 0) {
        }
        lr4Var = new lr4(this, j(i3), p() * f, io6Var2, null);
        kr4Var2.X = null;
        kr4Var2.d0 = 2;
        if (d(xa4.Default, lr4Var, kr4Var2) != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:0x0330, code lost:
        if (r() == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v12, types: [xa0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(cr4 cr4Var, boolean z, boolean z2) {
        Object obj;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        int i3;
        float f;
        int i4;
        Object obj2;
        boolean z7;
        xa0 xa0Var;
        xa0 xa0Var2;
        List list;
        int w;
        int i5;
        int i6;
        boolean z8;
        vl6 t;
        long e;
        long q;
        long j;
        List list2 = cr4Var.a;
        int i7 = cr4Var.l;
        i34 i34Var = cr4Var.i;
        i34 i34Var2 = cr4Var.j;
        float f2 = cr4Var.k;
        this.s.e = list2.size();
        this.o = cr4Var.b + cr4Var.c;
        if (!z && this.a) {
            this.b = cr4Var;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.a = true;
        }
        uq4 uq4Var = this.t;
        boolean z10 = this.l;
        qn2 qn2Var = null;
        er4 er4Var = this.d;
        if (z2) {
            er4Var.c.i(f2);
        } else {
            er4Var.getClass();
            if (i34Var2 != null) {
                obj = i34Var2.d;
            } else {
                obj = null;
            }
            er4Var.e = obj;
            if (er4Var.d || !list2.isEmpty()) {
                er4Var.d = true;
                if (i34Var2 != null) {
                    i = i34Var2.a;
                } else {
                    i = 0;
                }
                er4Var.b.i(i);
                er4Var.f.a(i);
                er4Var.c.i(f2);
            }
            if (z10) {
                m44 m44Var = uq4Var.o;
                p94 p94Var = uq4Var.e;
                m44Var.L = cr4Var;
                m44Var.R = uq4Var.n;
                s63 s63Var = uq4Var.a;
                int i8 = uq4Var.g;
                int i9 = -1;
                float f3 = RecyclerView.B1;
                if (i8 != -1 && i8 != m44Var.w()) {
                    uq4Var.l = true;
                    if (m44Var.o()) {
                        int i10 = uq4Var.h;
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        uq4Var.h = i10;
                        if (m44Var.q().a.isEmpty()) {
                            w = -1;
                        } else {
                            w = m44Var.w() - 1;
                        }
                        if (w != -1) {
                            int i11 = uq4Var.i;
                            if (i11 <= w) {
                                w = i11;
                            }
                            uq4Var.i = w;
                        }
                        if (uq4Var.f <= RecyclerView.B1) {
                            uq4Var.f(m44Var.p(), uq4Var.m - 1);
                        } else {
                            uq4Var.f(0, m44Var.m());
                        }
                    }
                }
                uq4Var.m = m44Var.w();
                if (m44Var.o()) {
                    int size = m44Var.q().r.size() + m44Var.q().a.size() + m44Var.q().q.size();
                    int i12 = 0;
                    while (i12 < size) {
                        int size2 = m44Var.q().q.size();
                        int size3 = m44Var.q().a.size();
                        if (i12 < size2) {
                            i4 = ((i34) m44Var.q().q.get(i12)).a;
                            f = f3;
                        } else {
                            f = f3;
                            if (i12 >= size2 && i12 < size2 + size3) {
                                i4 = ((i34) m44Var.q().a.get(i12 - size2)).a;
                            } else if (i12 >= size2 + size3) {
                                i4 = ((i34) m44Var.q().r.get((i12 - size2) - size3)).a;
                            } else {
                                i4 = i9;
                            }
                        }
                        int size4 = m44Var.q().q.size();
                        int size5 = m44Var.q().a.size();
                        if (i12 < size4) {
                            obj2 = ((i34) m44Var.q().q.get(i12)).d;
                        } else if (i12 >= size4 && i12 < size4 + size5) {
                            obj2 = ((i34) m44Var.q().a.get(i12 - size4)).d;
                        } else if (i12 >= size4 + size5) {
                            obj2 = ((i34) m44Var.q().r.get((i12 - size4) - size5)).d;
                        } else {
                            obj2 = xa0.c;
                        }
                        int i13 = m44Var.q().b;
                        if (i4 != i9) {
                            if (p94Var.a(i4)) {
                                Object b = p94Var.b(i4);
                                b.getClass();
                                int i14 = ((xa0) b).b;
                                Object b2 = p94Var.b(i4);
                                b2.getClass();
                                Object obj3 = ((xa0) b2).a;
                                if (i14 != i13 || !nb3.k(obj3, obj2)) {
                                    z7 = true;
                                    uq4Var.l = true;
                                    xa0Var = (xa0) p94Var.b(i4);
                                    if (xa0Var == null) {
                                        xa0Var.b = i13;
                                        xa0Var.a = obj2;
                                        xa0Var2 = xa0Var;
                                    } else {
                                        ?? obj4 = new Object();
                                        obj4.a = obj2;
                                        obj4.b = i13;
                                        xa0Var2 = obj4;
                                    }
                                    p94Var.i(i4, xa0Var2);
                                    uq4Var.h = Math.min(uq4Var.h, i4);
                                    uq4Var.i = Math.max(uq4Var.i, i4);
                                    list = (List) uq4Var.b.g(i4);
                                    if (list == null) {
                                        int size6 = list.size();
                                        for (int i15 = 0; i15 < size6; i15++) {
                                            ((oq3) list.get(i15)).cancel();
                                        }
                                    }
                                }
                            }
                            z7 = true;
                            xa0Var = (xa0) p94Var.b(i4);
                            if (xa0Var == null) {
                            }
                            p94Var.i(i4, xa0Var2);
                            uq4Var.h = Math.min(uq4Var.h, i4);
                            uq4Var.i = Math.max(uq4Var.i, i4);
                            list = (List) uq4Var.b.g(i4);
                            if (list == null) {
                            }
                        } else {
                            z7 = true;
                        }
                        i12++;
                        f3 = f;
                        z9 = z7;
                        i9 = -1;
                    }
                    boolean z11 = z9;
                    float f4 = f3;
                    if (uq4Var.l) {
                        if (uq4Var.f <= f4) {
                            z5 = z11;
                        } else {
                            z5 = false;
                        }
                        if (m44Var.o()) {
                            gi2.G(m44Var.q());
                            if (m44Var.q().t != null) {
                                i3 = ((nr4) s63Var.B).o;
                            } else {
                                i3 = 0;
                            }
                            z4 = z11;
                            int i16 = i3;
                            z3 = z10;
                            z6 = false;
                            uq4Var.d(m44Var, m44Var.m(), m44Var.p(), i16, m44Var.r(), m44Var.s(), RecyclerView.B1, z5);
                        } else {
                            z3 = z10;
                            z4 = z11;
                            z6 = false;
                        }
                        uq4Var.l = z6;
                        i2 = z6;
                    } else {
                        z3 = z10;
                        z4 = z11;
                        i2 = 0;
                    }
                } else {
                    z3 = z10;
                    z4 = true;
                    i2 = 0;
                    uq4Var.g();
                }
                uq4Var.g = m44Var.w();
                i5 = i2;
                this.m.setValue(cr4Var);
                this.B.setValue(Boolean.valueOf(cr4Var.m));
                if (i34Var == null) {
                    i6 = i34Var.a;
                } else {
                    i6 = i5;
                }
                if (i6 != 0 && i7 == 0) {
                    z8 = i5;
                } else {
                    z8 = z4;
                }
                this.C.setValue(Boolean.valueOf(z8));
                if (i34Var != null) {
                    this.e = i34Var.a;
                }
                this.f = i7;
                t = ln2.t();
                if (t != null) {
                    qn2Var = t.e();
                }
                qn2 qn2Var2 = qn2Var;
                vl6 N = ln2.N(t);
                if (z3) {
                    try {
                        if (cr4Var.h < n() && Math.abs(this.j) > 0.5f) {
                            float f5 = this.j;
                            if (m().e == lo4.Vertical) {
                                if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) {
                                    uq4Var.e(this.j, cr4Var);
                                }
                            } else if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) {
                                uq4Var.e(this.j, cr4Var);
                            }
                        }
                    } finally {
                        ln2.V(t, N, qn2Var2);
                    }
                }
                this.g = pr4.a(cr4Var, n());
                n();
                if (cr4Var.e != lo4.Horizontal) {
                    e = cr4Var.e() >> 32;
                } else {
                    e = cr4Var.e() & 4294967295L;
                }
                int i17 = (int) e;
                cr4Var.n.getClass();
                q = gi2.q(i5, i5, i17);
                j = this.g;
                if (q > j) {
                    q = j;
                }
                this.h = q;
            }
        }
        z4 = true;
        z3 = z10;
        i5 = 0;
        this.m.setValue(cr4Var);
        this.B.setValue(Boolean.valueOf(cr4Var.m));
        if (i34Var == null) {
        }
        if (i6 != 0) {
        }
        z8 = z4;
        this.C.setValue(Boolean.valueOf(z8));
        if (i34Var != null) {
        }
        this.f = i7;
        t = ln2.t();
        if (t != null) {
        }
        qn2 qn2Var22 = qn2Var;
        vl6 N2 = ln2.N(t);
        if (z3) {
        }
        this.g = pr4.a(cr4Var, n());
        n();
        if (cr4Var.e != lo4.Horizontal) {
        }
        int i172 = (int) e;
        cr4Var.n.getClass();
        q = gi2.q(i5, i5, i172);
        j = this.g;
        if (q > j) {
        }
        this.h = q;
    }

    public final Object i(s41 s41Var) {
        Object h;
        if (this.m.getValue() == pr4.b && (h = this.v.h(s41Var)) == x61.COROUTINE_SUSPENDED) {
            return h;
        }
        return jg7.a;
    }

    public final int j(int i) {
        if (n() <= 0) {
            return 0;
        }
        return gi2.q(i, 0, n() - 1);
    }

    public final int k() {
        return this.d.b.h();
    }

    public final float l() {
        return this.d.c.h();
    }

    public final cr4 m() {
        return (cr4) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((cr4) this.m.getValue()).b;
    }

    public final int p() {
        return ((cr4) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((jk4) this.c.getValue()).a;
    }

    public final boolean r() {
        if (((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void t(float f, int i, boolean z) {
        er4 er4Var = this.d;
        ss4 ss4Var = er4Var.b;
        rs4 rs4Var = er4Var.c;
        if (ss4Var.h() != i || rs4Var.h() != f) {
            this.t.g();
        }
        er4Var.b.i(i);
        er4Var.f.a(i);
        rs4Var.i(f);
        er4Var.e = null;
        if (z) {
            sm3 sm3Var = (sm3) this.w.getValue();
            if (sm3Var != null) {
                sm3Var.k();
                return;
            }
            return;
        }
        this.A.setValue(jg7.a);
    }
}
