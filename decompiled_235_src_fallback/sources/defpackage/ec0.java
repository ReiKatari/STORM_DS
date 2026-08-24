package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec0  reason: default package */
/* loaded from: classes.dex */
public final class ec0 implements defpackage.jk5 {
    public final java.lang.Object A;
    public final java.lang.Object B;
    public defpackage.jd0 L;
    public defpackage.tu0 R;
    public defpackage.tu0 X;

    public ec0() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.A = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.B = r0
            jd0 r0 = new jd0
            r1 = 0
            r0.<init>(r1)
            r2.L = r0
            return
    }

    @Override // defpackage.jk5
    public final void J(defpackage.yk5 r4, long r5, defpackage.th r7) {
            r3 = this;
            java.lang.Object r5 = r3.B
            monitor-enter(r5)
            tu0 r6 = r3.R     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L39
            java.lang.String r7 = "Camera2CameraControl.tag"
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            k54 r1 = defpackage.uy6.a     // Catch: java.lang.Throwable -> L37
            sy6 r2 = defpackage.sy6.b     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r4.a(r1, r2)     // Catch: java.lang.Throwable -> L37
            sy6 r4 = (defpackage.sy6) r4     // Catch: java.lang.Throwable -> L37
            android.util.ArrayMap r4 = r4.a     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L37
            boolean r4 = defpackage.nb3.k(r4, r0)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L39
            r4 = 0
            r6.b0(r4)     // Catch: java.lang.Throwable -> L37
            r3.R = r4     // Catch: java.lang.Throwable -> L37
            tu0 r6 = r3.X     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L39
            r6.b0(r4)     // Catch: java.lang.Throwable -> L37
            r3.X = r4     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r3 = move-exception
            goto L3b
        L39:
            monitor-exit(r5)
            return
        L3b:
            monitor-exit(r5)
            throw r3
    }

    public final defpackage.tu0 a(defpackage.li7 r6, boolean r7) {
            r5 = this;
            tu0 r0 = new tu0
            r0.<init>()
            java.lang.Object r1 = r5.A
            monitor-enter(r1)
            jd0 r2 = r5.L     // Catch: java.lang.Throwable -> L58
            kd0 r2 = r2.a()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)
            java.lang.Object r1 = r5.B
            monitor-enter(r1)
            if (r6 == 0) goto L44
            tu0 r3 = r5.R
            if (r7 == 0) goto L25
            if (r3 == 0) goto L2d
            java.lang.String r7 = "Camera2CameraControl was updated with new options."
            se0 r4 = new se0     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            r3.v0(r4)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L25:
            if (r3 == 0) goto L2d
            defpackage.nc1.a0(r0, r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r5 = move-exception
            goto L56
        L2d:
            r5.R = r0     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = "Camera2CameraControl.tag"
            int r7 = r0.hashCode()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2b
            java.util.Map r5 = java.util.Collections.singletonMap(r5, r7)     // Catch: java.lang.Throwable -> L2b
            r5.getClass()     // Catch: java.lang.Throwable -> L2b
            r6.d(r2, r5)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L44:
            tu0 r6 = r5.X     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L52
            java.lang.String r7 = "Camera2CameraControl was updated with new options."
            se0 r2 = new se0     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            r6.v0(r2)     // Catch: java.lang.Throwable -> L2b
        L52:
            r5.X = r0     // Catch: java.lang.Throwable -> L2b
        L54:
            monitor-exit(r1)
            return r0
        L56:
            monitor-exit(r1)
            throw r5
        L58:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
    }
}
