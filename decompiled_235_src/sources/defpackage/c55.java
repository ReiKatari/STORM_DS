package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c55  reason: default package */
/* loaded from: classes.dex */
public class c55 extends f55 implements x32, vx0 {
    public g55 L;
    public final o45 R;
    public final s35 X;
    public final wb6 Y;

    public c55(o45 o45Var, s35 s35Var, wb6 wb6Var) {
        o45Var.getClass();
        s35Var.getClass();
        wb6Var.getClass();
        this.L = g55.NOT_NULL;
        this.R = o45Var;
        this.X = s35Var;
        this.Y = wb6Var;
    }

    @Override // defpackage.vx0
    public final void D(t25 t25Var, int i, byte b) {
        t25Var.getClass();
        q0(b, u0(t25Var, i));
    }

    @Override // defpackage.x32
    public final void E(char c) {
        q0(c, m0());
    }

    @Override // defpackage.x32
    public final void K(wb6 wb6Var, int i) {
        wb6Var.getClass();
        long m0 = m0();
        int u = mp2.u(wb6Var, i, true);
        int i2 = (m0 > 19500L ? 1 : (m0 == 19500L ? 0 : -1));
        s35 s35Var = this.X;
        if (i2 == 0) {
            s35.s(s35Var, (t90) s35Var.A, u);
        } else {
            s35Var.G(u, (int) (m0 & 2147483647L), q45.DEFAULT);
        }
    }

    @Override // defpackage.vx0
    public final void N(t25 t25Var, int i, short s) {
        t25Var.getClass();
        q0(s, u0(t25Var, i));
    }

    @Override // defpackage.vx0
    public final void O(int i, int i2, wb6 wb6Var) {
        wb6Var.getClass();
        q0(i2, u0(wb6Var, i));
    }

    @Override // defpackage.vx0
    public final void Q(wb6 wb6Var, int i, String str) {
        wb6Var.getClass();
        str.getClass();
        s0(u0(wb6Var, i), str);
    }

    @Override // defpackage.vx0
    public final void R(t25 t25Var, int i, char c) {
        t25Var.getClass();
        q0(c, u0(t25Var, i));
    }

    @Override // defpackage.x32
    public final void T(int i) {
        q0(i, m0());
    }

    @Override // defpackage.vx0
    public final void V(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        g55 g55Var;
        wb6Var.getClass();
        gg3Var.getClass();
        if (wb6Var.k(i)) {
            g55Var = g55.OPTIONAL;
        } else {
            np2 e = wb6Var.j(i).e();
            if (!nb3.k(e, bt6.g)) {
                bt6 bt6Var = bt6.f;
                if (!nb3.k(e, bt6Var)) {
                    if (nb3.k(wb6Var.e(), bt6Var)) {
                        g55Var = g55.LIST_ELEMENT;
                    } else {
                        g55Var = g55.ACCEPTABLE;
                    }
                }
            }
            g55Var = g55.COLLECTION;
        }
        this.L = g55Var;
        n0(u0(wb6Var, i));
        if (gg3Var.e().c()) {
            j(gg3Var, obj);
        } else if (obj == null) {
            f();
        } else {
            j(gg3Var, obj);
        }
    }

    @Override // defpackage.x32
    public final void X(long j) {
        r0(m0(), j);
    }

    @Override // defpackage.vx0
    public final void a(wb6 wb6Var) {
        wb6Var.getClass();
        int i = this.A;
        if (i >= 0) {
            if (i >= 0) {
                this.A = i - 1;
                long j = ((long[]) this.B)[i];
            } else {
                throw new IllegalArgumentException("No tag in stack for requested element");
            }
        }
        t0(wb6Var);
    }

    @Override // defpackage.vx0
    public final x32 a0(t25 t25Var, int i) {
        t25Var.getClass();
        long u0 = u0(t25Var, i);
        t25Var.j(i).getClass();
        n0(u0);
        return this;
    }

    @Override // defpackage.x32
    public final jd1 b() {
        return this.R.b;
    }

    @Override // defpackage.x32
    public vx0 c(wb6 wb6Var) {
        wb6Var.getClass();
        np2 e = wb6Var.e();
        if (nb3.k(e, bt6.f)) {
            if (mp2.O(wb6Var.j(0)) && (h0() & 4294967296L) != 0) {
                return new iq4(h0(), this.X, this.R, wb6Var);
            }
            return new fk5(h0(), this.X, this.R, wb6Var);
        } else if (!nb3.k(e, bt6.e) && !nb3.k(e, bt6.h) && !(e instanceof dz4)) {
            if (nb3.k(e, bt6.g)) {
                return new a14(h0(), this.X, this.R, wb6Var);
            }
            throw new IllegalArgumentException("This serial kind is not supported as structure: " + wb6Var);
        } else {
            long h0 = h0();
            if (h0 == 19500 && wb6Var.equals(this.Y)) {
                return this;
            }
            boolean N = mp2.N(h0);
            o45 o45Var = this.R;
            if (N) {
                return new dm4(o45Var, this.X, wb6Var);
            }
            return new zd4(h0(), this.X, o45Var, wb6Var);
        }
    }

