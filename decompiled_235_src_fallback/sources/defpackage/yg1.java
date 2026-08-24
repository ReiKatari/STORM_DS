package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg1  reason: default package */
/* loaded from: classes.dex */
public final class yg1 implements defpackage.m55 {
    public defpackage.m55 a;

    public static void a(defpackage.yg1 r1, defpackage.m55 r2) {
            m55 r0 = r1.a
            if (r0 != 0) goto L7
            r1.a = r2
            return
        L7:
            defpackage.e41.m()
            return
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r0 = this;
            m55 r0 = r0.a
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.get()
            return r0
        L9:
            defpackage.e41.m()
            r0 = 0
            return r0
    }
}
