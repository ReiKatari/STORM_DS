package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lh3  reason: default package */
/* loaded from: classes.dex */
public enum lh3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.lh3[] $VALUES = null;
    public static final defpackage.lh3 CRUNCHY = null;
    public static final defpackage.lh3 LEGACY = null;
    public static final defpackage.lh3 RAW = null;
    public static final defpackage.lh3 TINK = null;

    static {
            lh3 r0 = new lh3
            java.lang.String r1 = "TINK"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.lh3.TINK = r0
            lh3 r1 = new lh3
            java.lang.String r2 = "LEGACY"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.lh3.LEGACY = r1
            lh3 r2 = new lh3
            java.lang.String r3 = "RAW"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.lh3.RAW = r2
            lh3 r3 = new lh3
            java.lang.String r4 = "CRUNCHY"
            r5 = 3
            r3.<init>(r4, r5)
            defpackage.lh3.CRUNCHY = r3
            lh3[] r0 = new defpackage.lh3[]{r0, r1, r2, r3}
            defpackage.lh3.$VALUES = r0
            return
    }

    lh3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.lh3 valueOf(java.lang.String r1) {
            java.lang.Class<lh3> r0 = defpackage.lh3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            lh3 r1 = (defpackage.lh3) r1
            return r1
    }

    public static defpackage.lh3[] values() {
            lh3[] r0 = defpackage.lh3.$VALUES
            java.lang.Object r0 = r0.clone()
            lh3[] r0 = (defpackage.lh3[]) r0
            return r0
    }
}
