package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h6  reason: default package */
/* loaded from: classes.dex */
public enum h6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.h6[] $VALUES = null;
    public static final defpackage.h6 RUNTIME_OWNS_SUBMIT = null;
    public static final defpackage.h6 SUBMIT_FROM_KOTLIN = null;

    private static final /* synthetic */ defpackage.h6[] $values() {
            h6 r0 = defpackage.h6.RUNTIME_OWNS_SUBMIT
            h6 r1 = defpackage.h6.SUBMIT_FROM_KOTLIN
            h6[] r0 = new defpackage.h6[]{r0, r1}
            return r0
    }

    static {
            h6 r0 = new h6
            java.lang.String r1 = "RUNTIME_OWNS_SUBMIT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.h6.RUNTIME_OWNS_SUBMIT = r0
            h6 r0 = new h6
            java.lang.String r1 = "SUBMIT_FROM_KOTLIN"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.h6.SUBMIT_FROM_KOTLIN = r0
            h6[] r0 = $values()
            defpackage.h6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.h6.$ENTRIES = r0
            return
    }

    h6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.h6.$ENTRIES
            return r0
    }

    public static defpackage.h6 valueOf(java.lang.String r1) {
            java.lang.Class<h6> r0 = defpackage.h6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            h6 r1 = (defpackage.h6) r1
            return r1
    }

    public static defpackage.h6[] values() {
            h6[] r0 = defpackage.h6.$VALUES
            java.lang.Object r0 = r0.clone()
            h6[] r0 = (defpackage.h6[]) r0
            return r0
    }
}
