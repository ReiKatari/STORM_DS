package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci5  reason: default package */
/* loaded from: classes.dex */
public final class ci5 extends defpackage.pr2 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final defpackage.ci5 DEFAULT_INSTANCE = null;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile defpackage.ys4 PARSER;
    private java.lang.String configName_;
    private defpackage.z93 entry_;

    static {
            ci5 r0 = new ci5
            r0.<init>()
            defpackage.ci5.DEFAULT_INSTANCE = r0
            java.lang.Class<ci5> r1 = defpackage.ci5.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public ci5() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.configName_ = r0
            z45 r0 = defpackage.z45.R
            r1.entry_ = r0
            return
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.bi5.a
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
            ys4 r2 = defpackage.ci5.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<ci5> r3 = defpackage.ci5.class
            monitor-enter(r3)
            ys4 r2 = defpackage.ci5.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.ci5.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            ci5 r2 = defpackage.ci5.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "configName_"
            java.lang.String r3 = "entry_"
            java.lang.Class<th3> r0 = defpackage.th3.class
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b"
            ci5 r0 = defpackage.ci5.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L47:
            wa r2 = new wa
            ci5 r3 = defpackage.ci5.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4f:
            ci5 r2 = new ci5
            r2.<init>()
            return r2
    }
}
