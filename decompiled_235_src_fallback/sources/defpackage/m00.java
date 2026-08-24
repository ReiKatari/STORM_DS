package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m00  reason: default package */
/* loaded from: classes.dex */
public enum m00 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.m00[] $VALUES = null;
    public static final defpackage.m00 FATAL_ERROR = null;
    public static final defpackage.m00 OK = null;
    public static final defpackage.m00 TRANSIENT_ERROR = null;

    static {
            m00 r0 = new m00
            java.lang.String r1 = "OK"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.m00.OK = r0
            m00 r1 = new m00
            java.lang.String r2 = "TRANSIENT_ERROR"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.m00.TRANSIENT_ERROR = r1
            m00 r2 = new m00
            java.lang.String r3 = "FATAL_ERROR"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.m00.FATAL_ERROR = r2
            m00[] r0 = new defpackage.m00[]{r0, r1, r2}
            defpackage.m00.$VALUES = r0
            return
    }

    m00(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.m00 valueOf(java.lang.String r1) {
            java.lang.Class<m00> r0 = defpackage.m00.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            m00 r1 = (defpackage.m00) r1
            return r1
    }

    public static defpackage.m00[] values() {
            m00[] r0 = defpackage.m00.$VALUES
            java.lang.Object r0 = r0.clone()
            m00[] r0 = (defpackage.m00[]) r0
            return r0
    }
}
