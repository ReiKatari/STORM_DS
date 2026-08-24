package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt3  reason: default package */
/* loaded from: classes.dex */
public final class kt3 {
    public final android.view.View a;
    public final defpackage.u63 b;
    public defpackage.qn2 c;
    public defpackage.qn2 d;
    public defpackage.jt3 e;
    public defpackage.p27 f;
    public defpackage.fo7 g;
    public defpackage.c37 h;
    public defpackage.l33 i;
    public final java.util.ArrayList j;
    public final defpackage.go3 k;
    public android.graphics.Rect l;
    public final defpackage.ft3 m;

    public kt3(android.view.View r5, defpackage.ii r6, defpackage.u63 r7) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.b = r7
            v83 r5 = new v83
            r0 = 18
            r5.<init>(r0)
            r4.c = r5
            v83 r5 = new v83
            r0 = 19
            r5.<init>(r0)
            r4.d = r5
            c37 r5 = new c37
            long r0 = defpackage.k47.b
            r2 = 4
            java.lang.String r3 = ""
            r5.<init>(r3, r2, r0)
            r4.h = r5
            l33 r5 = defpackage.l33.g
            r4.i = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.j = r5
            xr3 r5 = defpackage.xr3.NONE
            er2 r0 = new er2
            r1 = 7
            r0.<init>(r4, r1)
            go3 r5 = defpackage.kj2.M(r5, r0)
            r4.k = r5
            ft3 r5 = new ft3
            r5.<init>(r6, r7)
            r4.m = r5
            return
    }

    public final defpackage.lf5 a(android.view.inputmethod.EditorInfo r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            c37 r2 = r0.h
            fp r3 = r2.a
            java.lang.String r3 = r3.B
            long r4 = r2.b
            l33 r2 = r0.i
            int r6 = r2.e
            int r7 = r2.d
            boolean r8 = r2.a
            r10 = 4
            r11 = 5
            r13 = 7
            r14 = 6
            r15 = 3
            r12 = 2
            r9 = 1
            if (r6 != r9) goto L23
            if (r8 == 0) goto L21
        L1f:
            r6 = r14
            goto L3e
        L21:
            r6 = 0
            goto L3e
        L23:
            if (r6 != 0) goto L27
            r6 = r9
            goto L3e
        L27:
            if (r6 != r12) goto L2b
            r6 = r12
            goto L3e
        L2b:
            if (r6 != r14) goto L2f
            r6 = r11
            goto L3e
        L2f:
            if (r6 != r11) goto L33
            r6 = r13
            goto L3e
        L33:
            if (r6 != r15) goto L37
            r6 = r15
            goto L3e
        L37:
            if (r6 != r10) goto L3b
            r6 = r10
            goto L3e
        L3b:
            if (r6 != r13) goto L1a7
            goto L1f
        L3e:
            r1.imeOptions = r6
            gy3 r6 = r2.f
            gy3 r13 = defpackage.gy3.L
            boolean r13 = defpackage.nb3.k(r6, r13)
            r14 = 10
            if (r13 == 0) goto L50
            r13 = 0
            r1.hintLocales = r13
            goto L88
        L50:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r11 = defpackage.ht0.v0(r6, r14)
            r13.<init>(r11)
            java.util.List r6 = r6.A
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L71
            java.lang.Object r11 = r6.next()
            fy3 r11 = (defpackage.fy3) r11
            java.util.Locale r11 = r11.a
            r13.add(r11)
            goto L5f
        L71:
            r11 = 0
            java.util.Locale[] r6 = new java.util.Locale[r11]
            java.lang.Object[] r6 = r13.toArray(r6)
            java.util.Locale[] r6 = (java.util.Locale[]) r6
            int r11 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r11)
            java.util.Locale[] r6 = (java.util.Locale[]) r6
            android.os.LocaleList r11 = new android.os.LocaleList
            r11.<init>(r6)
            r1.hintLocales = r11
        L88:
            r6 = 8
            if (r7 != r9) goto L8e
        L8c:
            r10 = r9
            goto Lbd
        L8e:
            if (r7 != r12) goto L98
            int r10 = r1.imeOptions
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r11
            r1.imeOptions = r10
            goto L8c
        L98:
            if (r7 != r15) goto L9c
            r10 = r12
            goto Lbd
        L9c:
            if (r7 != r10) goto La0
            r10 = r15
            goto Lbd
        La0:
            r10 = 5
            if (r7 != r10) goto La6
            r10 = 17
            goto Lbd
        La6:
            r10 = 6
            if (r7 != r10) goto Lac
            r10 = 33
            goto Lbd
        Lac:
            r10 = 7
            if (r7 != r10) goto Lb2
            r10 = 129(0x81, float:1.81E-43)
            goto Lbd
        Lb2:
            if (r7 != r6) goto Lb7
            r10 = 18
            goto Lbd
        Lb7:
            r10 = 9
            if (r7 != r10) goto L19f
            r10 = 8194(0x2002, float:1.1482E-41)
        Lbd:
            r1.inputType = r10
            if (r8 != 0) goto Ld5
            r8 = r10 & 1
            if (r8 != r9) goto Ld5
            r8 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 | r10
            r1.inputType = r8
            int r8 = r2.e
            if (r8 != r9) goto Ld5
            int r8 = r1.imeOptions
            r10 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r10
            r1.imeOptions = r8
        Ld5:
            int r8 = r1.inputType
            r10 = r8 & 1
            if (r10 != r9) goto Lfd
            int r10 = r2.b
            if (r10 != r9) goto Le4
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r1.inputType = r8
            goto Lf1
        Le4:
            if (r10 != r12) goto Leb
            r8 = r8 | 8192(0x2000, float:1.148E-41)
            r1.inputType = r8
            goto Lf1
        Leb:
            if (r10 != r15) goto Lf1
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r1.inputType = r8
        Lf1:
            boolean r2 = r2.c
            if (r2 == 0) goto Lfd
            int r2 = r1.inputType
            r8 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r8
            r1.inputType = r2
        Lfd:
            int r2 = defpackage.k47.c
            r2 = 32
            long r10 = r4 >> r2
            int r2 = (int) r10
            r1.initialSelStart = r2
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r10
            int r2 = (int) r4
            r1.initialSelEnd = r2
            defpackage.jw2.C(r1, r3)
            int r2 = r1.imeOptions
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 | r3
            r1.imeOptions = r2
            boolean r2 = defpackage.et6.a
            if (r2 == 0) goto L120
            r10 = 7
            if (r7 != r10) goto L122
        L120:
            r11 = 0
            goto L16b
        L122:
            if (r7 != r6) goto L125
            goto L120
        L125:
            defpackage.jw2.D(r1, r9)
            java.lang.Class r16 = defpackage.gi.j()
            java.lang.Class r17 = defpackage.gi.A()
            java.lang.Class r18 = defpackage.gi.w()
            java.lang.Class r19 = defpackage.gi.z()
            java.lang.Class r20 = defpackage.gi.B()
            java.lang.Class r21 = defpackage.gi.C()
            java.lang.Class r22 = defpackage.gi.D()
            java.lang.Class[] r2 = new java.lang.Class[]{r16, r17, r18, r19, r20, r21, r22}
            java.util.List r2 = defpackage.hf.c0(r2)
            defpackage.gi.p(r1, r2)
            java.lang.Class r2 = defpackage.gi.j()
            java.lang.Class r3 = defpackage.gi.A()
            java.lang.Class r4 = defpackage.gi.w()
            java.lang.Class r5 = defpackage.gi.z()
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4, r5}
            java.util.Set r2 = defpackage.fv.V0(r2)
            defpackage.gi.q(r1, r2)
            goto L16e
        L16b:
            defpackage.jw2.D(r1, r11)
        L16e:
            gt3 r2 = defpackage.ht3.a
            boolean r2 = defpackage.ws1.d()
            if (r2 != 0) goto L177
            goto L17e
        L177:
            ws1 r2 = defpackage.ws1.a()
            r2.i(r1)
        L17e:
            c37 r4 = r0.h
            l33 r1 = r0.i
            boolean r6 = r1.c
            s63 r5 = new s63
            r5.<init>(r0, r14)
            jt3 r7 = r0.e
            p27 r8 = r0.f
            fo7 r9 = r0.g
            lf5 r3 = new lf5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            java.util.ArrayList r0 = r0.j
            r0.add(r1)
            return r3
        L19f:
            java.lang.String r0 = "Invalid Keyboard Type"
            defpackage.i.m(r0)
            r16 = 0
            return r16
        L1a7:
            r16 = 0
            java.lang.String r0 = "invalid ImeAction"
            defpackage.i.m(r0)
            return r16
    }
}
