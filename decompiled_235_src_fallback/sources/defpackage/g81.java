package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g81  reason: default package */
/* loaded from: classes.dex */
public enum g81 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.g81[] $VALUES = null;
    public static final defpackage.g81 Cancelled = null;
    public static final defpackage.g81 None = null;
    public static final defpackage.g81 RedirectCancelled = null;
    public static final defpackage.g81 Redirected = null;

    private static final /* synthetic */ defpackage.g81[] $values() {
            g81 r0 = defpackage.g81.None
            g81 r1 = defpackage.g81.Cancelled
            g81 r2 = defpackage.g81.Redirected
            g81 r3 = defpackage.g81.RedirectCancelled
            g81[] r0 = new defpackage.g81[]{r0, r1, r2, r3}
            return r0
    }

    static {
            g81 r0 = new g81
            java.lang.String r1 = "None"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.g81.None = r0
            g81 r0 = new g81
            java.lang.String r1 = "Cancelled"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.g81.Cancelled = r0
            g81 r0 = new g81
            java.lang.String r1 = "Redirected"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.g81.Redirected = r0
            g81 r0 = new g81
            java.lang.String r1 = "RedirectCancelled"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.g81.RedirectCancelled = r0
            g81[] r0 = $values()
            defpackage.g81.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.g81.$ENTRIES = r0
            return
    }

    g81(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.g81.$ENTRIES
            return r0
    }

    public static defpackage.g81 valueOf(java.lang.String r1) {
            java.lang.Class<g81> r0 = defpackage.g81.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g81 r1 = (defpackage.g81) r1
            return r1
    }

    public static defpackage.g81[] values() {
            g81[] r0 = defpackage.g81.$VALUES
            java.lang.Object r0 = r0.clone()
            g81[] r0 = (defpackage.g81[]) r0
            return r0
    }
}
