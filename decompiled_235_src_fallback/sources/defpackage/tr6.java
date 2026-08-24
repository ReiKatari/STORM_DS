package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr6  reason: default package */
/* loaded from: classes.dex */
public enum tr6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.tr6[] $VALUES = null;
    public static final defpackage.tr6 CROPPED_RAW = null;
    public static final defpackage.tr6 DEFAULT = null;
    public static final defpackage.tr6 PREVIEW = null;
    public static final defpackage.tr6 PREVIEW_VIDEO_STILL = null;
    public static final defpackage.tr6 STILL_CAPTURE = null;
    public static final defpackage.tr6 VIDEO_CALL = null;
    public static final defpackage.tr6 VIDEO_RECORD = null;
    private final long value;

    private static final /* synthetic */ defpackage.tr6[] $values() {
            tr6 r0 = defpackage.tr6.DEFAULT
            tr6 r1 = defpackage.tr6.PREVIEW
            tr6 r2 = defpackage.tr6.VIDEO_RECORD
            tr6 r3 = defpackage.tr6.STILL_CAPTURE
            tr6 r4 = defpackage.tr6.VIDEO_CALL
            tr6 r5 = defpackage.tr6.PREVIEW_VIDEO_STILL
            tr6 r6 = defpackage.tr6.CROPPED_RAW
            tr6[] r0 = new defpackage.tr6[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            tr6 r0 = new tr6
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.tr6.DEFAULT = r0
            tr6 r0 = new tr6
            java.lang.String r1 = "PREVIEW"
            r2 = 1
            r0.<init>(r1, r2, r2)
            defpackage.tr6.PREVIEW = r0
            tr6 r0 = new tr6
            java.lang.String r1 = "VIDEO_RECORD"
            r2 = 2
            r3 = 3
            r0.<init>(r1, r2, r3)
            defpackage.tr6.VIDEO_RECORD = r0
            tr6 r0 = new tr6
            java.lang.String r1 = "STILL_CAPTURE"
            r0.<init>(r1, r3, r2)
            defpackage.tr6.STILL_CAPTURE = r0
            tr6 r0 = new tr6
            java.lang.String r1 = "VIDEO_CALL"
            r2 = 4
            r3 = 5
            r0.<init>(r1, r2, r3)
            defpackage.tr6.VIDEO_CALL = r0
            tr6 r0 = new tr6
            java.lang.String r1 = "PREVIEW_VIDEO_STILL"
            r0.<init>(r1, r3, r2)
            defpackage.tr6.PREVIEW_VIDEO_STILL = r0
            tr6 r0 = new tr6
            java.lang.String r1 = "CROPPED_RAW"
            r2 = 6
            r0.<init>(r1, r2, r2)
            defpackage.tr6.CROPPED_RAW = r0
            tr6[] r0 = $values()
            defpackage.tr6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.tr6.$ENTRIES = r0
            return
    }

    tr6(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            long r1 = (long) r3
            r0.value = r1
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.tr6.$ENTRIES
            return r0
    }

    public static defpackage.tr6 valueOf(java.lang.String r1) {
            java.lang.Class<tr6> r0 = defpackage.tr6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            tr6 r1 = (defpackage.tr6) r1
            return r1
    }

    public static defpackage.tr6[] values() {
            tr6[] r0 = defpackage.tr6.$VALUES
            java.lang.Object r0 = r0.clone()
            tr6[] r0 = (defpackage.tr6[]) r0
            return r0
    }

    public final long getValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }
}
