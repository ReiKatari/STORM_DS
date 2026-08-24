package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd2  reason: default package */
/* loaded from: classes.dex */
public enum cd2 extends java.lang.Enum implements defpackage.nu4 {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.cd2[] $VALUES = null;
    public static final defpackage.cd2 EXIT = null;
    public static final defpackage.cd2 RESET = null;
    public static final defpackage.cd2 SETTINGS = null;
    private final int textResource;

    private static final /* synthetic */ defpackage.cd2[] $values() {
            cd2 r0 = defpackage.cd2.SETTINGS
            cd2 r1 = defpackage.cd2.RESET
            cd2 r2 = defpackage.cd2.EXIT
            cd2[] r0 = new defpackage.cd2[]{r0, r1, r2}
            return r0
    }

    static {
            cd2 r0 = new cd2
            r1 = 0
            r2 = 2131952616(0x7f1303e8, float:1.954168E38)
            java.lang.String r3 = "SETTINGS"
            r0.<init>(r3, r1, r2)
            defpackage.cd2.SETTINGS = r0
            cd2 r0 = new cd2
            r1 = 1
            r2 = 2131952445(0x7f13033d, float:1.9541333E38)
            java.lang.String r3 = "RESET"
            r0.<init>(r3, r1, r2)
            defpackage.cd2.RESET = r0
            cd2 r0 = new cd2
            r1 = 2
            r2 = 2131951958(0x7f130156, float:1.9540345E38)
            java.lang.String r3 = "EXIT"
            r0.<init>(r3, r1, r2)
            defpackage.cd2.EXIT = r0
            cd2[] r0 = $values()
            defpackage.cd2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.cd2.$ENTRIES = r0
            return
    }

    cd2(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.textResource = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.cd2.$ENTRIES
            return r0
    }

    public static defpackage.cd2 valueOf(java.lang.String r1) {
            java.lang.Class<cd2> r0 = defpackage.cd2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            cd2 r1 = (defpackage.cd2) r1
            return r1
    }

    public static defpackage.cd2[] values() {
            cd2[] r0 = defpackage.cd2.$VALUES
            java.lang.Object r0 = r0.clone()
            cd2[] r0 = (defpackage.cd2[]) r0
            return r0
    }

    @Override // defpackage.nu4
    public int getTextResource() {
            r0 = this;
            int r0 = r0.textResource
            return r0
    }
}
