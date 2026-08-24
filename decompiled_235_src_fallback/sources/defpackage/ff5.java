package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff5  reason: default package */
/* loaded from: classes.dex */
public enum ff5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ff5[] $VALUES = null;
    public static final defpackage.ff5 Idle = null;
    public static final defpackage.ff5 Inactive = null;
    public static final defpackage.ff5 InactivePendingWork = null;
    public static final defpackage.ff5 PendingWork = null;
    public static final defpackage.ff5 ShutDown = null;
    public static final defpackage.ff5 ShuttingDown = null;

    private static final /* synthetic */ defpackage.ff5[] $values() {
            ff5 r0 = defpackage.ff5.ShutDown
            ff5 r1 = defpackage.ff5.ShuttingDown
            ff5 r2 = defpackage.ff5.Inactive
            ff5 r3 = defpackage.ff5.InactivePendingWork
            ff5 r4 = defpackage.ff5.Idle
            ff5 r5 = defpackage.ff5.PendingWork
            ff5[] r0 = new defpackage.ff5[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            ff5 r0 = new ff5
            java.lang.String r1 = "ShutDown"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ff5.ShutDown = r0
            ff5 r0 = new ff5
            java.lang.String r1 = "ShuttingDown"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ff5.ShuttingDown = r0
            ff5 r0 = new ff5
            java.lang.String r1 = "Inactive"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ff5.Inactive = r0
            ff5 r0 = new ff5
            java.lang.String r1 = "InactivePendingWork"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ff5.InactivePendingWork = r0
            ff5 r0 = new ff5
            java.lang.String r1 = "Idle"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ff5.Idle = r0
            ff5 r0 = new ff5
            java.lang.String r1 = "PendingWork"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.ff5.PendingWork = r0
            ff5[] r0 = $values()
            defpackage.ff5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ff5.$ENTRIES = r0
            return
    }

    ff5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ff5.$ENTRIES
            return r0
    }

    public static defpackage.ff5 valueOf(java.lang.String r1) {
            java.lang.Class<ff5> r0 = defpackage.ff5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ff5 r1 = (defpackage.ff5) r1
            return r1
    }

    public static defpackage.ff5[] values() {
            ff5[] r0 = defpackage.ff5.$VALUES
            java.lang.Object r0 = r0.clone()
            ff5[] r0 = (defpackage.ff5[]) r0
            return r0
    }
}
