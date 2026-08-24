package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v0  reason: default package */
/* loaded from: classes.dex */
public abstract class v0 implements yd3, sc1, ux0 {
    public final ArrayList A = new ArrayList();
    public boolean B;
    public final id3 L;
    public final String R;
    public final td3 X;

    public v0(id3 id3Var, String str) {
        this.L = id3Var;
        this.R = str;
        this.X = id3Var.a;
    }

    @Override // defpackage.ux0
    public final String A(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return w(D(wb6Var, i));
    }

    @Override // defpackage.sc1
    public final int B() {
        return r(K());
    }

    @Override // defpackage.ux0
    public final short C(t25 t25Var, int i) {
        t25Var.getClass();
        return u(D(t25Var, i));
    }

    public final String D(wb6 wb6Var, int i) {
        wb6Var.getClass();
        String x = x(wb6Var, i);
        x.getClass();
        String str = (String) gt0.R0(this.A);
        return x;
    }

    public abstract de3 E();

    @Override // defpackage.sc1
    public final sc1 F(wb6 wb6Var) {
        wb6Var.getClass();
        if (gt0.R0(this.A) != null) {
            return o(K(), wb6Var);
        }
        return new ff3(this.L, E(), this.R).F(wb6Var);
    }

    @Override // defpackage.ux0
    public final Object G(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        this.A.add(D(wb6Var, i));
        gg3Var.getClass();
        Object k = k(gg3Var);
        if (!this.B) {
            K();
        }
        this.B = false;
        return k;
    }

    @Override // defpackage.ux0
    public final int H(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return r(D(wb6Var, i));
    }

    @Override // defpackage.sc1
    public final String I() {
        return w(K());
    }

    @Override // defpackage.sc1
    public final int J(wb6 wb6Var) {
        String str;
        wb6Var.getClass();
        String str2 = (String) K();
        str2.getClass();
        de3 d = d(str2);
        String a = wb6Var.a();
        boolean z = d instanceof df3;
        id3 id3Var = this.L;
        if (!z) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of " + a;
            String O = O(str2);
            if (id3Var.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        return te3.b(wb6Var, id3Var, ((df3) d).a(), "");
    }

    public final Object K() {
        ArrayList arrayList = this.A;
        Object remove = arrayList.remove(hf.U(arrayList));
        this.B = true;
        return remove;
    }

    @Override // defpackage.sc1
    public final long L() {
        return s(K());
    }

    @Override // defpackage.sc1
    public boolean M() {
        return !(f() instanceof ue3);
    }

    public final String N() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return gt0.P0(arrayList, ".", "$.", null, null, 60);
    }

    public final String O(String str) {
        str.getClass();
        return N() + '.' + str;
    }

    @Override // defpackage.ux0
    public final Object P(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        Object k;
        wb6Var.getClass();
        gg3Var.getClass();
        this.A.add(D(wb6Var, i));
        if (!gg3Var.e().c() && !M()) {
            k = null;
        } else {
            k = k(gg3Var);
        }
        if (!this.B) {
            K();
        }
        this.B = false;
        return k;
    }

