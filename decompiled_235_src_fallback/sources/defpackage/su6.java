package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su6  reason: default package */
/* loaded from: classes.dex */
public enum su6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.su6[] $VALUES = null;
    public static final defpackage.su6 BEGIN_DEFERRED = null;
    public static final defpackage.su6 BEGIN_EXCLUSIVE = null;
    public static final defpackage.su6 BEGIN_IMMEDIATE = null;
    public static final defpackage.su6 END = null;
    public static final defpackage.su6 ROLLBACK = null;

    private static final /* synthetic */ defpackage.su6[] $values() {
            su6 r0 = defpackage.su6.END
            su6 r1 = defpackage.su6.ROLLBACK
            su6 r2 = defpackage.su6.BEGIN_EXCLUSIVE
            su6 r3 = defpackage.su6.BEGIN_IMMEDIATE
            su6 r4 = defpackage.su6.BEGIN_DEFERRED
            su6[] r0 = new defpackage.su6[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            su6 r0 = new su6
            java.lang.String r1 = "END"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.su6.END = r0
            su6 r0 = new su6
            java.lang.String r1 = "ROLLBACK"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.su6.ROLLBACK = r0
            su6 r0 = new su6
            java.lang.String r1 = "BEGIN_EXCLUSIVE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.su6.BEGIN_EXCLUSIVE = r0
            su6 r0 = new su6
            java.lang.String r1 = "BEGIN_IMMEDIATE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.su6.BEGIN_IMMEDIATE = r0
            su6 r0 = new su6
            java.lang.String r1 = "BEGIN_DEFERRED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.su6.BEGIN_DEFERRED = r0
            su6[] r0 = $values()
            defpackage.su6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.su6.$ENTRIES = r0
            return
    }

    su6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.su6.$ENTRIES
            return r0
    }

    public static defpackage.su6 valueOf(java.lang.String r1) {
            java.lang.Class<su6> r0 = defpackage.su6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            su6 r1 = (defpackage.su6) r1
            return r1
    }

    public static defpackage.su6[] values() {
            su6[] r0 = defpackage.su6.$VALUES
            java.lang.Object r0 = r0.clone()
            su6[] r0 = (defpackage.su6[]) r0
            return r0
    }
}
