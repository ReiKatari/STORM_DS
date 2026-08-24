package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s40  reason: default package */
/* loaded from: classes.dex */
public final class s40 {
    public final defpackage.b33 a;
    public final defpackage.fo4 b;
    public final defpackage.lb6 c;
    public final defpackage.u72 d;

    public s40(defpackage.b33 r1, defpackage.fo4 r2, defpackage.lb6 r3, defpackage.u72 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final java.lang.Object a(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.r40
            if (r0 == 0) goto L13
            r0 = r8
            r40 r0 = (defpackage.r40) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            r40 r0 = new r40
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.R
            lb6 r7 = (defpackage.lb6) r7
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L2f:
            r8 = move-exception
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L37:
            lb6 r7 = r0.X
            java.lang.Object r2 = r0.R
            s40 r2 = (defpackage.s40) r2
            defpackage.oi2.Y(r8)
            r8 = r7
            r7 = r2
            goto L55
        L43:
            defpackage.oi2.Y(r8)
            r0.R = r7
            lb6 r8 = r7.c
            r0.X = r8
            r0.d0 = r5
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L55
            goto L71
        L55:
            a5 r2 = new a5     // Catch: java.lang.Throwable -> L7f
            r5 = 8
            r2.<init>(r7, r5)     // Catch: java.lang.Throwable -> L7f
            r0.R = r8     // Catch: java.lang.Throwable -> L7f
            r0.X = r3     // Catch: java.lang.Throwable -> L7f
            r0.d0 = r4     // Catch: java.lang.Throwable -> L7f
            vt1 r7 = defpackage.vt1.A     // Catch: java.lang.Throwable -> L7f
            m5 r4 = new m5     // Catch: java.lang.Throwable -> L7f
            r5 = 17
            r4.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r7 = defpackage.hv.d0(r7, r4, r0)     // Catch: java.lang.Throwable -> L7f
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            r6 = r8
            r8 = r7
            r7 = r6
        L75:
            qc1 r8 = (defpackage.qc1) r8     // Catch: java.lang.Throwable -> L2f
            r7.c()
            return r8
        L7b:
            r6 = r8
            r8 = r7
            r7 = r6
            goto L81
        L7f:
            r7 = move-exception
            goto L7b
        L81:
            r7.c()
            throw r8
    }
}
