package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip3  reason: default package */
/* loaded from: classes.dex */
public final class ip3 implements f86 {
    public static final ap3 w = jx2.z(new ep3(0, (byte) 0), new v83(12));
    public final oe1 a;
    public boolean b;
    public wo3 c;
    public final zo3 d;
    public final vs4 e;
    public final r94 f;
    public float g;
    public final bf1 h;
    public final boolean i;
    public sm3 j;
    public final gp3 k;
    public final sz l;
    public final zp3 m;
    public final p70 n;
    public final pq3 o;
    public final s63 p;
    public final mq3 q;
    public final qa4 r;
    public final qa4 s;
    public final vs4 t;
    public final vs4 u;
    public final ap3 v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oe1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [sz, java.lang.Object] */
    public ip3(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.e = new ua4(new oq3[16]);
        obj.c = -1;
        this.a = obj;
        this.d = new zo3(i, i2, 0);
        this.e = new vs4(kp3.a, vs0.j0);
        this.f = new r94();
        this.h = new bf1(new bg2(this, 4));
        this.i = true;
        this.k = new gp3(this, 0);
        this.l = new Object();
        this.m = new zp3();
        this.n = new p70(1);
        this.o = new pq3(new fp3(this, i, 0));
        this.p = new s63(this, 8);
        this.q = new mq3();
        this.r = np2.E();
        this.s = np2.E();
        Boolean bool = Boolean.FALSE;
        this.t = np2.Y(bool);
        this.u = np2.Y(bool);
        this.v = new ap3(2);
    }

    public static Object j(ip3 ip3Var, int i, hw6 hw6Var) {
        ip3Var.getClass();
        Object d = ip3Var.d(xa4.Default, new a6(ip3Var, i, null, 26), hw6Var);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return jg7.a;
    }

