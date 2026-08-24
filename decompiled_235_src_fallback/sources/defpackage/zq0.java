package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq0  reason: default package */
/* loaded from: classes.dex */
public enum zq0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.zq0[] $VALUES = null;
    public static final defpackage.zq0 ALL_JSON_OBJECTS = null;
    public static final defpackage.zq0 NONE = null;
    public static final defpackage.zq0 POLYMORPHIC = null;

    private static final /* synthetic */ defpackage.zq0[] $values() {
            zq0 r0 = defpackage.zq0.NONE
            zq0 r1 = defpackage.zq0.ALL_JSON_OBJECTS
            zq0 r2 = defpackage.zq0.POLYMORPHIC
            zq0[] r0 = new defpackage.zq0[]{r0, r1, r2}
            return r0
    }

    static {
            zq0 r0 = new zq0
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.zq0.NONE = r0
            zq0 r0 = new zq0
            java.lang.String r1 = "ALL_JSON_OBJECTS"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.zq0.ALL_JSON_OBJECTS = r0
            zq0 r0 = new zq0
            java.lang.String r1 = "POLYMORPHIC"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.zq0.POLYMORPHIC = r0
            zq0[] r0 = $values()
            defpackage.zq0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.zq0.$ENTRIES = r0
            return
    }

    zq0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.zq0.$ENTRIES
            return r0
    }

    public static defpackage.zq0 valueOf(java.lang.String r1) {
            java.lang.Class<zq0> r0 = defpackage.zq0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zq0 r1 = (defpackage.zq0) r1
            return r1
    }

    public static defpackage.zq0[] values() {
            zq0[] r0 = defpackage.zq0.$VALUES
            java.lang.Object r0 = r0.clone()
            zq0[] r0 = (defpackage.zq0[]) r0
            return r0
    }
}
