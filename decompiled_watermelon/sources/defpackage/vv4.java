package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vv4  reason: default package */
/* loaded from: classes.dex */
public class vv4 extends yv4 implements mz1, zu0 {
    public zv4 L;
    public final hv4 R;
    public final ka3 X;
    public final h06 Y;

    public vv4(hv4 hv4Var, ka3 ka3Var, h06 h06Var) {
        hv4Var.getClass();
        ka3Var.getClass();
        h06Var.getClass();
        this.L = zv4.NOT_NULL;
        this.R = hv4Var;
        this.X = ka3Var;
        this.Y = h06Var;
    }

    @Override // defpackage.zu0
    public final void A(h06 h06Var, int i, boolean z) {
        h06Var.getClass();
        q0(z ? 1 : 0, u0(h06Var, i));
    }

    @Override // defpackage.zu0
    public final void C(rt4 rt4Var, int i, char c) {
        rt4Var.getClass();
        q0(c, u0(rt4Var, i));
    }

    @Override // defpackage.mz1
    public final void E(int i) {
        q0(i, m0());
    }

    @Override // defpackage.zu0
    public final void F(h06 h06Var, int i, m93 m93Var, Object obj) {
        zv4 zv4Var;
        h06Var.getClass();
        m93Var.getClass();
        if (h06Var.k(i)) {
            zv4Var = zv4.OPTIONAL;
        } else {
            h06 j = h06Var.j(i);
            if (!j.h()) {
                zv4Var = zv4.NOT_NULL;
            } else {
                ep2 c = j.c();
                if (!b53.x(c, kh6.j)) {
                    kh6 kh6Var = kh6.i;
                    if (!b53.x(c, kh6Var)) {
                        if (b53.x(h06Var.c(), kh6Var)) {
                            zv4Var = zv4.LIST_ELEMENT;
                        } else {
                            zv4Var = zv4.ACCEPTABLE;
                        }
                    }
                }
                zv4Var = zv4.COLLECTION;
            }
        }
        this.L = zv4Var;
        n0(u0(h06Var, i));
        l(m93Var, obj);
    }

    @Override // defpackage.mz1
    public final void H(float f) {
        p0(f, m0());
    }

    @Override // defpackage.zu0
    public final void N(h06 h06Var, int i, m93 m93Var, Object obj) {
        zv4 zv4Var;
        h06Var.getClass();
        m93Var.getClass();
        if (h06Var.k(i)) {
            zv4Var = zv4.OPTIONAL;
        } else {
            ep2 c = h06Var.j(i).c();
            if (!b53.x(c, kh6.j)) {
                kh6 kh6Var = kh6.i;
                if (!b53.x(c, kh6Var)) {
                    if (b53.x(h06Var.c(), kh6Var)) {
                        zv4Var = zv4.LIST_ELEMENT;
                    } else {
                        zv4Var = zv4.ACCEPTABLE;
                    }
                }
            }
            zv4Var = zv4.COLLECTION;
        }
        this.L = zv4Var;
        n0(u0(h06Var, i));
        if (m93Var.e().h()) {
            l(m93Var, obj);
        } else if (obj == null) {
            g();
        } else {
            l(m93Var, obj);
        }
    }

    @Override // defpackage.mz1
    public final void P(long j) {
        r0(m0(), j);
    }

    @Override // defpackage.zu0
    public final void R(rt4 rt4Var, int i, byte b) {
        rt4Var.getClass();
        q0(b, u0(rt4Var, i));
    }

    @Override // defpackage.mz1
    public final void S(char c) {
        q0(c, m0());
    }

    @Override // defpackage.zu0
    public final mz1 Y(rt4 rt4Var, int i) {
        rt4Var.getClass();
        long u0 = u0(rt4Var, i);
        rt4Var.j(i).getClass();
        n0(u0);
        return this;
    }

    @Override // defpackage.zu0
    public final void a(h06 h06Var) {
        h06Var.getClass();
        int i = this.A;
        if (i >= 0) {
            if (i >= 0) {
                this.A = i - 1;
                long j = ((long[]) this.B)[i];
            } else {
                throw new IllegalArgumentException("No tag in stack for requested element");
            }
        }
        t0(h06Var);
    }

    @Override // defpackage.mz1
    public final vn1 b() {
        return this.R.b;
    }

    @Override // defpackage.mz1
    public final void b0(String str) {
        str.getClass();
        s0(m0(), str);
    }

