package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb7  reason: default package */
/* loaded from: classes.dex */
public final class rb7 {
    public final defpackage.fz a;
    public final defpackage.c42 b;
    public final defpackage.q97 c;
    public final defpackage.sb7 d;

    public rb7(defpackage.fz r1, defpackage.c42 r2, defpackage.q97 r3, defpackage.sb7 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final void a(defpackage.i62 r8) {
            r7 = this;
            if (r8 == 0) goto L86
            q97 r0 = r7.c
            if (r0 == 0) goto L80
            sb7 r1 = r7.d
            ye1 r2 = r1.c
            gy r8 = (defpackage.gy) r8
            b35 r3 = r8.b
            bt r4 = defpackage.fz.a()
            fz r5 = r7.a
            java.lang.String r6 = r5.a
            if (r6 == 0) goto L7a
            r4.B = r6
            if (r3 == 0) goto L74
            r4.R = r3
            byte[] r3 = r5.b
            r4.L = r3
            fz r3 = r4.A()
            pa r4 = new pa
            r5 = 4
            r6 = 0
            r4.<init>(r5, r6)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.Z = r5
            wr0 r5 = r1.a
            long r5 = r5.a()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.X = r5
            wr0 r1 = r1.b
            long r5 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r4.Y = r1
            java.lang.String r1 = "FIREBASE_ML_SDK"
            r4.B = r1
            w32 r1 = new w32
            java.lang.Object r8 = r8.a
            java.lang.Object r8 = r0.apply(r8)
            byte[] r8 = (byte[]) r8
            c42 r7 = r7.b
            r1.<init>(r7, r8)
            r4.R = r1
            r7 = 0
            r4.L = r7
            hy r7 = r4.f()
            java.util.concurrent.Executor r8 = r2.b
            h15 r0 = new h15
            r1 = 1
            r0.<init>(r2, r3, r7, r1)
            r8.execute(r0)
            return
        L74:
            java.lang.String r7 = "Null priority"
            defpackage.u34.x(r7)
            return
        L7a:
            java.lang.String r7 = "Null backendName"
            defpackage.u34.x(r7)
            return
        L80:
            java.lang.String r7 = "Null transformer"
            defpackage.u34.x(r7)
            return
        L86:
            java.lang.String r7 = "Null event"
            defpackage.u34.x(r7)
            return
    }
}
