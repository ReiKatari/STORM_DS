package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by2  reason: default package */
/* loaded from: classes.dex */
public final class by2 extends defpackage.pr2 {
    private static final defpackage.by2 DEFAULT_INSTANCE = null;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
            by2 r0 = new by2
            r0.<init>()
            defpackage.by2.DEFAULT_INSTANCE = r0
            java.lang.Class<by2> r1 = defpackage.by2.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public static defpackage.by2 m() {
            by2 r0 = defpackage.by2.DEFAULT_INSTANCE
            return r0
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.ay2.a
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 0
            switch(r2) {
                case 1: goto L4d;
                case 2: goto L45;
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
            ys4 r2 = defpackage.by2.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<by2> r3 = defpackage.by2.class
            monitor-enter(r3)
            ys4 r2 = defpackage.by2.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.by2.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            by2 r2 = defpackage.by2.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "hash_"
            java.lang.String r3 = "tagSize_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b"
            by2 r0 = defpackage.by2.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L45:
            wa r2 = new wa
            by2 r3 = defpackage.by2.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4d:
            by2 r2 = new by2
            r2.<init>()
            return r2
    }

    public final defpackage.sw2 n() {
            r0 = this;
            int r0 = r0.hash_
            sw2 r0 = defpackage.sw2.forNumber(r0)
            if (r0 != 0) goto La
            sw2 r0 = defpackage.sw2.UNRECOGNIZED
        La:
            return r0
    }

    public final int o() {
            r0 = this;
            int r0 = r0.tagSize_
            return r0
    }
}
