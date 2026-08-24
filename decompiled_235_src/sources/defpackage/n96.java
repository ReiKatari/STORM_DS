package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n96  reason: default package */
/* loaded from: classes.dex */
public final class n96 extends gx0 {
    public static final wo s = new wo(RecyclerView.B1);
    public static final wo t = new wo(1.0f);
    public final vs4 b;
    public final vs4 c;
    public Object d;
    public ga7 e;
    public long f;
    public final t46 g;
    public qm6 h;
    public final rs4 i;
    public rj0 j;
    public final hb4 k;
    public final eb4 l;
    public long m;
    public final ca4 n;
    public g96 o;
    public final f96 p;
    public float q;
    public final f96 r;

    /* JADX WARN: Type inference failed for: r3v6, types: [f96] */
    /* JADX WARN: Type inference failed for: r3v7, types: [f96] */
    public n96(sb4 sb4Var) {
        super(3);
        this.b = np2.Y(sb4Var);
        this.c = np2.Y(sb4Var);
        this.d = sb4Var;
        this.g = new t46(this, 4);
        this.i = new rs4(RecyclerView.B1);
        this.k = new hb4();
        this.l = new eb4();
        this.m = Long.MIN_VALUE;
        this.n = new ca4();
        this.p = new qn2(this) { // from class: f96
            public final /* synthetic */ n96 B;

            {
                this.B = this;
            }

            @Override // defpackage.qn2
            public final Object g(Object obj) {
                int i = r2;
                jg7 jg7Var = jg7.a;
                n96 n96Var = this.B;
                long longValue = ((Long) obj).longValue();
                switch (i) {
                    case 0:
                        n96Var.m = longValue;
                        return jg7Var;
                    default:
                        n96Var.m = longValue;
                        long F = u24.F((longValue - n96Var.m) / n96Var.q);
                        ca4 ca4Var = n96Var.n;
                        if (ca4Var.i()) {
                            Object[] objArr = ca4Var.a;
                            int i2 = ca4Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                g96 g96Var = (g96) objArr[i4];
                                n96.u(g96Var, F);
                                g96Var.c = true;
                            }
                            ga7 ga7Var = n96Var.e;
                            if (ga7Var != null) {
                                ga7Var.o();
                            }
                            int i5 = ca4Var.b;
                            Object[] objArr2 = ca4Var.a;
                            l93 R = gi2.R(0, i5);
                            int i6 = R.A;
                            int i7 = R.B;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((g96) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            fv.z0(i5 - i3, i5, null, objArr2);
                            ca4Var.b -= i3;
                        }
                        g96 g96Var2 = n96Var.o;
                        if (g96Var2 != null) {
                            g96Var2.g = n96Var.f;
                            n96.u(g96Var2, F);
                            n96Var.x(g96Var2.d);
                            if (g96Var2.d == 1.0f) {
                                n96Var.o = null;
                            }
                            n96Var.w();
                        }
                        return jg7Var;
                }
            }
        };
        this.r = new qn2(this) { // from class: f96
            public final /* synthetic */ n96 B;

            {
                this.B = this;
            }

            @Override // defpackage.qn2
            public final Object g(Object obj) {
                int i = r2;
                jg7 jg7Var = jg7.a;
                n96 n96Var = this.B;
                long longValue = ((Long) obj).longValue();
                switch (i) {
                    case 0:
                        n96Var.m = longValue;
                        return jg7Var;
                    default:
                        n96Var.m = longValue;
                        long F = u24.F((longValue - n96Var.m) / n96Var.q);
                        ca4 ca4Var = n96Var.n;
                        if (ca4Var.i()) {
                            Object[] objArr = ca4Var.a;
                            int i2 = ca4Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                g96 g96Var = (g96) objArr[i4];
                                n96.u(g96Var, F);
                                g96Var.c = true;
                            }
                            ga7 ga7Var = n96Var.e;
                            if (ga7Var != null) {
                                ga7Var.o();
                            }
                            int i5 = ca4Var.b;
                            Object[] objArr2 = ca4Var.a;
                            l93 R = gi2.R(0, i5);
                            int i6 = R.A;
                            int i7 = R.B;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((g96) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            fv.z0(i5 - i3, i5, null, objArr2);
                            ca4Var.b -= i3;
                        }
                        g96 g96Var2 = n96Var.o;
                        if (g96Var2 != null) {
                            g96Var2.g = n96Var.f;
                            n96.u(g96Var2, F);
                            n96Var.x(g96Var2.d);
                            if (g96Var2.d == 1.0f) {
                                n96Var.o = null;
                            }
                            n96Var.w();
                        }
                        return jg7Var;
                }
            }
        };
    }

