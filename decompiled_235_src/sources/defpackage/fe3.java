package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe3  reason: default package */
/* loaded from: classes.dex */
public abstract class fe3 {
    public static final l53 a = hi2.a(ps6.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final df3 a(Integer num) {
        if (num == null) {
            return ue3.INSTANCE;
        }
        return new qe3(false, num);
    }

    public static final df3 b(String str) {
        if (str == null) {
            return ue3.INSTANCE;
        }
        return new qe3(true, str);
    }

    public static final void c(de3 de3Var, String str) {
        throw new IllegalArgumentException("Element " + gh5.a(de3Var.getClass()) + " is not a " + str);
    }

    public static final Boolean d(df3 df3Var) {
        String a2 = df3Var.a();
        String[] strArr = os6.a;
        a2.getClass();
        if (a2.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (a2.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int e(df3 df3Var) {
        try {
            long i = i(df3Var);
            if (-2147483648L <= i && i <= 2147483647L) {
                return (int) i;
            }
            String a2 = df3Var.a();
            throw new NumberFormatException(a2 + " is not an Int");
        } catch (ae3 e) {
            throw new NumberFormatException(e.A);
        }
    }

    public static final nd3 f(de3 de3Var) {
        nd3 nd3Var;
        de3Var.getClass();
        if (de3Var instanceof nd3) {
            nd3Var = (nd3) de3Var;
        } else {
            nd3Var = null;
        }
        if (nd3Var != null) {
            return nd3Var;
        }
        c(de3Var, "JsonArray");
        throw null;
    }

    public static final ye3 g(de3 de3Var) {
        ye3 ye3Var;
        de3Var.getClass();
        if (de3Var instanceof ye3) {
            ye3Var = (ye3) de3Var;
        } else {
            ye3Var = null;
        }
        if (ye3Var != null) {
            return ye3Var;
        }
        c(de3Var, "JsonObject");
        throw null;
    }

    public static final df3 h(de3 de3Var) {
        df3 df3Var;
        de3Var.getClass();
        if (de3Var instanceof df3) {
            df3Var = (df3) de3Var;
        } else {
            df3Var = null;
        }
        if (df3Var != null) {
            return df3Var;
        }
        c(de3Var, "JsonPrimitive");
        throw null;
    }

    public static final long i(df3 df3Var) {
        int i;
        String str;
        ns6 i2 = np2.i(id3.d, df3Var.a());
        String str2 = i2.Z;
        long j = i2.j();
        if (i2.g() != 10) {
            int i3 = i2.B;
            if (i3 > 0) {
                i = i3 - 1;
            } else {
                i = i3;
            }
            if (i3 != str2.length() && i >= 0) {
                str = String.valueOf(str2.charAt(i));
            } else {
                str = "EOF";
            }
            u0.q(i2, lb1.A("Expected input to contain a single valid number, but got '", str, "' after it"), i, null, 4);
            throw null;
        }
        return j;
    }
}
