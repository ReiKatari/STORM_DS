package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s70  reason: default package */
/* loaded from: classes.dex */
public final class s70 {
    public final defpackage.ua4 a;

    public s70() {
            r2 = this;
            r2.<init>()
            ua4 r0 = new ua4
            r1 = 16
            t70[] r1 = new defpackage.t70[r1]
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public final java.lang.Object a(defpackage.of5 r9, defpackage.s41 r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.r70
            if (r0 == 0) goto L13
            r0 = r10
            r70 r0 = (defpackage.r70) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            r70 r0 = new r70
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r8 = r0.Z
            int r9 = r0.Y
            java.lang.Object[] r2 = r0.X
            of5 r4 = r0.R
            defpackage.oi2.Y(r10)
            r10 = r4
            goto L63
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L37:
            defpackage.oi2.Y(r10)
            ua4 r8 = r8.a
            java.lang.Object[] r10 = r8.A
            int r8 = r8.L
            r2 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L45:
            if (r9 >= r8) goto L65
            r4 = r2[r9]
            t70 r4 = (defpackage.t70) r4
            a5 r5 = new a5
            r6 = 9
            r5.<init>(r10, r6)
            r0.R = r10
            r0.X = r2
            r0.Y = r9
            r0.Z = r8
            r0.f0 = r3
            java.lang.Object r4 = defpackage.l.j(r4, r5, r0)
            if (r4 != r1) goto L63
            return r1
        L63:
            int r9 = r9 + r3
            goto L45
        L65:
            jg7 r8 = defpackage.jg7.a
            return r8
    }
}
