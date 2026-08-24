package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm1  reason: default package */
/* loaded from: classes.dex */
public enum zm1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.zm1[] $VALUES = null;
    public static final defpackage.zm1 No = null;
    public static final defpackage.zm1 NotInitialized = null;
    public static final defpackage.zm1 Yes = null;

    private static final /* synthetic */ defpackage.zm1[] $values() {
            zm1 r0 = defpackage.zm1.Yes
            zm1 r1 = defpackage.zm1.No
            zm1 r2 = defpackage.zm1.NotInitialized
            zm1[] r0 = new defpackage.zm1[]{r0, r1, r2}
            return r0
    }

    static {
            zm1 r0 = new zm1
            java.lang.String r1 = "Yes"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.zm1.Yes = r0
            zm1 r0 = new zm1
            java.lang.String r1 = "No"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.zm1.No = r0
            zm1 r0 = new zm1
            java.lang.String r1 = "NotInitialized"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.zm1.NotInitialized = r0
            zm1[] r0 = $values()
            defpackage.zm1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.zm1.$ENTRIES = r0
            return
    }

    zm1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.zm1.$ENTRIES
            return r0
    }

    public static defpackage.zm1 valueOf(java.lang.String r1) {
            java.lang.Class<zm1> r0 = defpackage.zm1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zm1 r1 = (defpackage.zm1) r1
            return r1
    }

    public static defpackage.zm1[] values() {
            zm1[] r0 = defpackage.zm1.$VALUES
            java.lang.Object r0 = r0.clone()
            zm1[] r0 = (defpackage.zm1[]) r0
            return r0
    }
}
