package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc4  reason: default package */
/* loaded from: classes.dex */
public abstract class jc4 {
    public final defpackage.qd4 a;
    public final int b;
    public final java.lang.String c;
    public final java.util.LinkedHashMap d;
    public final java.util.ArrayList e;
    public final java.util.LinkedHashMap f;

    public jc4(defpackage.qd4 r12, defpackage.ar0 r13, java.util.Map r14) {
            r11 = this;
            r14.getClass()
            if (r13 == 0) goto Le
            gg3 r0 = defpackage.jx2.K(r13)
            int r0 = defpackage.np2.O(r0)
            goto Lf
        Le:
            r0 = -1
        Lf:
            r1 = 0
            r2 = 0
            if (r13 == 0) goto Lb4
            gg3 r3 = defpackage.jx2.K(r13)
            boolean r4 = r3 instanceof defpackage.fz4
            if (r4 == 0) goto L3e
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Cannot generate route pattern from polymorphic class "
            r12.<init>(r13)
            fz4 r3 = (defpackage.fz4) r3
            wb6 r13 = r3.e()
            ar0 r13 = defpackage.n16.x(r13)
            if (r13 == 0) goto L34
            java.lang.String r1 = r13.c()
        L34:
            java.lang.String r13 = ". Routes can only be generated from concrete classes or objects."
            java.lang.String r12 = defpackage.i61.n(r12, r1, r13)
            r11.<init>(r12)
            throw r11
        L3e:
            eb r4 = new eb
            r4.<init>(r3)
            ov4 r5 = new ov4
            r6 = 12
            r5.<init>(r4, r6)
            wb6 r6 = r3.e()
            int r6 = r6.f()
            r7 = r2
        L53:
            if (r7 >= r6) goto L95
            wb6 r8 = r3.e()
            java.lang.String r8 = r8.g(r7)
            wb6 r9 = r3.e()
            wb6 r9 = r9.j(r7)
            fd4 r9 = defpackage.np2.D(r9, r14)
            if (r9 == 0) goto L75
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r5.e(r10, r8, r9)
            int r7 = r7 + 1
            goto L53
        L75:
            wb6 r11 = r3.e()
            wb6 r11 = r11.j(r7)
            java.lang.String r11 = r11.a()
            wb6 r12 = r3.e()
            java.lang.String r12 = r12.a()
            java.lang.String r13 = r14.toString()
            java.lang.String r11 = defpackage.np2.j0(r8, r11, r12, r13)
            defpackage.i.h(r11)
            throw r1
        L95:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r5 = r4.L
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.Object r5 = r4.R
            java.lang.String r5 = (java.lang.String) r5
            r3.append(r5)
            java.lang.Object r4 = r4.X
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto Lb5
        Lb4:
            r3 = r1
        Lb5:
            r11.<init>()
            r11.a = r12
            r11.b = r0
            r11.c = r3
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r11.d = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.e = r12
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r11.f = r12
            if (r13 == 0) goto L15a
            gg3 r12 = defpackage.jx2.K(r13)
            boolean r13 = r12 instanceof defpackage.fz4
            if (r13 != 0) goto L152
            wb6 r13 = r12.e()
            int r13 = r13.f()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r13)
            r3 = r2
        Leb:
            if (r3 >= r13) goto L13a
            wb6 r4 = r12.e()
            java.lang.String r4 = r4.g(r3)
            r4.getClass()
            ob4 r5 = new ob4
            wb6 r6 = r12.e()
            wb6 r6 = r6.j(r3)
            boolean r7 = r6.c()
            fd4 r8 = defpackage.np2.D(r6, r14)
            if (r8 == 0) goto L122
            wb6 r6 = r12.e()
            boolean r6 = r6.k(r3)
            rb4 r9 = new rb4
            r9.<init>(r8, r7, r6)
            r5.<init>(r4, r9)
            r0.add(r5)
            int r3 = r3 + 1
            goto Leb
        L122:
            java.lang.String r11 = r6.a()
            wb6 r12 = r12.e()
            java.lang.String r12 = r12.a()
            java.lang.String r13 = r14.toString()
            java.lang.String r11 = defpackage.np2.j0(r4, r11, r12, r13)
            defpackage.i.h(r11)
            throw r1
        L13a:
            int r12 = r0.size()
        L13e:
            if (r2 >= r12) goto L15a
            java.lang.Object r13 = r0.get(r2)
            int r2 = r2 + 1
            ob4 r13 = (defpackage.ob4) r13
            java.util.LinkedHashMap r14 = r11.d
            java.lang.String r1 = r13.a
            rb4 r13 = r13.b
            r14.put(r1, r13)
            goto L13e
        L152:
            java.lang.String r11 = "Cannot generate NavArguments for polymorphic serializer "
            java.lang.String r13 = ". Arguments can only be generated from concrete classes or objects."
            defpackage.u34.C(r12, r13, r11)
            throw r1
        L15a:
            return
    }

    public defpackage.ic4 a() {
            r17 = this;
            r0 = r17
            ic4 r1 = r0.b()
            r1.getClass()
            z9 r2 = r1.B
            java.util.LinkedHashMap r3 = r0.d
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            rb4 r4 = (defpackage.rb4) r4
            r5.getClass()
            r4.getClass()
            r2.getClass()
            java.lang.Object r6 = r2.d
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            r6.put(r5, r4)
            goto L15
        L3e:
            java.util.ArrayList r3 = r0.e
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L46:
            r7 = 0
            if (r6 >= r4) goto L83
            java.lang.Object r8 = r3.get(r6)
            int r6 = r6 + 1
            fc4 r8 = (defpackage.fc4) r8
            r8.getClass()
            r2.getClass()
            java.lang.Object r9 = r2.d
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            kc4 r10 = new kc4
            r10.<init>(r8, r5)
            java.util.ArrayList r16 = defpackage.xk2.C(r9, r10)
            boolean r9 = r16.isEmpty()
            if (r9 == 0) goto L72
            java.lang.Object r7 = r2.c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r8)
            goto L46
        L72:
            java.lang.String r12 = r8.a
            java.lang.Object r0 = r2.b
            r14 = r0
            ic4 r14 = (defpackage.ic4) r14
            java.lang.String r15 = ".\nFollowing required arguments are missing: "
            java.lang.String r11 = "Deep link "
            java.lang.String r13 = " can't be used to open destination "
            defpackage.u34.n(r11, r12, r13, r14, r15, r16)
            return r7
        L83:
            java.util.LinkedHashMap r3 = r0.f
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L107
            java.lang.String r3 = r0.c
            if (r3 == 0) goto Lff
            r2.getClass()
            boolean r4 = defpackage.qs6.v0(r3)
            if (r4 != 0) goto Lf9
            java.lang.String r4 = "android-app://androidx.navigation/"
            java.lang.String r4 = r4.concat(r3)
            fc4 r6 = new fc4
            r6.<init>(r4)
            java.lang.Object r7 = r2.d
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            kc4 r8 = new kc4
            r9 = 1
            r8.<init>(r6, r9)
            java.util.ArrayList r6 = defpackage.xk2.C(r7, r8)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto Ld4
            lc4 r6 = new lc4
            r6.<init>(r4, r5)
            ex6 r5 = new ex6
            r5.<init>(r6)
            r2.f = r5
            int r4 = r4.hashCode()
            r2.a = r4
            r2.e = r3
            goto Lff
        Ld4:
            java.lang.String r0 = "Cannot set route \""
            java.lang.String r1 = "\" for destination "
            java.lang.StringBuilder r0 = defpackage.i61.t(r0, r3, r1)
            java.lang.Object r1 = r2.b
            ic4 r1 = (defpackage.ic4) r1
            r0.append(r1)
            java.lang.String r1 = ". Following required arguments are missing: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lf9:
            java.lang.String r0 = "Cannot have an empty route"
            defpackage.i.h(r0)
            return r7
        Lff:
            r3 = -1
            int r0 = r0.b
            if (r0 == r3) goto L106
            r2.a = r0
        L106:
            return r1
        L107:
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            defpackage.u34.a()
            return r7
    }

    public defpackage.ic4 b() {
            r0 = this;
            qd4 r0 = r0.a
            ic4 r0 = r0.a()
            return r0
    }
}
