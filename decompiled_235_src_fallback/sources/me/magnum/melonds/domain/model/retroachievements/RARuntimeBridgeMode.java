package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum RARuntimeBridgeMode extends java.lang.Enum<me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode RC_CLIENT_OFFLINE = null;
    public static final me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode RC_CLIENT_ONLINE = null;
    private final int nativeValue;

    private static final /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] $values() {
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r0 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.RC_CLIENT_ONLINE
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r1 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.RC_CLIENT_OFFLINE
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] r0 = new me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[]{r0, r1}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r0 = new me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode
            java.lang.String r1 = "RC_CLIENT_ONLINE"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.RC_CLIENT_ONLINE = r0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r0 = new me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode
            java.lang.String r1 = "RC_CLIENT_OFFLINE"
            r2 = 2
            r0.<init>(r1, r3, r2)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.RC_CLIENT_OFFLINE = r0
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] r0 = $values()
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.$ENTRIES = r0
            return
    }

    RARuntimeBridgeMode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.nativeValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode> r0 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode r1 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] values() {
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] r0 = me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[] r0 = (me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode[]) r0
            return r0
    }

    public final int getNativeValue() {
            r0 = this;
            int r0 = r0.nativeValue
            return r0
    }
}
