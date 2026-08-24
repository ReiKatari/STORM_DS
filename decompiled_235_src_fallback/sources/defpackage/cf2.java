package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf2  reason: default package */
/* loaded from: classes.dex */
public final class cf2 implements defpackage.le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.le2 B;
    public final /* synthetic */ defpackage.eo2 L;

    public cf2(defpackage.eo2 r2, defpackage.le2 r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public /* synthetic */ cf2(defpackage.le2 r1, defpackage.eo2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r9, defpackage.r41 r10) {
            r8 = this;
            int r0 = r8.A
            le2 r1 = r8.B
            jg7 r2 = defpackage.jg7.a
            eo2 r3 = r8.L
            switch(r0) {
                case 0: goto L31;
                case 1: goto L1c;
                default: goto Lb;
            }
        Lb:
            zb0 r8 = new zb0
            r0 = 10
            r8.<init>(r0, r9, r3)
            java.lang.Object r8 = r1.b(r8, r10)
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            if (r8 != r9) goto L1b
            r2 = r8
        L1b:
            return r2
        L1c:
            zg5 r8 = new zg5
            r8.<init>()
            vc r0 = new vc
            r4 = 4
            r0.<init>(r8, r9, r3, r4)
            java.lang.Object r8 = r1.b(r0, r10)
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            if (r8 != r9) goto L30
            r2 = r8
        L30:
            return r2
        L31:
            boolean r0 = r10 instanceof defpackage.bf2
            if (r0 == 0) goto L44
            r0 = r10
            bf2 r0 = (defpackage.bf2) r0
            int r1 = r0.X
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1 & r4
            if (r5 == 0) goto L44
            int r1 = r1 - r4
            r0.X = r1
            goto L49
        L44:
            bf2 r0 = new bf2
            r0.<init>(r8, r10)
        L49:
            java.lang.Object r10 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.X
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L6f
            if (r4 == r7) goto L63
            if (r4 != r6) goto L5c
            defpackage.oi2.Y(r10)
            goto La1
        L5c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r2 = r5
            goto La1
        L63:
            k36 r8 = r0.e0
            ne2 r9 = r0.d0
            cf2 r3 = r0.Z
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L6d
            goto L8d
        L6d:
            r9 = move-exception
            goto La4
        L6f:
            defpackage.oi2.Y(r10)
            k36 r10 = new k36
            l61 r4 = r0.B
            r4.getClass()
            r10.<init>(r9, r4)
            r0.Z = r8     // Catch: java.lang.Throwable -> La2
            r0.d0 = r9     // Catch: java.lang.Throwable -> La2
            r0.e0 = r10     // Catch: java.lang.Throwable -> La2
            r0.X = r7     // Catch: java.lang.Throwable -> La2
            java.lang.Object r3 = r3.o(r10, r0)     // Catch: java.lang.Throwable -> La2
            if (r3 != r1) goto L8b
            goto La0
        L8b:
            r3 = r8
            r8 = r10
        L8d:
            r8.u()
            le2 r8 = r3.B
            r0.Z = r5
            r0.d0 = r5
            r0.e0 = r5
            r0.X = r6
            java.lang.Object r8 = r8.b(r9, r0)
            if (r8 != r1) goto La1
        La0:
            r2 = r1
        La1:
            return r2
        La2:
            r9 = move-exception
            r8 = r10
        La4:
            r8.u()
            throw r9
    }
}
