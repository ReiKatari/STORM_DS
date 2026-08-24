package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr2  reason: default package */
/* loaded from: classes.dex */
public final class lr2 implements defpackage.h54 {
    public static final defpackage.lr2 b = null;
    public final /* synthetic */ int a;

    static {
            lr2 r0 = new lr2
            r1 = 0
            r0.<init>(r1)
            defpackage.lr2.b = r0
            return
    }

    public /* synthetic */ lr2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.h54
    public final defpackage.wd5 a(java.lang.Class r3) {
            r2 = this;
            int r2 = r2.a
            switch(r2) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This should never be called."
            r2.<init>(r3)
            throw r2
        Ld:
            java.lang.Class<pr2> r2 = defpackage.pr2.class
            boolean r0 = r2.isAssignableFrom(r3)
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.Exception -> L28
            pr2 r2 = defpackage.pr2.g(r2)     // Catch: java.lang.Exception -> L28
            or2 r0 = defpackage.or2.BUILD_MESSAGE_INFO     // Catch: java.lang.Exception -> L28
            java.lang.Object r2 = r2.f(r0)     // Catch: java.lang.Exception -> L28
            wd5 r2 = (defpackage.wd5) r2     // Catch: java.lang.Exception -> L28
            r1 = r2
            goto L44
        L28:
            r2 = move-exception
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "Unable to get message info for "
            java.lang.String r3 = r0.concat(r3)
            defpackage.u34.p(r3, r2)
            goto L44
        L37:
            java.lang.String r2 = r3.getName()
            java.lang.String r3 = "Unsupported message type: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.i.h(r2)
        L44:
            return r1
    }

    @Override // defpackage.h54
    public final boolean b(java.lang.Class r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            java.lang.Class<pr2> r0 = defpackage.pr2.class
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }
}
