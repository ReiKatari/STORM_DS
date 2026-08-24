package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c84  reason: default package */
/* loaded from: classes.dex */
public enum c84 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.c84[] $VALUES = null;
    public static final defpackage.c84 DPAD_STEER = null;
    public static final defpackage.c84 OFF = null;
    public static final defpackage.c84 SLOT2_ANALOG = null;
    public static final defpackage.c84 TOUCH_AIM = null;

    private static final /* synthetic */ defpackage.c84[] $values() {
            c84 r0 = defpackage.c84.OFF
            c84 r1 = defpackage.c84.TOUCH_AIM
            c84 r2 = defpackage.c84.DPAD_STEER
            c84 r3 = defpackage.c84.SLOT2_ANALOG
            c84[] r0 = new defpackage.c84[]{r0, r1, r2, r3}
            return r0
    }

    static {
            c84 r0 = new c84
            java.lang.String r1 = "OFF"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.c84.OFF = r0
            c84 r0 = new c84
            java.lang.String r1 = "TOUCH_AIM"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.c84.TOUCH_AIM = r0
            c84 r0 = new c84
            java.lang.String r1 = "DPAD_STEER"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.c84.DPAD_STEER = r0
            c84 r0 = new c84
            java.lang.String r1 = "SLOT2_ANALOG"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.c84.SLOT2_ANALOG = r0
            c84[] r0 = $values()
            defpackage.c84.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.c84.$ENTRIES = r0
            return
    }

    c84(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.c84.$ENTRIES
            return r0
    }

    public static defpackage.c84 valueOf(java.lang.String r1) {
            java.lang.Class<c84> r0 = defpackage.c84.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            c84 r1 = (defpackage.c84) r1
            return r1
    }

    public static defpackage.c84[] values() {
            c84[] r0 = defpackage.c84.$VALUES
            java.lang.Object r0 = r0.clone()
            c84[] r0 = (defpackage.c84[]) r0
            return r0
    }
}
