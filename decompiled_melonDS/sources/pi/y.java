package pi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {
    public static z a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        str.getClass();
        z zVar = z.HTTP_1_0;
        str2 = zVar.protocol;
        if (str.equals(str2)) {
            return zVar;
        }
        z zVar2 = z.HTTP_1_1;
        str3 = zVar2.protocol;
        if (str.equals(str3)) {
            return zVar2;
        }
        z zVar3 = z.H2_PRIOR_KNOWLEDGE;
        str4 = zVar3.protocol;
        if (str.equals(str4)) {
            return zVar3;
        }
        z zVar4 = z.HTTP_2;
        str5 = zVar4.protocol;
        if (str.equals(str5)) {
            return zVar4;
        }
        z zVar5 = z.SPDY_3;
        str6 = zVar5.protocol;
        if (str.equals(str6)) {
            return zVar5;
        }
        z zVar6 = z.QUIC;
        str7 = zVar6.protocol;
        if (str.equals(str7)) {
            return zVar6;
        }
        z zVar7 = z.HTTP_3;
        str8 = zVar7.protocol;
        if (vc.o.V(str, str8, false)) {
            return zVar7;
        }
        fj.j.h("Unexpected protocol: ".concat(str));
        return null;
    }
}