    public final void Q(df3 df3Var, String str, String str2) {
        String str3;
        String str4;
        if (xs6.g0(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        String str5 = "Failed to parse literal '" + df3Var + "' as " + str3.concat(str) + " value";
        String O = O(str2);
        if (this.L.a.g) {
            str4 = hi2.H(-1, f().toString()).toString();
        } else {
            str4 = null;
        }
        throw new me3(hi2.x(str5, O, -1, null, str4));
    }

    @Override // defpackage.yd3
    public final id3 S() {
        return this.L;
    }

    @Override // defpackage.ux0
    public final boolean W(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return i(D(wb6Var, i));
    }

    @Override // defpackage.sc1
    public final byte Y() {
        return j(K());
    }

    @Override // defpackage.sc1
    public final short Z() {
        return u(K());
    }

    public void a(wb6 wb6Var) {
        wb6Var.getClass();
    }

    @Override // defpackage.ux0
    public final jd1 b() {
        return this.L.b;
    }

    @Override // defpackage.sc1
    public final float b0() {
        return n(K());
    }

    @Override // defpackage.sc1
    public ux0 c(wb6 wb6Var) {
        String str;
        String str2;
        String str3;
        wb6Var.getClass();
        de3 f = f();
        np2 e = wb6Var.e();
        boolean k = nb3.k(e, bt6.f);
        id3 id3Var = this.L;
        if (!k && !(e instanceof dz4)) {
            if (nb3.k(e, bt6.g)) {
                wb6 b = js7.b(wb6Var.j(0), id3Var.b);
                np2 e2 = b.e();
                if (!(e2 instanceof v25) && !nb3.k(e2, bc6.e)) {
                    throw hi2.b(b);
                }
                String a = wb6Var.a();
                if (!(f instanceof ye3)) {
                    String str4 = "Expected " + gh5.a(ye3.class).c() + ", but had " + gh5.a(f.getClass()).c() + " as the serialized body of " + a;
                    String N = N();
                    if (id3Var.a.g) {
                        str3 = hi2.H(-1, f.toString()).toString();
                    } else {
                        str3 = null;
                    }
                    throw new me3(hi2.x(str4, N, -1, null, str3));
                }
                return new mf3(id3Var, (ye3) f);
            }
            String a2 = wb6Var.a();
            if (!(f instanceof ye3)) {
                String str5 = "Expected " + gh5.a(ye3.class).c() + ", but had " + gh5.a(f.getClass()).c() + " as the serialized body of " + a2;
                String N2 = N();
                if (id3Var.a.g) {
                    str2 = hi2.H(-1, f.toString()).toString();
                } else {
                    str2 = null;
                }
                throw new me3(hi2.x(str5, N2, -1, null, str2));
            }
            return new kf3(id3Var, (ye3) f, this.R, 8);
        }
        String a3 = wb6Var.a();
        if (!(f instanceof nd3)) {
            String str6 = "Expected " + gh5.a(nd3.class).c() + ", but had " + gh5.a(f.getClass()).c() + " as the serialized body of " + a3;
            String N3 = N();
            if (id3Var.a.g) {
                str = hi2.H(-1, f.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str6, N3, -1, null, str));
        }
        return new lf3(id3Var, (nd3) f);
    }

    @Override // defpackage.ux0
    public final long c0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return s(D(wb6Var, i));
    }

    public abstract de3 d(String str);

    @Override // defpackage.ux0
    public final sc1 e(t25 t25Var, int i) {
        t25Var.getClass();
        return o(D(t25Var, i), t25Var.j(i));
    }

    @Override // defpackage.sc1
    public final double e0() {
        return m(K());
    }

    public final de3 f() {
        de3 d;
        String str = (String) gt0.R0(this.A);
        if (str != null && (d = d(str)) != null) {
            return d;
        }
        return E();
    }

    @Override // defpackage.sc1
    public final boolean g() {
        return i(K());
    }

    @Override // defpackage.sc1
    public final char h() {
        return l(K());
    }

    public final boolean i(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        if (!(d instanceof df3)) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of boolean";
            String O = O(str2);
            if (this.L.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        try {
            Boolean d2 = fe3.d(df3Var);
            if (d2 != null) {
                return d2.booleanValue();
            }
            Q(df3Var, "boolean", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "boolean", str2);
            throw null;
        }
    }

    public final byte j(Object obj) {
        Byte b;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        if (!(d instanceof df3)) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of byte";
            String O = O(str2);
            if (this.L.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        try {
            long i = fe3.i(df3Var);
            if (-128 <= i && i <= 127) {
                b = Byte.valueOf((byte) i);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            Q(df3Var, "byte", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "byte", str2);
            throw null;
        }
    }

    @Override // defpackage.sc1
    public final Object k(gg3 gg3Var) {
        String str;
        String str2;
        String str3;
        gg3Var.getClass();
        if (gg3Var instanceof fz4) {
            id3 id3Var = this.L;
            td3 td3Var = id3Var.a;
            fz4 fz4Var = (fz4) gg3Var;
            String r = uj2.r(id3Var, fz4Var.e());
            de3 f = f();
            String a = fz4Var.e().a();
            if (!(f instanceof ye3)) {
                String str4 = "Expected " + gh5.a(ye3.class).c() + ", but had " + gh5.a(f.getClass()).c() + " as the serialized body of " + a;
                String N = N();
                if (id3Var.a.g) {
                    str3 = hi2.H(-1, f.toString()).toString();
                } else {
                    str3 = null;
                }
                throw new me3(hi2.x(str4, N, -1, null, str3));
            }
            ye3 ye3Var = (ye3) f;
            de3 de3Var = (de3) ye3Var.get(r);
            try {
                if (de3Var != null) {
                    df3 h = fe3.h(de3Var);
                    if (!(h instanceof ue3)) {
                        str = h.a();
                        xk2.g((fz4) gg3Var, this, str);
                        throw null;
                    }
                }
                xk2.g((fz4) gg3Var, this, str);
                throw null;
            } catch (fc6 e) {
                String message = e.getMessage();
                message.getClass();
                if (id3Var.a.g) {
                    str2 = hi2.H(-1, ye3Var.toString()).toString();
                } else {
                    str2 = null;
                }
                throw new me3(hi2.x(message, null, -1, null, str2));
            }
            str = null;
        } else {
            return gg3Var.c(this);
        }
    }

    public final char l(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        if (!(d instanceof df3)) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of char";
            String O = O(str2);
            if (this.L.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        try {
            String a = df3Var.a();
            a.getClass();
            int length = a.length();
            if (length != 0) {
                if (length == 1) {
                    return a.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "char", str2);
            throw null;
        }
    }

    public final double m(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        de3 d = d(str3);
        boolean z = d instanceof df3;
        id3 id3Var = this.L;
        if (!z) {
            String str4 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of double";
            String O = O(str3);
            if (id3Var.a.g) {
                str2 = hi2.H(-1, d.toString()).toString();
            } else {
                str2 = null;
            }
            throw new me3(hi2.x(str4, O, -1, null, str2));
        }
        df3 df3Var = (df3) d;
        try {
            l53 l53Var = fe3.a;
            double parseDouble = Double.parseDouble(df3Var.a());
            td3 td3Var = id3Var.a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            String I = hi2.I(Double.valueOf(parseDouble), str3);
            if (id3Var.a.g) {
                str = hi2.H(-1, f().toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(I, null, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "double", str3);
            throw null;
        }
    }

    public final float n(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        de3 d = d(str3);
        boolean z = d instanceof df3;
        id3 id3Var = this.L;
        if (!z) {
            String str4 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of float";
            String O = O(str3);
            if (id3Var.a.g) {
                str2 = hi2.H(-1, d.toString()).toString();
            } else {
                str2 = null;
            }
            throw new me3(hi2.x(str4, O, -1, null, str2));
        }
        df3 df3Var = (df3) d;
        try {
            l53 l53Var = fe3.a;
            float parseFloat = Float.parseFloat(df3Var.a());
            td3 td3Var = id3Var.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            String I = hi2.I(Float.valueOf(parseFloat), str3);
            if (id3Var.a.g) {
                str = hi2.H(-1, f().toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(I, null, -1, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "float", str3);
            throw null;
        }
    }

    public final sc1 o(Object obj, wb6 wb6Var) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        wb6Var.getClass();
        if (is6.a(wb6Var)) {
            de3 d = d(str2);
            String a = wb6Var.a();
            boolean z = d instanceof df3;
            id3 id3Var = this.L;
            if (!z) {
                String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of " + a;
                String O = O(str2);
                if (id3Var.a.g) {
                    str = hi2.H(-1, d.toString()).toString();
                } else {
                    str = null;
                }
                throw new me3(hi2.x(str3, O, -1, null, str));
            }
            return new zd3(np2.i(id3Var, ((df3) d).a()), id3Var);
        }
        this.A.add(str2);
        return this;
    }

    @Override // defpackage.ux0
    public final float p(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return n(D(wb6Var, i));
    }

    public final int r(Object obj) {
        Integer num;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        if (!(d instanceof df3)) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of int";
            String O = O(str2);
            if (this.L.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        try {
            long i = fe3.i(df3Var);
            if (-2147483648L <= i && i <= 2147483647L) {
                num = Integer.valueOf((int) i);
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
            Q(df3Var, "int", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "int", str2);
            throw null;
        }
    }

    public final long s(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        if (!(d instanceof df3)) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of long";
            String O = O(str2);
            if (this.L.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        try {
            return fe3.i(df3Var);
        } catch (IllegalArgumentException unused) {
            this.Q(df3Var, "long", str2);
            throw null;
        }
    }

    @Override // defpackage.ux0
    public final double t(t25 t25Var, int i) {
        t25Var.getClass();
        return m(D(t25Var, i));
    }

    public final short u(Object obj) {
        Short sh;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        if (!(d instanceof df3)) {
            String str3 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of short";
            String O = O(str2);
            if (this.L.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str3, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        try {
            long i = fe3.i(df3Var);
            if (-32768 <= i && i <= 32767) {
                sh = Short.valueOf((short) i);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            Q(df3Var, "short", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            Q(df3Var, "short", str2);
            throw null;
        }
    }

    @Override // defpackage.ux0
    public final char v(t25 t25Var, int i) {
        t25Var.getClass();
        return l(D(t25Var, i));
    }

    public final String w(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        de3 d = d(str2);
        boolean z = d instanceof df3;
        id3 id3Var = this.L;
        String str3 = null;
        if (!z) {
            String str4 = "Expected " + gh5.a(df3.class).c() + ", but had " + gh5.a(d.getClass()).c() + " as the serialized body of string";
            String O = O(str2);
            if (id3Var.a.g) {
                str = hi2.H(-1, d.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str4, O, -1, null, str));
        }
        df3 df3Var = (df3) d;
        if (!(df3Var instanceof qe3)) {
            String A = lb1.A("Expected string value for a non-null key '", str2, "', got null literal instead");
            String O2 = O(str2);
            if (id3Var.a.g) {
                str3 = hi2.H(-1, f().toString()).toString();
            }
            throw new me3(hi2.x(A, O2, -1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", str3));
        }
        qe3 qe3Var = (qe3) df3Var;
        if (!qe3Var.A) {
            td3 td3Var = id3Var.a;
            String A2 = lb1.A("String literal for value of key '", str2, "' should be quoted");
            String O3 = O(str2);
            if (id3Var.a.g) {
                str3 = hi2.H(-1, f().toString()).toString();
            }
            throw new me3(hi2.x(A2, O3, -1, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", str3));
        }
        return qe3Var.B;
    }

    public String x(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return wb6Var.g(i);
    }

    @Override // defpackage.yd3
    public final de3 y() {
        return f();
    }

    @Override // defpackage.ux0
    public final byte z(t25 t25Var, int i) {
        t25Var.getClass();
        return j(D(t25Var, i));
    }
}
