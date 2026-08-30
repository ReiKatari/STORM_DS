package pd;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import n2.o1;
import nd.e1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b implements od.j, md.c, md.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11559a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f11560b;

    /* renamed from: c  reason: collision with root package name */
    public final od.c f11561c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11562d;

    /* renamed from: e  reason: collision with root package name */
    public final o1 f11563e;

    public b(od.c cVar, String str) {
        this.f11561c = cVar;
        this.f11562d = str;
        this.f11563e = cVar.f10885a;
    }

    @Override // md.c
    public final short A() {
        return O(T());
    }

    @Override // md.c
    public final String B() {
        return P(T());
    }

    @Override // md.c
    public final float C() {
        return K(T());
    }

    @Override // md.c
    public final double D() {
        return J(T());
    }

    public abstract od.l E(String str);

    public final od.l F() {
        od.l E;
        String str = (String) zb.l.a0(this.f11559a);
        if (str != null && (E = E(str)) != null) {
            return E;
        }
        return S();
    }

    public final boolean G(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                nd.g0 g0Var = od.m.f10897a;
                String a10 = d0Var.a();
                String[] strArr = j0.f11591a;
                a10.getClass();
                if (a10.equalsIgnoreCase("true")) {
                    bool = Boolean.TRUE;
                } else if (a10.equalsIgnoreCase("false")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                W(d0Var, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(d0Var, "boolean", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of boolean at element: " + V(str), E.toString());
    }

    public final byte H(Object obj) {
        Byte b10;
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                long h2 = od.m.h(d0Var);
                if (-128 <= h2 && h2 <= 127) {
                    b10 = Byte.valueOf((byte) h2);
                } else {
                    b10 = null;
                }
                if (b10 != null) {
                    return b10.byteValue();
                }
                W(d0Var, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(d0Var, "byte", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of byte at element: " + V(str), E.toString());
    }

    public final char I(Object obj) {
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                String a10 = d0Var.a();
                a10.getClass();
                int length = a10.length();
                if (length != 0) {
                    if (length == 1) {
                        return a10.charAt(0);
                    }
                    throw new IllegalArgumentException("Char sequence has more than one element.");
                }
                throw new NoSuchElementException("Char sequence is empty.");
            } catch (IllegalArgumentException unused) {
                W(d0Var, "char", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of char at element: " + V(str), E.toString());
    }

    public final double J(Object obj) {
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                nd.g0 g0Var = od.m.f10897a;
                double parseDouble = Double.parseDouble(d0Var.a());
                o1 o1Var = this.f11561c.f10885a;
                if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                    return parseDouble;
                }
                throw t.a(Double.valueOf(parseDouble), str, F().toString());
            } catch (IllegalArgumentException unused) {
                W(d0Var, "double", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of double at element: " + V(str), E.toString());
    }

    public final float K(Object obj) {
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                nd.g0 g0Var = od.m.f10897a;
                float parseFloat = Float.parseFloat(d0Var.a());
                o1 o1Var = this.f11561c.f10885a;
                if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                    return parseFloat;
                }
                throw t.a(Float.valueOf(parseFloat), str, F().toString());
            } catch (IllegalArgumentException unused) {
                W(d0Var, "float", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of float at element: " + V(str), E.toString());
    }

    public final md.c L(Object obj, ld.e eVar) {
        String str = (String) obj;
        str.getClass();
        eVar.getClass();
        if (h0.a(eVar)) {
            od.l E = E(str);
            String b10 = eVar.b();
            if (E instanceof od.d0) {
                String a10 = ((od.d0) E).a();
                od.c cVar = this.f11561c;
                cVar.getClass();
                a10.getClass();
                return new o(new i0(a10), cVar);
            }
            throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of " + b10 + " at element: " + V(str), E.toString());
        }
        this.f11559a.add(str);
        return this;
    }

    public final int M(Object obj) {
        Integer num;
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                long h2 = od.m.h(d0Var);
                if (-2147483648L <= h2 && h2 <= 2147483647L) {
                    num = Integer.valueOf((int) h2);
                } else {
                    num = null;
                }
                if (num != null) {
                    return num.intValue();
                }
                W(d0Var, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(d0Var, "int", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of int at element: " + V(str), E.toString());
    }

    public final long N(Object obj) {
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                return od.m.h(d0Var);
            } catch (IllegalArgumentException unused) {
                W(d0Var, "long", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of long at element: " + V(str), E.toString());
    }

    public final short O(Object obj) {
        Short sh2;
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            try {
                long h2 = od.m.h(d0Var);
                if (-32768 <= h2 && h2 <= 32767) {
                    sh2 = Short.valueOf((short) h2);
                } else {
                    sh2 = null;
                }
                if (sh2 != null) {
                    return sh2.shortValue();
                }
                W(d0Var, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(d0Var, "short", str);
                throw null;
            }
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of short at element: " + V(str), E.toString());
    }

    public final String P(Object obj) {
        String str = (String) obj;
        str.getClass();
        od.l E = E(str);
        if (E instanceof od.d0) {
            od.d0 d0Var = (od.d0) E;
            if (d0Var instanceof od.s) {
                od.s sVar = (od.s) d0Var;
                if (sVar.A) {
                    return sVar.B;
                }
                o1 o1Var = this.f11561c.f10885a;
                StringBuilder u4 = w.d.u("String literal for key '", str, "' should be quoted at element: ");
                u4.append(V(str));
                u4.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                throw t.e(-1, u4.toString(), F().toString());
            }
            StringBuilder u10 = w.d.u("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            u10.append(V(str));
            throw t.e(-1, u10.toString(), F().toString());
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of string at element: " + V(str), E.toString());
    }

    public String Q(ld.e eVar, int i2) {
        eVar.getClass();
        return eVar.e(i2);
    }

    public final String R(ld.e eVar, int i2) {
        eVar.getClass();
        String Q = Q(eVar, i2);
        Q.getClass();
        String str = (String) zb.l.a0(this.f11559a);
        return Q;
    }

    public abstract od.l S();

    public final Object T() {
        ArrayList arrayList = this.f11559a;
        Object remove = arrayList.remove(p7.t.l(arrayList));
        this.f11560b = true;
        return remove;
    }

    public final String U() {
        ArrayList arrayList = this.f11559a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return zb.l.Y(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        str.getClass();
        return U() + '.' + str;
    }

    public final void W(od.d0 d0Var, String str, String str2) {
        String str3;
        if (vc.o.V(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        String concat = str3.concat(str);
        throw t.e(-1, "Failed to parse literal '" + d0Var + "' as " + concat + " value at element: " + V(str2), F().toString());
    }

    @Override // md.c
    public md.a a(ld.e eVar) {
        eVar.getClass();
        od.l F = F();
        d0.d c4 = eVar.c();
        boolean a10 = nc.k.a(c4, ld.j.f9045p);
        od.c cVar = this.f11561c;
        if (!a10 && !(c4 instanceof ld.c)) {
            if (nc.k.a(c4, ld.j.f9046q)) {
                ld.e f8 = t.f(eVar.j(0), cVar.f10886b);
                d0.d c10 = f8.c();
                if (!(c10 instanceof ld.d) && !nc.k.a(c10, ld.i.f9043o)) {
                    throw t.c(f8);
                }
                String b10 = eVar.b();
                if (F instanceof od.z) {
                    return new y(cVar, (od.z) F);
                }
                throw t.e(-1, "Expected " + nc.u.a(od.z.class).c() + ", but had " + nc.u.a(F.getClass()).c() + " as the serialized body of " + b10 + " at element: " + U(), F.toString());
            }
            String b11 = eVar.b();
            if (F instanceof od.z) {
                return new w(cVar, (od.z) F, this.f11562d, 8);
            }
            throw t.e(-1, "Expected " + nc.u.a(od.z.class).c() + ", but had " + nc.u.a(F.getClass()).c() + " as the serialized body of " + b11 + " at element: " + U(), F.toString());
        }
        String b12 = eVar.b();
        if (F instanceof od.e) {
            return new x(cVar, (od.e) F);
        }
        throw t.e(-1, "Expected " + nc.u.a(od.e.class).c() + ", but had " + nc.u.a(F.getClass()).c() + " as the serialized body of " + b12 + " at element: " + U(), F.toString());
    }

    @Override // md.a
    public void b(ld.e eVar) {
        eVar.getClass();
    }

    @Override // md.a
    public final k0.g c() {
        return this.f11561c.f10886b;
    }

    @Override // md.c
    public final md.c d(ld.e eVar) {
        eVar.getClass();
        if (zb.l.a0(this.f11559a) != null) {
            return L(T(), eVar);
        }
        return new v(this.f11561c, S(), this.f11562d).d(eVar);
    }

    @Override // md.c
    public final long e() {
        return N(T());
    }

    @Override // md.a
    public final long f(ld.e eVar, int i2) {
        eVar.getClass();
        return N(R(eVar, i2));
    }

    @Override // md.c
    public final boolean h() {
        return G(T());
    }

    @Override // md.c
    public boolean i() {
        return !(F() instanceof od.v);
    }

    @Override // md.c
    public final char j() {
        return I(T());
    }

    @Override // md.a
    public final md.c k(e1 e1Var, int i2) {
        e1Var.getClass();
        return L(R(e1Var, i2), e1Var.j(i2));
    }

    @Override // md.a
    public final short l(e1 e1Var, int i2) {
        e1Var.getClass();
        return O(R(e1Var, i2));
    }

    @Override // md.a
    public final String m(ld.e eVar, int i2) {
        eVar.getClass();
        return P(R(eVar, i2));
    }

    @Override // md.a
    public final int n(ld.e eVar, int i2) {
        eVar.getClass();
        return M(R(eVar, i2));
    }

    @Override // md.a
    public final Object o(ld.e eVar, int i2, jd.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        this.f11559a.add(R(eVar, i2));
        aVar.getClass();
        Object t5 = t(aVar);
        if (!this.f11560b) {
            T();
        }
        this.f11560b = false;
        return t5;
    }

    @Override // md.c
    public final int p(ld.e eVar) {
        eVar.getClass();
        String str = (String) T();
        str.getClass();
        od.l E = E(str);
        String b10 = eVar.b();
        if (E instanceof od.d0) {
            return t.k(eVar, this.f11561c, ((od.d0) E).a(), "");
        }
        throw t.e(-1, "Expected " + nc.u.a(od.d0.class).c() + ", but had " + nc.u.a(E.getClass()).c() + " as the serialized body of " + b10 + " at element: " + V(str), E.toString());
    }

    @Override // md.a
    public final float q(e1 e1Var, int i2) {
        e1Var.getClass();
        return K(R(e1Var, i2));
    }

    @Override // md.a
    public final Object r(ld.e eVar, int i2, jd.a aVar, Object obj) {
        Object t5;
        eVar.getClass();
        aVar.getClass();
        this.f11559a.add(R(eVar, i2));
        if (!aVar.e().h() && !i()) {
            t5 = null;
        } else {
            t5 = t(aVar);
        }
        if (!this.f11560b) {
            T();
        }
        this.f11560b = false;
        return t5;
    }

    @Override // od.j
    public final od.l s() {
        return F();
    }

    @Override // md.c
    public final Object t(jd.a aVar) {
        aVar.getClass();
        if (aVar instanceof nd.b) {
            od.c cVar = this.f11561c;
            o1 o1Var = cVar.f10885a;
            nd.b bVar = (nd.b) aVar;
            String h2 = t.h(bVar.e(), cVar);
            od.l F = F();
            String b10 = bVar.e().b();
            if (F instanceof od.z) {
                od.z zVar = (od.z) F;
                od.l lVar = (od.l) zVar.get(h2);
                String str = null;
                if (lVar != null) {
                    od.d0 g10 = od.m.g(lVar);
                    if (!(g10 instanceof od.v)) {
                        str = g10.a();
                    }
                }
                try {
                    return t.p(cVar, h2, zVar, a.a.r((nd.b) aVar, this, str));
                } catch (jd.h e6) {
                    String message = e6.getMessage();
                    message.getClass();
                    throw t.e(-1, message, zVar.toString());
                }
            }
            throw t.e(-1, "Expected " + nc.u.a(od.z.class).c() + ", but had " + nc.u.a(F.getClass()).c() + " as the serialized body of " + b10 + " at element: " + U(), F.toString());
        }
        return aVar.a(this);
    }

    @Override // md.c
    public final int u() {
        return M(T());
    }

    @Override // md.c
    public final byte v() {
        return H(T());
    }

    @Override // md.a
    public final boolean w(ld.e eVar, int i2) {
        eVar.getClass();
        return G(R(eVar, i2));
    }

    @Override // md.a
    public final char x(e1 e1Var, int i2) {
        e1Var.getClass();
        return I(R(e1Var, i2));
    }

    @Override // md.a
    public final double y(e1 e1Var, int i2) {
        e1Var.getClass();
        return J(R(e1Var, i2));
    }

    @Override // md.a
    public final byte z(e1 e1Var, int i2) {
        e1Var.getClass();
        return H(R(e1Var, i2));
    }
}