    @Override // defpackage.f86
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.f86
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.l.h(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.h.d(r7, r8, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // defpackage.f86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        hp3 hp3Var;
        int i;
        if (s41Var instanceof hp3) {
            hp3Var = (hp3) s41Var;
            int i2 = hp3Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hp3Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = hp3Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = hp3Var.d0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eo2Var = (eo2) hp3Var.X;
                    xa4Var = hp3Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (this.e.getValue() == kp3.a) {
                        hp3Var.R = xa4Var;
                        hp3Var.X = (hw6) eo2Var;
                        hp3Var.d0 = 1;
                    }
                }
                hp3Var.R = null;
                hp3Var.X = null;
                hp3Var.d0 = 2;
            }
        }
        hp3Var = new hp3(this, s41Var);
        Object obj2 = hp3Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = hp3Var.d0;
        if (i == 0) {
        }
        hp3Var.R = null;
        hp3Var.X = null;
        hp3Var.d0 = 2;
    }

    @Override // defpackage.f86
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(wo3 wo3Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        xo3 xo3Var;
        boolean z4;
        int i3;
        xo3 xo3Var2;
        xo3 xo3Var3;
        List list = wo3Var.m;
        int i4 = wo3Var.p;
        yo3 yo3Var = wo3Var.a;
        int i5 = wo3Var.b;
        this.o.e = list.size();
        Object obj = null;
        qn2 qn2Var = null;
        obj = null;
        boolean z5 = false;
        zo3 zo3Var = this.d;
        ap3 ap3Var = this.v;
        if (!z && this.b) {
            this.c = wo3Var;
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            }
            vl6 N = ln2.N(t);
            try {
                if (((Number) ((uo) ap3Var.L).B.getValue()).floatValue() == RecyclerView.B1) {
                    z5 = true;
                }
                if (!z5 && i5 == zo3Var.c.h() && yo3Var != null && (xo3Var3 = (xo3) fv.E0(yo3Var.b)) != null && xo3Var3.a == zo3Var.b.h()) {
                    ap3Var.w();
                }
                return;
            } finally {
                ln2.V(t, N, qn2Var);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= wo3Var.d;
        this.e.setValue(wo3Var);
        if (yo3Var != null) {
            i = yo3Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i5 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.u.setValue(Boolean.valueOf(z3));
        this.t.setValue(Boolean.valueOf(wo3Var.c));
        if (z2) {
            zo3Var.getClass();
            if (i5 < RecyclerView.B1) {
                s53.c("scrollOffset should be non-negative");
            }
            zo3Var.c.i(i5);
        } else {
            zo3Var.getClass();
            if (yo3Var != null && (xo3Var2 = (xo3) fv.E0(yo3Var.b)) != null) {
                obj = xo3Var2.b;
            }
            zo3Var.e = obj;
            if (zo3Var.d || i4 > 0) {
                zo3Var.d = true;
                if (i5 < RecyclerView.B1) {
                    s53.c("scrollOffset should be non-negative (" + i5 + ')');
                }
                if (yo3Var != null && (xo3Var = (xo3) fv.E0(yo3Var.b)) != null) {
                    i2 = xo3Var.a;
                } else {
                    i2 = 0;
                }
                zo3Var.a(i2, i5);
            }
            if (this.i) {
                oe1 oe1Var = this.a;
                ua4 ua4Var = (ua4) oe1Var.e;
                int i6 = oe1Var.a;
                boolean z6 = oe1Var.b;
                if (i6 != -1 && !list.isEmpty() && i6 != oe1.b(wo3Var, z6)) {
                    oe1Var.a = -1;
                    Object[] objArr = ua4Var.A;
                    int i7 = ua4Var.L;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((oq3) objArr[i8]).cancel();
                    }
                    ua4Var.g();
                }
                int i9 = oe1Var.c;
                if (i9 != -1 && oe1Var.d != RecyclerView.B1 && i9 != i4 && !list.isEmpty()) {
                    if (oe1Var.d < RecyclerView.B1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int b = oe1.b(wo3Var, z4);
                    if (oe1Var.d < RecyclerView.B1) {
                        z5 = true;
                    }
                    if (z5) {
                        i3 = ((xo3) gt0.Q0(list)).a + 1;
                    } else {
                        i3 = ((xo3) gt0.H0(list)).a - 1;
                    }
                    if (i3 >= 0 && i3 < i4 && b != oe1Var.a && b >= 0) {
                        oe1Var.a = b;
                        ua4Var.g();
                        ua4Var.d(ua4Var.L, this.p.B(b));
                    }
                }
                oe1Var.c = i4;
            }
        }
        if (z) {
            ap3Var.y(wo3Var.f, wo3Var.i, wo3Var.h);
        }
    }

    public final int g() {
        return this.d.b.h();
    }

    public final wo3 h() {
        return (wo3) this.e.getValue();
    }

    public final void i(float f, wo3 wo3Var) {
        boolean z;
        int i;
        long j;
        if (this.i) {
            oe1 oe1Var = this.a;
            ua4 ua4Var = (ua4) oe1Var.e;
            List list = wo3Var.m;
            List list2 = wo3Var.m;
            lo4 lo4Var = wo3Var.q;
            if (!list.isEmpty()) {
                int i2 = 0;
                if (f < RecyclerView.B1) {
                    z = true;
                } else {
                    z = false;
                }
                int b = oe1.b(wo3Var, z);
                if (z) {
                    i = ((xo3) gt0.Q0(list2)).a + 1;
                } else {
                    i = ((xo3) gt0.H0(list2)).a - 1;
                }
                if (i >= 0 && i < wo3Var.p) {
                    if (b != oe1Var.a && b >= 0) {
                        if (oe1Var.b != z) {
                            Object[] objArr = ua4Var.A;
                            int i3 = ua4Var.L;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((oq3) objArr[i4]).cancel();
                            }
                        }
                        oe1Var.b = z;
                        oe1Var.a = b;
                        ua4Var.g();
                        ua4Var.d(ua4Var.L, this.p.B(b));
                    }
                    if (z) {
                        xo3 xo3Var = (xo3) gt0.Q0(list2);
                        if (lo4Var == lo4.Vertical) {
                            j = xo3Var.n & 4294967295L;
                        } else {
                            j = xo3Var.n >> 32;
                        }
                        int i5 = (int) j;
                        if (((oi2.O(xo3Var, lo4Var) + i5) + wo3Var.s) - wo3Var.o < (-f)) {
                            Object[] objArr2 = ua4Var.A;
                            int i6 = ua4Var.L;
                            while (i2 < i6) {
                                ((oq3) objArr2[i2]).a();
                                i2++;
                            }
                        }
                    } else if (wo3Var.n - oi2.O((xo3) gt0.H0(list2), lo4Var) < f) {
                        Object[] objArr3 = ua4Var.A;
                        int i7 = ua4Var.L;
                        while (i2 < i7) {
                            ((oq3) objArr3[i2]).a();
                            i2++;
                        }
                    }
                }
            }
            oe1Var.d = f;
        }
    }
}
