package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al6  reason: default package */
/* loaded from: classes.dex */
public enum al6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.al6[] $VALUES = null;
    public static final defpackage.al6 Indefinite = null;
    public static final defpackage.al6 Long = null;
    public static final defpackage.al6 Short = null;

    private static final /* synthetic */ defpackage.al6[] $values() {
            al6 r0 = defpackage.al6.Short
            al6 r1 = defpackage.al6.Long
            al6 r2 = defpackage.al6.Indefinite
            al6[] r0 = new defpackage.al6[]{r0, r1, r2}
            return r0
    }

    static {
            al6 r0 = new al6
            java.lang.String r1 = "Short"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.al6.Short = r0
            al6 r0 = new al6
            java.lang.String r1 = "Long"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.al6.Long = r0
            al6 r0 = new al6
            java.lang.String r1 = "Indefinite"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.al6.Indefinite = r0
            al6[] r0 = $values()
            defpackage.al6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.al6.$ENTRIES = r0
            return
    }

    al6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.al6.$ENTRIES
            return r0
    }

    public static defpackage.al6 valueOf(java.lang.String r1) {
            java.lang.Class<al6> r0 = defpackage.al6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            al6 r1 = (defpackage.al6) r1
            return r1
    }

    public static defpackage.al6[] values() {
            al6[] r0 = defpackage.al6.$VALUES
            java.lang.Object r0 = r0.clone()
            al6[] r0 = (defpackage.al6[]) r0
            return r0
    }
}
