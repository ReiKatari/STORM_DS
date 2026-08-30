package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw4  reason: default package */
/* loaded from: classes.dex */
public final class cw4 {
    public static dw4 a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        str.getClass();
        dw4 dw4Var = dw4.HTTP_1_0;
        str2 = dw4Var.protocol;
        if (str.equals(str2)) {
            return dw4Var;
        }
        dw4 dw4Var2 = dw4.HTTP_1_1;
        str3 = dw4Var2.protocol;
        if (str.equals(str3)) {
            return dw4Var2;
        }
        dw4 dw4Var3 = dw4.H2_PRIOR_KNOWLEDGE;
        str4 = dw4Var3.protocol;
        if (str.equals(str4)) {
            return dw4Var3;
        }
        dw4 dw4Var4 = dw4.HTTP_2;
        str5 = dw4Var4.protocol;
        if (str.equals(str5)) {
            return dw4Var4;
        }
        dw4 dw4Var5 = dw4.SPDY_3;
        str6 = dw4Var5.protocol;
        if (str.equals(str6)) {
            return dw4Var5;
        }
        dw4 dw4Var6 = dw4.QUIC;
        str7 = dw4Var6.protocol;
        if (str.equals(str7)) {
            return dw4Var6;
        }
        dw4 dw4Var7 = dw4.HTTP_3;
        str8 = dw4Var7.protocol;
        if (gh6.n0(str, str8, false)) {
            return dw4Var7;
        }
        f81.j("Unexpected protocol: ".concat(str));
        return null;
    }
}
