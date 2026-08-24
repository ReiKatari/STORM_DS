package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jo5  reason: default package */
/* loaded from: classes.dex */
public final class jo5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.no5 d0;
    public final /* synthetic */ defpackage.pq5 e0;

    public /* synthetic */ jo5(defpackage.no5 r1, defpackage.pq5 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.d0 = r1
            r0.e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            jo5 r2 = (defpackage.jo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            jo5 r2 = (defpackage.jo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            jo5 r2 = (defpackage.jo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.X
            pq5 r1 = r3.e0
            no5 r3 = r3.d0
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L12;
                default: goto L9;
            }
        L9:
            jo5 r0 = new jo5
            r2 = 2
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
        L12:
            jo5 r0 = new jo5
            r2 = 1
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
        L1b:
            jo5 r0 = new jo5
            r2 = 0
            r0.<init>(r3, r1, r4, r2)
            r0.Z = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            zt1 r1 = defpackage.zt1.A
            no5 r2 = r7.d0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L79;
                case 1: goto L43;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r7.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L23
            if (r6 != r4) goto L1f
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L1d
            goto L32
        L1d:
            r7 = move-exception
            goto L35
        L1f:
            defpackage.i.m(r3)
            goto L42
        L23:
            defpackage.oi2.Y(r8)
            r7.Z = r5     // Catch: java.lang.Throwable -> L1d
            r7.Y = r4     // Catch: java.lang.Throwable -> L1d
            java.io.Serializable r8 = r2.j(r7)     // Catch: java.lang.Throwable -> L1d
            if (r8 != r0) goto L32
            r5 = r0
            goto L42
        L32:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L1d
            goto L3a
        L35:
            em5 r8 = new em5
            r8.<init>(r7)
        L3a:
            java.lang.Throwable r7 = defpackage.hm5.a(r8)
            if (r7 != 0) goto L41
            r1 = r8
        L41:
            r5 = r1
        L42:
            return r5
        L43:
            java.lang.Object r0 = r7.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L59
            if (r6 != r4) goto L55
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L53
            goto L68
        L53:
            r7 = move-exception
            goto L6b
        L55:
            defpackage.i.m(r3)
            goto L78
        L59:
            defpackage.oi2.Y(r8)
            r7.Z = r5     // Catch: java.lang.Throwable -> L53
            r7.Y = r4     // Catch: java.lang.Throwable -> L53
            java.io.Serializable r8 = r2.i(r7)     // Catch: java.lang.Throwable -> L53
            if (r8 != r0) goto L68
            r5 = r0
            goto L78
        L68:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L53
            goto L70
        L6b:
            em5 r8 = new em5
            r8.<init>(r7)
        L70:
            java.lang.Throwable r7 = defpackage.hm5.a(r8)
            if (r7 != 0) goto L77
            r1 = r8
        L77:
            r5 = r1
        L78:
            return r5
        L79:
            java.lang.Object r0 = r7.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.Y
            if (r1 == 0) goto L8d
            if (r1 != r4) goto L89
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> La1
            goto L9e
        L89:
            defpackage.i.m(r3)
            goto Lb2
        L8d:
            defpackage.oi2.Y(r8)
            pq5 r8 = r7.e0
            r7.Z = r5     // Catch: java.lang.Throwable -> La1
            r7.Y = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r8 = r2.g(r8, r7)     // Catch: java.lang.Throwable -> La1
            if (r8 != r0) goto L9e
            r5 = r0
            goto Lb2
        L9e:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> La1
            goto La7
        La1:
            r7 = move-exception
            em5 r8 = new em5
            r8.<init>(r7)
        La7:
            java.lang.Throwable r7 = defpackage.hm5.a(r8)
            if (r7 != 0) goto Laf
            r5 = r8
            goto Lb2
        Laf:
            du1 r7 = defpackage.du1.A
            r5 = r7
        Lb2:
            return r5
    }
}
