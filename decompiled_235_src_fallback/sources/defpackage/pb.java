package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb  reason: default package */
/* loaded from: classes.dex */
public final class pb extends defpackage.pr2 {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final defpackage.pb DEFAULT_INSTANCE = null;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile defpackage.ys4 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    static {
            pb r0 = new pb
            r0.<init>()
            defpackage.pb.DEFAULT_INSTANCE = r0
            java.lang.Class<pb> r1 = defpackage.pb.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public static void m(defpackage.pb r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            r1.ciphertextSegmentSize_ = r0
            return
    }

    public static void n(defpackage.pb r1) {
            r0 = 32
            r1.derivedKeySize_ = r0
            return
    }

    public static void o(defpackage.pb r0, defpackage.sw2 r1) {
            r0.getClass()
            int r1 = r1.getNumber()
            r0.hkdfHashType_ = r1
            return
    }

    public static defpackage.pb q() {
            pb r0 = defpackage.pb.DEFAULT_INSTANCE
            return r0
    }

    public static defpackage.ob t() {
            pb r0 = defpackage.pb.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            ob r0 = (defpackage.ob) r0
            return r0
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.nb.a
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
            ys4 r2 = defpackage.pb.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<pb> r3 = defpackage.pb.class
            monitor-enter(r3)
            ys4 r2 = defpackage.pb.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.pb.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            pb r2 = defpackage.pb.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "ciphertextSegmentSize_"
            java.lang.String r3 = "derivedKeySize_"
            java.lang.String r0 = "hkdfHashType_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f"
            pb r0 = defpackage.pb.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L47:
            ob r2 = new ob
            pb r3 = defpackage.pb.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4f:
            pb r2 = new pb
            r2.<init>()
            return r2
    }

    public final int p() {
            r0 = this;
            int r0 = r0.ciphertextSegmentSize_
            return r0
    }

    public final int r() {
            r0 = this;
            int r0 = r0.derivedKeySize_
            return r0
    }

    public final defpackage.sw2 s() {
            r0 = this;
            int r0 = r0.hkdfHashType_
            sw2 r0 = defpackage.sw2.forNumber(r0)
            if (r0 != 0) goto La
            sw2 r0 = defpackage.sw2.UNRECOGNIZED
        La:
            return r0
    }
}
