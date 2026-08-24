package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t43  reason: default package */
/* loaded from: classes.dex */
public enum t43 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.t43[] $VALUES = null;
    public static final defpackage.t43 No = null;
    public static final defpackage.t43 NotInitialized = null;
    public static final defpackage.t43 Yes = null;

    private static final /* synthetic */ defpackage.t43[] $values() {
            t43 r0 = defpackage.t43.Yes
            t43 r1 = defpackage.t43.No
            t43 r2 = defpackage.t43.NotInitialized
            t43[] r0 = new defpackage.t43[]{r0, r1, r2}
            return r0
    }

    static {
            t43 r0 = new t43
            java.lang.String r1 = "Yes"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.t43.Yes = r0
            t43 r0 = new t43
            java.lang.String r1 = "No"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.t43.No = r0
            t43 r0 = new t43
            java.lang.String r1 = "NotInitialized"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.t43.NotInitialized = r0
            t43[] r0 = $values()
            defpackage.t43.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.t43.$ENTRIES = r0
            return
    }

    t43(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.t43.$ENTRIES
            return r0
    }

    public static defpackage.t43 valueOf(java.lang.String r1) {
            java.lang.Class<t43> r0 = defpackage.t43.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            t43 r1 = (defpackage.t43) r1
            return r1
    }

    public static defpackage.t43[] values() {
            t43[] r0 = defpackage.t43.$VALUES
            java.lang.Object r0 = r0.clone()
            t43[] r0 = (defpackage.t43[]) r0
            return r0
    }
}
