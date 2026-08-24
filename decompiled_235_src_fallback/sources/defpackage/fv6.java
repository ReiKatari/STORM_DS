package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv6  reason: default package */
/* loaded from: classes.dex */
public enum fv6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fv6[] $VALUES = null;
    public static final defpackage.fv6 MAXIMUM = null;
    public static final defpackage.fv6 MAXIMUM_16_9 = null;
    public static final defpackage.fv6 MAXIMUM_4_3 = null;
    public static final defpackage.fv6 NOT_SUPPORT = null;
    public static final defpackage.fv6 PREVIEW = null;
    public static final defpackage.fv6 RECORD = null;
    public static final defpackage.fv6 S1080P_16_9 = null;
    public static final defpackage.fv6 S1080P_4_3 = null;
    public static final defpackage.fv6 S1440P_16_9 = null;
    public static final defpackage.fv6 S1440P_4_3 = null;
    public static final defpackage.fv6 S720P_16_9 = null;
    public static final defpackage.fv6 UHD = null;
    public static final defpackage.fv6 ULTRA_MAXIMUM = null;
    public static final defpackage.fv6 VGA = null;
    public static final defpackage.fv6 X_VGA = null;
    private final int id;
    private final android.util.Size relatedFixedSize;

    private static final /* synthetic */ defpackage.fv6[] $values() {
            fv6 r0 = defpackage.fv6.VGA
            fv6 r1 = defpackage.fv6.X_VGA
            fv6 r2 = defpackage.fv6.S720P_16_9
            fv6 r3 = defpackage.fv6.PREVIEW
            fv6 r4 = defpackage.fv6.S1080P_4_3
            fv6 r5 = defpackage.fv6.S1080P_16_9
            fv6 r6 = defpackage.fv6.S1440P_4_3
            fv6 r7 = defpackage.fv6.S1440P_16_9
            fv6 r8 = defpackage.fv6.UHD
            fv6 r9 = defpackage.fv6.RECORD
            fv6 r10 = defpackage.fv6.MAXIMUM
            fv6 r11 = defpackage.fv6.MAXIMUM_4_3
            fv6 r12 = defpackage.fv6.MAXIMUM_16_9
            fv6 r13 = defpackage.fv6.ULTRA_MAXIMUM
            fv6 r14 = defpackage.fv6.NOT_SUPPORT
            fv6[] r0 = new defpackage.fv6[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            return r0
    }

    static {
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r2 = 640(0x280, float:8.97E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            r1.<init>(r2, r3)
            java.lang.String r2 = "VGA"
            r3 = 0
            r0.<init>(r2, r3, r3, r1)
            defpackage.fv6.VGA = r0
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r2 = 1024(0x400, float:1.435E-42)
            r3 = 768(0x300, float:1.076E-42)
            r1.<init>(r2, r3)
            java.lang.String r2 = "X_VGA"
            r3 = 1
            r0.<init>(r2, r3, r3, r1)
            defpackage.fv6.X_VGA = r0
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r2 = 1280(0x500, float:1.794E-42)
            r3 = 720(0x2d0, float:1.009E-42)
            r1.<init>(r2, r3)
            java.lang.String r2 = "S720P_16_9"
            r3 = 2
            r0.<init>(r2, r3, r3, r1)
            defpackage.fv6.S720P_16_9 = r0
            fv6 r4 = new fv6
            r9 = 2
            r10 = 0
            java.lang.String r5 = "PREVIEW"
            r6 = 3
            r7 = 3
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            defpackage.fv6.PREVIEW = r4
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r2 = 1440(0x5a0, float:2.018E-42)
            r3 = 1080(0x438, float:1.513E-42)
            r1.<init>(r2, r3)
            java.lang.String r4 = "S1080P_4_3"
            r5 = 4
            r0.<init>(r4, r5, r5, r1)
            defpackage.fv6.S1080P_4_3 = r0
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r4 = 1920(0x780, float:2.69E-42)
            r1.<init>(r4, r3)
            java.lang.String r3 = "S1080P_16_9"
            r5 = 5
            r0.<init>(r3, r5, r5, r1)
            defpackage.fv6.S1080P_16_9 = r0
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r1.<init>(r4, r2)
            java.lang.String r3 = "S1440P_4_3"
            r4 = 6
            r0.<init>(r3, r4, r4, r1)
            defpackage.fv6.S1440P_4_3 = r0
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r3 = 2560(0xa00, float:3.587E-42)
            r1.<init>(r3, r2)
            java.lang.String r2 = "S1440P_16_9"
            r3 = 7
            r0.<init>(r2, r3, r3, r1)
            defpackage.fv6.S1440P_16_9 = r0
            fv6 r0 = new fv6
            android.util.Size r1 = new android.util.Size
            r2 = 3840(0xf00, float:5.381E-42)
            r3 = 2160(0x870, float:3.027E-42)
            r1.<init>(r2, r3)
            java.lang.String r2 = "UHD"
            r3 = 8
            r0.<init>(r2, r3, r3, r1)
            defpackage.fv6.UHD = r0
            fv6 r4 = new fv6
            java.lang.String r5 = "RECORD"
            r6 = 9
            r7 = 9
            r4.<init>(r5, r6, r7, r8, r9, r10)
            defpackage.fv6.RECORD = r4
            fv6 r5 = new fv6
            r10 = 2
            r11 = 0
            java.lang.String r6 = "MAXIMUM"
            r7 = 10
            r8 = 10
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            defpackage.fv6.MAXIMUM = r5
            fv6 r6 = new fv6
            r11 = 2
            r12 = 0
            java.lang.String r7 = "MAXIMUM_4_3"
            r8 = 11
            r9 = 11
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.fv6.MAXIMUM_4_3 = r6
            fv6 r7 = new fv6
            r12 = 2
            r13 = 0
            java.lang.String r8 = "MAXIMUM_16_9"
            r9 = 12
            r10 = 12
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            defpackage.fv6.MAXIMUM_16_9 = r7
            fv6 r0 = new fv6
            r5 = 2
            r6 = 0
            java.lang.String r1 = "ULTRA_MAXIMUM"
            r2 = 13
            r3 = 13
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.fv6.ULTRA_MAXIMUM = r0
            fv6 r1 = new fv6
            r6 = 2
            r7 = 0
            java.lang.String r2 = "NOT_SUPPORT"
            r3 = 14
            r4 = 14
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            defpackage.fv6.NOT_SUPPORT = r1
            fv6[] r0 = $values()
            defpackage.fv6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fv6.$ENTRIES = r0
            return
    }

    fv6(java.lang.String r1, int r2, int r3, android.util.Size r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            r0.relatedFixedSize = r4
            return
    }

    /* synthetic */ fv6(java.lang.String r1, int r2, int r3, android.util.Size r4, int r5, defpackage.id1 r6) {
            r0 = this;
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fv6.$ENTRIES
            return r0
    }

    public static defpackage.fv6 valueOf(java.lang.String r1) {
            java.lang.Class<fv6> r0 = defpackage.fv6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fv6 r1 = (defpackage.fv6) r1
            return r1
    }

    public static defpackage.fv6[] values() {
            fv6[] r0 = defpackage.fv6.$VALUES
            java.lang.Object r0 = r0.clone()
            fv6[] r0 = (defpackage.fv6[]) r0
            return r0
    }

    public final int getId() {
            r0 = this;
            int r0 = r0.id
            return r0
    }

    public final android.util.Size getRelatedFixedSize() {
            r0 = this;
            android.util.Size r0 = r0.relatedFixedSize
            return r0
    }
}
