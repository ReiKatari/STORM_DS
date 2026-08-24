package me.magnum.melonds.domain.model.layout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum BackgroundMode extends java.lang.Enum<me.magnum.melonds.domain.model.layout.BackgroundMode> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.layout.BackgroundMode[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.layout.BackgroundMode FIT_BOTTOM = null;
    public static final me.magnum.melonds.domain.model.layout.BackgroundMode FIT_CENTER = null;
    public static final me.magnum.melonds.domain.model.layout.BackgroundMode FIT_LEFT = null;
    public static final me.magnum.melonds.domain.model.layout.BackgroundMode FIT_RIGHT = null;
    public static final me.magnum.melonds.domain.model.layout.BackgroundMode FIT_TOP = null;
    public static final me.magnum.melonds.domain.model.layout.BackgroundMode STRETCH = null;

    private static final /* synthetic */ me.magnum.melonds.domain.model.layout.BackgroundMode[] $values() {
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = me.magnum.melonds.domain.model.layout.BackgroundMode.STRETCH
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_CENTER
            me.magnum.melonds.domain.model.layout.BackgroundMode r2 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_TOP
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_LEFT
            me.magnum.melonds.domain.model.layout.BackgroundMode r4 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_BOTTOM
            me.magnum.melonds.domain.model.layout.BackgroundMode r5 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_RIGHT
            me.magnum.melonds.domain.model.layout.BackgroundMode[] r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode
            java.lang.String r1 = "STRETCH"
            r2 = 0
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode.STRETCH = r0
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode
            java.lang.String r1 = "FIT_CENTER"
            r2 = 1
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_CENTER = r0
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode
            java.lang.String r1 = "FIT_TOP"
            r2 = 2
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_TOP = r0
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode
            java.lang.String r1 = "FIT_LEFT"
            r2 = 3
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_LEFT = r0
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode
            java.lang.String r1 = "FIT_BOTTOM"
            r2 = 4
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_BOTTOM = r0
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = new me.magnum.melonds.domain.model.layout.BackgroundMode
            java.lang.String r1 = "FIT_RIGHT"
            r2 = 5
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_RIGHT = r0
            me.magnum.melonds.domain.model.layout.BackgroundMode[] r0 = $values()
            me.magnum.melonds.domain.model.layout.BackgroundMode.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.layout.BackgroundMode.$ENTRIES = r0
            return
    }

    BackgroundMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.layout.BackgroundMode.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.layout.BackgroundMode valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.layout.BackgroundMode> r0 = me.magnum.melonds.domain.model.layout.BackgroundMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = (me.magnum.melonds.domain.model.layout.BackgroundMode) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.layout.BackgroundMode[] values() {
            me.magnum.melonds.domain.model.layout.BackgroundMode[] r0 = me.magnum.melonds.domain.model.layout.BackgroundMode.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.layout.BackgroundMode[] r0 = (me.magnum.melonds.domain.model.layout.BackgroundMode[]) r0
            return r0
    }
}
