package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr7  reason: default package */
/* loaded from: classes.dex */
public enum sr7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.sr7[] $VALUES = null;
    public static final defpackage.sr7 CUSTOM = null;
    public static final defpackage.sr7 SYSTEM = null;

    private static final /* synthetic */ defpackage.sr7[] $values() {
            sr7 r0 = defpackage.sr7.SYSTEM
            sr7 r1 = defpackage.sr7.CUSTOM
            sr7[] r0 = new defpackage.sr7[]{r0, r1}
            return r0
    }

    static {
            sr7 r0 = new sr7
            java.lang.String r1 = "SYSTEM"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sr7.SYSTEM = r0
            sr7 r0 = new sr7
            java.lang.String r1 = "CUSTOM"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.sr7.CUSTOM = r0
            sr7[] r0 = $values()
            defpackage.sr7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.sr7.$ENTRIES = r0
            return
    }

    sr7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.sr7.$ENTRIES
            return r0
    }

    public static defpackage.sr7 valueOf(java.lang.String r1) {
            java.lang.Class<sr7> r0 = defpackage.sr7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sr7 r1 = (defpackage.sr7) r1
            return r1
    }

    public static defpackage.sr7[] values() {
            sr7[] r0 = defpackage.sr7.$VALUES
            java.lang.Object r0 = r0.clone()
            sr7[] r0 = (defpackage.sr7[]) r0
            return r0
    }
}
