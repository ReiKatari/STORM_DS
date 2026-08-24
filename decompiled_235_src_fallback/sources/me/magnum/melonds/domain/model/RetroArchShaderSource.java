package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum RetroArchShaderSource extends java.lang.Enum<me.magnum.melonds.domain.model.RetroArchShaderSource> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.RetroArchShaderSource[] $VALUES = null;
    public static final defpackage.gp5 Companion = null;
    public static final me.magnum.melonds.domain.model.RetroArchShaderSource FOLDER = null;
    public static final me.magnum.melonds.domain.model.RetroArchShaderSource INTERNAL = null;

    private static final /* synthetic */ me.magnum.melonds.domain.model.RetroArchShaderSource[] $values() {
            me.magnum.melonds.domain.model.RetroArchShaderSource r0 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            me.magnum.melonds.domain.model.RetroArchShaderSource r1 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER
            me.magnum.melonds.domain.model.RetroArchShaderSource[] r0 = new me.magnum.melonds.domain.model.RetroArchShaderSource[]{r0, r1}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.RetroArchShaderSource r0 = new me.magnum.melonds.domain.model.RetroArchShaderSource
            java.lang.String r1 = "INTERNAL"
            r2 = 0
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL = r0
            me.magnum.melonds.domain.model.RetroArchShaderSource r0 = new me.magnum.melonds.domain.model.RetroArchShaderSource
            java.lang.String r1 = "FOLDER"
            r2 = 1
            r0.<init>(r1, r2)
            me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER = r0
            me.magnum.melonds.domain.model.RetroArchShaderSource[] r0 = $values()
            me.magnum.melonds.domain.model.RetroArchShaderSource.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.RetroArchShaderSource.$ENTRIES = r0
            gp5 r0 = new gp5
            r0.<init>()
            me.magnum.melonds.domain.model.RetroArchShaderSource.Companion = r0
            return
    }

    RetroArchShaderSource(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.RetroArchShaderSource.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.RetroArchShaderSource valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.RetroArchShaderSource> r0 = me.magnum.melonds.domain.model.RetroArchShaderSource.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.RetroArchShaderSource r1 = (me.magnum.melonds.domain.model.RetroArchShaderSource) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.RetroArchShaderSource[] values() {
            me.magnum.melonds.domain.model.RetroArchShaderSource[] r0 = me.magnum.melonds.domain.model.RetroArchShaderSource.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.RetroArchShaderSource[] r0 = (me.magnum.melonds.domain.model.RetroArchShaderSource[]) r0
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r1 = this;
            java.lang.String r1 = r1.name()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            r1.getClass()
            return r1
    }
}
