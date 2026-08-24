package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum ConsoleType extends java.lang.Enum<me.magnum.melonds.domain.model.ConsoleType> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.ConsoleType[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.ConsoleType DS = null;
    public static final me.magnum.melonds.domain.model.ConsoleType DSi = null;
    private final int consoleType;

    private static final /* synthetic */ me.magnum.melonds.domain.model.ConsoleType[] $values() {
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DS
            me.magnum.melonds.domain.model.ConsoleType r1 = me.magnum.melonds.domain.model.ConsoleType.DSi
            me.magnum.melonds.domain.model.ConsoleType[] r0 = new me.magnum.melonds.domain.model.ConsoleType[]{r0, r1}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.ConsoleType r0 = new me.magnum.melonds.domain.model.ConsoleType
            java.lang.String r1 = "DS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.ConsoleType.DS = r0
            me.magnum.melonds.domain.model.ConsoleType r0 = new me.magnum.melonds.domain.model.ConsoleType
            java.lang.String r1 = "DSi"
            r2 = 1
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.ConsoleType.DSi = r0
            me.magnum.melonds.domain.model.ConsoleType[] r0 = $values()
            me.magnum.melonds.domain.model.ConsoleType.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.ConsoleType.$ENTRIES = r0
            return
    }

    ConsoleType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.consoleType = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.ConsoleType.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.ConsoleType valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.ConsoleType> r0 = me.magnum.melonds.domain.model.ConsoleType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.ConsoleType[] values() {
            me.magnum.melonds.domain.model.ConsoleType[] r0 = me.magnum.melonds.domain.model.ConsoleType.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.ConsoleType[] r0 = (me.magnum.melonds.domain.model.ConsoleType[]) r0
            return r0
    }

    public final int getConsoleType() {
            r0 = this;
            int r0 = r0.consoleType
            return r0
    }
}
