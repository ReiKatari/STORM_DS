package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GmsVersion {
    public static final int VERSION_HALLOUMI = 4100000;
    public static final int VERSION_JARLSBERG = 4300000;
    public static final int VERSION_KENAFA = 4400000;
    public static final int VERSION_LONGHORN = 5000000;
    public static final int VERSION_MANCHEGO = 6000000;
    public static final int VERSION_ORLA = 7000000;
    public static final int VERSION_PARMESAN = 7200000;
    public static final int VERSION_QUESO = 7500000;
    public static final int VERSION_REBLOCHON = 7800000;
    public static final int VERSION_SAGA = 8000000;

    private GmsVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAtLeastFenacho(int r1) {
            r0 = 3200000(0x30d400, float:4.484155E-39)
            if (r1 < r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }
}
