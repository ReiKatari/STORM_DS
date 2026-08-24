package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw5  reason: default package */
/* loaded from: classes.dex */
public enum jw5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.jw5[] $VALUES = null;
    public static final defpackage.jw5 NOT_SCANNED = null;
    public static final defpackage.jw5 UNCHANGED = null;
    public static final defpackage.jw5 UPDATED = null;

    private static final /* synthetic */ defpackage.jw5[] $values() {
            jw5 r0 = defpackage.jw5.UPDATED
            jw5 r1 = defpackage.jw5.UNCHANGED
            jw5 r2 = defpackage.jw5.NOT_SCANNED
            jw5[] r0 = new defpackage.jw5[]{r0, r1, r2}
            return r0
    }

    static {
            jw5 r0 = new jw5
            java.lang.String r1 = "UPDATED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.jw5.UPDATED = r0
            jw5 r0 = new jw5
            java.lang.String r1 = "UNCHANGED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.jw5.UNCHANGED = r0
            jw5 r0 = new jw5
            java.lang.String r1 = "NOT_SCANNED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.jw5.NOT_SCANNED = r0
            jw5[] r0 = $values()
            defpackage.jw5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.jw5.$ENTRIES = r0
            return
    }

    jw5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.jw5.$ENTRIES
            return r0
    }

    public static defpackage.jw5 valueOf(java.lang.String r1) {
            java.lang.Class<jw5> r0 = defpackage.jw5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jw5 r1 = (defpackage.jw5) r1
            return r1
    }

    public static defpackage.jw5[] values() {
            jw5[] r0 = defpackage.jw5.$VALUES
            java.lang.Object r0 = r0.clone()
            jw5[] r0 = (defpackage.jw5[]) r0
            return r0
    }
}
