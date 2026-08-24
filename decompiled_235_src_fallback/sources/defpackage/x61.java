package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x61  reason: default package */
/* loaded from: classes.dex */
public enum x61 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.x61[] $VALUES = null;
    public static final defpackage.x61 COROUTINE_SUSPENDED = null;
    public static final defpackage.x61 RESUMED = null;
    public static final defpackage.x61 UNDECIDED = null;

    private static final /* synthetic */ defpackage.x61[] $values() {
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            x61 r1 = defpackage.x61.UNDECIDED
            x61 r2 = defpackage.x61.RESUMED
            x61[] r0 = new defpackage.x61[]{r0, r1, r2}
            return r0
    }

    static {
            x61 r0 = new x61
            java.lang.String r1 = "COROUTINE_SUSPENDED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.x61.COROUTINE_SUSPENDED = r0
            x61 r0 = new x61
            java.lang.String r1 = "UNDECIDED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.x61.UNDECIDED = r0
            x61 r0 = new x61
            java.lang.String r1 = "RESUMED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.x61.RESUMED = r0
            x61[] r0 = $values()
            defpackage.x61.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.x61.$ENTRIES = r0
            return
    }

    x61(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.x61.$ENTRIES
            return r0
    }

    public static defpackage.x61 valueOf(java.lang.String r1) {
            java.lang.Class<x61> r0 = defpackage.x61.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            x61 r1 = (defpackage.x61) r1
            return r1
    }

    public static defpackage.x61[] values() {
            x61[] r0 = defpackage.x61.$VALUES
            java.lang.Object r0 = r0.clone()
            x61[] r0 = (defpackage.x61[]) r0
            return r0
    }
}
