package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z42  reason: default package */
/* loaded from: classes.dex */
public enum z42 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.z42[] $VALUES = null;
    public static final defpackage.z42 PostExit = null;
    public static final defpackage.z42 PreEnter = null;
    public static final defpackage.z42 Visible = null;

    private static final /* synthetic */ defpackage.z42[] $values() {
            z42 r0 = defpackage.z42.PreEnter
            z42 r1 = defpackage.z42.Visible
            z42 r2 = defpackage.z42.PostExit
            z42[] r0 = new defpackage.z42[]{r0, r1, r2}
            return r0
    }

    static {
            z42 r0 = new z42
            java.lang.String r1 = "PreEnter"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.z42.PreEnter = r0
            z42 r0 = new z42
            java.lang.String r1 = "Visible"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.z42.Visible = r0
            z42 r0 = new z42
            java.lang.String r1 = "PostExit"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.z42.PostExit = r0
            z42[] r0 = $values()
            defpackage.z42.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.z42.$ENTRIES = r0
            return
    }

    z42(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.z42.$ENTRIES
            return r0
    }

    public static defpackage.z42 valueOf(java.lang.String r1) {
            java.lang.Class<z42> r0 = defpackage.z42.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            z42 r1 = (defpackage.z42) r1
            return r1
    }

    public static defpackage.z42[] values() {
            z42[] r0 = defpackage.z42.$VALUES
            java.lang.Object r0 = r0.clone()
            z42[] r0 = (defpackage.z42[]) r0
            return r0
    }
}
