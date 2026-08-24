package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip5  reason: default package */
/* loaded from: classes.dex */
public final class ip5 {
    public static final defpackage.ip5 d = null;
    public static final defpackage.ip5 e = null;
    public static final defpackage.ip5 f = null;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
            ip5 r0 = new ip5
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r1)
            defpackage.ip5.d = r0
            ip5 r0 = new ip5
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 1
            r0.<init>(r6, r4, r1)
            defpackage.ip5.e = r0
            ip5 r0 = new ip5
            r4 = 100
            r0.<init>(r6, r4, r1)
            ip5 r0 = new ip5
            r0.<init>(r1, r2, r6)
            defpackage.ip5.f = r0
            return
    }

    public ip5(boolean r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            if (r4 == 0) goto L10
            r1 = r1 ^ 1
            java.lang.String r2 = "shouldRetry must be false when completeWithoutFailure is set to true"
            defpackage.np2.s(r2, r1)
        L10:
            r0.c = r4
            return
    }
}
