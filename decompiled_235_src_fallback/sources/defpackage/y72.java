package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y72  reason: default package */
/* loaded from: classes.dex */
public enum y72 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.y72[] $VALUES = null;
    public static final defpackage.y72 APPEND = null;
    public static final defpackage.y72 APPEND_OR_REPLACE = null;
    public static final defpackage.y72 KEEP = null;
    public static final defpackage.y72 REPLACE = null;

    private static final /* synthetic */ defpackage.y72[] $values() {
            y72 r0 = defpackage.y72.REPLACE
            y72 r1 = defpackage.y72.KEEP
            y72 r2 = defpackage.y72.APPEND
            y72 r3 = defpackage.y72.APPEND_OR_REPLACE
            y72[] r0 = new defpackage.y72[]{r0, r1, r2, r3}
            return r0
    }

    static {
            y72 r0 = new y72
            java.lang.String r1 = "REPLACE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.y72.REPLACE = r0
            y72 r0 = new y72
            java.lang.String r1 = "KEEP"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.y72.KEEP = r0
            y72 r0 = new y72
            java.lang.String r1 = "APPEND"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.y72.APPEND = r0
            y72 r0 = new y72
            java.lang.String r1 = "APPEND_OR_REPLACE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.y72.APPEND_OR_REPLACE = r0
            y72[] r0 = $values()
            defpackage.y72.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.y72.$ENTRIES = r0
            return
    }

    y72(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.y72.$ENTRIES
            return r0
    }

    public static defpackage.y72 valueOf(java.lang.String r1) {
            java.lang.Class<y72> r0 = defpackage.y72.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            y72 r1 = (defpackage.y72) r1
            return r1
    }

    public static defpackage.y72[] values() {
            y72[] r0 = defpackage.y72.$VALUES
            java.lang.Object r0 = r0.clone()
            y72[] r0 = (defpackage.y72[]) r0
            return r0
    }
}
