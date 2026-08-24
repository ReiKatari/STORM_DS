package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf  reason: default package */
/* loaded from: classes.dex */
public enum lf extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.lf[] $VALUES = null;
    public static final defpackage.lf SHOW_ORIGINAL = null;
    public static final defpackage.lf SHOW_TRANSLATED = null;

    private static final /* synthetic */ defpackage.lf[] $values() {
            lf r0 = defpackage.lf.SHOW_ORIGINAL
            lf r1 = defpackage.lf.SHOW_TRANSLATED
            lf[] r0 = new defpackage.lf[]{r0, r1}
            return r0
    }

    static {
            lf r0 = new lf
            java.lang.String r1 = "SHOW_ORIGINAL"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.lf.SHOW_ORIGINAL = r0
            lf r0 = new lf
            java.lang.String r1 = "SHOW_TRANSLATED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.lf.SHOW_TRANSLATED = r0
            lf[] r0 = $values()
            defpackage.lf.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.lf.$ENTRIES = r0
            return
    }

    lf(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.lf.$ENTRIES
            return r0
    }

    public static defpackage.lf valueOf(java.lang.String r1) {
            java.lang.Class<lf> r0 = defpackage.lf.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            lf r1 = (defpackage.lf) r1
            return r1
    }

    public static defpackage.lf[] values() {
            lf[] r0 = defpackage.lf.$VALUES
            java.lang.Object r0 = r0.clone()
            lf[] r0 = (defpackage.lf[]) r0
            return r0
    }
}
