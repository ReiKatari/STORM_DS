package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum MicSource extends java.lang.Enum<me.magnum.melonds.domain.model.MicSource> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.MicSource[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.MicSource BLOW = null;
    public static final me.magnum.melonds.domain.model.MicSource DEVICE = null;
    public static final me.magnum.melonds.domain.model.MicSource NONE = null;
    private final int sourceValue;

    private static final /* synthetic */ me.magnum.melonds.domain.model.MicSource[] $values() {
            me.magnum.melonds.domain.model.MicSource r0 = me.magnum.melonds.domain.model.MicSource.NONE
            me.magnum.melonds.domain.model.MicSource r1 = me.magnum.melonds.domain.model.MicSource.BLOW
            me.magnum.melonds.domain.model.MicSource r2 = me.magnum.melonds.domain.model.MicSource.DEVICE
            me.magnum.melonds.domain.model.MicSource[] r0 = new me.magnum.melonds.domain.model.MicSource[]{r0, r1, r2}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.MicSource r0 = new me.magnum.melonds.domain.model.MicSource
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.MicSource.NONE = r0
            me.magnum.melonds.domain.model.MicSource r0 = new me.magnum.melonds.domain.model.MicSource
            java.lang.String r1 = "BLOW"
            r2 = 1
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.MicSource.BLOW = r0
            me.magnum.melonds.domain.model.MicSource r0 = new me.magnum.melonds.domain.model.MicSource
            java.lang.String r1 = "DEVICE"
            r2 = 2
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.MicSource.DEVICE = r0
            me.magnum.melonds.domain.model.MicSource[] r0 = $values()
            me.magnum.melonds.domain.model.MicSource.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.MicSource.$ENTRIES = r0
            return
    }

    MicSource(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.sourceValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.MicSource.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.MicSource valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.MicSource> r0 = me.magnum.melonds.domain.model.MicSource.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.MicSource r1 = (me.magnum.melonds.domain.model.MicSource) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.MicSource[] values() {
            me.magnum.melonds.domain.model.MicSource[] r0 = me.magnum.melonds.domain.model.MicSource.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.MicSource[] r0 = (me.magnum.melonds.domain.model.MicSource[]) r0
            return r0
    }

    public final int getSourceValue() {
            r0 = this;
            int r0 = r0.sourceValue
            return r0
    }
}
