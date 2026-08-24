package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n54  reason: default package */
/* loaded from: classes.dex */
public final class n54 implements defpackage.f92 {
    public final defpackage.g71 a;
    public final defpackage.g71 b;

    public n54(defpackage.g71 r1, defpackage.g71 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r2 = this;
            g71 r0 = r2.a
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            g71 r2 = r2.b
            java.lang.Object r2 = r2.get()
            m54 r1 = new m54
            bt r2 = (defpackage.bt) r2
            r1.<init>(r0, r2)
            return r1
    }
}
