package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya4  reason: default package */
/* loaded from: classes.dex */
public enum ya4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ya4[] $VALUES = null;
    public static final defpackage.ya4 Default = null;
    public static final defpackage.ya4 PreventUserInput = null;
    public static final defpackage.ya4 UserInput = null;

    private static final /* synthetic */ defpackage.ya4[] $values() {
            ya4 r0 = defpackage.ya4.Default
            ya4 r1 = defpackage.ya4.UserInput
            ya4 r2 = defpackage.ya4.PreventUserInput
            ya4[] r0 = new defpackage.ya4[]{r0, r1, r2}
            return r0
    }

    static {
            ya4 r0 = new ya4
            java.lang.String r1 = "Default"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ya4.Default = r0
            ya4 r0 = new ya4
            java.lang.String r1 = "UserInput"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ya4.UserInput = r0
            ya4 r0 = new ya4
            java.lang.String r1 = "PreventUserInput"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ya4.PreventUserInput = r0
            ya4[] r0 = $values()
            defpackage.ya4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ya4.$ENTRIES = r0
            return
    }

    ya4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ya4.$ENTRIES
            return r0
    }

    public static defpackage.ya4 valueOf(java.lang.String r1) {
            java.lang.Class<ya4> r0 = defpackage.ya4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ya4 r1 = (defpackage.ya4) r1
            return r1
    }

    public static defpackage.ya4[] values() {
            ya4[] r0 = defpackage.ya4.$VALUES
            java.lang.Object r0 = r0.clone()
            ya4[] r0 = (defpackage.ya4[]) r0
            return r0
    }
}
