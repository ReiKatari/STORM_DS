package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok2  reason: default package */
/* loaded from: classes.dex */
public final class ok2 extends defpackage.d9 {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;

    public ok2(java.util.concurrent.atomic.AtomicReference r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.d9
    public final void a(java.lang.Object r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r0.a
            java.lang.Object r0 = r0.get()
            d9 r0 = (defpackage.d9) r0
            if (r0 == 0) goto Le
            r0.a(r1)
            return
        Le:
            java.lang.String r0 = "Operation cannot be started before fragment is in created state"
            defpackage.i.m(r0)
            return
    }
}
