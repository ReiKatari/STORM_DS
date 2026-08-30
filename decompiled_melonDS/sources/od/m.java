package od;

import nd.a1;
import nd.g0;
import nd.o1;
import pd.i0;
import pd.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f10897a = a1.a("kotlinx.serialization.json.JsonUnquotedLiteral", o1.f10343a);

    public static final d0 a(Integer num) {
        return new s(false, num);
    }

    public static final void b(l lVar, String str) {
        throw new IllegalArgumentException("Element " + nc.u.a(lVar.getClass()) + " is not a " + str);
    }

    public static final boolean c(d0 d0Var) {
        Boolean bool;
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
        throw new IllegalStateException(d0Var + " does not represent a Boolean");
    }

    public static final int d(d0 d0Var) {
        try {
            long h2 = h(d0Var);
            if (-2147483648L <= h2 && h2 <= 2147483647L) {
                return (int) h2;
            }
            String a10 = d0Var.a();
            throw new NumberFormatException(a10 + " is not an Int");
        } catch (pd.p e6) {
            throw new NumberFormatException(e6.getMessage());
        }
    }

    public static final e e(l lVar) {
        e eVar;
        lVar.getClass();
        if (lVar instanceof e) {
            eVar = (e) lVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        b(lVar, "JsonArray");
        throw null;
    }

    public static final z f(l lVar) {
        z zVar;
        lVar.getClass();
        if (lVar instanceof z) {
            zVar = (z) lVar;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            return zVar;
        }
        b(lVar, "JsonObject");
        throw null;
    }

    public static final d0 g(l lVar) {
        d0 d0Var;
        if (lVar instanceof d0) {
            d0Var = (d0) lVar;
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            return d0Var;
        }
        b(lVar, "JsonPrimitive");
        throw null;
    }

    public static final long h(d0 d0Var) {
        String str;
        i0 i0Var = new i0(d0Var.a());
        long i2 = i0Var.i();
        if (i0Var.f() != 10) {
            int i10 = i0Var.f11551a;
            int i11 = i10 - 1;
            String str2 = i0Var.f11588e;
            if (i10 != str2.length() && i11 >= 0) {
                str = String.valueOf(str2.charAt(i11));
            } else {
                str = "EOF";
            }
            pd.a.p(i0Var, kc.a.g("Expected input to contain a single valid number, but got '", str, "' after it"), i11, null, 4);
            throw null;
        }
        return i2;
    }
}
