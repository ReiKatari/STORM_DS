package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb7  reason: default package */
/* loaded from: classes.dex */
public enum mb7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.mb7[] $VALUES = null;
    public static final defpackage.mb7 AUTO_SCREEN_CHANGE = null;
    public static final defpackage.lb7 Companion = null;
    public static final defpackage.mb7 ON_DEMAND = null;
    private final java.lang.String preferenceValue;

    private static final /* synthetic */ defpackage.mb7[] $values() {
            mb7 r0 = defpackage.mb7.ON_DEMAND
            mb7 r1 = defpackage.mb7.AUTO_SCREEN_CHANGE
            mb7[] r0 = new defpackage.mb7[]{r0, r1}
            return r0
    }

    static {
            mb7 r0 = new mb7
            r1 = 0
            java.lang.String r2 = "on_demand"
            java.lang.String r3 = "ON_DEMAND"
            r0.<init>(r3, r1, r2)
            defpackage.mb7.ON_DEMAND = r0
            mb7 r0 = new mb7
            r1 = 1
            java.lang.String r2 = "auto_screen_change"
            java.lang.String r3 = "AUTO_SCREEN_CHANGE"
            r0.<init>(r3, r1, r2)
            defpackage.mb7.AUTO_SCREEN_CHANGE = r0
            mb7[] r0 = $values()
            defpackage.mb7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.mb7.$ENTRIES = r0
            lb7 r0 = new lb7
            r0.<init>()
            defpackage.mb7.Companion = r0
            return
    }

    mb7(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.preferenceValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.mb7.$ENTRIES
            return r0
    }

    public static defpackage.mb7 valueOf(java.lang.String r1) {
            java.lang.Class<mb7> r0 = defpackage.mb7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mb7 r1 = (defpackage.mb7) r1
            return r1
    }

    public static defpackage.mb7[] values() {
            mb7[] r0 = defpackage.mb7.$VALUES
            java.lang.Object r0 = r0.clone()
            mb7[] r0 = (defpackage.mb7[]) r0
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r0 = this;
            java.lang.String r0 = r0.preferenceValue
            return r0
    }
}
