package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy2  reason: default package */
/* loaded from: classes.dex */
public abstract class yy2 {
    public static final java.util.HashMap a = null;
    public static final java.util.regex.Pattern b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<yy2> r1 = defpackage.yy2.class
            java.lang.String r2 = "/org/commonmark/internal/util/entities.properties"
            java.io.InputStream r1 = r1.getResourceAsStream(r2)
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L61
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L61
            r4.<init>(r1, r2)     // Catch: java.io.IOException -> L61
            r3.<init>(r4)     // Catch: java.io.IOException -> L61
        L1d:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L41
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L2a
            goto L1d
        L2a:
            java.lang.String r2 = "="
            int r2 = r1.indexOf(r2)     // Catch: java.lang.Throwable -> L3f
            r4 = 0
            java.lang.String r4 = r1.substring(r4, r2)     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> L3f
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L3f
            goto L1d
        L3f:
            r0 = move-exception
            goto L56
        L41:
            r3.close()     // Catch: java.io.IOException -> L61
            java.lang.String r1 = "NewLine"
            java.lang.String r2 = "\n"
            r0.put(r1, r2)
            defpackage.yy2.a = r0
            java.lang.String r0 = "^&#[Xx]?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.yy2.b = r0
            return
        L56:
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.io.IOException -> L61
        L60:
            throw r1     // Catch: java.io.IOException -> L61
        L61:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed reading data for HTML named character references"
            r1.<init>(r2, r0)
            throw r1
    }

    public static java.lang.String a(java.lang.String r4) {
            java.util.regex.Pattern r0 = defpackage.yy2.b
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r1 = r0.find()
            r2 = 1
            if (r1 == 0) goto L3a
            int r1 = r0.end()
            r3 = 2
            if (r1 != r3) goto L17
            r1 = 10
            goto L19
        L17:
            r1 = 16
        L19:
            int r0 = r0.end()     // Catch: java.lang.IllegalArgumentException -> L37
            int r3 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L37
            int r3 = r3 - r2
            java.lang.String r4 = r4.substring(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L37
            int r4 = java.lang.Integer.parseInt(r4, r1)     // Catch: java.lang.IllegalArgumentException -> L37
            if (r4 != 0) goto L2d
            goto L37
        L2d:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> L37
            char[] r4 = java.lang.Character.toChars(r4)     // Catch: java.lang.IllegalArgumentException -> L37
            r0.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L37
            return r0
        L37:
            java.lang.String r4 = "�"
            return r4
        L3a:
            int r0 = r4.length()
            int r0 = r0 - r2
            java.lang.String r0 = r4.substring(r2, r0)
            java.util.HashMap r1 = defpackage.yy2.a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4e
            return r0
        L4e:
            return r4
    }
}
