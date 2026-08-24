package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck3  reason: default package */
/* loaded from: classes.dex */
public enum ck3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ck3[] $VALUES = null;
    public static final defpackage.ck3 FOLLOW_SYSTEM = null;
    public static final defpackage.ck3 LANDSCAPE = null;
    public static final defpackage.ck3 PORTRAIT = null;

    private static final /* synthetic */ defpackage.ck3[] $values() {
            ck3 r0 = defpackage.ck3.FOLLOW_SYSTEM
            ck3 r1 = defpackage.ck3.PORTRAIT
            ck3 r2 = defpackage.ck3.LANDSCAPE
            ck3[] r0 = new defpackage.ck3[]{r0, r1, r2}
            return r0
    }

    static {
            ck3 r0 = new ck3
            java.lang.String r1 = "FOLLOW_SYSTEM"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ck3.FOLLOW_SYSTEM = r0
            ck3 r0 = new ck3
            java.lang.String r1 = "PORTRAIT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ck3.PORTRAIT = r0
            ck3 r0 = new ck3
            java.lang.String r1 = "LANDSCAPE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ck3.LANDSCAPE = r0
            ck3[] r0 = $values()
            defpackage.ck3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ck3.$ENTRIES = r0
            return
    }

    ck3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ck3.$ENTRIES
            return r0
    }

    public static defpackage.ck3 valueOf(java.lang.String r1) {
            java.lang.Class<ck3> r0 = defpackage.ck3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ck3 r1 = (defpackage.ck3) r1
            return r1
    }

    public static defpackage.ck3[] values() {
            ck3[] r0 = defpackage.ck3.$VALUES
            java.lang.Object r0 = r0.clone()
            ck3[] r0 = (defpackage.ck3[]) r0
            return r0
    }
}
