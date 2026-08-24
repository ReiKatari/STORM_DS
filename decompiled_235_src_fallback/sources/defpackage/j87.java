package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j87  reason: default package */
/* loaded from: classes.dex */
public enum j87 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.j87[] $VALUES = null;
    public static final defpackage.j87 Attached = null;
    public static final defpackage.j87 Detached = null;
    public static final defpackage.j87 Uninitialized = null;

    private static final /* synthetic */ defpackage.j87[] $values() {
            j87 r0 = defpackage.j87.Uninitialized
            j87 r1 = defpackage.j87.Detached
            j87 r2 = defpackage.j87.Attached
            j87[] r0 = new defpackage.j87[]{r0, r1, r2}
            return r0
    }

    static {
            j87 r0 = new j87
            java.lang.String r1 = "Uninitialized"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.j87.Uninitialized = r0
            j87 r0 = new j87
            java.lang.String r1 = "Detached"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.j87.Detached = r0
            j87 r0 = new j87
            java.lang.String r1 = "Attached"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.j87.Attached = r0
            j87[] r0 = $values()
            defpackage.j87.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.j87.$ENTRIES = r0
            return
    }

    j87(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.j87.$ENTRIES
            return r0
    }

    public static defpackage.j87 valueOf(java.lang.String r1) {
            java.lang.Class<j87> r0 = defpackage.j87.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            j87 r1 = (defpackage.j87) r1
            return r1
    }

    public static defpackage.j87[] values() {
            j87[] r0 = defpackage.j87.$VALUES
            java.lang.Object r0 = r0.clone()
            j87[] r0 = (defpackage.j87[]) r0
            return r0
    }
}
