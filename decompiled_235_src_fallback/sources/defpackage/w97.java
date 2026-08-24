package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w97  reason: default package */
/* loaded from: classes.dex */
public final class w97 {
    public final defpackage.wc7 a;
    public final defpackage.vs4 b;
    public final /* synthetic */ defpackage.ga7 c;

    public w97(defpackage.ga7 r1, defpackage.wc7 r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.a = r2
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.b = r1
            return
    }

    public final defpackage.v97 a(defpackage.qn2 r9, defpackage.qn2 r10) {
            r8 = this;
            vs4 r0 = r8.b
            java.lang.Object r1 = r0.getValue()
            v97 r1 = (defpackage.v97) r1
            ga7 r2 = r8.c
            if (r1 != 0) goto L3f
            v97 r1 = new v97
            ca7 r3 = new ca7
            gx0 r4 = r2.a
            java.lang.Object r4 = r4.f()
            java.lang.Object r4 = r10.g(r4)
            gx0 r5 = r2.a
            java.lang.Object r5 = r5.f()
            java.lang.Object r5 = r10.g(r5)
            wc7 r6 = r8.a
            qn2 r7 = r6.a
            java.lang.Object r5 = r7.g(r5)
            ap r5 = (defpackage.ap) r5
            r5.d()
            r3.<init>(r2, r4, r5, r6)
            r1.<init>(r8, r3, r9, r10)
            r0.setValue(r1)
            mm6 r8 = r2.i
            r8.add(r3)
        L3f:
            r1.L = r10
            r1.B = r9
            aa7 r8 = r2.f()
            r1.a(r8)
            return r1
    }
}
