package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: im1  reason: default package */
/* loaded from: classes.dex */
public enum im1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.im1[] $VALUES = null;
    public static final defpackage.im1 Cancel = null;
    public static final defpackage.im1 Drag = null;
    public static final defpackage.im1 Timeout = null;
    public static final defpackage.im1 Up = null;

    private static final /* synthetic */ defpackage.im1[] $values() {
            im1 r0 = defpackage.im1.Up
            im1 r1 = defpackage.im1.Drag
            im1 r2 = defpackage.im1.Timeout
            im1 r3 = defpackage.im1.Cancel
            im1[] r0 = new defpackage.im1[]{r0, r1, r2, r3}
            return r0
    }

    static {
            im1 r0 = new im1
            java.lang.String r1 = "Up"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.im1.Up = r0
            im1 r0 = new im1
            java.lang.String r1 = "Drag"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.im1.Drag = r0
            im1 r0 = new im1
            java.lang.String r1 = "Timeout"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.im1.Timeout = r0
            im1 r0 = new im1
            java.lang.String r1 = "Cancel"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.im1.Cancel = r0
            im1[] r0 = $values()
            defpackage.im1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.im1.$ENTRIES = r0
            return
    }

    im1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.im1.$ENTRIES
            return r0
    }

    public static defpackage.im1 valueOf(java.lang.String r1) {
            java.lang.Class<im1> r0 = defpackage.im1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            im1 r1 = (defpackage.im1) r1
            return r1
    }

    public static defpackage.im1[] values() {
            im1[] r0 = defpackage.im1.$VALUES
            java.lang.Object r0 = r0.clone()
            im1[] r0 = (defpackage.im1[]) r0
            return r0
    }
}
