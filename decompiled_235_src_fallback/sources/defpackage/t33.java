package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t33  reason: default package */
/* loaded from: classes.dex */
public enum t33 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.t33[] $VALUES = null;
    public static final defpackage.t33 DSI_MEMORY_FULL = null;
    public static final defpackage.t33 ERROR_OPENING_FILE = null;
    public static final defpackage.t33 INSATLL_FAILED = null;
    public static final defpackage.t33 METADATA_FETCH_FAILED = null;
    public static final defpackage.t33 NAND_NOT_OPEN = null;
    public static final defpackage.t33 NOT_DSIWARE_TITLE = null;
    public static final defpackage.t33 SUCCESS = null;
    public static final defpackage.t33 TITLE_ALREADY_IMPORTED = null;
    public static final defpackage.t33 TITLE_LIMIT_REACHED = null;
    public static final defpackage.t33 UNKNOWN = null;

    private static final /* synthetic */ defpackage.t33[] $values() {
            t33 r0 = defpackage.t33.SUCCESS
            t33 r1 = defpackage.t33.NAND_NOT_OPEN
            t33 r2 = defpackage.t33.ERROR_OPENING_FILE
            t33 r3 = defpackage.t33.NOT_DSIWARE_TITLE
            t33 r4 = defpackage.t33.TITLE_ALREADY_IMPORTED
            t33 r5 = defpackage.t33.TITLE_LIMIT_REACHED
            t33 r6 = defpackage.t33.DSI_MEMORY_FULL
            t33 r7 = defpackage.t33.INSATLL_FAILED
            t33 r8 = defpackage.t33.METADATA_FETCH_FAILED
            t33 r9 = defpackage.t33.UNKNOWN
            t33[] r0 = new defpackage.t33[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            return r0
    }

    static {
            t33 r0 = new t33
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.t33.SUCCESS = r0
            t33 r0 = new t33
            java.lang.String r1 = "NAND_NOT_OPEN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.t33.NAND_NOT_OPEN = r0
            t33 r0 = new t33
            java.lang.String r1 = "ERROR_OPENING_FILE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.t33.ERROR_OPENING_FILE = r0
            t33 r0 = new t33
            java.lang.String r1 = "NOT_DSIWARE_TITLE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.t33.NOT_DSIWARE_TITLE = r0
            t33 r0 = new t33
            java.lang.String r1 = "TITLE_ALREADY_IMPORTED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.t33.TITLE_ALREADY_IMPORTED = r0
            t33 r0 = new t33
            java.lang.String r1 = "TITLE_LIMIT_REACHED"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.t33.TITLE_LIMIT_REACHED = r0
            t33 r0 = new t33
            java.lang.String r1 = "DSI_MEMORY_FULL"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.t33.DSI_MEMORY_FULL = r0
            t33 r0 = new t33
            java.lang.String r1 = "INSATLL_FAILED"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.t33.INSATLL_FAILED = r0
            t33 r0 = new t33
            java.lang.String r1 = "METADATA_FETCH_FAILED"
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.t33.METADATA_FETCH_FAILED = r0
            t33 r0 = new t33
            java.lang.String r1 = "UNKNOWN"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.t33.UNKNOWN = r0
            t33[] r0 = $values()
            defpackage.t33.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.t33.$ENTRIES = r0
            return
    }

    t33(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.t33.$ENTRIES
            return r0
    }

    public static defpackage.t33 valueOf(java.lang.String r1) {
            java.lang.Class<t33> r0 = defpackage.t33.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            t33 r1 = (defpackage.t33) r1
            return r1
    }

    public static defpackage.t33[] values() {
            t33[] r0 = defpackage.t33.$VALUES
            java.lang.Object r0 = r0.clone()
            t33[] r0 = (defpackage.t33[]) r0
            return r0
    }
}
