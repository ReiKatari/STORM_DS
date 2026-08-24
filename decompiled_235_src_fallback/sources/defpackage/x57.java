package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x57  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x57 extends defpackage.po2 implements defpackage.on2 {
    public static final defpackage.x57 d0 = null;

    static {
            x57 r0 = new x57
            java.lang.String r4 = "currentTimeMillis()J"
            r5 = 0
            r1 = 0
            java.lang.Class<java.lang.System> r2 = java.lang.System.class
            java.lang.String r3 = "currentTimeMillis"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.x57.d0 = r0
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }
}
