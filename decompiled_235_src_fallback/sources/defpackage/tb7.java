package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tb7  reason: default package */
/* loaded from: classes.dex */
public enum tb7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.tb7[] $VALUES = null;
    public static final defpackage.tb7 CancelTraversal = null;
    public static final defpackage.tb7 ContinueTraversal = null;
    public static final defpackage.tb7 SkipSubtreeAndContinueTraversal = null;

    private static final /* synthetic */ defpackage.tb7[] $values() {
            tb7 r0 = defpackage.tb7.ContinueTraversal
            tb7 r1 = defpackage.tb7.SkipSubtreeAndContinueTraversal
            tb7 r2 = defpackage.tb7.CancelTraversal
            tb7[] r0 = new defpackage.tb7[]{r0, r1, r2}
            return r0
    }

    static {
            tb7 r0 = new tb7
            java.lang.String r1 = "ContinueTraversal"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.tb7.ContinueTraversal = r0
            tb7 r0 = new tb7
            java.lang.String r1 = "SkipSubtreeAndContinueTraversal"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.tb7.SkipSubtreeAndContinueTraversal = r0
            tb7 r0 = new tb7
            java.lang.String r1 = "CancelTraversal"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.tb7.CancelTraversal = r0
            tb7[] r0 = $values()
            defpackage.tb7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.tb7.$ENTRIES = r0
            return
    }

    tb7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.tb7.$ENTRIES
            return r0
    }

    public static defpackage.tb7 valueOf(java.lang.String r1) {
            java.lang.Class<tb7> r0 = defpackage.tb7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            tb7 r1 = (defpackage.tb7) r1
            return r1
    }

    public static defpackage.tb7[] values() {
            tb7[] r0 = defpackage.tb7.$VALUES
            java.lang.Object r0 = r0.clone()
            tb7[] r0 = (defpackage.tb7[]) r0
            return r0
    }
}
