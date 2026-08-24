package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um6  reason: default package */
/* loaded from: classes.dex */
public enum um6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.um6[] $VALUES = null;
    public static final defpackage.um6 ALWAYS_INVISIBLE = null;
    public static final defpackage.um6 ALWAYS_VISIBLE = null;
    public static final defpackage.um6 HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS = null;
    public static final defpackage.um6 HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED = null;

    private static final /* synthetic */ defpackage.um6[] $values() {
            um6 r0 = defpackage.um6.ALWAYS_VISIBLE
            um6 r1 = defpackage.um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED
            um6 r2 = defpackage.um6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS
            um6 r3 = defpackage.um6.ALWAYS_INVISIBLE
            um6[] r0 = new defpackage.um6[]{r0, r1, r2, r3}
            return r0
    }

    static {
            um6 r0 = new um6
            java.lang.String r1 = "ALWAYS_VISIBLE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.um6.ALWAYS_VISIBLE = r0
            um6 r0 = new um6
            java.lang.String r1 = "HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED = r0
            um6 r0 = new um6
            java.lang.String r1 = "HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.um6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS = r0
            um6 r0 = new um6
            java.lang.String r1 = "ALWAYS_INVISIBLE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.um6.ALWAYS_INVISIBLE = r0
            um6[] r0 = $values()
            defpackage.um6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.um6.$ENTRIES = r0
            return
    }

    um6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.um6.$ENTRIES
            return r0
    }

    public static defpackage.um6 valueOf(java.lang.String r1) {
            java.lang.Class<um6> r0 = defpackage.um6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            um6 r1 = (defpackage.um6) r1
            return r1
    }

    public static defpackage.um6[] values() {
            um6[] r0 = defpackage.um6.$VALUES
            java.lang.Object r0 = r0.clone()
            um6[] r0 = (defpackage.um6[]) r0
            return r0
    }
}
