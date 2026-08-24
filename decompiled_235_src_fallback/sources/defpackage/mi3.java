package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi3  reason: default package */
/* loaded from: classes.dex */
public final class mi3 extends defpackage.pr2 {
    private static final defpackage.mi3 DEFAULT_INSTANCE = null;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private java.lang.String typeUrl_;

    static {
            mi3 r0 = new mi3
            r0.<init>()
            defpackage.mi3.DEFAULT_INSTANCE = r0
            java.lang.Class<mi3> r1 = defpackage.mi3.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public mi3() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.typeUrl_ = r0
            return
    }

    public static void m(defpackage.mi3 r0, java.lang.String r1) {
            r0.getClass()
            r1.getClass()
            r0.typeUrl_ = r1
            return
    }

    public static void n(defpackage.mi3 r0, defpackage.jp4 r1) {
            r0.getClass()
            int r1 = r1.getNumber()
            r0.outputPrefixType_ = r1
            return
    }

    public static void o(defpackage.mi3 r0, defpackage.hh3 r1) {
            r0.getClass()
            int r1 = r1.getNumber()
            r0.status_ = r1
            return
    }

    public static void p(defpackage.mi3 r0, int r1) {
            r0.keyId_ = r1
            return
    }

    public static defpackage.li3 r() {
            mi3 r0 = defpackage.mi3.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            li3 r0 = (defpackage.li3) r0
            return r0
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.ji3.a
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 0
            switch(r2) {
                case 1: goto L51;
                case 2: goto L49;
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
            ys4 r2 = defpackage.mi3.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<mi3> r3 = defpackage.mi3.class
            monitor-enter(r3)
            ys4 r2 = defpackage.mi3.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.mi3.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            mi3 r2 = defpackage.mi3.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "typeUrl_"
            java.lang.String r3 = "status_"
            java.lang.String r0 = "keyId_"
            java.lang.String r1 = "outputPrefixType_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0, r1}
            java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f"
            mi3 r0 = defpackage.mi3.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L49:
            li3 r2 = new li3
            mi3 r3 = defpackage.mi3.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L51:
            mi3 r2 = new mi3
            r2.<init>()
            return r2
    }

    public final int q() {
            r0 = this;
            int r0 = r0.keyId_
            return r0
    }
}
