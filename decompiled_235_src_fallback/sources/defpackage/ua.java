package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua  reason: default package */
/* loaded from: classes.dex */
public final class ua extends defpackage.pr2 {
    private static final defpackage.ua DEFAULT_INSTANCE = null;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private defpackage.ea0 keyValue_;
    private defpackage.db params_;
    private int version_;

    static {
            ua r0 = new ua
            r0.<init>()
            defpackage.ua.DEFAULT_INSTANCE = r0
            java.lang.Class<ua> r1 = defpackage.ua.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public ua() {
            r1 = this;
            r1.<init>()
            ca0 r0 = defpackage.ea0.B
            r1.keyValue_ = r0
            return
    }

    public static void m(defpackage.ua r1) {
            r0 = 0
            r1.version_ = r0
            return
    }

    public static void n(defpackage.ua r0, defpackage.db r1) {
            r0.getClass()
            r1.getClass()
            r0.params_ = r1
            return
    }

    public static void o(defpackage.ua r0, defpackage.ca0 r1) {
            r0.getClass()
            r0.keyValue_ = r1
            return
    }

    public static defpackage.ta s() {
            ua r0 = defpackage.ua.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            ta r0 = (defpackage.ta) r0
            return r0
    }

    public static defpackage.ua t(defpackage.ea0 r1, defpackage.g82 r2) {
            ua r0 = defpackage.ua.DEFAULT_INSTANCE
            pr2 r1 = defpackage.pr2.j(r0, r1, r2)
            ua r1 = (defpackage.ua) r1
            return r1
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.sa.a
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 0
            switch(r2) {
                case 1: goto L4f;
                case 2: goto L47;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L16;
                case 6: goto L10;
                case 7: goto Lf;
                default: goto Lc;
            }
        Lc:
            defpackage.e41.t()
        Lf:
            return r3
        L10:
            r2 = 1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
        L16:
            ys4 r2 = defpackage.ua.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<ua> r3 = defpackage.ua.class
            monitor-enter(r3)
            ys4 r2 = defpackage.ua.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.ua.PARSER = r2     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r2 = move-exception
            goto L2d
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            return r2
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r2
        L2f:
            return r2
        L30:
            ua r2 = defpackage.ua.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "version_"
            java.lang.String r3 = "params_"
            java.lang.String r0 = "keyValue_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"
            ua r0 = defpackage.ua.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L47:
            ta r2 = new ta
            ua r3 = defpackage.ua.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4f:
            ua r2 = new ua
            r2.<init>()
            return r2
    }

    public final defpackage.ea0 p() {
            r0 = this;
            ea0 r0 = r0.keyValue_
            return r0
    }

    public final defpackage.db q() {
            r0 = this;
            db r0 = r0.params_
            if (r0 != 0) goto L8
            db r0 = defpackage.db.n()
        L8:
            return r0
    }

    public final int r() {
            r0 = this;
            int r0 = r0.version_
            return r0
    }
}
