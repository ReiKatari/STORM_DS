package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jc extends defpackage.po2 implements defpackage.eo2 {
    public static final defpackage.jc d0 = null;

    static {
            jc r0 = new jc
            java.lang.String r4 = "min(II)I"
            r5 = 1
            r1 = 2
            java.lang.Class<u24> r2 = defpackage.u24.class
            java.lang.String r3 = "min"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.jc.d0 = r0
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
