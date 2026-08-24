package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh3  reason: default package */
/* loaded from: classes.dex */
public final class mh3 extends defpackage.pr2 {
    private static final defpackage.mh3 DEFAULT_INSTANCE = null;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private java.lang.String typeUrl_;
    private defpackage.ea0 value_;

    static {
            mh3 r0 = new mh3
            r0.<init>()
            defpackage.mh3.DEFAULT_INSTANCE = r0
            java.lang.Class<mh3> r1 = defpackage.mh3.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public mh3() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.typeUrl_ = r0
            ca0 r0 = defpackage.ea0.B
            r1.value_ = r0
            return
    }

    public static void m(defpackage.mh3 r1) {
            r1.getClass()
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"
            r1.typeUrl_ = r0
            return
    }

    public static void n(defpackage.mh3 r0, defpackage.ca0 r1) {
            r0.getClass()
            r0.value_ = r1
            return
    }

    public static void o(defpackage.mh3 r0, defpackage.jp4 r1) {
            r0.getClass()
            int r1 = r1.getNumber()
            r0.outputPrefixType_ = r1
            return
    }

    public static defpackage.kh3 s() {
            mh3 r0 = defpackage.mh3.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            kh3 r0 = (defpackage.kh3) r0
            return r0
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.ih3.a
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
            ys4 r2 = defpackage.mh3.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<mh3> r3 = defpackage.mh3.class
            monitor-enter(r3)
            ys4 r2 = defpackage.mh3.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.mh3.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            mh3 r2 = defpackage.mh3.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "typeUrl_"
            java.lang.String r3 = "value_"
            java.lang.String r0 = "outputPrefixType_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f"
            mh3 r0 = defpackage.mh3.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L47:
            kh3 r2 = new kh3
            mh3 r3 = defpackage.mh3.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4f:
            mh3 r2 = new mh3
            r2.<init>()
            return r2
    }

    public final defpackage.jp4 p() {
            r0 = this;
            int r0 = r0.outputPrefixType_
            jp4 r0 = defpackage.jp4.forNumber(r0)
            if (r0 != 0) goto La
            jp4 r0 = defpackage.jp4.UNRECOGNIZED
        La:
            return r0
    }

    public final java.lang.String q() {
            r0 = this;
            java.lang.String r0 = r0.typeUrl_
            return r0
    }

    public final defpackage.ea0 r() {
            r0 = this;
            ea0 r0 = r0.value_
            return r0
    }
}
