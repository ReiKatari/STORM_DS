package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u0  reason: default package */
/* loaded from: classes.dex */
public abstract class u0 implements f73, b91, yu0 {
    public final ArrayList A = new ArrayList();
    public boolean B;
    public final t63 L;
    public final String R;
    public final e73 X;

    public u0(t63 t63Var, String str) {
        this.L = t63Var;
        this.R = str;
        this.X = t63Var.a;
    }

    public final String A(h06 h06Var, int i) {
        h06Var.getClass();
        String z = z(h06Var, i);
        z.getClass();
        String str = (String) tq0.U0(this.A);
        return z;
    }

    @Override // defpackage.yu0
    public final char B(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return m(A(rt4Var, i));
    }

    public abstract k73 C();

    @Override // defpackage.f73
    public final t63 D() {
        return this.L;
    }

    public final Object E() {
        ArrayList arrayList = this.A;
        Object remove = arrayList.remove(l07.P(arrayList));
        this.B = true;
        return remove;
    }

    public final String F() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return tq0.S0(arrayList, ".", "$.", null, null, 60);
    }

    public final String G(String str) {
        str.getClass();
        return F() + '.' + str;
    }

    public final void H(k83 k83Var, String str, String str2) {
        String str3;
        String str4;
        if (gh6.n0(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        String str5 = "Failed to parse literal '" + k83Var + "' as " + str3.concat(str) + " value";
        String G = G(str2);
        if (this.L.a.g) {
            str4 = io2.Z(-1, g().toString()).toString();
        } else {
            str4 = null;
        }
        throw new t73(io2.u(str5, G, -1, null, str4));
    }

    @Override // defpackage.f73
    public final k73 I() {
        return g();
    }

    @Override // defpackage.yu0
    public final byte J(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return l(A(rt4Var, i));
    }

    @Override // defpackage.yu0
    public final String K(h06 h06Var, int i) {
        h06Var.getClass();
        return x(A(h06Var, i));
    }

    @Override // defpackage.b91
    public final int L() {
        return r(E());
    }

    @Override // defpackage.yu0
    public final short M(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return w(A(rt4Var, i));
    }

    @Override // defpackage.yu0
    public final boolean O(h06 h06Var, int i) {
        h06Var.getClass();
        return k(A(h06Var, i));
    }

    @Override // defpackage.b91
    public final byte Q() {
        return l(E());
    }

    @Override // defpackage.b91
    public final b91 T(h06 h06Var) {
        h06Var.getClass();
        if (tq0.U0(this.A) != null) {
            return q(E(), h06Var);
        }
        return new m83(this.L, C(), this.R).T(h06Var);
    }

    @Override // defpackage.yu0
    public final Object U(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        this.A.add(A(h06Var, i));
        m93Var.getClass();
        Object n = n(m93Var);
        if (!this.B) {
            E();
        }
        this.B = false;
        return n;
    }

    @Override // defpackage.yu0
    public final int V(h06 h06Var, int i) {
        h06Var.getClass();
        return r(A(h06Var, i));
    }

    @Override // defpackage.b91
    public final short W() {
        return w(E());
    }

    @Override // defpackage.b91
    public final String X() {
        return x(E());
    }

    @Override // defpackage.b91
    public final float Z() {
        return p(E());
    }

    public void a(h06 h06Var) {
        h06Var.getClass();
    }

    @Override // defpackage.yu0
    public final long a0(h06 h06Var, int i) {
        h06Var.getClass();
        return s(A(h06Var, i));
    }

    @Override // defpackage.yu0
    public final vn1 b() {
        return this.L.b;
    }

    @Override // defpackage.b91
    public yu0 c(h06 h06Var) {
        String str;
        String str2;
        String str3;
        h06Var.getClass();
        k73 g = g();
        ep2 c = h06Var.c();
        boolean x = b53.x(c, kh6.i);
        t63 t63Var = this.L;
        if (!x && !(c instanceof zp4)) {
            if (b53.x(c, kh6.j)) {
                h06 a = fj7.a(h06Var.j(0), t63Var.b);
                ep2 c2 = a.c();
                if (!(c2 instanceof tt4) && !b53.x(c2, m06.h)) {
                    throw io2.a(a);
                }
                String b = h06Var.b();
                if (!(g instanceof f83)) {
                    String str4 = "Expected " + q75.a(f83.class).c() + ", but had " + q75.a(g.getClass()).c() + " as the serialized body of " + b;
                    String F = F();
                    if (t63Var.a.g) {
                        str3 = io2.Z(-1, g.toString()).toString();
                    } else {
                        str3 = null;
                    }
                    throw new t73(io2.u(str4, F, -1, null, str3));
                }
                return new t83(t63Var, (f83) g);
            }
            String b2 = h06Var.b();
            if (!(g instanceof f83)) {
                String str5 = "Expected " + q75.a(f83.class).c() + ", but had " + q75.a(g.getClass()).c() + " as the serialized body of " + b2;
                String F2 = F();
                if (t63Var.a.g) {
                    str2 = io2.Z(-1, g.toString()).toString();
                } else {
                    str2 = null;
                }
                throw new t73(io2.u(str5, F2, -1, null, str2));
            }
            return new r83(t63Var, (f83) g, this.R, 8);
        }
        String b3 = h06Var.b();
        if (!(g instanceof y63)) {
            String str6 = "Expected " + q75.a(y63.class).c() + ", but had " + q75.a(g.getClass()).c() + " as the serialized body of " + b3;
            String F3 = F();
            if (t63Var.a.g) {
                str = io2.Z(-1, g.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str6, F3, -1, null, str));
        }
        return new s83(t63Var, (y63) g);
    }

    @Override // defpackage.b91
    public final int c0(h06 h06Var) {
        String str;
        h06Var.getClass();
        String str2 = (String) E();
        str2.getClass();
        k73 d = d(str2);
        String b = h06Var.b();
        boolean z = d instanceof k83;
        t63 t63Var = this.L;
        if (!z) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of " + b;
            String G = G(str2);
            if (t63Var.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        return a83.b(h06Var, t63Var, ((k83) d).b(), "");
    }

    public abstract k73 d(String str);

    @Override // defpackage.b91
    public final double d0() {
        return o(E());
    }

    @Override // defpackage.b91
    public final long e() {
        return s(E());
    }

    @Override // defpackage.yu0
    public final b91 f(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return q(A(rt4Var, i), rt4Var.j(i));
    }

    public final k73 g() {
        k73 d;
        String str = (String) tq0.U0(this.A);
        if (str != null && (d = d(str)) != null) {
            return d;
        }
        return C();
    }

    @Override // defpackage.b91
    public final boolean h() {
        return k(E());
    }

    @Override // defpackage.b91
    public boolean i() {
        return !(g() instanceof b83);
    }

    @Override // defpackage.b91
    public final char j() {
        return m(E());
    }

    public final boolean k(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        if (!(d instanceof k83)) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of boolean";
            String G = G(str2);
            if (this.L.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        try {
            Boolean d2 = m73.d(k83Var);
            if (d2 != null) {
                return d2.booleanValue();
            }
            H(k83Var, "boolean", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            H(k83Var, "boolean", str2);
            throw null;
        }
    }

    public final byte l(Object obj) {
        Byte b;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        if (!(d instanceof k83)) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of byte";
            String G = G(str2);
            if (this.L.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        try {
            long i = m73.i(k83Var);
            if (-128 <= i && i <= 127) {
                b = Byte.valueOf((byte) i);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            H(k83Var, "byte", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            H(k83Var, "byte", str2);
            throw null;
        }
    }

    public final char m(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        if (!(d instanceof k83)) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of char";
            String G = G(str2);
            if (this.L.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        try {
            String b = k83Var.b();
            b.getClass();
            int length = b.length();
            if (length != 0) {
                if (length == 1) {
                    return b.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            H(k83Var, "char", str2);
            throw null;
        }
    }

    @Override // defpackage.b91
    public final Object n(m93 m93Var) {
        String str;
        String str2;
        String str3;
        m93Var.getClass();
        if (m93Var instanceof bq4) {
            t63 t63Var = this.L;
            e73 e73Var = t63Var.a;
            bq4 bq4Var = (bq4) m93Var;
            String g = hi2.g(t63Var, bq4Var.e());
            k73 g2 = g();
            String b = bq4Var.e().b();
            if (!(g2 instanceof f83)) {
                String str4 = "Expected " + q75.a(f83.class).c() + ", but had " + q75.a(g2.getClass()).c() + " as the serialized body of " + b;
                String F = F();
                if (t63Var.a.g) {
                    str3 = io2.Z(-1, g2.toString()).toString();
                } else {
                    str3 = null;
                }
                throw new t73(io2.u(str4, F, -1, null, str3));
            }
            f83 f83Var = (f83) g2;
            k73 k73Var = (k73) f83Var.get(g);
            try {
                if (k73Var != null) {
                    k83 h = m73.h(k73Var);
                    if (!(h instanceof b83)) {
                        str = h.b();
                        mj2.u((bq4) m93Var, this, str);
                        throw null;
                    }
                }
                mj2.u((bq4) m93Var, this, str);
                throw null;
            } catch (q06 e) {
                String message = e.getMessage();
                message.getClass();
                if (t63Var.a.g) {
                    str2 = io2.Z(-1, f83Var.toString()).toString();
                } else {
                    str2 = null;
                }
                throw new t73(io2.u(message, null, -1, null, str2));
            }
            str = null;
        } else {
            return m93Var.b(this);
        }
    }

    public final double o(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        k73 d = d(str3);
        boolean z = d instanceof k83;
        t63 t63Var = this.L;
        if (!z) {
            String str4 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of double";
            String G = G(str3);
            if (t63Var.a.g) {
                str2 = io2.Z(-1, d.toString()).toString();
            } else {
                str2 = null;
            }
            throw new t73(io2.u(str4, G, -1, null, str2));
        }
        k83 k83Var = (k83) d;
        try {
            iz2 iz2Var = m73.a;
            double parseDouble = Double.parseDouble(k83Var.b());
            e73 e73Var = t63Var.a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            String a0 = io2.a0(Double.valueOf(parseDouble), str3);
            if (t63Var.a.g) {
                str = io2.Z(-1, g().toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(a0, null, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
        } catch (IllegalArgumentException unused) {
            H(k83Var, "double", str3);
            throw null;
        }
    }

    public final float p(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        k73 d = d(str3);
        boolean z = d instanceof k83;
        t63 t63Var = this.L;
        if (!z) {
            String str4 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of float";
            String G = G(str3);
            if (t63Var.a.g) {
                str2 = io2.Z(-1, d.toString()).toString();
            } else {
                str2 = null;
            }
            throw new t73(io2.u(str4, G, -1, null, str2));
        }
        k83 k83Var = (k83) d;
        try {
            iz2 iz2Var = m73.a;
            float parseFloat = Float.parseFloat(k83Var.b());
            e73 e73Var = t63Var.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            String a0 = io2.a0(Float.valueOf(parseFloat), str3);
            if (t63Var.a.g) {
                str = io2.Z(-1, g().toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(a0, null, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
        } catch (IllegalArgumentException unused) {
            H(k83Var, "float", str3);
            throw null;
        }
    }

    public final b91 q(Object obj, h06 h06Var) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        h06Var.getClass();
        if (rg6.a(h06Var)) {
            k73 d = d(str2);
            String b = h06Var.b();
            boolean z = d instanceof k83;
            t63 t63Var = this.L;
            if (!z) {
                String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of " + b;
                String G = G(str2);
                if (t63Var.a.g) {
                    str = io2.Z(-1, d.toString()).toString();
                } else {
                    str = null;
                }
                throw new t73(io2.u(str3, G, -1, null, str));
            }
            return new g73(ep2.e(t63Var, ((k83) d).b()), t63Var);
        }
        this.A.add(str2);
        return this;
    }

    public final int r(Object obj) {
        Integer num;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        if (!(d instanceof k83)) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of int";
            String G = G(str2);
            if (this.L.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        try {
            long i = m73.i(k83Var);
            if (-2147483648L <= i && i <= 2147483647L) {
                num = Integer.valueOf((int) i);
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
            H(k83Var, "int", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            H(k83Var, "int", str2);
            throw null;
        }
    }

    public final long s(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        if (!(d instanceof k83)) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of long";
            String G = G(str2);
            if (this.L.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        try {
            return m73.i(k83Var);
        } catch (IllegalArgumentException unused) {
            this.H(k83Var, "long", str2);
            throw null;
        }
    }

    @Override // defpackage.yu0
    public final float t(h06 h06Var, int i) {
        h06Var.getClass();
        return p(A(h06Var, i));
    }

    @Override // defpackage.yu0
    public final Object u(h06 h06Var, int i, m93 m93Var, Object obj) {
        Object n;
        h06Var.getClass();
        m93Var.getClass();
        this.A.add(A(h06Var, i));
        if (!m93Var.e().h() && !i()) {
            n = null;
        } else {
            n = n(m93Var);
        }
        if (!this.B) {
            E();
        }
        this.B = false;
        return n;
    }

    public final short w(Object obj) {
        Short sh;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        if (!(d instanceof k83)) {
            String str3 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of short";
            String G = G(str2);
            if (this.L.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str3, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        try {
            long i = m73.i(k83Var);
            if (-32768 <= i && i <= 32767) {
                sh = Short.valueOf((short) i);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            H(k83Var, "short", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            H(k83Var, "short", str2);
            throw null;
        }
    }

    public final String x(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        k73 d = d(str2);
        boolean z = d instanceof k83;
        t63 t63Var = this.L;
        String str3 = null;
        if (!z) {
            String str4 = "Expected " + q75.a(k83.class).c() + ", but had " + q75.a(d.getClass()).c() + " as the serialized body of string";
            String G = G(str2);
            if (t63Var.a.g) {
                str = io2.Z(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str4, G, -1, null, str));
        }
        k83 k83Var = (k83) d;
        if (!(k83Var instanceof x73)) {
            String A = wh1.A("Expected string value for a non-null key '", str2, "', got null literal instead");
            String G2 = G(str2);
            if (t63Var.a.g) {
                str3 = io2.Z(-1, g().toString()).toString();
            }
            throw new t73(io2.u(A, G2, -1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", str3));
        }
        x73 x73Var = (x73) k83Var;
        if (!x73Var.A) {
            e73 e73Var = t63Var.a;
            String A2 = wh1.A("String literal for value of key '", str2, "' should be quoted");
            String G3 = G(str2);
            if (t63Var.a.g) {
                str3 = io2.Z(-1, g().toString()).toString();
            }
            throw new t73(io2.u(A2, G3, -1, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", str3));
        }
        return x73Var.B;
    }

    @Override // defpackage.yu0
    public final double y(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return o(A(rt4Var, i));
    }

    public String z(h06 h06Var, int i) {
        h06Var.getClass();
        return h06Var.e(i);
    }
}
