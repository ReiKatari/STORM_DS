package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc6  reason: default package */
/* loaded from: classes.dex */
public final class pc6 extends defpackage.kc6 {
    public final defpackage.q33 j;
    public boolean k;
    public final java.lang.StringBuilder l;
    public boolean m;
    public final java.util.ArrayList n;

    public pc6() {
            r3 = this;
            r3.<init>()
            q33 r0 = new q33
            r0.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk> r1 = androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class
            y65 r2 = defpackage.ri1.a
            u65 r1 = r2.b(r1)
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r0.A = r1
            r3.j = r0
            r0 = 1
            r3.k = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3.l = r0
            r0 = 0
            r3.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.n = r0
            return
    }

    public final void a(defpackage.rc6 r13) {
            r12 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            ek0 r2 = r13.g
            int r3 = r2.c
            go4 r4 = r2.b
            r5 = -1
            dk0 r6 = r12.b
            if (r3 == r5) goto L2d
            r5 = 1
            r12.m = r5
            int r5 = r6.L
            java.util.List r7 = defpackage.rc6.j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            int r8 = r7.indexOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            int r7 = r7.indexOf(r9)
            if (r8 < r7) goto L2a
            goto L2b
        L2a:
            r3 = r5
        L2b:
            r6.L = r3
        L2d:
            android.util.Range r3 = r2.a()
            android.util.Range r5 = defpackage.yy.h
            boolean r7 = r3.equals(r5)
            java.lang.StringBuilder r8 = r12.l
            java.lang.String r9 = "ValidatingBuilder"
            if (r7 == 0) goto L3e
            goto L8c
        L3e:
            java.lang.Object r7 = r6.X
            da4 r7 = (defpackage.da4) r7
            xx r10 = defpackage.ek0.f
            java.lang.Object r7 = r7.b(r10, r5)
            android.util.Range r7 = (android.util.Range) r7
            boolean r7 = r7.equals(r5)
            java.lang.Object r11 = r6.X
            da4 r11 = (defpackage.da4) r11
            if (r7 == 0) goto L58
            r11.m(r10, r3)
            goto L8c
        L58:
            java.lang.Object r7 = r11.b(r10, r5)
            android.util.Range r7 = (android.util.Range) r7
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L8c
            r12.k = r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Different ExpectedFrameRateRange values; current = "
            r7.<init>(r11)
            java.lang.Object r11 = r6.X
            da4 r11 = (defpackage.da4) r11
            java.lang.Object r5 = r11.b(r10, r5)
            android.util.Range r5 = (android.util.Range) r5
            r7.append(r5)
            java.lang.String r5 = ", new = "
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            defpackage.kj2.v(r9, r3)
            r8.append(r3)
        L8c:
            xx r3 = defpackage.zi7.U
            java.lang.Object r5 = r4.b(r3, r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.util.Objects.requireNonNull(r5)
            int r7 = r5.intValue()
            if (r7 == 0) goto La9
            r6.getClass()
            if (r7 == 0) goto La9
            java.lang.Object r7 = r6.X
            da4 r7 = (defpackage.da4) r7
            r7.m(r3, r5)
        La9:
            xx r3 = defpackage.zi7.V
            java.lang.Object r1 = r4.b(r3, r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Objects.requireNonNull(r1)
            int r5 = r1.intValue()
            if (r5 == 0) goto Lc6
            r6.getClass()
            if (r5 == 0) goto Lc6
            java.lang.Object r5 = r6.X
            da4 r5 = (defpackage.da4) r5
            r5.m(r3, r1)
        Lc6:
            sy6 r1 = r2.e
            java.lang.Object r3 = r6.Y
            sa4 r3 = (defpackage.sa4) r3
            java.lang.Object r5 = r6.R
            java.util.HashSet r5 = (java.util.HashSet) r5
            android.util.ArrayMap r3 = r3.a
            android.util.ArrayMap r1 = r1.a
            r3.putAll(r1)
            java.util.ArrayList r1 = r12.c
            java.util.List r3 = r13.c
            r1.addAll(r3)
            java.util.ArrayList r1 = r12.d
            java.util.List r3 = r13.d
            r1.addAll(r3)
            java.util.List r1 = r2.d
            r6.c(r1)
            java.util.ArrayList r1 = r12.e
            java.util.List r3 = r13.e
            r1.addAll(r3)
            nc6 r1 = r13.f
            if (r1 == 0) goto Lfa
            java.util.ArrayList r3 = r12.n
            r3.add(r1)
        Lfa:
            android.hardware.camera2.params.InputConfiguration r1 = r13.i
            if (r1 == 0) goto L100
            r12.g = r1
        L100:
            java.util.ArrayList r1 = r13.a
            java.util.LinkedHashSet r3 = r12.a
            r3.addAll(r1)
            java.util.ArrayList r1 = r2.a
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r5.addAll(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L119:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L140
            java.lang.Object r3 = r2.next()
            wy r3 = (defpackage.wy) r3
            ig1 r7 = r3.a
            r1.add(r7)
            java.util.List r3 = r3.b
            java.util.Iterator r3 = r3.iterator()
        L130:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L119
            java.lang.Object r7 = r3.next()
            ig1 r7 = (defpackage.ig1) r7
            r1.add(r7)
            goto L130
        L140:
            boolean r1 = r1.containsAll(r5)
            if (r1 != 0) goto L150
            java.lang.String r1 = "Invalid configuration due to capture request surfaces are not a subset of surfaces"
            defpackage.kj2.t(r9, r1)
            r12.k = r0
            r8.append(r1)
        L150:
            int r1 = r13.h
            int r2 = r12.h
            if (r1 == r2) goto L165
            if (r1 == 0) goto L165
            if (r2 == 0) goto L165
            java.lang.String r1 = "Invalid configuration due to that two non-default session types are set"
            defpackage.kj2.t(r9, r1)
            r12.k = r0
            r8.append(r1)
            goto L169
        L165:
            if (r1 == 0) goto L169
            r12.h = r1
        L169:
            wy r13 = r13.b
            if (r13 == 0) goto L180
            wy r1 = r12.i
            if (r1 == r13) goto L17e
            if (r1 == 0) goto L17e
            java.lang.String r13 = "Invalid configuration due to that two different postview output configs are set"
            defpackage.kj2.t(r9, r13)
            r12.k = r0
            r8.append(r13)
            goto L180
        L17e:
            r12.i = r13
        L180:
            r6.e(r4)
            return
    }

    public final defpackage.rc6 b() {
            r12 = this;
            boolean r0 = r12.k
            r1 = 0
            if (r0 == 0) goto L112
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.LinkedHashSet r0 = r12.a
            r3.<init>(r0)
            q33 r0 = r12.j
            boolean r2 = r0.A
            if (r2 != 0) goto L13
            goto L1c
        L13:
            su0 r2 = new su0
            r4 = 5
            r2.<init>(r0, r4)
            java.util.Collections.sort(r3, r2)
        L1c:
            int r0 = r12.h
            r2 = 2
            dk0 r4 = r12.b
            r5 = 1
            if (r0 != r5) goto Lde
            r4.getClass()
            int r0 = r3.size()
            if (r0 != r2) goto Lde
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L35
            goto Lde
        L35:
            int r0 = r3.size()
            r5 = 0
        L3a:
            if (r5 >= r0) goto Lde
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            wy r6 = (defpackage.wy) r6
            ig1 r6 = r6.a
            r6.getClass()
            java.lang.Class r6 = r6.j
            java.lang.Class<android.media.MediaCodec> r7 = android.media.MediaCodec.class
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L3a
            java.lang.Object r0 = r4.R
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.getClass()
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L61
            goto L7d
        L61:
            java.util.Iterator r0 = r0.iterator()
        L65:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r0.next()
            ig1 r5 = (defpackage.ig1) r5
            r5.getClass()
            java.lang.Class r5 = r5.j
            boolean r5 = defpackage.nb3.k(r5, r7)
            if (r5 == 0) goto L65
            goto Lde
        L7d:
            java.lang.Object r0 = r4.X
            da4 r0 = (defpackage.da4) r0
            xx r5 = defpackage.ek0.f
            android.util.Range r6 = defpackage.yy.h
            java.lang.Object r0 = r0.b(r5, r6)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 == 0) goto Lde
            java.lang.Comparable r6 = r0.getUpper()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r7 = 120(0x78, float:1.68E-43)
            if (r6 < r7) goto Laa
            java.lang.Comparable r6 = r0.getLower()
            java.lang.Comparable r7 = r0.getUpper()
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto Laa
            goto Lab
        Laa:
            r0 = r1
        Lab:
            if (r0 == 0) goto Lde
            android.util.Range r6 = new android.util.Range
            r7 = 30
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Comparable r8 = r0.getUpper()
            r6.<init>(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Modified high-speed FPS range from "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = " to "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            java.lang.String r7 = "HighSpeedFpsModifier"
            defpackage.kj2.t(r7, r0)
            java.lang.Object r0 = r4.X
            da4 r0 = (defpackage.da4) r0
            r0.m(r5, r6)
        Lde:
            java.util.ArrayList r0 = r12.n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Leb
            a23 r1 = new a23
            r1.<init>(r12, r2)
        Leb:
            r8 = r1
            rc6 r2 = new rc6
            r0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList r1 = r12.c
            r4.<init>(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r1 = r12.d
            r5.<init>(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList r1 = r12.e
            r6.<init>(r1)
            ek0 r7 = r0.i()
            android.hardware.camera2.params.InputConfiguration r9 = r12.g
            int r10 = r12.h
            wy r11 = r12.i
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L112:
            java.lang.String r12 = "Unsupported session configuration combination"
            defpackage.i.h(r12)
            return r1
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.m
            if (r0 == 0) goto La
            boolean r1 = r1.k
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}
