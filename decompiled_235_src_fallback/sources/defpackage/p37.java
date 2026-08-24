package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p37  reason: default package */
/* loaded from: classes.dex */
public enum p37 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.p37[] $VALUES = null;
    public static final defpackage.p37 HideKeyboard = null;
    public static final defpackage.p37 ShowKeyboard = null;
    public static final defpackage.p37 StartInput = null;
    public static final defpackage.p37 StopInput = null;

    private static final /* synthetic */ defpackage.p37[] $values() {
            p37 r0 = defpackage.p37.StartInput
            p37 r1 = defpackage.p37.StopInput
            p37 r2 = defpackage.p37.ShowKeyboard
            p37 r3 = defpackage.p37.HideKeyboard
            p37[] r0 = new defpackage.p37[]{r0, r1, r2, r3}
            return r0
    }

    static {
            p37 r0 = new p37
            java.lang.String r1 = "StartInput"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.p37.StartInput = r0
            p37 r0 = new p37
            java.lang.String r1 = "StopInput"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.p37.StopInput = r0
            p37 r0 = new p37
            java.lang.String r1 = "ShowKeyboard"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.p37.ShowKeyboard = r0
            p37 r0 = new p37
            java.lang.String r1 = "HideKeyboard"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.p37.HideKeyboard = r0
            p37[] r0 = $values()
            defpackage.p37.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.p37.$ENTRIES = r0
            return
    }

    p37(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.p37.$ENTRIES
            return r0
    }

    public static defpackage.p37 valueOf(java.lang.String r1) {
            java.lang.Class<p37> r0 = defpackage.p37.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            p37 r1 = (defpackage.p37) r1
            return r1
    }

    public static defpackage.p37[] values() {
            p37[] r0 = defpackage.p37.$VALUES
            java.lang.Object r0 = r0.clone()
            p37[] r0 = (defpackage.p37[]) r0
            return r0
    }
}
