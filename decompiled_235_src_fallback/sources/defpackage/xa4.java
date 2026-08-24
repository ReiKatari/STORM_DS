package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa4  reason: default package */
/* loaded from: classes.dex */
public enum xa4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xa4[] $VALUES = null;
    public static final defpackage.xa4 Default = null;
    public static final defpackage.xa4 PreventUserInput = null;
    public static final defpackage.xa4 UserInput = null;

    private static final /* synthetic */ defpackage.xa4[] $values() {
            xa4 r0 = defpackage.xa4.Default
            xa4 r1 = defpackage.xa4.UserInput
            xa4 r2 = defpackage.xa4.PreventUserInput
            xa4[] r0 = new defpackage.xa4[]{r0, r1, r2}
            return r0
    }

    static {
            xa4 r0 = new xa4
            java.lang.String r1 = "Default"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xa4.Default = r0
            xa4 r0 = new xa4
            java.lang.String r1 = "UserInput"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xa4.UserInput = r0
            xa4 r0 = new xa4
            java.lang.String r1 = "PreventUserInput"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xa4.PreventUserInput = r0
            xa4[] r0 = $values()
            defpackage.xa4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xa4.$ENTRIES = r0
            return
    }

    xa4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xa4.$ENTRIES
            return r0
    }

    public static defpackage.xa4 valueOf(java.lang.String r1) {
            java.lang.Class<xa4> r0 = defpackage.xa4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xa4 r1 = (defpackage.xa4) r1
            return r1
    }

    public static defpackage.xa4[] values() {
            xa4[] r0 = defpackage.xa4.$VALUES
            java.lang.Object r0 = r0.clone()
            xa4[] r0 = (defpackage.xa4[]) r0
            return r0
    }
}
