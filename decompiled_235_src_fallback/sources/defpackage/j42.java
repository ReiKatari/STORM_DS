package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j42  reason: default package */
/* loaded from: classes.dex */
public final class j42 extends defpackage.pr2 {
    private static final defpackage.j42 DEFAULT_INSTANCE = null;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile defpackage.ys4 PARSER;
    private defpackage.ea0 encryptedKeyset_;
    private defpackage.ni3 keysetInfo_;

    static {
            j42 r0 = new j42
            r0.<init>()
            defpackage.j42.DEFAULT_INSTANCE = r0
            java.lang.Class<j42> r1 = defpackage.j42.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public j42() {
            r1 = this;
            r1.<init>()
            ca0 r0 = defpackage.ea0.B
            r1.encryptedKeyset_ = r0
            return
    }

    public static void m(defpackage.j42 r0, defpackage.ca0 r1) {
            r0.getClass()
            r0.encryptedKeyset_ = r1
            return
    }

    public static void n(defpackage.j42 r0, defpackage.ni3 r1) {
            r0.getClass()
            r0.keysetInfo_ = r1
            return
    }

    public static defpackage.i42 p() {
            j42 r0 = defpackage.j42.DEFAULT_INSTANCE
            mr2 r0 = r0.e()
            i42 r0 = (defpackage.i42) r0
            return r0
    }

    public static defpackage.j42 q(byte[] r1, defpackage.g82 r2) {
            j42 r0 = defpackage.j42.DEFAULT_INSTANCE
            pr2 r1 = defpackage.pr2.k(r0, r1, r2)
            j42 r1 = (defpackage.j42) r1
            return r1
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r3) {
            r2 = this;
            int[] r2 = defpackage.h42.a
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
            ys4 r2 = defpackage.j42.PARSER
            if (r2 != 0) goto L2f
            java.lang.Class<j42> r3 = defpackage.j42.class
            monitor-enter(r3)
            ys4 r2 = defpackage.j42.PARSER     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            nr2 r2 = new nr2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.j42.PARSER = r2     // Catch: java.lang.Throwable -> L29
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
            j42 r2 = defpackage.j42.DEFAULT_INSTANCE
            return r2
        L33:
            java.lang.String r2 = "encryptedKeyset_"
            java.lang.String r3 = "keysetInfo_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t"
            j42 r0 = defpackage.j42.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r3, r2)
            return r1
        L45:
            i42 r2 = new i42
            j42 r3 = defpackage.j42.DEFAULT_INSTANCE
            r2.<init>(r3)
            return r2
        L4d:
            j42 r2 = new j42
            r2.<init>()
            return r2
    }

    public final defpackage.ea0 o() {
            r0 = this;
            ea0 r0 = r0.encryptedKeyset_
            return r0
    }
}
