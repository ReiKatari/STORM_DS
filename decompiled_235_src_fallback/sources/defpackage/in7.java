package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in7  reason: default package */
/* loaded from: classes.dex */
public enum in7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.in7[] $VALUES = null;
    public static final defpackage.hn7 Companion = null;
    public static final defpackage.in7 OFF = null;
    public static final defpackage.in7 ON = null;
    public static final defpackage.in7 PREVIEW = null;
    public static final defpackage.in7 UNSPECIFIED = null;

    private static final /* synthetic */ defpackage.in7[] $values() {
            in7 r0 = defpackage.in7.UNSPECIFIED
            in7 r1 = defpackage.in7.OFF
            in7 r2 = defpackage.in7.ON
            in7 r3 = defpackage.in7.PREVIEW
            in7[] r0 = new defpackage.in7[]{r0, r1, r2, r3}
            return r0
    }

    static {
            in7 r0 = new in7
            java.lang.String r1 = "UNSPECIFIED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.in7.UNSPECIFIED = r0
            in7 r0 = new in7
            java.lang.String r1 = "OFF"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.in7.OFF = r0
            in7 r0 = new in7
            java.lang.String r1 = "ON"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.in7.ON = r0
            in7 r0 = new in7
            java.lang.String r1 = "PREVIEW"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.in7.PREVIEW = r0
            in7[] r0 = $values()
            defpackage.in7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.in7.$ENTRIES = r0
            hn7 r0 = new hn7
            r0.<init>()
            defpackage.in7.Companion = r0
            return
    }

    in7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final defpackage.in7 from$camera_core(int r1, int r2) {
            hn7 r0 = defpackage.in7.Companion
            r0.getClass()
            r0 = 1
            if (r1 == r0) goto L19
            if (r2 != r0) goto Lb
            goto L19
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            in7 r1 = defpackage.in7.PREVIEW
            return r1
        L11:
            if (r2 != r0) goto L16
            in7 r1 = defpackage.in7.ON
            return r1
        L16:
            in7 r1 = defpackage.in7.UNSPECIFIED
            return r1
        L19:
            in7 r1 = defpackage.in7.OFF
            return r1
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.in7.$ENTRIES
            return r0
    }

    public static defpackage.in7 valueOf(java.lang.String r1) {
            java.lang.Class<in7> r0 = defpackage.in7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            in7 r1 = (defpackage.in7) r1
            return r1
    }

    public static defpackage.in7[] values() {
            in7[] r0 = defpackage.in7.$VALUES
            java.lang.Object r0 = r0.clone()
            in7[] r0 = (defpackage.in7[]) r0
            return r0
    }
}
