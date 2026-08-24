package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v97  reason: default package */
/* loaded from: classes.dex */
public final class v97 implements defpackage.pp6 {
    public final defpackage.ca7 A;
    public defpackage.qn2 B;
    public defpackage.qn2 L;
    public final /* synthetic */ defpackage.w97 R;

    public v97(defpackage.w97 r1, defpackage.ca7 r2, defpackage.qn2 r3, defpackage.qn2 r4) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r0.A = r2
            r0.B = r3
            r0.L = r4
            return
    }

    public final void a(defpackage.aa7 r5) {
            r4 = this;
            qn2 r0 = r4.L
            java.lang.Object r1 = r5.c()
            java.lang.Object r0 = r0.g(r1)
            w97 r1 = r4.R
            ga7 r1 = r1.c
            boolean r1 = r1.g()
            ca7 r2 = r4.A
            if (r1 == 0) goto L2c
            qn2 r1 = r4.L
            java.lang.Object r3 = r5.a()
            java.lang.Object r1 = r1.g(r3)
            qn2 r4 = r4.B
            java.lang.Object r4 = r4.g(r5)
            rc2 r4 = (defpackage.rc2) r4
            r2.h(r1, r0, r4)
            return
        L2c:
            qn2 r4 = r4.B
            java.lang.Object r4 = r4.g(r5)
            rc2 r4 = (defpackage.rc2) r4
            r2.i(r0, r4)
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r1 = this;
            w97 r0 = r1.R
            ga7 r0 = r0.c
            aa7 r0 = r0.f()
            r1.a(r0)
            ca7 r1 = r1.A
            vs4 r1 = r1.f0
            java.lang.Object r1 = r1.getValue()
            return r1
    }
}
