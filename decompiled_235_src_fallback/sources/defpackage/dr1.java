package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr1  reason: default package */
/* loaded from: classes.dex */
public final class dr1 implements defpackage.br1 {
    public static final defpackage.d51 a = null;
    public static final java.util.Set b = null;

    static {
            d51 r0 = new d51
            dr1 r1 = new dr1
            r1.<init>()
            r2 = 14
            r0.<init>(r1, r2)
            defpackage.dr1.a = r0
            yq1 r0 = defpackage.yq1.d
            java.util.Set r0 = defpackage.ii2.R(r0)
            defpackage.dr1.b = r0
            return
    }

    @Override // defpackage.br1
    public final java.util.Set a() {
            r0 = this;
            java.util.Set r0 = defpackage.dr1.b
            return r0
    }

    @Override // defpackage.br1
    public final android.hardware.camera2.params.DynamicRangeProfiles b() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.br1
    public final java.util.Set c(defpackage.yq1 r3) {
            r2 = this;
            r3.getClass()
            yq1 r2 = defpackage.yq1.d
            boolean r2 = r2.equals(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DynamicRange is not supported: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            defpackage.np2.s(r3, r2)
            java.util.Set r2 = defpackage.dr1.b
            return r2
    }
}
