package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl1  reason: default package */
/* loaded from: classes.dex */
public enum rl1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.rl1[] $VALUES = null;
    public static final defpackage.rl1 DIRECTORY = null;
    public static final defpackage.rl1 FILE = null;

    private static final /* synthetic */ defpackage.rl1[] $values() {
            rl1 r0 = defpackage.rl1.FILE
            rl1 r1 = defpackage.rl1.DIRECTORY
            rl1[] r0 = new defpackage.rl1[]{r0, r1}
            return r0
    }

    static {
            rl1 r0 = new rl1
            java.lang.String r1 = "FILE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.rl1.FILE = r0
            rl1 r0 = new rl1
            java.lang.String r1 = "DIRECTORY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.rl1.DIRECTORY = r0
            rl1[] r0 = $values()
            defpackage.rl1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.rl1.$ENTRIES = r0
            return
    }

    rl1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.rl1.$ENTRIES
            return r0
    }

    public static defpackage.rl1 valueOf(java.lang.String r1) {
            java.lang.Class<rl1> r0 = defpackage.rl1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rl1 r1 = (defpackage.rl1) r1
            return r1
    }

    public static defpackage.rl1[] values() {
            rl1[] r0 = defpackage.rl1.$VALUES
            java.lang.Object r0 = r0.clone()
            rl1[] r0 = (defpackage.rl1[]) r0
            return r0
    }
}
