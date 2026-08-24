package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd3  reason: default package */
/* loaded from: classes.dex */
public abstract class fd3 {
    public static final defpackage.gr1 a = null;
    public static final defpackage.gr1 b = null;
    public static final defpackage.gr1 c = null;
    public static final defpackage.gr1 d = null;
    public static final defpackage.gr1 e = null;
    public static final defpackage.rt1 f = null;
    public static final defpackage.rt1 g = null;

    static {
            gr1 r0 = new gr1
            java.lang.String r1 = "COMPLETING_ALREADY"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.fd3.a = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1, r2)
            defpackage.fd3.b = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1, r2)
            defpackage.fd3.c = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1, r2)
            defpackage.fd3.d = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "SEALED"
            r0.<init>(r1, r2)
            defpackage.fd3.e = r0
            rt1 r0 = new rt1
            r1 = 0
            r0.<init>(r1)
            defpackage.fd3.f = r0
            rt1 r0 = new rt1
            r1 = 1
            r0.<init>(r1)
            defpackage.fd3.g = r0
            return
    }

    public static final java.lang.Object a(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.f43
            if (r0 == 0) goto L8
            r0 = r1
            f43 r0 = (defpackage.f43) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            e43 r0 = r0.a
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            return r1
    }
}
