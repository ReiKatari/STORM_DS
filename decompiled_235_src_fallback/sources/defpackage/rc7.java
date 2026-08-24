package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc7  reason: default package */
/* loaded from: classes.dex */
public enum rc7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.rc7[] $VALUES = null;
    public static final defpackage.rc7 ALREADY_SELECTED = null;
    public static final defpackage.rc7 CANCELLED = null;
    public static final defpackage.rc7 REREGISTER = null;
    public static final defpackage.rc7 SUCCESSFUL = null;

    private static final /* synthetic */ defpackage.rc7[] $values() {
            rc7 r0 = defpackage.rc7.SUCCESSFUL
            rc7 r1 = defpackage.rc7.REREGISTER
            rc7 r2 = defpackage.rc7.CANCELLED
            rc7 r3 = defpackage.rc7.ALREADY_SELECTED
            rc7[] r0 = new defpackage.rc7[]{r0, r1, r2, r3}
            return r0
    }

    static {
            rc7 r0 = new rc7
            java.lang.String r1 = "SUCCESSFUL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.rc7.SUCCESSFUL = r0
            rc7 r0 = new rc7
            java.lang.String r1 = "REREGISTER"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.rc7.REREGISTER = r0
            rc7 r0 = new rc7
            java.lang.String r1 = "CANCELLED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.rc7.CANCELLED = r0
            rc7 r0 = new rc7
            java.lang.String r1 = "ALREADY_SELECTED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.rc7.ALREADY_SELECTED = r0
            rc7[] r0 = $values()
            defpackage.rc7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.rc7.$ENTRIES = r0
            return
    }

    rc7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.rc7.$ENTRIES
            return r0
    }

    public static defpackage.rc7 valueOf(java.lang.String r1) {
            java.lang.Class<rc7> r0 = defpackage.rc7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rc7 r1 = (defpackage.rc7) r1
            return r1
    }

    public static defpackage.rc7[] values() {
            rc7[] r0 = defpackage.rc7.$VALUES
            java.lang.Object r0 = r0.clone()
            rc7[] r0 = (defpackage.rc7[]) r0
            return r0
    }
}
