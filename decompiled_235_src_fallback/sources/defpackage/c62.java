package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c62  reason: default package */
/* loaded from: classes.dex */
public abstract class c62 {
    public static final java.util.regex.Pattern a = null;
    public static final java.util.regex.Pattern b = null;
    public static final java.util.regex.Pattern c = null;
    public static final defpackage.x31 d = null;

    static {
            java.lang.String r0 = "[\\\\&]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.c62.a = r0
            java.lang.String r0 = "\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            defpackage.c62.b = r0
            java.lang.String r0 = "(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "[ \t\r\n]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.c62.c = r0
            x31 r0 = new x31
            r1 = 4
            r0.<init>(r1)
            defpackage.c62.d = r0
            return
    }

    public static java.lang.String a(java.lang.String r6) {
            java.util.regex.Pattern r0 = defpackage.c62.a
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r0 = r0.find()
            if (r0 == 0) goto L69
            java.util.regex.Pattern r0 = defpackage.c62.b
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r1 = r0.find()
            if (r1 != 0) goto L19
            goto L69
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r6.length()
            int r2 = r2 + 16
            r1.<init>(r2)
            r2 = 0
            r3 = r2
        L26:
            int r4 = r0.start()
            r1.append(r6, r3, r4)
            java.lang.String r3 = r0.group()
            x31 r4 = defpackage.c62.d
            r4.getClass()
            char r4 = r3.charAt(r2)
            r5 = 92
            if (r4 != r5) goto L47
            r4 = 1
            int r5 = r3.length()
            r1.append(r3, r4, r5)
            goto L4e
        L47:
            java.lang.String r3 = defpackage.yy2.a(r3)
            r1.append(r3)
        L4e:
            int r3 = r0.end()
            boolean r4 = r0.find()
            if (r4 != 0) goto L26
            int r0 = r6.length()
            if (r3 == r0) goto L65
            int r0 = r6.length()
            r1.append(r6, r3, r0)
        L65:
            java.lang.String r6 = r1.toString()
        L69:
            return r6
    }
}
