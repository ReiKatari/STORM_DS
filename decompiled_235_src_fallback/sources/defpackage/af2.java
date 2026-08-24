package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: af2  reason: default package */
/* loaded from: classes.dex */
public final class af2 implements defpackage.le2 {
    public final /* synthetic */ defpackage.le2 A;
    public final /* synthetic */ defpackage.fo2 B;

    public af2(defpackage.le2 r1, defpackage.fo2 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r9, defpackage.r41 r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ze2
            if (r0 == 0) goto L13
            r0 = r10
            ze2 r0 = (defpackage.ze2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ze2 r0 = new ze2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.Z
            k36 r8 = (defpackage.k36) r8
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r9 = move-exception
            goto L85
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r6
        L3a:
            java.lang.Object r8 = r0.Z
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.oi2.Y(r10)
            goto L9d
        L42:
            ne2 r9 = r0.d0
            java.lang.Object r8 = r0.Z
            af2 r8 = (defpackage.af2) r8
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L4c
            goto L63
        L4c:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L89
        L51:
            defpackage.oi2.Y(r10)
            le2 r10 = r8.A     // Catch: java.lang.Throwable -> L4c
            r0.Z = r8     // Catch: java.lang.Throwable -> L4c
            r0.d0 = r9     // Catch: java.lang.Throwable -> L4c
            r0.X = r5     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r10.b(r9, r0)     // Catch: java.lang.Throwable -> L4c
            if (r10 != r1) goto L63
            goto L9c
        L63:
            k36 r10 = new k36
            l61 r2 = r0.B
            r2.getClass()
            r10.<init>(r9, r2)
            fo2 r8 = r8.B     // Catch: java.lang.Throwable -> L83
            r0.Z = r10     // Catch: java.lang.Throwable -> L83
            r0.d0 = r6     // Catch: java.lang.Throwable -> L83
            r0.X = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r8.e(r10, r6, r0)     // Catch: java.lang.Throwable -> L83
            if (r8 != r1) goto L7c
            goto L9c
        L7c:
            r8 = r10
        L7d:
            r8.u()
            jg7 r8 = defpackage.jg7.a
            return r8
        L83:
            r9 = move-exception
            r8 = r10
        L85:
            r8.u()
            throw r9
        L89:
            w57 r10 = new w57
            r10.<init>(r8)
            fo2 r9 = r9.B
            r0.Z = r8
            r0.d0 = r6
            r0.X = r4
            java.lang.Object r9 = defpackage.u24.e(r10, r9, r8, r0)
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            throw r8
    }
}
