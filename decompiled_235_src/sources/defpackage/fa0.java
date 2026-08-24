package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa0  reason: default package */
/* loaded from: classes.dex */
public final class fa0 {
    public static final String c;
    public static final Set d;
    public static final fa0 e;
    public final String a;
    public final String b;

    static {
        String A = jx2.A("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = A;
        jx2.A("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        jx2.A("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c42("proto"), new c42("json"))));
        e = new fa0(A, null);
    }

    public fa0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static fa0 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        String str2 = null;
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str3 = split[0];
                if (!str3.isEmpty()) {
                    String str4 = split[1];
                    if (!str4.isEmpty()) {
                        str2 = str4;
                    }
                    return new fa0(str3, str2);
                }
                i.h("Missing endpoint in CCTDestination extras");
                return null;
            }
            i.h("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        i.h("Version marker missing from extras");
        return null;
    }
}
