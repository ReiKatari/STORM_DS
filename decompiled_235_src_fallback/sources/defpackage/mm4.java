package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm4  reason: default package */
/* loaded from: classes.dex */
public enum mm4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.mm4[] $VALUES = null;
    public static final defpackage.mm4 BIOS7_NOT_FOUND = null;
    public static final defpackage.mm4 INVALID_DSI_SETUP = null;
    public static final defpackage.mm4 NAND_ALREADY_OPEN = null;
    public static final defpackage.mm4 NAND_OPEN_FAILED = null;
    public static final defpackage.mm4 SUCCESS = null;
    public static final defpackage.mm4 UNKNOWN = null;

    private static final /* synthetic */ defpackage.mm4[] $values() {
            mm4 r0 = defpackage.mm4.SUCCESS
            mm4 r1 = defpackage.mm4.NAND_ALREADY_OPEN
            mm4 r2 = defpackage.mm4.BIOS7_NOT_FOUND
            mm4 r3 = defpackage.mm4.NAND_OPEN_FAILED
            mm4 r4 = defpackage.mm4.INVALID_DSI_SETUP
            mm4 r5 = defpackage.mm4.UNKNOWN
            mm4[] r0 = new defpackage.mm4[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            mm4 r0 = new mm4
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.mm4.SUCCESS = r0
            mm4 r0 = new mm4
            java.lang.String r1 = "NAND_ALREADY_OPEN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.mm4.NAND_ALREADY_OPEN = r0
            mm4 r0 = new mm4
            java.lang.String r1 = "BIOS7_NOT_FOUND"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.mm4.BIOS7_NOT_FOUND = r0
            mm4 r0 = new mm4
            java.lang.String r1 = "NAND_OPEN_FAILED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.mm4.NAND_OPEN_FAILED = r0
            mm4 r0 = new mm4
            java.lang.String r1 = "INVALID_DSI_SETUP"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.mm4.INVALID_DSI_SETUP = r0
            mm4 r0 = new mm4
            java.lang.String r1 = "UNKNOWN"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.mm4.UNKNOWN = r0
            mm4[] r0 = $values()
            defpackage.mm4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.mm4.$ENTRIES = r0
            return
    }

    mm4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.mm4.$ENTRIES
            return r0
    }

    public static defpackage.mm4 valueOf(java.lang.String r1) {
            java.lang.Class<mm4> r0 = defpackage.mm4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mm4 r1 = (defpackage.mm4) r1
            return r1
    }

    public static defpackage.mm4[] values() {
            mm4[] r0 = defpackage.mm4.$VALUES
            java.lang.Object r0 = r0.clone()
            mm4[] r0 = (defpackage.mm4[]) r0
            return r0
    }

    public final boolean isFailure() {
            r1 = this;
            mm4 r0 = defpackage.mm4.SUCCESS
            if (r1 == r0) goto La
            mm4 r0 = defpackage.mm4.NAND_ALREADY_OPEN
            if (r1 == r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public final boolean isSuccess() {
            r0 = this;
            boolean r0 = r0.isFailure()
            r0 = r0 ^ 1
            return r0
    }
}
