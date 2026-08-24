package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd3  reason: default package */
/* loaded from: classes.dex */
public final class xd3 implements defpackage.z32 {
    public static final defpackage.wd3 e = null;
    public final java.util.HashMap a;
    public final java.util.HashMap b;
    public final defpackage.ud3 c;
    public boolean d;

    static {
            wd3 r0 = new wd3
            r0.<init>()
            defpackage.xd3.e = r0
            return
    }

    public xd3() {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.a = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.b = r1
            ud3 r2 = defpackage.ud3.a
            r3.c = r2
            r2 = 0
            r3.d = r2
            vd3 r3 = defpackage.vd3.b
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1.put(r2, r3)
            r0.remove(r2)
            vd3 r3 = defpackage.vd3.c
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r1.put(r2, r3)
            r0.remove(r2)
            wd3 r3 = defpackage.xd3.e
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            r1.put(r2, r3)
            r0.remove(r2)
            return
    }

    @Override // defpackage.z32
    public final defpackage.z32 registerEncoder(java.lang.Class r2, defpackage.qh4 r3) {
            r1 = this;
            java.util.HashMap r0 = r1.a
            r0.put(r2, r3)
            java.util.HashMap r3 = r1.b
            r3.remove(r2)
            return r1
    }
}
