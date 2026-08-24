package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i6  reason: default package */
/* loaded from: classes.dex */
public enum i6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.i6[] $VALUES = null;
    public static final defpackage.i6 LEGACY_KOTLIN = null;
    public static final defpackage.i6 RC_CLIENT = null;

    private static final /* synthetic */ defpackage.i6[] $values() {
            i6 r0 = defpackage.i6.RC_CLIENT
            i6 r1 = defpackage.i6.LEGACY_KOTLIN
            i6[] r0 = new defpackage.i6[]{r0, r1}
            return r0
    }

    static {
            i6 r0 = new i6
            java.lang.String r1 = "RC_CLIENT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.i6.RC_CLIENT = r0
            i6 r0 = new i6
            java.lang.String r1 = "LEGACY_KOTLIN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.i6.LEGACY_KOTLIN = r0
            i6[] r0 = $values()
            defpackage.i6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.i6.$ENTRIES = r0
            return
    }

    i6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.i6.$ENTRIES
            return r0
    }

    public static defpackage.i6 valueOf(java.lang.String r1) {
            java.lang.Class<i6> r0 = defpackage.i6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            i6 r1 = (defpackage.i6) r1
            return r1
    }

    public static defpackage.i6[] values() {
            i6[] r0 = defpackage.i6.$VALUES
            java.lang.Object r0 = r0.clone()
            i6[] r0 = (defpackage.i6[]) r0
            return r0
    }
}
