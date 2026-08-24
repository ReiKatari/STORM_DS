package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl6  reason: default package */
/* loaded from: classes.dex */
public final class gl6 {
    public final defpackage.hb4 a;
    public final defpackage.vs4 b;

    public gl6() {
            r1 = this;
            r1.<init>()
            hb4 r0 = new hb4
            r0.<init>()
            r1.a = r0
            r0 = 0
            vs4 r0 = defpackage.np2.Y(r0)
            r1.b = r0
            return
    }

    public static /* synthetic */ java.lang.Object b(defpackage.gl6 r0, java.lang.String r1, java.lang.String r2, defpackage.s41 r3, int r4) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 0
        L5:
            al6 r4 = defpackage.al6.Short
            java.lang.Object r0 = r0.a(r1, r2, r4, r3)
            return r0
    }

    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, defpackage.al6 r10, defpackage.s41 r11) {
            r7 = this;
            boolean r0 = r11 instanceof defpackage.fl6
            if (r0 == 0) goto L13
            r0 = r11
            fl6 r0 = (defpackage.fl6) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            fl6 r0 = new fl6
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            vs4 r3 = r7.b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            fb4 r7 = r0.Z
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L2f
            goto L7e
        L2f:
            r8 = move-exception
            goto L87
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r6
        L37:
            fb4 r7 = r0.Z
            al6 r10 = r0.Y
            java.lang.String r9 = r0.X
            java.lang.String r8 = r0.R
            defpackage.oi2.Y(r11)
            goto L59
        L43:
            defpackage.oi2.Y(r11)
            r0.R = r8
            r0.X = r9
            r0.Y = r10
            hb4 r7 = r7.a
            r0.Z = r7
            r0.f0 = r5
            java.lang.Object r11 = r7.e(r0)
            if (r11 != r1) goto L59
            goto L7d
        L59:
            r0.R = r8     // Catch: java.lang.Throwable -> L2f
            r0.X = r9     // Catch: java.lang.Throwable -> L2f
            r0.Y = r10     // Catch: java.lang.Throwable -> L2f
            r0.Z = r7     // Catch: java.lang.Throwable -> L2f
            r0.f0 = r4     // Catch: java.lang.Throwable -> L2f
            rj0 r11 = new rj0     // Catch: java.lang.Throwable -> L2f
            r41 r0 = defpackage.np2.V(r0)     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2f
            r11.v()     // Catch: java.lang.Throwable -> L2f
            el6 r0 = new el6     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2f
            r3.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r11 = r11.s()     // Catch: java.lang.Throwable -> L2f
            if (r11 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L85
            r7.h(r6)
            return r11
        L85:
            r8 = move-exception
            goto L8b
        L87:
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L85
            throw r8     // Catch: java.lang.Throwable -> L85
        L8b:
            r7.h(r6)
            throw r8
    }
}