    @Override // defpackage.vx0
    public final void d(t25 t25Var, int i, double d) {
        t25Var.getClass();
        o0(u0(t25Var, i), d);
    }

    @Override // defpackage.x32
    public final void d0(String str) {
        str.getClass();
        s0(m0(), str);
    }

    @Override // defpackage.x32
    public final void f() {
        String str;
        g55 g55Var = this.L;
        if (g55Var != g55.ACCEPTABLE) {
            int i = h55.a[g55Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            str = "'null' is not supported in ProtoBuf";
                        } else {
                            str = "'null' is not allowed for not-null properties";
                        }
                    } else {
                        str = "'null' is not supported as the value of a list element in ProtoBuf";
                    }
                } else {
                    str = "'null' is not supported as the value of collection types in ProtoBuf";
                }
            } else {
                str = "'null' is not supported for optional properties in ProtoBuf";
            }
            throw new IllegalArgumentException(str);
        }
    }

    @Override // defpackage.vx0
    public final void f0(wb6 wb6Var, int i, float f) {
        wb6Var.getClass();
        p0(f, u0(wb6Var, i));
    }

    @Override // defpackage.x32
    public vx0 g0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        np2 e = wb6Var.e();
        bt6 bt6Var = bt6.f;
        if (nb3.k(e, bt6Var)) {
            long h0 = h0();
            if ((4294967296L & h0) != 0 && mp2.O(wb6Var.j(0))) {
                return new iq4(h0(), this.X, this.R, wb6Var);
            }
            int i2 = (h0 > 19500L ? 1 : (h0 == 19500L ? 0 : -1));
            if (i2 == 0) {
                s35 s35Var = this.X;
                s35.s(s35Var, (t90) s35Var.A, i);
            }
            wb6 wb6Var2 = this.Y;
            if (nb3.k(wb6Var2.e(), bt6Var) && i2 != 0 && !wb6Var2.equals(wb6Var)) {
                return new zd4(this.R, this.X, h0, wb6Var, new t90());
            }
            return new fk5(h0, this.X, this.R, wb6Var);
        } else if (nb3.k(e, bt6.g)) {
            return new a14(((long[]) this.B)[this.A], this.X, this.R, wb6Var);
        } else {
            throw new IllegalArgumentException("This serial kind is not supported as collection: " + wb6Var);
        }
    }

    @Override // defpackage.vx0
    public final boolean i(wb6 wb6Var) {
        wb6Var.getClass();
        return this.R.a;
    }

    @Override // defpackage.x32
    public final void j(gg3 gg3Var, Object obj) {
        gg3Var.getClass();
        if (gg3Var instanceof qw2) {
            qw2 qw2Var = (qw2) gg3Var;
            gg3 gg3Var2 = qw2Var.a;
            gg3 gg3Var3 = qw2Var.b;
            gg3Var2.getClass();
            gg3Var3.getClass();
            w04 w04Var = new w04(gg3Var2, gg3Var3, 0);
            wb6 e = w04Var.e();
            e.getClass();
            nu nuVar = new nu(e, 3);
            obj.getClass();
            Set entrySet = ((Map) obj).entrySet();
            Set set = entrySet;
            set.getClass();
            int size = set.size();
            vx0 g0 = g0(nuVar, size);
            Set set2 = entrySet;
            set2.getClass();
            Iterator it = set2.iterator();
            for (int i = 0; i < size; i++) {
                g0.w(nuVar, i, w04Var, it.next());
            }
            g0.a(nuVar);
            return;
        }
        boolean k = nb3.k(gg3Var.e(), x90.c.b);
        s35 s35Var = this.X;
        if (k) {
            obj.getClass();
            byte[] bArr = (byte[]) obj;
            long m0 = m0();
            if (m0 == 19500) {
                s35Var.F(bArr);
                return;
            }
            s35Var.getClass();
            s35.s(s35Var, (t90) s35Var.A, x45.SIZE_DELIMITED.wireIntWithTag((int) (m0 & 2147483647L)));
            s35Var.F(bArr);
        } else if (nb3.k(gg3Var.e(), cf7.c.b)) {
            obj.getClass();
            byte[] bArr2 = ((af7) obj).A;
            long m02 = m0();
            if (m02 == 19500) {
                s35Var.F(bArr2);
                return;
            }
            s35Var.getClass();
            s35.s(s35Var, (t90) s35Var.A, x45.SIZE_DELIMITED.wireIntWithTag((int) (m02 & 2147483647L)));
            s35Var.F(bArr2);
        } else {
            gg3Var.d(this, obj);
        }
    }

    @Override // defpackage.x32
    public final void l(double d) {
        o0(m0(), d);
    }

    @Override // defpackage.x32
    public final void m(short s) {
        q0(s, m0());
    }

    @Override // defpackage.vx0
    public final void n(wb6 wb6Var, int i, long j) {
        wb6Var.getClass();
        r0(u0(wb6Var, i), j);
    }

    @Override // defpackage.x32
    public final void o(byte b) {
        q0(b, m0());
    }

    public final void o0(long j, double d) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        s35 s35Var = this.X;
        if (i == 0) {
            ((t90) s35Var.A).d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        s35.s(s35Var, (t90) s35Var.A, x45.i64.wireIntWithTag((int) (j & 2147483647L)));
        ((t90) s35Var.A).d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    public final void p0(float f, long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        s35 s35Var = this.X;
        if (i == 0) {
            ((t90) s35Var.A).c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        s35.s(s35Var, (t90) s35Var.A, x45.i32.wireIntWithTag((int) (j & 2147483647L)));
        ((t90) s35Var.A).c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    public final void q0(int i, long j) {
        int i2 = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        s35 s35Var = this.X;
        if (i2 == 0) {
            s35.s(s35Var, (t90) s35Var.A, i);
        } else {
            s35Var.G(i, (int) (2147483647L & j), mp2.I(j));
        }
    }

    @Override // defpackage.x32
    public final void r(boolean z) {
        q0(z ? 1 : 0, m0());
    }

    public final void r0(long j, long j2) {
        x45 x45Var;
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        s35 s35Var = this.X;
        if (i == 0) {
            s35Var.t((t90) s35Var.A, j2, q45.DEFAULT);
            return;
        }
        int i2 = (int) (2147483647L & j);
        q45 I = mp2.I(j);
        s35Var.getClass();
        t90 t90Var = (t90) s35Var.A;
        I.getClass();
        if (I == q45.FIXED) {
            x45Var = x45.i64;
        } else {
            x45Var = x45.VARINT;
        }
        s35.s(s35Var, t90Var, x45Var.wireIntWithTag(i2));
        s35Var.t(t90Var, j2, I);
    }

    @Override // defpackage.x32
    public x32 s(wb6 wb6Var) {
        wb6Var.getClass();
        n0(m0());
        return this;
    }

    public void s0(long j, String str) {
        str.getClass();
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        s35 s35Var = this.X;
        if (i == 0) {
            s35Var.getClass();
            s35Var.F(xs6.X(str));
            return;
        }
        s35Var.getClass();
        byte[] X = xs6.X(str);
        s35.s(s35Var, (t90) s35Var.A, x45.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
        s35Var.F(X);
    }

    public void t0(wb6 wb6Var) {
        wb6Var.getClass();
    }

    @Override // defpackage.vx0
    public final void u(wb6 wb6Var, int i, boolean z) {
        wb6Var.getClass();
        q0(z ? 1 : 0, u0(wb6Var, i));
    }

    public long u0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return mp2.t(wb6Var, i);
    }

    @Override // defpackage.vx0
    public final void w(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        g55 g55Var;
        wb6Var.getClass();
        gg3Var.getClass();
        if (wb6Var.k(i)) {
            g55Var = g55.OPTIONAL;
        } else {
            wb6 j = wb6Var.j(i);
            if (!j.c()) {
                g55Var = g55.NOT_NULL;
            } else {
                np2 e = j.e();
                if (!nb3.k(e, bt6.g)) {
                    bt6 bt6Var = bt6.f;
                    if (!nb3.k(e, bt6Var)) {
                        if (nb3.k(wb6Var.e(), bt6Var)) {
                            g55Var = g55.LIST_ELEMENT;
                        } else {
                            g55Var = g55.ACCEPTABLE;
                        }
                    }
                }
                g55Var = g55.COLLECTION;
            }
        }
        this.L = g55Var;
        n0(u0(wb6Var, i));
        j(gg3Var, obj);
    }

    @Override // defpackage.x32
    public final void x(float f) {
        p0(f, m0());
    }
}
