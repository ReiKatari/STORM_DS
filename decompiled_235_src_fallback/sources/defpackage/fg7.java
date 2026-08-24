package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg7  reason: default package */
/* loaded from: classes.dex */
public final class fg7 {
    public defpackage.rr6 a;
    public defpackage.rr6 b;
    public int c;
    public java.lang.Long d;
    public boolean e;

    public final void a(defpackage.c37 r5) {
            r4 = this;
            r0 = 0
            r4.e = r0
            rr6 r0 = r4.a
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.L
            c37 r0 = (defpackage.c37) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 == 0) goto L16
            goto L7a
        L16:
            fp r0 = r5.a
            java.lang.String r0 = r0.B
            rr6 r2 = r4.a
            if (r2 == 0) goto L29
            java.lang.Object r2 = r2.L
            c37 r2 = (defpackage.c37) r2
            if (r2 == 0) goto L29
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            goto L2a
        L29:
            r2 = r1
        L2a:
            boolean r0 = defpackage.nb3.k(r0, r2)
            rr6 r2 = r4.a
            if (r0 == 0) goto L37
            if (r2 == 0) goto L7a
            r2.L = r5
            return
        L37:
            rr6 r0 = new rr6
            r3 = 8
            r0.<init>(r3, r2, r5)
            r4.a = r0
            r4.b = r1
            int r0 = r4.c
            fp r5 = r5.a
            java.lang.String r5 = r5.B
            int r5 = r5.length()
            int r5 = r5 + r0
            r4.c = r5
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r5 <= r0) goto L7a
            rr6 r4 = r4.a
            if (r4 == 0) goto L5d
            java.lang.Object r5 = r4.B
            rr6 r5 = (defpackage.rr6) r5
            goto L5e
        L5d:
            r5 = r1
        L5e:
            if (r5 != 0) goto L61
            goto L7a
        L61:
            if (r4 == 0) goto L6e
            java.lang.Object r5 = r4.B
            rr6 r5 = (defpackage.rr6) r5
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r5.B
            rr6 r5 = (defpackage.rr6) r5
            goto L6f
        L6e:
            r5 = r1
        L6f:
            if (r5 == 0) goto L76
            java.lang.Object r4 = r4.B
            rr6 r4 = (defpackage.rr6) r4
            goto L61
        L76:
            if (r4 == 0) goto L7a
            r4.B = r1
        L7a:
            return
    }
}
