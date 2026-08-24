package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l16  reason: default package */
/* loaded from: classes.dex */
public enum l16 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.l16[] $VALUES = null;
    public static final defpackage.l16 AUTOMATIC = null;
    public static final defpackage.l16 TRUNCATE = null;
    public static final defpackage.l16 WRITE_AHEAD_LOGGING = null;

    private static final /* synthetic */ defpackage.l16[] $values() {
            l16 r0 = defpackage.l16.AUTOMATIC
            l16 r1 = defpackage.l16.TRUNCATE
            l16 r2 = defpackage.l16.WRITE_AHEAD_LOGGING
            l16[] r0 = new defpackage.l16[]{r0, r1, r2}
            return r0
    }

    static {
            l16 r0 = new l16
            java.lang.String r1 = "AUTOMATIC"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.l16.AUTOMATIC = r0
            l16 r0 = new l16
            java.lang.String r1 = "TRUNCATE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.l16.TRUNCATE = r0
            l16 r0 = new l16
            java.lang.String r1 = "WRITE_AHEAD_LOGGING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.l16.WRITE_AHEAD_LOGGING = r0
            l16[] r0 = $values()
            defpackage.l16.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.l16.$ENTRIES = r0
            return
    }

    l16(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.l16.$ENTRIES
            return r0
    }

    public static defpackage.l16 valueOf(java.lang.String r1) {
            java.lang.Class<l16> r0 = defpackage.l16.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            l16 r1 = (defpackage.l16) r1
            return r1
    }

    public static defpackage.l16[] values() {
            l16[] r0 = defpackage.l16.$VALUES
            java.lang.Object r0 = r0.clone()
            l16[] r0 = (defpackage.l16[]) r0
            return r0
    }

    public final defpackage.l16 resolve$room_runtime(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            l16 r0 = defpackage.l16.AUTOMATIC
            if (r1 == r0) goto L8
            return r1
        L8:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r2.getSystemService(r1)
            boolean r2 = r1 instanceof android.app.ActivityManager
            if (r2 == 0) goto L15
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L21
            boolean r1 = r1.isLowRamDevice()
            if (r1 != 0) goto L21
            l16 r1 = defpackage.l16.WRITE_AHEAD_LOGGING
            return r1
        L21:
            l16 r1 = defpackage.l16.TRUNCATE
            return r1
    }
}
