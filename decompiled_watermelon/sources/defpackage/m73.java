package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m73  reason: default package */
/* loaded from: classes.dex */
public abstract class m73 {
    public static final iz2 a = sn2.a(yg6.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final k83 a(Integer num) {
        if (num == null) {
            return b83.INSTANCE;
        }
        return new x73(false, num);
    }

    public static final k83 b(String str) {
        if (str == null) {
            return b83.INSTANCE;
        }
        return new x73(true, str);
    }

    public static final void c(k73 k73Var, String str) {
        throw new IllegalArgumentException("Element " + q75.a(k73Var.getClass()) + " is not a " + str);
    }

    public static final Boolean d(k83 k83Var) {
        String b = k83Var.b();
        String[] strArr = xg6.a;
        b.getClass();
        if (b.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (b.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int e(k83 k83Var) {
        try {
            long i = i(k83Var);
            if (-2147483648L <= i && i <= 2147483647L) {
                return (int) i;
            }
            String b = k83Var.b();
            throw new NumberFormatException(b + " is not an Int");
        } catch (h73 e) {
            throw new NumberFormatException(e.A);
        }
    }

    public static final y63 f(k73 k73Var) {
        y63 y63Var;
        k73Var.getClass();
        if (k73Var instanceof y63) {
            y63Var = (y63) k73Var;
        } else {
            y63Var = null;
        }
        if (y63Var != null) {
            return y63Var;
        }
        c(k73Var, "JsonArray");
        throw null;
    }

    public static final f83 g(k73 k73Var) {
        f83 f83Var;
        k73Var.getClass();
        if (k73Var instanceof f83) {
            f83Var = (f83) k73Var;
        } else {
            f83Var = null;
        }
        if (f83Var != null) {
            return f83Var;
        }
        c(k73Var, "JsonObject");
        throw null;
    }

    public static final k83 h(k73 k73Var) {
        k83 k83Var;
        k73Var.getClass();
        if (k73Var instanceof k83) {
            k83Var = (k83) k73Var;
        } else {
            k83Var = null;
        }
        if (k83Var != null) {
            return k83Var;
        }
        c(k73Var, "JsonPrimitive");
        throw null;
    }

    public static final long i(k83 k83Var) {
        int i;
        String str;
        wg6 e = ep2.e(t63.d, k83Var.b());
        String str2 = e.Z;
        long j = e.j();
        if (e.g() != 10) {
            int i2 = e.B;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            if (i2 != str2.length() && i >= 0) {
                str = String.valueOf(str2.charAt(i));
            } else {
                str = "EOF";
            }
            t0.q(e, wh1.A("Expected input to contain a single valid number, but got '", str, "' after it"), i, null, 4);
            throw null;
        }
        return j;
    }
}
