package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th3  reason: default package */
/* loaded from: classes.dex */
public final class th3 extends defpackage.pr2 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final defpackage.th3 DEFAULT_INSTANCE = null;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile defpackage.ys4 PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private java.lang.String catalogueName_;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private java.lang.String primitiveName_;
    private java.lang.String typeUrl_;

    static {
            th3 r0 = new th3
            r0.<init>()
            defpackage.th3.DEFAULT_INSTANCE = r0
            java.lang.Class<th3> r1 = defpackage.th3.class
            defpackage.pr2.l(r1, r0)
            return
    }

    public th3() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.primitiveName_ = r0
            r1.typeUrl_ = r0
            r1.catalogueName_ = r0
            return
    }

    @Override // defpackage.pr2
    public final java.lang.Object f(defpackage.or2 r4) {
            r3 = this;
            int[] r3 = defpackage.sh3.a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L53;
                case 2: goto L4b;
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
            return r4
        L10:
            r3 = 1
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L16:
            ys4 r3 = defpackage.th3.PARSER
            if (r3 != 0) goto L2f
            java.lang.Class<th3> r4 = defpackage.th3.class
            monitor-enter(r4)
            ys4 r3 = defpackage.th3.PARSER     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L2b
            nr2 r3 = new nr2     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            defpackage.th3.PARSER = r3     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r3 = move-exception
            goto L2d
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            return r3
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r3
        L2f:
            return r3
        L30:
            th3 r3 = defpackage.th3.DEFAULT_INSTANCE
            return r3
        L33:
            java.lang.String r3 = "primitiveName_"
            java.lang.String r4 = "typeUrl_"
            java.lang.String r0 = "keyManagerVersion_"
            java.lang.String r1 = "newKeyAllowed_"
            java.lang.String r2 = "catalogueName_"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r0, r1, r2}
            java.lang.String r4 = "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ"
            th3 r0 = defpackage.th3.DEFAULT_INSTANCE
            wd5 r1 = new wd5
            r1.<init>(r0, r4, r3)
            return r1
        L4b:
            wa r3 = new wa
            th3 r4 = defpackage.th3.DEFAULT_INSTANCE
            r3.<init>(r4)
            return r3
        L53:
            th3 r3 = new th3
            r3.<init>()
            return r3
    }
}
