package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv5  reason: default package */
/* loaded from: classes.dex */
public enum xv5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xv5[] $VALUES = null;
    public static final defpackage.xv5 DEFINITION_CHANGED = null;
    public static final defpackage.xv5 MISSING_FROM_CURRENT_SET = null;
    public static final defpackage.xv5 NOT_IN_PREFETCH_CACHE = null;
    public static final defpackage.xv5 SERVER_REJECTED = null;

    private static final /* synthetic */ defpackage.xv5[] $values() {
            xv5 r0 = defpackage.xv5.MISSING_FROM_CURRENT_SET
            xv5 r1 = defpackage.xv5.DEFINITION_CHANGED
            xv5 r2 = defpackage.xv5.NOT_IN_PREFETCH_CACHE
            xv5 r3 = defpackage.xv5.SERVER_REJECTED
            xv5[] r0 = new defpackage.xv5[]{r0, r1, r2, r3}
            return r0
    }

    static {
            xv5 r0 = new xv5
            java.lang.String r1 = "MISSING_FROM_CURRENT_SET"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xv5.MISSING_FROM_CURRENT_SET = r0
            xv5 r0 = new xv5
            java.lang.String r1 = "DEFINITION_CHANGED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xv5.DEFINITION_CHANGED = r0
            xv5 r0 = new xv5
            java.lang.String r1 = "NOT_IN_PREFETCH_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xv5.NOT_IN_PREFETCH_CACHE = r0
            xv5 r0 = new xv5
            java.lang.String r1 = "SERVER_REJECTED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.xv5.SERVER_REJECTED = r0
            xv5[] r0 = $values()
            defpackage.xv5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xv5.$ENTRIES = r0
            return
    }

    xv5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xv5.$ENTRIES
            return r0
    }

    public static defpackage.xv5 valueOf(java.lang.String r1) {
            java.lang.Class<xv5> r0 = defpackage.xv5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xv5 r1 = (defpackage.xv5) r1
            return r1
    }

    public static defpackage.xv5[] values() {
            xv5[] r0 = defpackage.xv5.$VALUES
            java.lang.Object r0 = r0.clone()
            xv5[] r0 = (defpackage.xv5[]) r0
            return r0
    }
}
