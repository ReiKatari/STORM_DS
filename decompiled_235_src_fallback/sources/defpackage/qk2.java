package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk2  reason: default package */
/* loaded from: classes.dex */
public final class qk2 extends defpackage.sk2 {
    public final /* synthetic */ defpackage.mo2 a;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference b;
    public final /* synthetic */ defpackage.b9 c;
    public final /* synthetic */ defpackage.a9 d;
    public final /* synthetic */ androidx.fragment.app.o e;

    public qk2(androidx.fragment.app.o r1, defpackage.mo2 r2, java.util.concurrent.atomic.AtomicReference r3, defpackage.b9 r4, defpackage.a9 r5) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            return
    }

    @Override // defpackage.sk2
    public final void a() {
            r5 = this;
            androidx.fragment.app.o r0 = r5.e
            java.lang.String r1 = r0.generateActivityResultKey()
            mo2 r2 = r5.a
            r3 = 0
            java.lang.Object r2 = r2.apply(r3)
            j9 r2 = (defpackage.j9) r2
            b9 r3 = r5.c
            a9 r4 = r5.d
            i9 r0 = r2.d(r1, r0, r3, r4)
            java.util.concurrent.atomic.AtomicReference r5 = r5.b
            r5.set(r0)
            return
    }
}