    public zu0 c(h06 h06Var) {
        h06Var.getClass();
        ep2 c = h06Var.c();
        if (b53.x(c, kh6.i)) {
            if (gk2.W(h06Var.j(0)) && (h0() & 4294967296L) != 0) {
                return new fh4(h0(), this.X, this.R, h06Var);
            }
            return new na5(h0(), this.X, this.R, h06Var);
        } else if (!b53.x(c, kh6.h) && !b53.x(c, kh6.k) && !(c instanceof zp4)) {
            if (b53.x(c, kh6.j)) {
                return new xt3(h0(), this.X, this.R, h06Var);
            }
            throw new IllegalArgumentException("This serial kind is not supported as structure: " + h06Var);
        } else {
            long h0 = h0();
            if (h0 == 19500 && h06Var.equals(this.Y)) {
                return this;
            }
            boolean V = gk2.V(h0);
            hv4 hv4Var = this.R;
            if (V) {
                return new fd4(hv4Var, this.X, h06Var);
            }
            return new t54(h0(), this.X, hv4Var, h06Var);
        }
    }

    @Override // defpackage.zu0
    public final void d(rt4 rt4Var, int i, double d) {
        rt4Var.getClass();
        o0(u0(rt4Var, i), d);
    }

    @Override // defpackage.zu0
    public final void e0(h06 h06Var, int i, float f) {
        h06Var.getClass();
        p0(f, u0(h06Var, i));
    }

    public zu0 f0(h06 h06Var, int i) {
        h06Var.getClass();
        ep2 c = h06Var.c();
        kh6 kh6Var = kh6.i;
        if (b53.x(c, kh6Var)) {
            long h0 = h0();
            if ((4294967296L & h0) != 0 && gk2.W(h06Var.j(0))) {
                return new fh4(h0(), this.X, this.R, h06Var);
            }
            int i2 = (h0 > 19500L ? 1 : (h0 == 19500L ? 0 : -1));
            if (i2 == 0) {
                ka3 ka3Var = this.X;
                ka3.u(ka3Var, (m70) ka3Var.B, i);
            }
            h06 h06Var2 = this.Y;
            if (b53.x(h06Var2.c(), kh6Var) && i2 != 0 && !h06Var2.equals(h06Var)) {
                return new t54(this.R, this.X, h0, h06Var, new m70());
            }
            return new na5(h0, this.X, this.R, h06Var);
        } else if (b53.x(c, kh6.j)) {
            return new xt3(((long[]) this.B)[this.A], this.X, this.R, h06Var);
        } else {
            throw new IllegalArgumentException("This serial kind is not supported as collection: " + h06Var);
        }
    }

