package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii3  reason: default package */
/* loaded from: classes.dex */
public final class ii3 extends defpackage.pr2 {
    private static final defpackage.ii3 DEFAULT_INSTANCE = null;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private defpackage.z93 key_;
    private int primaryKeyId_;

    static {
            ii3 r0 = new ii3
            r0.<init>()
            defpackage.ii3.DEFAULT_INSTANCE = r0
            java.lang.Class<ii3> r1 = defpackage.ii3.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public ii3() {
            r1 = this;
            r1.<init>()
            z45 r0 = defpackage.z45.R
            r1.key_ = r0
            return
    }

    public static void m(defpackage.ii3 r0, int r1) {
            r0.primaryKeyId_ = r1
            return
    }

    public static void n(defpackage.ii3 r2, defpackage.hi3 r3) {
            r2.getClass()
            z93 r0 = r2.key_
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
            r2.key_ = r0
        L1d:
            z93 r2 = r2.key_
            r2.add(r3)
            return
    }

    public static defpackage.fi3 s() {
            ii3 r0 = defpackage.ii3.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            fi3 r0 = (defpackage.fi3) r0
            return r0
    }

    public static defpackage.ii3 t(byte[] r1, defpackage.g82 r2) {
            ii3 r0 = defpackage.ii3.DEFAULT_INSTANCE
            pr2 r1 = defpackage.pr2.k(r0, r1, r2)
            ii3 r1 = (defpackage.ii3) r1
            return r1
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.ei3.a
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
            ys4 r2 = defpackage.ii3.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<ii3> r3 = defpackage.ii3.class
            monitor-enter(r3)
            ys4 r2 = defpackage.ii3.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.ii3.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            ii3 r2 = defpackage.ii3.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "primaryKeyId_"
            java.lang.String r3 = "key_"
            java.lang.Class<hi3> r0 = defpackage.hi3.class
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            ii3 r0 = defpackage.ii3.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L47:
            fi3 r2 = new fi3
            ii3 r3 = defpackage.ii3.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4f:
            ii3 r2 = new ii3
            r2.<init>()
            return r2
    }

    public final defpackage.hi3 o(int r1) {
            r0 = this;
            z93 r0 = r0.key_
            java.lang.Object r0 = r0.get(r1)
            hi3 r0 = (defpackage.hi3) r0
            return r0
    }

    public final int p() {
            r0 = this;
            z93 r0 = r0.key_
            int r0 = r0.size()
            return r0
    }

    public final java.util.List q() {
            r0 = this;
            z93 r0 = r0.key_
            return r0
    }

    public final int r() {
            r0 = this;
            int r0 = r0.primaryKeyId_
            return r0
    }
}
