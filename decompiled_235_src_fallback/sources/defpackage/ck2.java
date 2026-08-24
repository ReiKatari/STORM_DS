package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck2  reason: default package */
/* loaded from: classes.dex */
public final class ck2 {
    public static final defpackage.ck2 d = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;

    static {
            ck2 r0 = new ck2
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r1, r2)
            defpackage.ck2.d = r0
            ck2 r0 = new ck2
            java.lang.String r1 = "  "
            r2 = 1
            java.lang.String r3 = "\n"
            r0.<init>(r3, r1, r2)
            return
    }

    public ck2(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "[\r\n]*"
            boolean r0 = r3.matches(r0)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r0 = "[ \t]*"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L1b
            r2.a = r3
            r2.b = r4
            r2.c = r5
            return
        L1b:
            java.lang.String r2 = "Only combinations of spaces and tabs are allowed in indent."
            defpackage.i.h(r2)
            throw r1
        L21:
            java.lang.String r2 = "Only combinations of \\n and \\r are allowed in newline."
            defpackage.i.h(r2)
            throw r1
    }
}
