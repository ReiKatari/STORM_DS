package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni3  reason: default package */
/* loaded from: classes.dex */
public final class ni3 extends defpackage.pr2 {
    private static final defpackage.ni3 DEFAULT_INSTANCE = null;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private defpackage.z93 keyInfo_;
    private int primaryKeyId_;

    static {
            ni3 r0 = new ni3
            r0.<init>()
            defpackage.ni3.DEFAULT_INSTANCE = r0
            java.lang.Class<ni3> r1 = defpackage.ni3.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public ni3() {
            r1 = this;
            r1.<init>()
            z45 r0 = defpackage.z45.R
            r1.keyInfo_ = r0
            return
    }

    public static void m(defpackage.ni3 r0, int r1) {
            r0.primaryKeyId_ = r1
            return
    }

    public static void n(defpackage.ni3 r2, defpackage.mi3 r3) {
            r2.getClass()
            z93 r0 = r2.keyInfo_
            r1 = r0
            j1 r1 = (defpackage.j1) r1
            boolean r1 = r1.A
            if (r1 != 0) goto L1d
            int r1 = r0.size()
            if (r1 != 0) goto L15
            r1 = 10
            goto L17
        L15:
            int r1 = r1 * 2
        L17:
            z93 r0 = r0.k(r1)
            r2.keyInfo_ = r0
        L1d:
            z93 r2 = r2.keyInfo_
            r2.add(r3)
            return
    }

    public static defpackage.ki3 p() {
            ni3 r0 = defpackage.ni3.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            ki3 r0 = (defpackage.ki3) r0
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
            ys4 r2 = defpackage.ni3.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<ni3> r3 = defpackage.ni3.class
            monitor-enter(r3)
            ys4 r2 = defpackage.ni3.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.ni3.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            ni3 r2 = defpackage.ni3.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "primaryKeyId_"
            java.lang.String r3 = "keyInfo_"
            java.lang.Class<mi3> r0 = defpackage.mi3.class
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            ni3 r0 = defpackage.ni3.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L47:
            ki3 r2 = new ki3
            ni3 r3 = defpackage.ni3.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4f:
            ni3 r2 = new ni3
            r2.<init>()
            return r2
    }

    public final defpackage.mi3 o() {
            r1 = this;
            r0 = 0
            z93 r1 = r1.keyInfo_
            java.lang.Object r1 = r1.get(r0)
            mi3 r1 = (defpackage.mi3) r1
            return r1
    }
}
