package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c97  reason: default package */
/* loaded from: classes.dex */
public enum c97 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.c97[] $VALUES = null;
    public static final defpackage.c97 DEFERRED = null;
    public static final defpackage.c97 EXCLUSIVE = null;
    public static final defpackage.c97 IMMEDIATE = null;

    private static final /* synthetic */ defpackage.c97[] $values() {
            c97 r0 = defpackage.c97.DEFERRED
            c97 r1 = defpackage.c97.IMMEDIATE
            c97 r2 = defpackage.c97.EXCLUSIVE
            c97[] r0 = new defpackage.c97[]{r0, r1, r2}
            return r0
    }

    static {
            c97 r0 = new c97
            java.lang.String r1 = "DEFERRED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.c97.DEFERRED = r0
            c97 r0 = new c97
            java.lang.String r1 = "IMMEDIATE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.c97.IMMEDIATE = r0
            c97 r0 = new c97
            java.lang.String r1 = "EXCLUSIVE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.c97.EXCLUSIVE = r0
            c97[] r0 = $values()
            defpackage.c97.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.c97.$ENTRIES = r0
            return
    }

    c97(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.c97.$ENTRIES
            return r0
    }

    public static defpackage.c97 valueOf(java.lang.String r1) {
            java.lang.Class<c97> r0 = defpackage.c97.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            c97 r1 = (defpackage.c97) r1
            return r1
    }

    public static defpackage.c97[] values() {
            c97[] r0 = defpackage.c97.$VALUES
            java.lang.Object r0 = r0.clone()
            c97[] r0 = (defpackage.c97[]) r0
            return r0
    }
}
