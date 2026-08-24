package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bj7  reason: default package */
/* loaded from: classes.dex */
public enum bj7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.bj7[] $VALUES = null;
    public static final defpackage.bj7 IMAGE_ANALYSIS = null;
    public static final defpackage.bj7 IMAGE_CAPTURE = null;
    public static final defpackage.bj7 METERING_REPEATING = null;
    public static final defpackage.bj7 PREVIEW = null;
    public static final defpackage.bj7 STREAM_SHARING = null;
    public static final defpackage.bj7 VIDEO_CAPTURE = null;

    private static /* synthetic */ defpackage.bj7[] $values() {
            bj7 r0 = defpackage.bj7.IMAGE_CAPTURE
            bj7 r1 = defpackage.bj7.PREVIEW
            bj7 r2 = defpackage.bj7.IMAGE_ANALYSIS
            bj7 r3 = defpackage.bj7.VIDEO_CAPTURE
            bj7 r4 = defpackage.bj7.STREAM_SHARING
            bj7 r5 = defpackage.bj7.METERING_REPEATING
            bj7[] r0 = new defpackage.bj7[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            bj7 r0 = new bj7
            java.lang.String r1 = "IMAGE_CAPTURE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bj7.IMAGE_CAPTURE = r0
            bj7 r0 = new bj7
            java.lang.String r1 = "PREVIEW"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.bj7.PREVIEW = r0
            bj7 r0 = new bj7
            java.lang.String r1 = "IMAGE_ANALYSIS"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.bj7.IMAGE_ANALYSIS = r0
            bj7 r0 = new bj7
            java.lang.String r1 = "VIDEO_CAPTURE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.bj7.VIDEO_CAPTURE = r0
            bj7 r0 = new bj7
            java.lang.String r1 = "STREAM_SHARING"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.bj7.STREAM_SHARING = r0
            bj7 r0 = new bj7
            java.lang.String r1 = "METERING_REPEATING"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.bj7.METERING_REPEATING = r0
            bj7[] r0 = $values()
            defpackage.bj7.$VALUES = r0
            return
    }

    bj7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.bj7 valueOf(java.lang.String r1) {
            java.lang.Class<bj7> r0 = defpackage.bj7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bj7 r1 = (defpackage.bj7) r1
            return r1
    }

    public static defpackage.bj7[] values() {
            bj7[] r0 = defpackage.bj7.$VALUES
            java.lang.Object r0 = r0.clone()
            bj7[] r0 = (defpackage.bj7[]) r0
            return r0
    }
}
