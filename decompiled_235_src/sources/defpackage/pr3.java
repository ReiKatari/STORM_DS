package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr3  reason: default package */
/* loaded from: classes.dex */
public final class pr3 implements f86 {
    public static final ap3 y = jx2.z(new ep3(1, (byte) 0), new v83(15));
    public final oe1 a;
    public boolean b;
    public jr3 c;
    public boolean d;
    public final zo3 e;
    public final vs4 f;
    public final r94 g;
    public float h;
    public boolean i;
    public final bf1 j;
    public final boolean k;
    public sm3 l;
    public final gp3 m;
    public final sz n;
    public final zp3 o;
    public final p70 p;
    public final pq3 q;
    public final s63 r;
    public final mq3 s;
    public final qa4 t;
    public final vs4 u;
    public final vs4 v;
    public final qa4 w;
    public final ap3 x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oe1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [sz, java.lang.Object] */
    public pr3(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.c = -1;
        this.a = obj;
        this.e = new zo3(i, i2, 1);
        this.f = new vs4(qr3.a, vs0.j0);
        this.g = new r94();
        this.j = new bf1(new bg2(this, 8));
        this.k = true;
        this.m = new gp3(this, 1);
        this.n = new Object();
        this.o = new zp3();
        this.p = new p70(1);
        this.q = new pq3(new mr3(this, i));
        this.r = new s63(this, 9);
        this.s = new mq3();
        this.t = np2.E();
        Boolean bool = Boolean.FALSE;
        this.u = np2.Y(bool);
        this.v = np2.Y(bool);
        this.w = np2.E();
        this.x = new ap3(2);
    }

    public static Object l(pr3 pr3Var, int i, hw6 hw6Var) {
        pr3Var.getClass();
        Object d = pr3Var.d(xa4.Default, new a6(pr3Var, i, null, 28), hw6Var);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return jg7.a;
    }

    @Override // defpackage.f86
    public final boolean a() {
        return this.j.a();
    }

