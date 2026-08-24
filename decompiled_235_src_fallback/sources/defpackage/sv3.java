package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv3  reason: default package */
/* loaded from: classes.dex */
public enum sv3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.sv3[] $VALUES = null;
    public static final defpackage.sv3 DESTINATION = null;
    public static final defpackage.sv3 LABEL = null;
    public static final defpackage.sv3 PARAGRAPH = null;
    public static final defpackage.sv3 START_DEFINITION = null;
    public static final defpackage.sv3 START_TITLE = null;
    public static final defpackage.sv3 TITLE = null;

    static {
            sv3 r0 = new sv3
            java.lang.String r1 = "START_DEFINITION"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sv3.START_DEFINITION = r0
            sv3 r1 = new sv3
            java.lang.String r2 = "LABEL"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.sv3.LABEL = r1
            sv3 r2 = new sv3
            java.lang.String r3 = "DESTINATION"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.sv3.DESTINATION = r2
            sv3 r3 = new sv3
            java.lang.String r4 = "START_TITLE"
            r5 = 3
            r3.<init>(r4, r5)
            defpackage.sv3.START_TITLE = r3
            sv3 r4 = new sv3
            java.lang.String r5 = "TITLE"
            r6 = 4
            r4.<init>(r5, r6)
            defpackage.sv3.TITLE = r4
            sv3 r5 = new sv3
            java.lang.String r6 = "PARAGRAPH"
            r7 = 5
            r5.<init>(r6, r7)
            defpackage.sv3.PARAGRAPH = r5
            sv3[] r0 = new defpackage.sv3[]{r0, r1, r2, r3, r4, r5}
            defpackage.sv3.$VALUES = r0
            return
    }

    sv3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.sv3 valueOf(java.lang.String r1) {
            java.lang.Class<sv3> r0 = defpackage.sv3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sv3 r1 = (defpackage.sv3) r1
            return r1
    }

    public static defpackage.sv3[] values() {
            sv3[] r0 = defpackage.sv3.$VALUES
            java.lang.Object r0 = r0.clone()
            sv3[] r0 = (defpackage.sv3[]) r0
            return r0
    }
}
