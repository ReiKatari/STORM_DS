package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j55  reason: default package */
/* loaded from: classes.dex */
public final class j55 {
    public static k55 a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        str.getClass();
        k55 k55Var = k55.HTTP_1_0;
        str2 = k55Var.protocol;
        if (str.equals(str2)) {
            return k55Var;
        }
        k55 k55Var2 = k55.HTTP_1_1;
        str3 = k55Var2.protocol;
        if (str.equals(str3)) {
            return k55Var2;
        }
        k55 k55Var3 = k55.H2_PRIOR_KNOWLEDGE;
        str4 = k55Var3.protocol;
        if (str.equals(str4)) {
            return k55Var3;
        }
        k55 k55Var4 = k55.HTTP_2;
        str5 = k55Var4.protocol;
        if (str.equals(str5)) {
            return k55Var4;
        }
        k55 k55Var5 = k55.SPDY_3;
        str6 = k55Var5.protocol;
        if (str.equals(str6)) {
            return k55Var5;
        }
        k55 k55Var6 = k55.QUIC;
        str7 = k55Var6.protocol;
        if (str.equals(str7)) {
            return k55Var6;
        }
        k55 k55Var7 = k55.HTTP_3;
        str8 = k55Var7.protocol;
        if (xs6.g0(str, str8, false)) {
            return k55Var7;
        }
        e41.i("Unexpected protocol: ".concat(str));
        return null;
    }
}
