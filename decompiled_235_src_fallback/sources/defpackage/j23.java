package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j23  reason: default package */
/* loaded from: classes.dex */
public interface j23 extends defpackage.yd5 {
    public static final defpackage.xx l = null;
    public static final defpackage.xx m = null;
    public static final defpackage.xx n = null;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageInput.inputFormat"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.j23.l = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageInput.secondaryInputFormat"
            r0.<init>(r1, r2, r3)
            defpackage.j23.m = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageInput.inputDynamicRange"
            java.lang.Class<yq1> r2 = defpackage.yq1.class
            r0.<init>(r1, r2, r3)
            defpackage.j23.n = r0
            return
    }

    default int q() {
            r1 = this;
            xx r0 = defpackage.j23.l
            java.lang.Object r1 = r1.e(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }
}
