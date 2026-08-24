package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum AudioBitrate extends java.lang.Enum<me.magnum.melonds.domain.model.AudioBitrate> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.AudioBitrate[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.AudioBitrate AUTO = null;
    public static final me.magnum.melonds.domain.model.AudioBitrate BIT10 = null;
    public static final me.magnum.melonds.domain.model.AudioBitrate BIT16 = null;
    private final int bitrateValue;

    private static final /* synthetic */ me.magnum.melonds.domain.model.AudioBitrate[] $values() {
            me.magnum.melonds.domain.model.AudioBitrate r0 = me.magnum.melonds.domain.model.AudioBitrate.AUTO
            me.magnum.melonds.domain.model.AudioBitrate r1 = me.magnum.melonds.domain.model.AudioBitrate.BIT10
            me.magnum.melonds.domain.model.AudioBitrate r2 = me.magnum.melonds.domain.model.AudioBitrate.BIT16
            me.magnum.melonds.domain.model.AudioBitrate[] r0 = new me.magnum.melonds.domain.model.AudioBitrate[]{r0, r1, r2}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.AudioBitrate r0 = new me.magnum.melonds.domain.model.AudioBitrate
            java.lang.String r1 = "AUTO"
            r2 = 0
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioBitrate.AUTO = r0
            me.magnum.melonds.domain.model.AudioBitrate r0 = new me.magnum.melonds.domain.model.AudioBitrate
            java.lang.String r1 = "BIT10"
            r2 = 1
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioBitrate.BIT10 = r0
            me.magnum.melonds.domain.model.AudioBitrate r0 = new me.magnum.melonds.domain.model.AudioBitrate
            java.lang.String r1 = "BIT16"
            r2 = 2
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioBitrate.BIT16 = r0
            me.magnum.melonds.domain.model.AudioBitrate[] r0 = $values()
            me.magnum.melonds.domain.model.AudioBitrate.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.AudioBitrate.$ENTRIES = r0
            return
    }

    AudioBitrate(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.bitrateValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.AudioBitrate.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.AudioBitrate valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.AudioBitrate> r0 = me.magnum.melonds.domain.model.AudioBitrate.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.AudioBitrate r1 = (me.magnum.melonds.domain.model.AudioBitrate) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.AudioBitrate[] values() {
            me.magnum.melonds.domain.model.AudioBitrate[] r0 = me.magnum.melonds.domain.model.AudioBitrate.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.AudioBitrate[] r0 = (me.magnum.melonds.domain.model.AudioBitrate[]) r0
            return r0
    }

    public final int getBitrateValue() {
            r0 = this;
            int r0 = r0.bitrateValue
            return r0
    }
}
