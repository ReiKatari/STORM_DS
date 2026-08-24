package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et0  reason: default package */
/* loaded from: classes.dex */
public final class et0 extends defpackage.yc7 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public /* synthetic */ et0(int r1, defpackage.yc7 r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    public et0(defpackage.ud7 r2, java.lang.Class r3) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r8) {
            r7 = this;
            int r0 = r7.a
            r1 = 0
            java.lang.Object r2 = r7.c
            java.lang.Object r7 = r7.b
            switch(r0) {
                case 0: goto La7;
                case 1: goto L52;
                default: goto La;
            }
        La:
            java.lang.Class r7 = (java.lang.Class) r7
            ud7 r2 = (defpackage.ud7) r2
            yc7 r0 = r2.L
            java.lang.Object r0 = r0.b(r8)
            if (r0 == 0) goto L51
            boolean r1 = r7.isInstance(r0)
            if (r1 == 0) goto L1d
            goto L51
        L1d:
            ne3 r1 = new ne3
            java.lang.String r7 = r7.getName()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = r8.D()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = " but was "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = "; at path "
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7)
            throw r1
        L51:
            return r0
        L52:
            r8.h()
            r0 = r1
        L56:
            jf3 r3 = r8.n0()
            jf3 r4 = defpackage.jf3.END_OBJECT
            java.lang.String r5 = "dateTime"
            java.lang.String r6 = "offset"
            if (r3 == r4) goto L91
            java.lang.String r3 = r8.c0()
            r3.getClass()
            boolean r4 = r3.equals(r6)
            if (r4 != 0) goto L85
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L79
            r8.u0()
            goto L56
        L79:
            r1 = r7
            xc7 r1 = (defpackage.xc7) r1
            java.lang.Object r1 = r1.b(r8)
            java.time.LocalDateTime r1 = defpackage.jc3.e(r1)
            goto L56
        L85:
            r0 = r2
            yc7 r0 = (defpackage.yc7) r0
            java.lang.Object r0 = r0.b(r8)
            java.time.ZoneOffset r0 = defpackage.jc3.m(r0)
            goto L56
        L91:
            r8.u()
            defpackage.kc3.a(r1, r5, r8)
            java.time.LocalDateTime r7 = defpackage.jc3.t(r1)
            defpackage.kc3.a(r0, r6, r8)
            java.time.ZoneOffset r8 = defpackage.jc3.v(r0)
            java.time.OffsetDateTime r7 = defpackage.mc3.s(r7, r8)
            return r7
        La7:
            jf3 r0 = r8.n0()
            jf3 r3 = defpackage.jf3.NULL
            if (r0 != r3) goto Lb3
            r8.j0()
            goto Ld5
        Lb3:
            ph4 r2 = (defpackage.ph4) r2
            java.lang.Object r0 = r2.e()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r8.e()
        Lbf:
            boolean r0 = r8.F()
            if (r0 == 0) goto Ld2
            r0 = r7
            lc3 r0 = (defpackage.lc3) r0
            yc7 r0 = r0.c
            java.lang.Object r0 = r0.b(r8)
            r1.add(r0)
            goto Lbf
        Ld2:
            r8.r()
        Ld5:
            return r1
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r1 = r2.b
            java.lang.Object r2 = r2.c
            switch(r0) {
                case 0: goto L38;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            ud7 r2 = (defpackage.ud7) r2
            yc7 r2 = r2.L
            r2.c(r3, r4)
            return
        L11:
            java.time.OffsetDateTime r4 = defpackage.mc3.r(r4)
            r3.k()
            java.lang.String r0 = "dateTime"
            r3.v(r0)
            xc7 r1 = (defpackage.xc7) r1
            java.time.LocalDateTime r0 = defpackage.mc3.k(r4)
            r1.c(r3, r0)
            java.lang.String r0 = "offset"
            r3.v(r0)
            yc7 r2 = (defpackage.yc7) r2
            java.time.ZoneOffset r4 = defpackage.mc3.v(r4)
            r2.c(r3, r4)
            r3.u()
            return
        L38:
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto L40
            r3.A()
            goto L5b
        L40:
            r3.h()
            java.util.Iterator r2 = r4.iterator()
        L47:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.next()
            r0 = r1
            lc3 r0 = (defpackage.lc3) r0
            r0.c(r3, r4)
            goto L47
        L58:
            r3.r()
        L5b:
            return
    }
}
