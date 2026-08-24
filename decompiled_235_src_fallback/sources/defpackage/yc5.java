package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc5  reason: default package */
/* loaded from: classes.dex */
public enum yc5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.yc5[] $VALUES = null;
    public static final defpackage.yc5 LEGACY_KOTLIN = null;
    public static final defpackage.yc5 NONE = null;
    public static final defpackage.yc5 RC_CLIENT = null;

    private static final /* synthetic */ defpackage.yc5[] $values() {
            yc5 r0 = defpackage.yc5.RC_CLIENT
            yc5 r1 = defpackage.yc5.LEGACY_KOTLIN
            yc5 r2 = defpackage.yc5.NONE
            yc5[] r0 = new defpackage.yc5[]{r0, r1, r2}
            return r0
    }

    static {
            yc5 r0 = new yc5
            java.lang.String r1 = "RC_CLIENT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.yc5.RC_CLIENT = r0
            yc5 r0 = new yc5
            java.lang.String r1 = "LEGACY_KOTLIN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.yc5.LEGACY_KOTLIN = r0
            yc5 r0 = new yc5
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.yc5.NONE = r0
            yc5[] r0 = $values()
            defpackage.yc5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.yc5.$ENTRIES = r0
            return
    }

    yc5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.yc5.$ENTRIES
            return r0
    }

    public static defpackage.yc5 valueOf(java.lang.String r1) {
            java.lang.Class<yc5> r0 = defpackage.yc5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yc5 r1 = (defpackage.yc5) r1
            return r1
    }

    public static defpackage.yc5[] values() {
            yc5[] r0 = defpackage.yc5.$VALUES
            java.lang.Object r0 = r0.clone()
            yc5[] r0 = (defpackage.yc5[]) r0
            return r0
    }
}
