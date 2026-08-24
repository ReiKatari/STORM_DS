package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n05  reason: default package */
/* loaded from: classes.dex */
public enum n05 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.n05[] $VALUES = null;
    public static final defpackage.n05 AUTOMATIC = null;
    public static final defpackage.n05 EXACT = null;
    public static final defpackage.n05 INEXACT = null;

    private static final /* synthetic */ defpackage.n05[] $values() {
            n05 r0 = defpackage.n05.EXACT
            n05 r1 = defpackage.n05.INEXACT
            n05 r2 = defpackage.n05.AUTOMATIC
            n05[] r0 = new defpackage.n05[]{r0, r1, r2}
            return r0
    }

    static {
            n05 r0 = new n05
            java.lang.String r1 = "EXACT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n05.EXACT = r0
            n05 r0 = new n05
            java.lang.String r1 = "INEXACT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.n05.INEXACT = r0
            n05 r0 = new n05
            java.lang.String r1 = "AUTOMATIC"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.n05.AUTOMATIC = r0
            n05[] r0 = $values()
            defpackage.n05.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.n05.$ENTRIES = r0
            return
    }

    n05(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.n05.$ENTRIES
            return r0
    }

    public static defpackage.n05 valueOf(java.lang.String r1) {
            java.lang.Class<n05> r0 = defpackage.n05.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n05 r1 = (defpackage.n05) r1
            return r1
    }

    public static defpackage.n05[] values() {
            n05[] r0 = defpackage.n05.$VALUES
            java.lang.Object r0 = r0.clone()
            n05[] r0 = (defpackage.n05[]) r0
            return r0
    }
}
