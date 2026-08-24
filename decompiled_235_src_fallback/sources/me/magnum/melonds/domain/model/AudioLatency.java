package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum AudioLatency extends java.lang.Enum<me.magnum.melonds.domain.model.AudioLatency> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.AudioLatency[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.AudioLatency HIGH = null;
    public static final me.magnum.melonds.domain.model.AudioLatency LOW = null;
    public static final me.magnum.melonds.domain.model.AudioLatency MEDIUM = null;
    private final int latencyValue;

    private static final /* synthetic */ me.magnum.melonds.domain.model.AudioLatency[] $values() {
            me.magnum.melonds.domain.model.AudioLatency r0 = me.magnum.melonds.domain.model.AudioLatency.LOW
            me.magnum.melonds.domain.model.AudioLatency r1 = me.magnum.melonds.domain.model.AudioLatency.MEDIUM
            me.magnum.melonds.domain.model.AudioLatency r2 = me.magnum.melonds.domain.model.AudioLatency.HIGH
            me.magnum.melonds.domain.model.AudioLatency[] r0 = new me.magnum.melonds.domain.model.AudioLatency[]{r0, r1, r2}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.AudioLatency r0 = new me.magnum.melonds.domain.model.AudioLatency
            java.lang.String r1 = "LOW"
            r2 = 0
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioLatency.LOW = r0
            me.magnum.melonds.domain.model.AudioLatency r0 = new me.magnum.melonds.domain.model.AudioLatency
            java.lang.String r1 = "MEDIUM"
            r2 = 1
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioLatency.MEDIUM = r0
            me.magnum.melonds.domain.model.AudioLatency r0 = new me.magnum.melonds.domain.model.AudioLatency
            java.lang.String r1 = "HIGH"
            r2 = 2
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioLatency.HIGH = r0
            me.magnum.melonds.domain.model.AudioLatency[] r0 = $values()
            me.magnum.melonds.domain.model.AudioLatency.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.AudioLatency.$ENTRIES = r0
            return
    }

    AudioLatency(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.latencyValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.AudioLatency.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.AudioLatency valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.AudioLatency> r0 = me.magnum.melonds.domain.model.AudioLatency.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.AudioLatency r1 = (me.magnum.melonds.domain.model.AudioLatency) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.AudioLatency[] values() {
            me.magnum.melonds.domain.model.AudioLatency[] r0 = me.magnum.melonds.domain.model.AudioLatency.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.AudioLatency[] r0 = (me.magnum.melonds.domain.model.AudioLatency[]) r0
            return r0
    }

    public final int getLatencyValue() {
            r0 = this;
            int r0 = r0.latencyValue
            return r0
    }
}
