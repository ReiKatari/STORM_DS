package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y62  reason: default package */
/* loaded from: classes.dex */
public final class y62 extends defpackage.yc7 {
    public volatile defpackage.yc7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ defpackage.su2 d;
    public final /* synthetic */ defpackage.ie7 e;
    public final /* synthetic */ defpackage.z62 f;

    public y62(defpackage.z62 r1, boolean r2, boolean r3, defpackage.su2 r4, defpackage.ie7 r5) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            boolean r0 = r3.b
            if (r0 == 0) goto L9
            r4.u0()
            r3 = 0
            return r3
        L9:
            yc7 r0 = r3.a
            if (r0 != 0) goto L19
            su2 r0 = r3.d
            z62 r1 = r3.f
            ie7 r2 = r3.e
            yc7 r0 = r0.e(r1, r2)
            r3.a = r0
        L19:
            java.lang.Object r3 = r0.b(r4)
            return r3
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.c
            if (r0 == 0) goto L8
            r4.A()
            return
        L8:
            yc7 r0 = r3.a
            if (r0 != 0) goto L18
            su2 r0 = r3.d
            z62 r1 = r3.f
            ie7 r2 = r3.e
            yc7 r0 = r0.e(r1, r2)
            r3.a = r0
        L18:
            r0.c(r4, r5)
            return
    }
}
