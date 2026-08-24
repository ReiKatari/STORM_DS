package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn3  reason: default package */
/* loaded from: classes.dex */
public final class cn3 extends defpackage.pm3 {
    public final /* synthetic */ defpackage.gn3 b;
    public final /* synthetic */ defpackage.eo2 c;

    public cn3(defpackage.gn3 r1, defpackage.eo2 r2, java.lang.String r3) {
            r0 = this;
            r0.b = r1
            r0.c = r2
            r0.<init>(r3)
            return
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r7, java.util.List r8, long r9) {
            r6 = this;
            gn3 r2 = r6.b
            an3 r8 = r2.d0
            kk3 r0 = r7.getLayoutDirection()
            r8.A = r0
            float r0 = r7.a()
            r8.B = r0
            float r0 = r7.Y()
            r8.L = r0
            boolean r7 = r7.a0()
            eo2 r6 = r6.c
            r0 = 0
            if (r7 != 0) goto L3f
            sm3 r7 = r2.A
            sm3 r7 = r7.e0
            if (r7 == 0) goto L3f
            r2.X = r0
            xm3 r7 = r2.e0
            q21 r8 = new q21
            r8.<init>(r9)
            java.lang.Object r6 = r6.o(r7, r8)
            r1 = r6
            f34 r1 = (defpackage.f34) r1
            int r3 = r2.X
            bn3 r0 = new bn3
            r5 = 0
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L3f:
            r2.R = r0
            q21 r7 = new q21
            r7.<init>(r9)
            java.lang.Object r6 = r6.o(r8, r7)
            r1 = r6
            f34 r1 = (defpackage.f34) r1
            int r3 = r2.R
            bn3 r0 = new bn3
            r5 = 1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
