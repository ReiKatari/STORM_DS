package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha3  reason: default package */
/* loaded from: classes.dex */
public final class ha3 {
    public static final java.lang.reflect.Type g = null;
    public final android.content.Context a;
    public final defpackage.su2 b;
    public final defpackage.jd6 c;
    public final defpackage.hb4 d;
    public boolean e;
    public final defpackage.tp6 f;

    static {
            da3 r0 = new da3
            r0.<init>()
            java.lang.reflect.Type r0 = r0.b
            r0.getClass()
            defpackage.ha3.g = r0
            return
    }

    public ha3(android.content.Context r1, defpackage.su2 r2, defpackage.jd6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            hb4 r1 = new hb4
            r1.<init>()
            r0.d = r1
            yt1 r1 = defpackage.yt1.A
            tp6 r1 = defpackage.up6.a(r1)
            r0.f = r1
            return
    }

    public final java.lang.Object a(defpackage.n00 r12, defpackage.s41 r13) {
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ea3
            if (r0 == 0) goto L13
            r0 = r13
            ea3 r0 = (defpackage.ea3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ea3 r0 = new ea3
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            jg7 r3 = defpackage.jg7.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.oi2.Y(r13)
            return r3
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r6
        L33:
            n00 r12 = r0.R
            defpackage.oi2.Y(r13)
            goto L47
        L39:
            defpackage.oi2.Y(r13)
            r0.R = r12
            r0.Z = r5
            java.lang.Object r13 = r11.b(r0)
            if (r13 != r1) goto L47
            goto Lb3
        L47:
            tp6 r13 = r11.f
            java.lang.Object r2 = r13.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            r8 = r7
            fh1 r8 = (defpackage.fh1) r8
            boolean r9 = r8.b
            if (r9 != 0) goto L53
            java.lang.Object r8 = r8.a
            n00 r8 = (defpackage.n00) r8
            java.util.UUID r8 = r8.a
            java.util.UUID r9 = r12.a
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L53
            goto L74
        L73:
            r7 = r6
        L74:
            fh1 r7 = (defpackage.fh1) r7
            if (r7 == 0) goto Lb4
        L78:
            java.lang.Object r12 = r13.getValue()
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            int r8 = r2.indexOf(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            java.lang.Object r2 = r7.a
            fh1 r10 = new fh1
            r10.<init>(r5, r2)
            r9.set(r8, r10)
            boolean r12 = r13.j(r12, r9)
            if (r12 == 0) goto L78
            r0.R = r6
            r0.Z = r4
            xe1 r12 = defpackage.xk1.a
            de1 r12 = defpackage.de1.L
            y3 r13 = new y3
            r2 = 11
            r13.<init>(r11, r6, r2)
            java.lang.Object r11 = defpackage.hv.d0(r12, r13, r0)
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            if (r11 != r12) goto Lb0
            goto Lb1
        Lb0:
            r11 = r3
        Lb1:
            if (r11 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            return r3
    }

    public final java.lang.Object b(defpackage.s41 r5) {
            r4 = this;
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            u12 r1 = new u12
            r2 = 0
            r3 = 13
            r1.<init>(r4, r2, r3)
            java.lang.Object r4 = defpackage.hv.d0(r0, r1, r5)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L15
            return r4
        L15:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public final java.lang.Object c(java.util.UUID r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fa3
            if (r0 == 0) goto L13
            r0 = r7
            fa3 r0 = (defpackage.fa3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            fa3 r0 = new fa3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.util.UUID r6 = r0.R
            defpackage.oi2.Y(r7)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L30:
            defpackage.oi2.Y(r7)
            r0.R = r6
            r0.Z = r4
            java.lang.Object r7 = r5.b(r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            tp6 r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r5.next()
            r0 = r7
            fh1 r0 = (defpackage.fh1) r0
            boolean r1 = r0.b
            if (r1 != 0) goto L4a
            java.lang.Object r0 = r0.a
            n00 r0 = (defpackage.n00) r0
            java.util.UUID r0 = r0.a
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 == 0) goto L4a
            goto L69
        L68:
            r7 = r3
        L69:
            fh1 r7 = (defpackage.fh1) r7
            if (r7 == 0) goto L72
            java.lang.Object r5 = r7.a
            n00 r5 = (defpackage.n00) r5
            return r5
        L72:
            return r3
    }
}
