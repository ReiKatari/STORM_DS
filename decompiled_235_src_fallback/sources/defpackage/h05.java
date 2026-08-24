package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h05  reason: default package */
/* loaded from: classes.dex */
public enum h05 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.h05[] $VALUES = null;
    public static final defpackage.h05 SHOW_DESCRIPTION = null;
    public static final defpackage.h05 SHOW_ICON = null;
    public static final defpackage.h05 SHOW_TITLE = null;

    private static final /* synthetic */ defpackage.h05[] $values() {
            h05 r0 = defpackage.h05.SHOW_ICON
            h05 r1 = defpackage.h05.SHOW_TITLE
            h05 r2 = defpackage.h05.SHOW_DESCRIPTION
            h05[] r0 = new defpackage.h05[]{r0, r1, r2}
            return r0
    }

    static {
            h05 r0 = new h05
            java.lang.String r1 = "SHOW_ICON"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.h05.SHOW_ICON = r0
            h05 r0 = new h05
            java.lang.String r1 = "SHOW_TITLE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.h05.SHOW_TITLE = r0
            h05 r0 = new h05
            java.lang.String r1 = "SHOW_DESCRIPTION"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.h05.SHOW_DESCRIPTION = r0
            h05[] r0 = $values()
            defpackage.h05.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.h05.$ENTRIES = r0
            return
    }

    h05(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.h05.$ENTRIES
            return r0
    }

    public static defpackage.h05 valueOf(java.lang.String r1) {
            java.lang.Class<h05> r0 = defpackage.h05.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            h05 r1 = (defpackage.h05) r1
            return r1
    }

    public static defpackage.h05[] values() {
            h05[] r0 = defpackage.h05.$VALUES
            java.lang.Object r0 = r0.clone()
            h05[] r0 = (defpackage.h05[]) r0
            return r0
    }
}
