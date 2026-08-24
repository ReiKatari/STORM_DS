package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i91  reason: default package */
/* loaded from: classes.dex */
public enum i91 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.i91[] $VALUES = null;
    public static final defpackage.i91 EXPORT = null;
    public static final defpackage.i91 IMPORT = null;
    public static final defpackage.i91 MAIN = null;
    public static final defpackage.i91 NONE = null;

    private static final /* synthetic */ defpackage.i91[] $values() {
            i91 r0 = defpackage.i91.NONE
            i91 r1 = defpackage.i91.MAIN
            i91 r2 = defpackage.i91.IMPORT
            i91 r3 = defpackage.i91.EXPORT
            i91[] r0 = new defpackage.i91[]{r0, r1, r2, r3}
            return r0
    }

    static {
            i91 r0 = new i91
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.i91.NONE = r0
            i91 r0 = new i91
            java.lang.String r1 = "MAIN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.i91.MAIN = r0
            i91 r0 = new i91
            java.lang.String r1 = "IMPORT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.i91.IMPORT = r0
            i91 r0 = new i91
            java.lang.String r1 = "EXPORT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.i91.EXPORT = r0
            i91[] r0 = $values()
            defpackage.i91.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.i91.$ENTRIES = r0
            return
    }

    i91(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.i91.$ENTRIES
            return r0
    }

    public static defpackage.i91 valueOf(java.lang.String r1) {
            java.lang.Class<i91> r0 = defpackage.i91.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i91 r1 = (defpackage.i91) r1
            return r1
    }

    public static defpackage.i91[] values() {
            i91[] r0 = defpackage.i91.$VALUES
            java.lang.Object r0 = r0.clone()
            i91[] r0 = (defpackage.i91[]) r0
            return r0
    }
}
