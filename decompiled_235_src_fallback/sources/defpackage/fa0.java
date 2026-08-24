package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa0  reason: default package */
/* loaded from: classes.dex */
public final class fa0 {
    public static final java.lang.String c = null;
    public static final java.util.Set d = null;
    public static final defpackage.fa0 e = null;
    public final java.lang.String a;
    public final java.lang.String b;

    static {
            java.lang.String r0 = "hts/frbslgiggolai.o/0clgbthfra=snpoo"
            java.lang.String r1 = "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3"
            java.lang.String r0 = defpackage.jx2.A(r0, r1)
            defpackage.fa0.c = r0
            java.lang.String r1 = "hts/frbslgigp.ogepscmv/ieo/eaybtho"
            java.lang.String r2 = "tp:/ieaeogn-agolai.o/1frlglgc/aclg"
            defpackage.jx2.A(r1, r2)
            java.lang.String r1 = "AzSCki82AwsLzKd5O8zo"
            java.lang.String r2 = "IayckHiZRO1EFl1aGoK"
            defpackage.jx2.A(r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            c42 r2 = new c42
            java.lang.String r3 = "proto"
            r2.<init>(r3)
            c42 r3 = new c42
            java.lang.String r4 = "json"
            r3.<init>(r4)
            c42[] r2 = new defpackage.c42[]{r2, r3}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            defpackage.fa0.d = r1
            fa0 r1 = new fa0
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.fa0.e = r1
            return
    }

    public fa0(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static defpackage.fa0 a(byte[] r4) {
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r4, r1)
            java.lang.String r4 = "1$"
            boolean r4 = r0.startsWith(r4)
            r1 = 0
            if (r4 == 0) goto L4c
            r4 = 2
            java.lang.String r0 = r0.substring(r4)
            java.lang.String r2 = "\\"
            java.lang.String r2 = java.util.regex.Pattern.quote(r2)
            java.lang.String[] r0 = r0.split(r2, r4)
            int r2 = r0.length
            if (r2 != r4) goto L46
            r4 = 0
            r4 = r0[r4]
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L40
            r2 = 1
            r0 = r0[r2]
            fa0 r2 = new fa0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r1 = r0
        L3c:
            r2.<init>(r4, r1)
            return r2
        L40:
            java.lang.String r4 = "Missing endpoint in CCTDestination extras"
            defpackage.i.h(r4)
            return r1
        L46:
            java.lang.String r4 = "Extra is not a valid encoded LegacyFlgDestination"
            defpackage.i.h(r4)
            return r1
        L4c:
            java.lang.String r4 = "Version marker missing from extras"
            defpackage.i.h(r4)
            return r1
    }
}
