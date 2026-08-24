package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya7  reason: default package */
/* loaded from: classes.dex */
public enum ya7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ya7[] $VALUES = null;
    public static final defpackage.xa7 Companion = null;
    public static final defpackage.ya7 OUTLINE_ONLY = null;
    public static final defpackage.ya7 SEMI_TRANSPARENT = null;
    public static final defpackage.ya7 SMART_BACKGROUND_MATCH = null;
    public static final defpackage.ya7 TRANSLUCENT_BUBBLE = null;
    private final java.lang.String preferenceValue;

    private static final /* synthetic */ defpackage.ya7[] $values() {
            ya7 r0 = defpackage.ya7.SMART_BACKGROUND_MATCH
            ya7 r1 = defpackage.ya7.SEMI_TRANSPARENT
            ya7 r2 = defpackage.ya7.TRANSLUCENT_BUBBLE
            ya7 r3 = defpackage.ya7.OUTLINE_ONLY
            ya7[] r0 = new defpackage.ya7[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ya7 r0 = new ya7
            r1 = 0
            java.lang.String r2 = "smart_background_match"
            java.lang.String r3 = "SMART_BACKGROUND_MATCH"
            r0.<init>(r3, r1, r2)
            defpackage.ya7.SMART_BACKGROUND_MATCH = r0
            ya7 r0 = new ya7
            r1 = 1
            java.lang.String r2 = "semi_transparent"
            java.lang.String r3 = "SEMI_TRANSPARENT"
            r0.<init>(r3, r1, r2)
            defpackage.ya7.SEMI_TRANSPARENT = r0
            ya7 r0 = new ya7
            r1 = 2
            java.lang.String r2 = "translucent_bubble"
            java.lang.String r3 = "TRANSLUCENT_BUBBLE"
            r0.<init>(r3, r1, r2)
            defpackage.ya7.TRANSLUCENT_BUBBLE = r0
            ya7 r0 = new ya7
            r1 = 3
            java.lang.String r2 = "outline_only"
            java.lang.String r3 = "OUTLINE_ONLY"
            r0.<init>(r3, r1, r2)
            defpackage.ya7.OUTLINE_ONLY = r0
            ya7[] r0 = $values()
            defpackage.ya7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ya7.$ENTRIES = r0
            xa7 r0 = new xa7
            r0.<init>()
            defpackage.ya7.Companion = r0
            return
    }

    ya7(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.preferenceValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ya7.$ENTRIES
            return r0
    }

    public static defpackage.ya7 valueOf(java.lang.String r1) {
            java.lang.Class<ya7> r0 = defpackage.ya7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ya7 r1 = (defpackage.ya7) r1
            return r1
    }

    public static defpackage.ya7[] values() {
            ya7[] r0 = defpackage.ya7.$VALUES
            java.lang.Object r0 = r0.clone()
            ya7[] r0 = (defpackage.ya7[]) r0
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r0 = this;
            java.lang.String r0 = r0.preferenceValue
            return r0
    }
}
