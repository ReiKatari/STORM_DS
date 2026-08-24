package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki4  reason: default package */
/* loaded from: classes.dex */
public enum ki4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ki4[] $VALUES = null;
    public static final defpackage.ki4 FEMALE = null;
    public static final defpackage.ki4 MALE = null;
    public static final defpackage.ki4 NEUTRAL = null;

    private static final /* synthetic */ defpackage.ki4[] $values() {
            ki4 r0 = defpackage.ki4.MALE
            ki4 r1 = defpackage.ki4.FEMALE
            ki4 r2 = defpackage.ki4.NEUTRAL
            ki4[] r0 = new defpackage.ki4[]{r0, r1, r2}
            return r0
    }

    static {
            ki4 r0 = new ki4
            java.lang.String r1 = "MALE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ki4.MALE = r0
            ki4 r0 = new ki4
            java.lang.String r1 = "FEMALE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ki4.FEMALE = r0
            ki4 r0 = new ki4
            java.lang.String r1 = "NEUTRAL"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ki4.NEUTRAL = r0
            ki4[] r0 = $values()
            defpackage.ki4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ki4.$ENTRIES = r0
            return
    }

    ki4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ki4.$ENTRIES
            return r0
    }

    public static defpackage.ki4 valueOf(java.lang.String r1) {
            java.lang.Class<ki4> r0 = defpackage.ki4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ki4 r1 = (defpackage.ki4) r1
            return r1
    }

    public static defpackage.ki4[] values() {
            ki4[] r0 = defpackage.ki4.$VALUES
            java.lang.Object r0 = r0.clone()
            ki4[] r0 = (defpackage.ki4[]) r0
            return r0
    }
}