    public static final void o(n96 n96Var) {
        rs4 rs4Var = n96Var.i;
        ga7 ga7Var = n96Var.e;
        if (ga7Var == null) {
            return;
        }
        g96 g96Var = n96Var.o;
        if (g96Var == null) {
            if (n96Var.f > 0 && rs4Var.h() != 1.0f && !nb3.k(n96Var.c.getValue(), n96Var.b.getValue())) {
                g96Var = new g96();
                g96Var.d = rs4Var.h();
                long j = n96Var.f;
                g96Var.g = j;
                g96Var.h = u24.F((1.0d - rs4Var.h()) * j);
                g96Var.e.e(0, rs4Var.h());
            } else {
                g96Var = null;
            }
        }
        if (g96Var != null) {
            g96Var.g = n96Var.f;
            n96Var.n.a(g96Var);
            ga7Var.m(g96Var);
        }
        n96Var.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(n96 n96Var, s41 s41Var) {
        i96 i96Var;
        Object obj;
        int i;
        ca4 ca4Var = n96Var.n;
        if (s41Var instanceof i96) {
            i96Var = (i96) s41Var;
            int i2 = i96Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i96Var.Y = i2 - Integer.MIN_VALUE;
                l61 l61Var = i96Var.B;
                Object obj2 = i96Var.R;
                obj = x61.COROUTINE_SUSPENDED;
                i = i96Var.Y;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj2);
                } else {
                    oi2.Y(obj2);
                    if (ca4Var.h() && n96Var.o == null) {
                        return jg7Var;
                    }
                    l61Var.getClass();
                    if (kj2.y(l61Var) == RecyclerView.B1) {
                        n96Var.t();
                        n96Var.m = Long.MIN_VALUE;
                        return jg7Var;
                    } else if (n96Var.m == Long.MIN_VALUE) {
                        f96 f96Var = n96Var.p;
                        i96Var.Y = 1;
                        l61Var.getClass();
                        if (ii2.x(l61Var).a(f96Var, i96Var) == obj) {
                            return obj;
                        }
                    }
                }
                do {
                    if (ca4Var.i() && n96Var.o == null) {
                        n96Var.m = Long.MIN_VALUE;
                        return jg7Var;
                    }
                    i96Var.Y = 2;
                } while (n96Var.s(i96Var) != obj);
                return obj;
            }
        }
        i96Var = new i96(n96Var, s41Var);
        l61 l61Var2 = i96Var.B;
        Object obj22 = i96Var.R;
        obj = x61.COROUTINE_SUSPENDED;
        i = i96Var.Y;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        do {
            if (ca4Var.i()) {
            }
            i96Var.Y = 2;
        } while (n96Var.s(i96Var) != obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.e(r1) == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(n96 n96Var, s41 s41Var) {
        l96 l96Var;
        x61 x61Var;
        int i;
        Object value;
        Object s2;
        Object obj;
        hb4 hb4Var = n96Var.k;
        if (s41Var instanceof l96) {
            l96Var = (l96) s41Var;
            int i2 = l96Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l96Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = l96Var.X;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = l96Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj = l96Var.R;
                            oi2.Y(obj2);
                            if (!nb3.k(obj2, obj)) {
                                return jg7.a;
                            }
                            n96Var.m = Long.MIN_VALUE;
                            throw new CancellationException("targetState while waiting for composition");
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = l96Var.R;
                    oi2.Y(obj2);
                    value = obj3;
                } else {
                    oi2.Y(obj2);
                    value = n96Var.b.getValue();
                    l96Var.R = value;
                    l96Var.Z = 1;
                }
                l96Var.R = value;
                l96Var.Z = 2;
                rj0 rj0Var = new rj0(1, np2.V(l96Var));
                rj0Var.v();
                n96Var.j = rj0Var;
                hb4Var.h(null);
                s2 = rj0Var.s();
                if (s2 != x61Var) {
                    obj = value;
                    obj2 = s2;
                    if (!nb3.k(obj2, obj)) {
                    }
                }
                return x61Var;
            }
        }
        l96Var = new l96(n96Var, s41Var);
        Object obj22 = l96Var.X;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = l96Var.Z;
        if (i == 0) {
        }
        l96Var.R = value;
        l96Var.Z = 2;
        rj0 rj0Var2 = new rj0(1, np2.V(l96Var));
        rj0Var2.v();
        n96Var.j = rj0Var2;
        hb4Var.h(null);
        s2 = rj0Var2.s();
        if (s2 != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.e(r1) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(n96 n96Var, s41 s41Var) {
        m96 m96Var;
        int i;
        Object value;
        Object obj;
        hb4 hb4Var = n96Var.k;
        if (s41Var instanceof m96) {
            m96Var = (m96) s41Var;
            int i2 = m96Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m96Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = m96Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = m96Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            obj = m96Var.R;
                            oi2.Y(obj2);
                            if (!nb3.k(obj2, obj)) {
                                n96Var.m = Long.MIN_VALUE;
                                throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                            }
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = m96Var.R;
                    oi2.Y(obj2);
                    value = obj3;
                } else {
                    oi2.Y(obj2);
                    value = n96Var.b.getValue();
                    m96Var.R = value;
                    m96Var.Z = 1;
                }
                if (!nb3.k(value, n96Var.d)) {
                    hb4Var.h(null);
                    return jg7.a;
                }
                m96Var.R = value;
                m96Var.Z = 2;
                rj0 rj0Var = new rj0(1, np2.V(m96Var));
                rj0Var.v();
                n96Var.j = rj0Var;
                hb4Var.h(null);
                Object s2 = rj0Var.s();
                if (s2 != x61Var) {
                    obj = value;
                    obj2 = s2;
                    if (!nb3.k(obj2, obj)) {
                    }
                    return jg7.a;
                }
                return x61Var;
            }
        }
        m96Var = new m96(n96Var, s41Var);
        Object obj22 = m96Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = m96Var.Z;
        if (i == 0) {
        }
        if (!nb3.k(value, n96Var.d)) {
        }
    }

    public static void u(g96 g96Var, long j) {
        long j2 = g96Var.a + j;
        g96Var.a = j2;
        long j3 = g96Var.h;
        if (j2 >= j3) {
            g96Var.d = 1.0f;
            return;
        }
        ll7 ll7Var = g96Var.b;
        wo woVar = g96Var.e;
        if (ll7Var != null) {
            wo woVar2 = g96Var.f;
            if (woVar2 == null) {
                woVar2 = s;
            }
            g96Var.d = gi2.p(((wo) ll7Var.q(j2, woVar, t, woVar2)).a(0), RecyclerView.B1, 1.0f);
            return;
        }
        float f = ((float) j2) / ((float) j3);
        float f2 = 1.0f - f;
        g96Var.d = (f * 1.0f) + (f2 * woVar.a(0));
    }

    @Override // defpackage.gx0
    public final Object f() {
        return this.c.getValue();
    }

    @Override // defpackage.gx0
    public final Object h() {
        return this.b.getValue();
    }

    @Override // defpackage.gx0
    public final void l(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.gx0
    public final void m(ga7 ga7Var) {
        ga7 ga7Var2 = this.e;
        if (ga7Var2 != null && ga7Var != ga7Var2) {
            t05.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + ga7Var);
        }
        this.e = ga7Var;
    }

    @Override // defpackage.gx0
    public final void n() {
        this.e = null;
        qm6 qm6Var = this.h;
        if (qm6Var != null) {
            qm6Var.b(this);
        }
    }

    public final Object s(s41 s41Var) {
        float y = kj2.y(s41Var.b());
        int i = (y > RecyclerView.B1 ? 1 : (y == RecyclerView.B1 ? 0 : -1));
        jg7 jg7Var = jg7.a;
        if (i <= 0) {
            t();
            return jg7Var;
        }
        this.q = y;
        Object a = ii2.x(s41Var.b()).a(this.r, s41Var);
        if (a == x61.COROUTINE_SUSPENDED) {
            return a;
        }
        return jg7Var;
    }

    public final void t() {
        ga7 ga7Var = this.e;
        if (ga7Var != null) {
            ga7Var.c();
        }
        this.n.d();
        if (this.o != null) {
            this.o = null;
            x(1.0f);
            w();
        }
    }

    public final Object v(float f, Object obj, hw6 hw6Var) {
        if (RecyclerView.B1 > f || f > 1.0f) {
            t05.a("Expecting fraction between 0 and 1. Got " + f);
        }
        ga7 ga7Var = this.e;
        if (ga7Var != null) {
            Object a = eb4.a(this.l, new k96(obj, this.b.getValue(), this, ga7Var, f, null), hw6Var);
            if (a == x61.COROUTINE_SUSPENDED) {
                return a;
            }
        }
        return jg7.a;
    }

    public final void w() {
        ga7 ga7Var = this.e;
        if (ga7Var == null) {
            return;
        }
        ga7Var.l(u24.F(this.i.h() * ((Number) ga7Var.l.getValue()).longValue()));
    }

    public final void x(float f) {
        this.i.i(f);
    }

    public final void y(qm6 qm6Var) {
        h61 h61Var;
        if (!nb3.k(this.h, qm6Var)) {
            qm6 qm6Var2 = this.h;
            if (qm6Var2 != null) {
                qm6Var2.b(this);
            }
            qm6 qm6Var3 = this.h;
            if (qm6Var3 != null && (h61Var = qm6Var3.h) != null) {
                h61Var.d();
            }
            this.h = qm6Var;
            if (qm6Var != null) {
                qm6Var.e();
            }
            qm6 qm6Var4 = this.h;
            if (qm6Var4 != null) {
                qm6Var4.d(this, n16.q, this.g);
            }
        }
    }
}
