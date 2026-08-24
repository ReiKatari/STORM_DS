package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx7  reason: default package */
/* loaded from: classes.dex */
public final class dx7 {
    public final defpackage.m16 a;
    public final defpackage.tm0 b;

    public dx7(defpackage.m16 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            tm0 r2 = new tm0
            r0 = 18
            r2.<init>(r0)
            r1.b = r2
            return
    }

    public final void a(defpackage.e36 r6, defpackage.wu r7) {
            r5 = this;
            java.util.Set r0 = r7.keySet()
            tu r0 = (defpackage.tu) r0
            wu r1 = r0.A
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lf
            return
        Lf:
            int r2 = r7.L
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L1f
            bx7 r0 = new bx7
            r0.<init>(r5, r6, r4)
            defpackage.ln2.T(r7, r0)
            return
        L1f:
            java.lang.String r5 = "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r5 = defpackage.lb1.s(r5)
            int r1 = r1.L
            defpackage.gi2.k(r5, r1)
            java.lang.String r1 = ")"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            j36 r5 = r6.i0(r5)
            java.util.Iterator r6 = r0.iterator()
            r0 = 1
            r1 = r0
        L3d:
            r2 = r6
            su r2 = (defpackage.su) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r2 = r2.next()
            java.lang.String r2 = (java.lang.String) r2
            r5.w(r1, r2)
            int r1 = r1 + r0
            goto L3d
        L51:
            java.lang.String r6 = "work_spec_id"
            int r6 = defpackage.ej2.A(r5, r6)     // Catch: java.lang.Throwable -> L7e
            r0 = -1
            if (r6 != r0) goto L5e
            r5.close()
            return
        L5e:
            boolean r0 = r5.f0()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L80
            java.lang.String r0 = r5.R(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L5e
            byte[] r1 = r5.getBlob(r4)     // Catch: java.lang.Throwable -> L7e
            xb1 r2 = defpackage.xb1.b     // Catch: java.lang.Throwable -> L7e
            xb1 r1 = defpackage.u24.k(r1)     // Catch: java.lang.Throwable -> L7e
            r0.add(r1)     // Catch: java.lang.Throwable -> L7e
            goto L5e
        L7e:
            r6 = move-exception
            goto L84
        L80:
            r5.close()
            return
        L84:
            r5.close()
            throw r6
    }

    public final void b(defpackage.e36 r6, defpackage.wu r7) {
            r5 = this;
            java.util.Set r0 = r7.keySet()
            tu r0 = (defpackage.tu) r0
            wu r1 = r0.A
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lf
            return
        Lf:
            int r2 = r7.L
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 1
            if (r2 <= r3) goto L1f
            bx7 r0 = new bx7
            r0.<init>(r5, r6, r4)
            defpackage.ln2.T(r7, r0)
            return
        L1f:
            java.lang.String r5 = "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r5 = defpackage.lb1.s(r5)
            int r1 = r1.L
            defpackage.gi2.k(r5, r1)
            java.lang.String r1 = ")"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            j36 r5 = r6.i0(r5)
            java.util.Iterator r6 = r0.iterator()
            r0 = r4
        L3c:
            r1 = r6
            su r1 = (defpackage.su) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            r5.w(r0, r1)
            int r0 = r0 + r4
            goto L3c
        L50:
            java.lang.String r6 = "work_spec_id"
            int r6 = defpackage.ej2.A(r5, r6)     // Catch: java.lang.Throwable -> L78
            r0 = -1
            if (r6 != r0) goto L5d
            r5.close()
            return
        L5d:
            boolean r0 = r5.f0()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L7a
            java.lang.String r0 = r5.R(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L78
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5d
            r1 = 0
            java.lang.String r1 = r5.R(r1)     // Catch: java.lang.Throwable -> L78
            r0.add(r1)     // Catch: java.lang.Throwable -> L78
            goto L5d
        L78:
            r6 = move-exception
            goto L7e
        L7a:
            r5.close()
            return
        L7e:
            r5.close()
            throw r6
    }

    public final defpackage.iw7 c(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            c70 r0 = new c70
            r1 = 22
            r0.<init>(r3, r1)
            m16 r2 = r2.a
            r3 = 1
            r1 = 0
            java.lang.Object r2 = defpackage.hv.Q(r2, r3, r1, r0)
            iw7 r2 = (defpackage.iw7) r2
            return r2
    }

    public final defpackage.yw7 d(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            c70 r0 = new c70
            r1 = 21
            r0.<init>(r3, r1)
            m16 r2 = r2.a
            r3 = 1
            r1 = 0
            java.lang.Object r2 = defpackage.hv.Q(r2, r3, r1, r0)
            yw7 r2 = (defpackage.yw7) r2
            return r2
    }

    public final void e(long r3, java.lang.String r5) {
            r2 = this;
            r5.getClass()
            ax7 r0 = new ax7
            r1 = 0
            r0.<init>(r5, r1, r3)
            m16 r2 = r2.a
            r3 = 1
            java.lang.Object r2 = defpackage.hv.Q(r2, r1, r3, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            return
    }

    public final void f(int r3, java.lang.String r4) {
            r2 = this;
            r4.getClass()
            ox6 r0 = new ox6
            r1 = 1
            r0.<init>(r4, r3, r1)
            m16 r2 = r2.a
            r3 = 0
            defpackage.hv.Q(r2, r3, r1, r0)
            return
    }

    public final void g(long r3, java.lang.String r5) {
            r2 = this;
            r5.getClass()
            ax7 r0 = new ax7
            r1 = 1
            r0.<init>(r5, r1, r3)
            m16 r2 = r2.a
            r3 = 0
            defpackage.hv.Q(r2, r3, r1, r0)
            return
    }

    public final void h(defpackage.iw7 r3, java.lang.String r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            ja7 r0 = new ja7
            r1 = 12
            r0.<init>(r1, r3, r4)
            m16 r2 = r2.a
            r3 = 0
            r4 = 1
            java.lang.Object r2 = defpackage.hv.Q(r2, r3, r4, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            return
    }

    public final void i(int r2, java.lang.String r3) {
            r1 = this;
            r3.getClass()
            ox6 r0 = new ox6
            r0.<init>(r2, r3)
            m16 r1 = r1.a
            r2 = 0
            r3 = 1
            defpackage.hv.Q(r1, r2, r3, r0)
            return
    }
}
