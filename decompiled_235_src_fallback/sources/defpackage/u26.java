package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u26  reason: default package */
/* loaded from: classes.dex */
public enum u26 extends java.lang.Enum implements defpackage.v26 {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.u26[] $VALUES = null;
    public static final defpackage.u26 DEFAULT = null;
    public static final defpackage.u26 DS = null;
    public static final defpackage.u26 DSi = null;
    private final me.magnum.melonds.domain.model.ConsoleType targetConsoleType;

    private static final /* synthetic */ defpackage.u26[] $values() {
            u26 r0 = defpackage.u26.DEFAULT
            u26 r1 = defpackage.u26.DS
            u26 r2 = defpackage.u26.DSi
            u26[] r0 = new defpackage.u26[]{r0, r1, r2}
            return r0
    }

    static {
            u26 r0 = new u26
            r1 = 0
            r2 = 0
            java.lang.String r3 = "DEFAULT"
            r0.<init>(r3, r1, r2)
            defpackage.u26.DEFAULT = r0
            u26 r0 = new u26
            r1 = 1
            me.magnum.melonds.domain.model.ConsoleType r2 = me.magnum.melonds.domain.model.ConsoleType.DS
            java.lang.String r3 = "DS"
            r0.<init>(r3, r1, r2)
            defpackage.u26.DS = r0
            u26 r0 = new u26
            r1 = 2
            me.magnum.melonds.domain.model.ConsoleType r2 = me.magnum.melonds.domain.model.ConsoleType.DSi
            java.lang.String r3 = "DSi"
            r0.<init>(r3, r1, r2)
            defpackage.u26.DSi = r0
            u26[] r0 = $values()
            defpackage.u26.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.u26.$ENTRIES = r0
            return
    }

    u26(java.lang.String r1, int r2, me.magnum.melonds.domain.model.ConsoleType r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.targetConsoleType = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.u26.$ENTRIES
            return r0
    }

    public static defpackage.u26 valueOf(java.lang.String r1) {
            java.lang.Class<u26> r0 = defpackage.u26.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            u26 r1 = (defpackage.u26) r1
            return r1
    }

    public static defpackage.u26[] values() {
            u26[] r0 = defpackage.u26.$VALUES
            java.lang.Object r0 = r0.clone()
            u26[] r0 = (defpackage.u26[]) r0
            return r0
    }

    @Override // defpackage.v26
    public /* bridge */ /* synthetic */ java.lang.Object getDefault() {
            r0 = this;
            u26 r0 = r0.getDefault()
            return r0
    }

    @Override // defpackage.v26
    public defpackage.u26 getDefault() {
            r0 = this;
            u26 r0 = defpackage.u26.DEFAULT
            return r0
    }

    public final me.magnum.melonds.domain.model.ConsoleType getTargetConsoleType() {
            r0 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.targetConsoleType
            return r0
    }

    @Override // defpackage.v26
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
            r0 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.getValue()
            return r0
    }

    @Override // defpackage.v26
    public me.magnum.melonds.domain.model.ConsoleType getValue() {
            r0 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.targetConsoleType
            r0.getClass()
            return r0
    }
}
