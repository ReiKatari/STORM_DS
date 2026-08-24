package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc6  reason: default package */
/* loaded from: classes.dex */
public enum oc6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.oc6[] $VALUES = null;
    public static final defpackage.oc6 SESSION_ERROR_SURFACE_NEEDS_RESET = null;
    public static final defpackage.oc6 SESSION_ERROR_UNKNOWN = null;

    private static /* synthetic */ defpackage.oc6[] $values() {
            oc6 r0 = defpackage.oc6.SESSION_ERROR_SURFACE_NEEDS_RESET
            oc6 r1 = defpackage.oc6.SESSION_ERROR_UNKNOWN
            oc6[] r0 = new defpackage.oc6[]{r0, r1}
            return r0
    }

    static {
            oc6 r0 = new oc6
            java.lang.String r1 = "SESSION_ERROR_SURFACE_NEEDS_RESET"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.oc6.SESSION_ERROR_SURFACE_NEEDS_RESET = r0
            oc6 r0 = new oc6
            java.lang.String r1 = "SESSION_ERROR_UNKNOWN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.oc6.SESSION_ERROR_UNKNOWN = r0
            oc6[] r0 = $values()
            defpackage.oc6.$VALUES = r0
            return
    }

    oc6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.oc6 valueOf(java.lang.String r1) {
            java.lang.Class<oc6> r0 = defpackage.oc6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            oc6 r1 = (defpackage.oc6) r1
            return r1
    }

    public static defpackage.oc6[] values() {
            oc6[] r0 = defpackage.oc6.$VALUES
            java.lang.Object r0 = r0.clone()
            oc6[] r0 = (defpackage.oc6[]) r0
            return r0
    }
}
