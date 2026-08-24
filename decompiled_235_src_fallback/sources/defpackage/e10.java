package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e10 implements defpackage.qr2 {
    public static final defpackage.e10 a = null;
    private static final defpackage.wb6 descriptor = null;

    static {
            e10 r0 = new e10
            r0.<init>()
            defpackage.e10.a = r0
            ly4 r1 = new ly4
            java.lang.String r2 = "me.magnum.melonds.parcelables.BackgroundParcelable"
            r3 = 3
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "uuid"
            r2 = 0
            r1.l(r0, r2)
            java.lang.String r0 = "name"
            r1.l(r0, r2)
            java.lang.String r0 = "uri"
            r1.l(r0, r2)
            defpackage.e10.descriptor = r1
            return
    }

    @Override // defpackage.qr2
    public final defpackage.gg3[] b() {
            r2 = this;
            r2 = 3
            gg3[] r2 = new defpackage.gg3[r2]
            ps6 r0 = defpackage.ps6.a
            r1 = 0
            r2[r1] = r0
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            return r2
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r10) {
            r9 = this;
            wb6 r9 = defpackage.e10.descriptor
            ux0 r10 = r10.c(r9)
            r10.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            r5 = r0
            r6 = r1
            r3 = r2
            r4 = r3
        L10:
            if (r5 == 0) goto L3d
            int r7 = r10.q(r9)
            r8 = -1
            if (r7 == r8) goto L3b
            if (r7 == 0) goto L34
            if (r7 == r0) goto L2d
            r4 = 2
            if (r7 != r4) goto L27
            java.lang.String r4 = r10.A(r9, r4)
            r6 = r6 | 4
            goto L10
        L27:
            lg7 r9 = new lg7
            r9.<init>(r7)
            throw r9
        L2d:
            java.lang.String r3 = r10.A(r9, r0)
            r6 = r6 | 2
            goto L10
        L34:
            java.lang.String r2 = r10.A(r9, r1)
            r6 = r6 | 1
            goto L10
        L3b:
            r5 = r1
            goto L10
        L3d:
            r10.a(r9)
            g10 r9 = new g10
            r9.<init>(r2, r6, r3, r4)
            return r9
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r3, java.lang.Object r4) {
            r2 = this;
            g10 r4 = (defpackage.g10) r4
            r4.getClass()
            wb6 r2 = defpackage.e10.descriptor
            vx0 r3 = r3.c(r2)
            r0 = 0
            java.lang.String r1 = r4.A
            r3.Q(r2, r0, r1)
            r0 = 1
            java.lang.String r1 = r4.B
            r3.Q(r2, r0, r1)
            r0 = 2
            java.lang.String r4 = r4.L
            r3.Q(r2, r0, r4)
            r3.a(r2)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            wb6 r0 = defpackage.e10.descriptor
            return r0
    }
}
