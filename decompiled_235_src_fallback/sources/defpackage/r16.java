package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r16  reason: default package */
/* loaded from: classes.dex */
public final class r16 extends android.view.OrientationEventListener {
    public final /* synthetic */ defpackage.t16 a;

    public r16(android.content.Context r1, defpackage.t16 r2) {
            r0 = this;
            r0.a = r2
            r0.<init>(r1)
            return
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int r4) {
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L5
            goto L87
        L5:
            t16 r1 = r3.a
            int r2 = r1.d
            if (r2 != r0) goto L27
            r0 = 45
            if (r4 < 0) goto L12
            if (r4 >= r0) goto L12
            goto L36
        L12:
            r1 = 135(0x87, float:1.89E-43)
            if (r0 > r4) goto L19
            if (r4 >= r1) goto L19
            goto L40
        L19:
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 > r4) goto L20
            if (r4 >= r0) goto L20
            goto L4a
        L20:
            if (r0 > r4) goto L36
            r0 = 315(0x13b, float:4.41E-43)
            if (r4 >= r0) goto L36
            goto L54
        L27:
            if (r4 < 0) goto L2e
            r0 = 40
            if (r4 >= r0) goto L2e
            goto L36
        L2e:
            r0 = 320(0x140, float:4.48E-43)
            if (r0 > r4) goto L38
            r0 = 360(0x168, float:5.04E-43)
            if (r4 >= r0) goto L38
        L36:
            r4 = 0
            goto L58
        L38:
            r0 = 50
            if (r0 > r4) goto L42
            r0 = 130(0x82, float:1.82E-43)
            if (r4 >= r0) goto L42
        L40:
            r4 = 3
            goto L58
        L42:
            r0 = 140(0x8c, float:1.96E-43)
            if (r0 > r4) goto L4c
            r0 = 220(0xdc, float:3.08E-43)
            if (r4 >= r0) goto L4c
        L4a:
            r4 = 2
            goto L58
        L4c:
            r0 = 230(0xe6, float:3.22E-43)
            if (r0 > r4) goto L56
            r0 = 310(0x136, float:4.34E-43)
            if (r4 >= r0) goto L56
        L54:
            r4 = 1
            goto L58
        L56:
            int r4 = r1.d
        L58:
            t16 r3 = r3.a
            int r0 = r3.d
            if (r0 == r4) goto L87
            r3.d = r4
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.LinkedHashMap r3 = r3.c     // Catch: java.lang.Throwable -> L84
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L84
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L84
            java.util.List r3 = defpackage.gt0.k1(r3)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)
            java.util.Iterator r3 = r3.iterator()
        L74:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r3.next()
            s16 r0 = (defpackage.s16) r0
            r0.a(r4)
            goto L74
        L84:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L87:
            return
    }
}
