package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j14  reason: default package */
/* loaded from: classes.dex */
public enum j14 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.j14[] $VALUES = null;
    public static final defpackage.j14 SHOW_FULL = null;
    public static final defpackage.j14 SHOW_ICON = null;

    private static final /* synthetic */ defpackage.j14[] $values() {
            j14 r0 = defpackage.j14.SHOW_ICON
            j14 r1 = defpackage.j14.SHOW_FULL
            j14[] r0 = new defpackage.j14[]{r0, r1}
            return r0
    }

    static {
            j14 r0 = new j14
            java.lang.String r1 = "SHOW_ICON"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.j14.SHOW_ICON = r0
            j14 r0 = new j14
            java.lang.String r1 = "SHOW_FULL"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.j14.SHOW_FULL = r0
            j14[] r0 = $values()
            defpackage.j14.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.j14.$ENTRIES = r0
            return
    }

    j14(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.j14.$ENTRIES
            return r0
    }

    public static defpackage.j14 valueOf(java.lang.String r1) {
            java.lang.Class<j14> r0 = defpackage.j14.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            j14 r1 = (defpackage.j14) r1
            return r1
    }

    public static defpackage.j14[] values() {
            j14[] r0 = defpackage.j14.$VALUES
            java.lang.Object r0 = r0.clone()
            j14[] r0 = (defpackage.j14[]) r0
            return r0
    }
}