    @Override // defpackage.f86
    public final boolean b() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.n.h(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.j.d(r7, r8, r0) != r1) goto L11;
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
        or3 or3Var;
        int i;
        if (s41Var instanceof or3) {
            or3Var = (or3) s41Var;
            int i2 = or3Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                or3Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = or3Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = or3Var.d0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eo2Var = (eo2) or3Var.X;
                    xa4Var = or3Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (this.f.getValue() == qr3.a) {
                        or3Var.R = xa4Var;
                        or3Var.X = (hw6) eo2Var;
                        or3Var.d0 = 1;
                    }
                }
                or3Var.R = null;
                or3Var.X = null;
                or3Var.d0 = 2;
            }
        }
        or3Var = new or3(this, s41Var);
        Object obj2 = or3Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = or3Var.d0;
        if (i == 0) {
        }
        or3Var.R = null;
        or3Var.X = null;
        or3Var.d0 = 2;
    }

    @Override // defpackage.f86
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, jg7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, s41 s41Var) {
        nr3 nr3Var;
        int i2;
        try {
            if (s41Var instanceof nr3) {
                nr3Var = (nr3) s41Var;
                int i3 = nr3Var.Y;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nr3Var.Y = i3 - Integer.MIN_VALUE;
                    Object obj = nr3Var.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i2 = nr3Var.Y;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        this.i = true;
                        bw1 bw1Var = new bw1(this, i, null);
                        nr3Var.Y = 1;
                        if (d(xa4.Default, bw1Var, nr3Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    this.i = false;
                    this = jg7.a;
                    return this;
                }
            }
            if (i2 == 0) {
            }
            this.i = false;
            this = jg7.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
        nr3Var = new nr3(this, s41Var);
        Object obj2 = nr3Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = nr3Var.Y;
    }

    public final void g(jr3 jr3Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        float f;
        long j;
        long j2;
        Object obj;
        int i2;
        boolean z4;
        boolean z5;
        List list = jr3Var.k;
        int i3 = jr3Var.n;
        int i4 = jr3Var.b;
        kr3 kr3Var = jr3Var.a;
        this.q.e = list.size();
        ap3 ap3Var = this.x;
        qn2 qn2Var = null;
        zo3 zo3Var = this.e;
        if (!z && this.b) {
            this.c = jr3Var;
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            }
            vl6 N = ln2.N(t);
            try {
                if (((Number) ((uo) ap3Var.L).B.getValue()).floatValue() == RecyclerView.B1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && kr3Var != null && kr3Var.a == zo3Var.b.h() && i4 == zo3Var.c.h()) {
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
        if (kr3Var != null) {
            i = kr3Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i4 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.v.setValue(Boolean.valueOf(z3));
        this.u.setValue(Boolean.valueOf(jr3Var.c));
        this.h -= jr3Var.d;
        this.f.setValue(jr3Var);
        if (z2) {
            zo3Var.getClass();
            if (i4 < RecyclerView.B1) {
                s53.c("scrollOffset should be non-negative");
            }
            zo3Var.c.i(i4);
        } else {
            kr3 kr3Var2 = (kr3) gt0.J0(list);
            kr3 kr3Var3 = (kr3) gt0.R0(list);
            if (kr3Var2 != null) {
                f = 0.0f;
                j = kr3Var2.a;
            } else {
                f = 0.0f;
                j = -1;
            }
            lb4.J(j, "firstVisibleItem:index");
            if (kr3Var3 != null) {
                j2 = kr3Var3.a;
            } else {
                j2 = -1;
            }
            lb4.J(j2, "lastVisibleItem:index");
            zo3Var.getClass();
            if (kr3Var != null) {
                obj = kr3Var.i;
            } else {
                obj = null;
            }
            zo3Var.e = obj;
            if (zo3Var.d || i3 > 0) {
                zo3Var.d = true;
                if (i4 < f) {
                    s53.c("scrollOffset should be non-negative");
                }
                if (kr3Var != null) {
                    i2 = kr3Var.a;
                } else {
                    i2 = 0;
                }
                zo3Var.a(i2, i4);
            }
            if (this.k) {
                oe1 oe1Var = this.a;
                int i5 = oe1Var.a;
                boolean z6 = oe1Var.b;
                if (i5 != -1 && !list.isEmpty() && i5 != oe1.a(jr3Var, z6)) {
                    oe1Var.a = -1;
                    oq3 oq3Var = (oq3) oe1Var.e;
                    if (oq3Var != null) {
                        oq3Var.cancel();
                    }
                    oe1Var.e = null;
                }
                int i6 = oe1Var.c;
                if (i6 != -1 && oe1Var.d != f && i6 != i3 && !list.isEmpty()) {
                    if (oe1Var.d < f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int a = oe1.a(jr3Var, z4);
                    if (a >= 0 && a < i3) {
                        oe1Var.a = a;
                        oe1Var.e = s63.C(this.r, a);
                    }
                }
                oe1Var.c = i3;
            }
        }
        if (z) {
            ap3Var.y(jr3Var.f, jr3Var.i, jr3Var.h);
        }
    }

    public final int h() {
        return this.e.b.h();
    }

    public final int i() {
        return this.e.c.h();
    }

    public final jr3 j() {
        return (jr3) this.f.getValue();
    }

    public final void k(float f, jr3 jr3Var) {
        boolean z;
        oq3 oq3Var;
        oq3 oq3Var2;
        if (this.k) {
            boolean isEmpty = jr3Var.k.isEmpty();
            oe1 oe1Var = this.a;
            if (!isEmpty) {
                if (f < RecyclerView.B1) {
                    z = true;
                } else {
                    z = false;
                }
                int a = oe1.a(jr3Var, z);
                if (a >= 0 && a < jr3Var.n) {
                    if (a != oe1Var.a) {
                        if (oe1Var.b != z) {
                            oe1Var.a = -1;
                            oq3 oq3Var3 = (oq3) oe1Var.e;
                            if (oq3Var3 != null) {
                                oq3Var3.cancel();
                            }
                            oe1Var.e = null;
                        }
                        oe1Var.b = z;
                        oe1Var.a = a;
                        oe1Var.e = s63.C(this.r, a);
                    }
                    List list = jr3Var.k;
                    if (z) {
                        kr3 kr3Var = (kr3) gt0.Q0(list);
                        if (((kr3Var.l + kr3Var.m) + jr3Var.q) - jr3Var.m < (-f) && (oq3Var2 = (oq3) oe1Var.e) != null) {
                            oq3Var2.a();
                        }
                    } else if (jr3Var.l - ((kr3) gt0.H0(list)).l < f && (oq3Var = (oq3) oe1Var.e) != null) {
                        oq3Var.a();
                    }
                }
            }
            oe1Var.d = f;
        }
    }

    public final void m(int i) {
        zo3 zo3Var = this.e;
        if (zo3Var.b.h() != i || zo3Var.c.h() != 0) {
            zp3 zp3Var = this.o;
            zp3Var.g();
            zp3Var.b = null;
        }
        zo3Var.a(i, 0);
        zo3Var.e = null;
        sm3 sm3Var = this.l;
        if (sm3Var != null) {
            sm3Var.k();
        }
    }
}
