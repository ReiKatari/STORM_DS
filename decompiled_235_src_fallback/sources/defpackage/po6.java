package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po6  reason: default package */
/* loaded from: classes.dex */
public abstract class po6 {
    public static final boolean a = false;
    public static final defpackage.oo6 b = null;
    public static final defpackage.oo6 c = null;
    public static final java.util.List d = null;

    static {
            r0 = 0
            r1 = 1
            java.lang.String r2 = "java.sql.Date"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            defpackage.po6.a = r2
            if (r2 == 0) goto L3b
            oo6 r2 = new oo6
            java.lang.Class<java.sql.Date> r3 = java.sql.Date.class
            r2.<init>(r0, r3)
            defpackage.po6.b = r2
            oo6 r2 = new oo6
            java.lang.Class<java.sql.Timestamp> r3 = java.sql.Timestamp.class
            r2.<init>(r1, r3)
            defpackage.po6.c = r2
            r2 = 3
            zc7[] r2 = new defpackage.zc7[r2]
            lo6$a r3 = defpackage.lo6.b
            r2[r0] = r3
            ko6$a r0 = defpackage.ko6.b
            r2[r1] = r0
            mo6 r0 = defpackage.no6.b
            r1 = 2
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            defpackage.po6.d = r0
            goto L44
        L3b:
            r0 = 0
            defpackage.po6.b = r0
            defpackage.po6.c = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            defpackage.po6.d = r0
        L44:
            return
    }
}
