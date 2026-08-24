package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k20  reason: default package */
/* loaded from: classes.dex */
public final class k20 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.fk3 Y;
    public final /* synthetic */ android.content.Context Z;
    public final /* synthetic */ android.net.Uri d0;
    public final /* synthetic */ defpackage.zn3 e0;

    public k20(defpackage.fk3 r1, android.content.Context r2, android.net.Uri r3, defpackage.zn3 r4, defpackage.r41 r5) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            k20 r0 = (defpackage.k20) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            k20 r0 = new k20
            android.net.Uri r3 = r6.d0
            zn3 r4 = r6.e0
            fk3 r1 = r6.Y
            android.content.Context r2 = r6.Z
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.X
            zn3 r2 = r7.e0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            defpackage.oi2.Y(r8)
            goto L81
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r5
        L19:
            defpackage.oi2.Y(r8)     // Catch: java.lang.Exception -> L1d
            goto L69
        L1d:
            r8 = move-exception
            goto L6c
        L1f:
            defpackage.oi2.Y(r8)
            fk3 r8 = r7.Y     // Catch: java.lang.Exception -> L1d
            gk3 r8 = defpackage.gk3.a.a(r8)     // Catch: java.lang.Exception -> L1d
            su2 r1 = new su2     // Catch: java.lang.Exception -> L1d
            r1.<init>()     // Catch: java.lang.Exception -> L1d
            java.lang.String r8 = r1.f(r8)     // Catch: java.lang.Exception -> L1d
            android.content.Context r1 = r7.Z     // Catch: java.lang.Exception -> L1d
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L1d
            android.net.Uri r6 = r7.d0     // Catch: java.lang.Exception -> L1d
            java.io.OutputStream r1 = r1.openOutputStream(r6)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L56
            java.nio.charset.Charset r6 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L4f
            byte[] r8 = r8.getBytes(r6)     // Catch: java.lang.Throwable -> L4f
            r8.getClass()     // Catch: java.lang.Throwable -> L4f
            r1.write(r8)     // Catch: java.lang.Throwable -> L4f
            r1.close()     // Catch: java.lang.Exception -> L1d
            goto L56
        L4f:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L51
        L51:
            r6 = move-exception
            defpackage.ge7.t(r1, r8)     // Catch: java.lang.Exception -> L1d
            throw r6     // Catch: java.lang.Exception -> L1d
        L56:
            xe1 r8 = defpackage.xk1.a     // Catch: java.lang.Exception -> L1d
            jv2 r8 = defpackage.e04.a     // Catch: java.lang.Exception -> L1d
            j20 r1 = new j20     // Catch: java.lang.Exception -> L1d
            r6 = 0
            r1.<init>(r2, r5, r6)     // Catch: java.lang.Exception -> L1d
            r7.X = r4     // Catch: java.lang.Exception -> L1d
            java.lang.Object r8 = defpackage.hv.d0(r8, r1, r7)     // Catch: java.lang.Exception -> L1d
            if (r8 != r0) goto L69
            goto L80
        L69:
            jg7 r8 = (defpackage.jg7) r8     // Catch: java.lang.Exception -> L1d
            goto L83
        L6c:
            r8.printStackTrace()
            xe1 r8 = defpackage.xk1.a
            jv2 r8 = defpackage.e04.a
            j20 r1 = new j20
            r1.<init>(r2, r5, r4)
            r7.X = r3
            java.lang.Object r8 = defpackage.hv.d0(r8, r1, r7)
            if (r8 != r0) goto L81
        L80:
            return r0
        L81:
            jg7 r8 = (defpackage.jg7) r8
        L83:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
