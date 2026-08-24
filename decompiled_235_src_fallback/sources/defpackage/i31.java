package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i31  reason: default package */
/* loaded from: classes.dex */
public enum i31 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.i31[] $VALUES = null;
    public static final defpackage.i31 VIEW_APPEAR = null;
    public static final defpackage.i31 VIEW_DISAPPEAR = null;

    private static final /* synthetic */ defpackage.i31[] $values() {
            i31 r0 = defpackage.i31.VIEW_APPEAR
            i31 r1 = defpackage.i31.VIEW_DISAPPEAR
            i31[] r0 = new defpackage.i31[]{r0, r1}
            return r0
    }

    static {
            i31 r0 = new i31
            java.lang.String r1 = "VIEW_APPEAR"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.i31.VIEW_APPEAR = r0
            i31 r0 = new i31
            java.lang.String r1 = "VIEW_DISAPPEAR"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.i31.VIEW_DISAPPEAR = r0
            i31[] r0 = $values()
            defpackage.i31.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.i31.$ENTRIES = r0
            return
    }

    i31(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.i31.$ENTRIES
            return r0
    }

    public static defpackage.i31 valueOf(java.lang.String r1) {
            java.lang.Class<i31> r0 = defpackage.i31.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i31 r1 = (defpackage.i31) r1
            return r1
    }

    public static defpackage.i31[] values() {
            i31[] r0 = defpackage.i31.$VALUES
            java.lang.Object r0 = r0.clone()
            i31[] r0 = (defpackage.i31[]) r0
            return r0
    }
}
