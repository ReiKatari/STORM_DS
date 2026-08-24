package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv2  reason: default package */
/* loaded from: classes.dex */
public enum fv2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fv2[] $VALUES = null;
    public static final defpackage.fv2 Cursor = null;
    public static final defpackage.fv2 SelectionEnd = null;
    public static final defpackage.fv2 SelectionStart = null;

    private static final /* synthetic */ defpackage.fv2[] $values() {
            fv2 r0 = defpackage.fv2.Cursor
            fv2 r1 = defpackage.fv2.SelectionStart
            fv2 r2 = defpackage.fv2.SelectionEnd
            fv2[] r0 = new defpackage.fv2[]{r0, r1, r2}
            return r0
    }

    static {
            fv2 r0 = new fv2
            java.lang.String r1 = "Cursor"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fv2.Cursor = r0
            fv2 r0 = new fv2
            java.lang.String r1 = "SelectionStart"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fv2.SelectionStart = r0
            fv2 r0 = new fv2
            java.lang.String r1 = "SelectionEnd"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.fv2.SelectionEnd = r0
            fv2[] r0 = $values()
            defpackage.fv2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fv2.$ENTRIES = r0
            return
    }

    fv2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fv2.$ENTRIES
            return r0
    }

    public static defpackage.fv2 valueOf(java.lang.String r1) {
            java.lang.Class<fv2> r0 = defpackage.fv2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fv2 r1 = (defpackage.fv2) r1
            return r1
    }

    public static defpackage.fv2[] values() {
            fv2[] r0 = defpackage.fv2.$VALUES
            java.lang.Object r0 = r0.clone()
            fv2[] r0 = (defpackage.fv2[]) r0
            return r0
    }
}
