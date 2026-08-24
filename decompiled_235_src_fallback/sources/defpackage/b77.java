package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b77  reason: default package */
/* loaded from: classes.dex */
public enum b77 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.b77[] $VALUES = null;
    public static final defpackage.b77 DEFINITION_CHANGED = null;
    public static final defpackage.b77 MISSING_FROM_CURRENT_SET = null;
    public static final defpackage.b77 NOT_IN_PREFETCH_CACHE = null;
    public static final defpackage.b77 SERVER_REJECTED = null;

    private static final /* synthetic */ defpackage.b77[] $values() {
            b77 r0 = defpackage.b77.MISSING_FROM_CURRENT_SET
            b77 r1 = defpackage.b77.DEFINITION_CHANGED
            b77 r2 = defpackage.b77.NOT_IN_PREFETCH_CACHE
            b77 r3 = defpackage.b77.SERVER_REJECTED
            b77[] r0 = new defpackage.b77[]{r0, r1, r2, r3}
            return r0
    }

    static {
            b77 r0 = new b77
            java.lang.String r1 = "MISSING_FROM_CURRENT_SET"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.b77.MISSING_FROM_CURRENT_SET = r0
            b77 r0 = new b77
            java.lang.String r1 = "DEFINITION_CHANGED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.b77.DEFINITION_CHANGED = r0
            b77 r0 = new b77
            java.lang.String r1 = "NOT_IN_PREFETCH_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.b77.NOT_IN_PREFETCH_CACHE = r0
            b77 r0 = new b77
            java.lang.String r1 = "SERVER_REJECTED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.b77.SERVER_REJECTED = r0
            b77[] r0 = $values()
            defpackage.b77.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.b77.$ENTRIES = r0
            return
    }

    b77(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.b77.$ENTRIES
            return r0
    }

    public static defpackage.b77 valueOf(java.lang.String r1) {
            java.lang.Class<b77> r0 = defpackage.b77.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            b77 r1 = (defpackage.b77) r1
            return r1
    }

    public static defpackage.b77[] values() {
            b77[] r0 = defpackage.b77.$VALUES
            java.lang.Object r0 = r0.clone()
            b77[] r0 = (defpackage.b77[]) r0
            return r0
    }
}
