package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ud3 implements defpackage.qh4 {
    public static final defpackage.ud3 a = null;

    static {
            ud3 r0 = new ud3
            r0.<init>()
            defpackage.ud3.a = r0
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            wd3 r1 = defpackage.xd3.e
            d42 r1 = new d42
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Couldn't find encoder for type "
            r3.<init>(r0)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }
}
