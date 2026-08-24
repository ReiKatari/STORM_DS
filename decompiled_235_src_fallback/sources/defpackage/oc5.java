package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc5  reason: default package */
/* loaded from: classes.dex */
public enum oc5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.oc5[] $VALUES = null;
    public static final defpackage.oc5 EXIT = null;
    public static final defpackage.oc5 KEEP_SESSION_OPEN = null;

    private static final /* synthetic */ defpackage.oc5[] $values() {
            oc5 r0 = defpackage.oc5.EXIT
            oc5 r1 = defpackage.oc5.KEEP_SESSION_OPEN
            oc5[] r0 = new defpackage.oc5[]{r0, r1}
            return r0
    }

    static {
            oc5 r0 = new oc5
            java.lang.String r1 = "EXIT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.oc5.EXIT = r0
            oc5 r0 = new oc5
            java.lang.String r1 = "KEEP_SESSION_OPEN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.oc5.KEEP_SESSION_OPEN = r0
            oc5[] r0 = $values()
            defpackage.oc5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.oc5.$ENTRIES = r0
            return
    }

    oc5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.oc5.$ENTRIES
            return r0
    }

    public static defpackage.oc5 valueOf(java.lang.String r1) {
            java.lang.Class<oc5> r0 = defpackage.oc5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            oc5 r1 = (defpackage.oc5) r1
            return r1
    }

    public static defpackage.oc5[] values() {
            oc5[] r0 = defpackage.oc5.$VALUES
            java.lang.Object r0 = r0.clone()
            oc5[] r0 = (defpackage.oc5[]) r0
            return r0
    }
}