    @Override // defpackage.mz1
    public final void g() {
        String str;
        zv4 zv4Var = this.L;
        if (zv4Var != zv4.ACCEPTABLE) {
            int i = aw4.a[zv4Var.ordinal()];
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

    @Override // defpackage.mz1
    public final void g0(h06 h06Var, int i) {
        h06Var.getClass();
        long m0 = m0();
        int I = gk2.I(h06Var, i, true);
        int i2 = (m0 > 19500L ? 1 : (m0 == 19500L ? 0 : -1));
        ka3 ka3Var = this.X;
        if (i2 == 0) {
            ka3.u(ka3Var, (m70) ka3Var.B, I);
        } else {
            ka3Var.K(I, (int) (m0 & 2147483647L), jv4.DEFAULT);
        }
    }

    @Override // defpackage.zu0
    public final boolean k(h06 h06Var) {
        h06Var.getClass();
        return this.R.a;
    }

    @Override // defpackage.mz1
    public final void l(m93 m93Var, Object obj) {
        m93Var.getClass();
        if (m93Var instanceof pq2) {
            pq2 pq2Var = (pq2) m93Var;
            m93 m93Var2 = pq2Var.a;
            m93 m93Var3 = pq2Var.b;
            m93Var2.getClass();
            m93Var3.getClass();
            tt3 tt3Var = new tt3(m93Var2, m93Var3, 0);
            h06 e = tt3Var.e();
            e.getClass();
            vt vtVar = new vt(e, 3);
            obj.getClass();
            Set entrySet = ((Map) obj).entrySet();
            Set set = entrySet;
            set.getClass();
            int size = set.size();
            zu0 f0 = f0(vtVar, size);
            Set set2 = entrySet;
            set2.getClass();
            Iterator it = set2.iterator();
            for (int i = 0; i < size; i++) {
                f0.F(vtVar, i, tt3Var, it.next());
            }
            f0.a(vtVar);
            return;
        }
        boolean x = b53.x(m93Var.e(), q70.c.b);
        ka3 ka3Var = this.X;
        if (x) {
            obj.getClass();
            byte[] bArr = (byte[]) obj;
            long m0 = m0();
            if (m0 == 19500) {
                ka3Var.J(bArr);
                return;
            }
            ka3Var.getClass();
            ka3.u(ka3Var, (m70) ka3Var.B, qv4.SIZE_DELIMITED.wireIntWithTag((int) (m0 & 2147483647L)));
            ka3Var.J(bArr);
        } else if (b53.x(m93Var.e(), h17.c.b)) {
            obj.getClass();
            byte[] bArr2 = ((f17) obj).A;
            long m02 = m0();
            if (m02 == 19500) {
                ka3Var.J(bArr2);
                return;
            }
            ka3Var.getClass();
            ka3.u(ka3Var, (m70) ka3Var.B, qv4.SIZE_DELIMITED.wireIntWithTag((int) (m02 & 2147483647L)));
            ka3Var.J(bArr2);
        } else {
            m93Var.d(this, obj);
        }
    }

    @Override // defpackage.zu0
    public final void m(rt4 rt4Var, int i, short s) {
        rt4Var.getClass();
        q0(s, u0(rt4Var, i));
    }

    @Override // defpackage.mz1
    public final void o(double d) {
        o0(m0(), d);
    }

    public final void o0(long j, double d) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        ka3 ka3Var = this.X;
        if (i == 0) {
            ((m70) ka3Var.B).d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        ka3.u(ka3Var, (m70) ka3Var.B, qv4.i64.wireIntWithTag((int) (j & 2147483647L)));
        ((m70) ka3Var.B).d(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    @Override // defpackage.mz1
    public final void p(short s) {
        q0(s, m0());
    }

    public final void p0(float f, long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        ka3 ka3Var = this.X;
        if (i == 0) {
            ((m70) ka3Var.B).c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        ka3.u(ka3Var, (m70) ka3Var.B, qv4.i32.wireIntWithTag((int) (j & 2147483647L)));
        ((m70) ka3Var.B).c(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    @Override // defpackage.zu0
    public final void q(int i, int i2, h06 h06Var) {
        h06Var.getClass();
        q0(i2, u0(h06Var, i));
    }

    public final void q0(int i, long j) {
        int i2 = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        ka3 ka3Var = this.X;
        if (i2 == 0) {
            ka3.u(ka3Var, (m70) ka3Var.B, i);
        } else {
            ka3Var.K(i, (int) (2147483647L & j), gk2.P(j));
        }
    }

    @Override // defpackage.zu0
    public final void r(h06 h06Var, int i, long j) {
        h06Var.getClass();
        r0(u0(h06Var, i), j);
    }

    public final void r0(long j, long j2) {
        qv4 qv4Var;
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        ka3 ka3Var = this.X;
        if (i == 0) {
            ka3Var.v((m70) ka3Var.B, j2, jv4.DEFAULT);
            return;
        }
        int i2 = (int) (2147483647L & j);
        jv4 P = gk2.P(j);
        ka3Var.getClass();
        m70 m70Var = (m70) ka3Var.B;
        P.getClass();
        if (P == jv4.FIXED) {
            qv4Var = qv4.i64;
        } else {
            qv4Var = qv4.VARINT;
        }
        ka3.u(ka3Var, m70Var, qv4Var.wireIntWithTag(i2));
        ka3Var.v(m70Var, j2, P);
    }

    @Override // defpackage.mz1
    public final void s(byte b) {
        q0(b, m0());
    }

    public void s0(long j, String str) {
        str.getClass();
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        ka3 ka3Var = this.X;
        if (i == 0) {
            ka3Var.getClass();
            ka3Var.J(gh6.e0(str));
            return;
        }
        ka3Var.getClass();
        byte[] e0 = gh6.e0(str);
        ka3.u(ka3Var, (m70) ka3Var.B, qv4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
        ka3Var.J(e0);
    }

    public void t0(h06 h06Var) {
        h06Var.getClass();
    }

    public long u0(h06 h06Var, int i) {
        h06Var.getClass();
        return gk2.H(h06Var, i);
    }

    @Override // defpackage.mz1
    public final void w(boolean z) {
        q0(z ? 1 : 0, m0());
    }

    public mz1 x(h06 h06Var) {
        h06Var.getClass();
        n0(m0());
        return this;
    }

    @Override // defpackage.zu0
    public final void z(h06 h06Var, int i, String str) {
        h06Var.getClass();
        str.getClass();
        s0(u0(h06Var, i), str);
    }
}
