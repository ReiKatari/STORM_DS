package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue4  reason: default package */
/* loaded from: classes.dex */
public enum ue4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ue4[] $VALUES = null;
    public static final defpackage.ue4 CONNECTED = null;
    public static final defpackage.ue4 DISCONNECTED = null;

    private static final /* synthetic */ defpackage.ue4[] $values() {
            ue4 r0 = defpackage.ue4.CONNECTED
            ue4 r1 = defpackage.ue4.DISCONNECTED
            ue4[] r0 = new defpackage.ue4[]{r0, r1}
            return r0
    }

    static {
            ue4 r0 = new ue4
            java.lang.String r1 = "CONNECTED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ue4.CONNECTED = r0
            ue4 r0 = new ue4
            java.lang.String r1 = "DISCONNECTED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ue4.DISCONNECTED = r0
            ue4[] r0 = $values()
            defpackage.ue4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ue4.$ENTRIES = r0
            return
    }

    ue4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ue4.$ENTRIES
            return r0
    }

    public static defpackage.ue4 valueOf(java.lang.String r1) {
            java.lang.Class<ue4> r0 = defpackage.ue4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ue4 r1 = (defpackage.ue4) r1
            return r1
    }

    public static defpackage.ue4[] values() {
            ue4[] r0 = defpackage.ue4.$VALUES
            java.lang.Object r0 = r0.clone()
            ue4[] r0 = (defpackage.ue4[]) r0
            return r0
    }
}
