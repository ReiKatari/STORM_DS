package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl3  reason: default package */
/* loaded from: classes.dex */
public enum kl3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.kl3[] $VALUES = null;
    public static final defpackage.kl3 RATIO_16_9 = null;
    public static final defpackage.kl3 RATIO_4_3 = null;
    public static final defpackage.kl3 UNRESTRICTED = null;
    private final java.lang.Float ratio;

    private static final /* synthetic */ defpackage.kl3[] $values() {
            kl3 r0 = defpackage.kl3.RATIO_4_3
            kl3 r1 = defpackage.kl3.RATIO_16_9
            kl3 r2 = defpackage.kl3.UNRESTRICTED
            kl3[] r0 = new defpackage.kl3[]{r0, r1, r2}
            return r0
    }

    static {
            kl3 r0 = new kl3
            r1 = 1068149419(0x3faaaaab, float:1.3333334)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "RATIO_4_3"
            r3 = 0
            r0.<init>(r2, r3, r1)
            defpackage.kl3.RATIO_4_3 = r0
            kl3 r0 = new kl3
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "RATIO_16_9"
            r3 = 1
            r0.<init>(r2, r3, r1)
            defpackage.kl3.RATIO_16_9 = r0
            kl3 r0 = new kl3
            r1 = 2
            r2 = 0
            java.lang.String r3 = "UNRESTRICTED"
            r0.<init>(r3, r1, r2)
            defpackage.kl3.UNRESTRICTED = r0
            kl3[] r0 = $values()
            defpackage.kl3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.kl3.$ENTRIES = r0
            return
    }

    kl3(java.lang.String r1, int r2, java.lang.Float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.ratio = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.kl3.$ENTRIES
            return r0
    }

    public static defpackage.kl3 valueOf(java.lang.String r1) {
            java.lang.Class<kl3> r0 = defpackage.kl3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kl3 r1 = (defpackage.kl3) r1
            return r1
    }

    public static defpackage.kl3[] values() {
            kl3[] r0 = defpackage.kl3.$VALUES
            java.lang.Object r0 = r0.clone()
            kl3[] r0 = (defpackage.kl3[]) r0
            return r0
    }

    public final java.lang.Float getRatio() {
            r0 = this;
            java.lang.Float r0 = r0.ratio
            return r0
    }
}
