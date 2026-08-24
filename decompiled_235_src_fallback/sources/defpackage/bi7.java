package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bi7  reason: default package */
/* loaded from: classes.dex */
public enum bi7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.bi7[] $VALUES = null;
    public static final defpackage.bi7 ACTIVE = null;
    public static final defpackage.bi7 INACTIVE = null;

    private static /* synthetic */ defpackage.bi7[] $values() {
            bi7 r0 = defpackage.bi7.ACTIVE
            bi7 r1 = defpackage.bi7.INACTIVE
            bi7[] r0 = new defpackage.bi7[]{r0, r1}
            return r0
    }

    static {
            bi7 r0 = new bi7
            java.lang.String r1 = "ACTIVE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bi7.ACTIVE = r0
            bi7 r0 = new bi7
            java.lang.String r1 = "INACTIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.bi7.INACTIVE = r0
            bi7[] r0 = $values()
            defpackage.bi7.$VALUES = r0
            return
    }

    bi7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.bi7 valueOf(java.lang.String r1) {
            java.lang.Class<bi7> r0 = defpackage.bi7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bi7 r1 = (defpackage.bi7) r1
            return r1
    }

    public static defpackage.bi7[] values() {
            bi7[] r0 = defpackage.bi7.$VALUES
            java.lang.Object r0 = r0.clone()
            bi7[] r0 = (defpackage.bi7[]) r0
            return r0
    }
}
