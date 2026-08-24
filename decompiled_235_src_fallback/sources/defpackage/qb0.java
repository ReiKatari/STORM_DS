package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qb0  reason: default package */
/* loaded from: classes.dex */
public final class qb0 {
    public java.lang.Object a;
    public defpackage.tb0 b;
    public defpackage.hl5 c;
    public boolean d;

    public final boolean a(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            r4.d = r0
            tb0 r1 = r4.b
            r2 = 0
            if (r1 == 0) goto L1d
            sb0 r1 = r1.B
            r1.getClass()
            if (r5 != 0) goto L11
            java.lang.Object r5 = defpackage.r1.Z
        L11:
            q60 r3 = defpackage.r1.Y
            boolean r5 = r3.n(r1, r2, r5)
            if (r5 == 0) goto L1d
            defpackage.r1.c(r1)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L26
            r4.a = r2
            r4.b = r2
            r4.c = r2
        L26:
            return r0
    }

    public final void b() {
            r2 = this;
            r0 = 1
            r2.d = r0
            tb0 r1 = r2.b
            if (r1 == 0) goto L16
            sb0 r1 = r1.B
            boolean r0 = r1.cancel(r0)
            if (r0 == 0) goto L16
            r0 = 0
            r2.a = r0
            r2.b = r0
            r2.c = r0
        L16:
            return
    }

    public final boolean c(java.lang.Throwable r3) {
            r2 = this;
            r0 = 1
            r2.d = r0
            tb0 r1 = r2.b
            if (r1 == 0) goto L10
            sb0 r1 = r1.B
            boolean r3 = r1.i(r3)
            if (r3 == 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L1a
            r3 = 0
            r2.a = r3
            r2.b = r3
            r2.c = r3
        L1a:
            return r0
    }

    public final void finalize() {
            r4 = this;
            tb0 r0 = r4.b
            if (r0 == 0) goto L25
            sb0 r1 = r0.B
            boolean r1 = r1.isDone()
            if (r1 != 0) goto L25
            l1 r1 = new l1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The completer object was garbage collected - this future would otherwise never complete. The tag was: "
            r2.<init>(r3)
            java.lang.Object r3 = r4.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            r1.<init>(r2, r3)
            r0.b(r1)
        L25:
            boolean r0 = r4.d
            if (r0 != 0) goto L31
            hl5 r4 = r4.c
            if (r4 == 0) goto L31
            r0 = 0
            r4.j(r0)
        L31:
            return
    }
}
