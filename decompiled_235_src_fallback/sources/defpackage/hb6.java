package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb6  reason: default package */
/* loaded from: classes.dex */
public abstract class hb6 {
    public static final java.util.Comparator[] a = null;
    public static final defpackage.db6 b = null;

    static {
            r0 = 2
            java.util.Comparator[] r1 = new java.util.Comparator[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L1d
            if (r2 != 0) goto Lb
            zh2 r3 = defpackage.zh2.e
            goto Ld
        Lb:
            zh2 r3 = defpackage.zh2.c
        Ld:
            ix1 r4 = new ix1
            r4.<init>(r3)
            ix1 r3 = new ix1
            r5 = 4
            r3.<init>(r4, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L1d:
            defpackage.hb6.a = r1
            db6 r0 = defpackage.db6.X
            defpackage.hb6.b = r0
            return
    }

    public static final void a(defpackage.xa6 r3, java.util.ArrayList r4, defpackage.mc r5, defpackage.mc r6, defpackage.p94 r7) {
            ta6 r0 = r3.d
            fb6 r1 = defpackage.bb6.n
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto Le
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Le:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L22
            java.lang.Object r1 = r6.g(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
        L22:
            java.lang.Object r1 = r5.g(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            r4.add(r3)
        L31:
            r1 = 7
            if (r0 == 0) goto L42
            int r4 = r3.f
            java.util.List r0 = defpackage.xa6.j(r1, r3)
            java.util.ArrayList r3 = b(r3, r5, r6, r0)
            r7.i(r4, r3)
            return
        L42:
            java.util.List r3 = defpackage.xa6.j(r1, r3)
            int r0 = r3.size()
            r1 = 0
        L4b:
            if (r1 >= r0) goto L59
            java.lang.Object r2 = r3.get(r1)
            xa6 r2 = (defpackage.xa6) r2
            a(r2, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L4b
        L59:
            return
    }

    public static final java.util.ArrayList b(defpackage.xa6 r17, defpackage.mc r18, defpackage.mc r19, java.util.List r20) {
            r0 = r19
            p94 r1 = defpackage.h93.a
            p94 r1 = new p94
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r20.size()
            r5 = 0
        L13:
            if (r5 >= r3) goto L25
            r6 = r20
            java.lang.Object r7 = r6.get(r5)
            xa6 r7 = (defpackage.xa6) r7
            r8 = r18
            a(r7, r2, r8, r0, r1)
            int r5 = r5 + 1
            goto L13
        L25:
            r5 = r17
            sm3 r3 = r5.c
            kk3 r3 = r3.v0
            kk3 r5 = defpackage.kk3.Rtl
            r6 = 1
            if (r3 != r5) goto L32
            r3 = r6
            goto L33
        L32:
            r3 = 0
        L33:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = r2.size()
            int r7 = r7 / 2
            r5.<init>(r7)
            int r7 = r2.size()
            int r7 = r7 - r6
            if (r7 < 0) goto Lf3
            r8 = 0
        L46:
            java.lang.Object r9 = r2.get(r8)
            xa6 r9 = (defpackage.xa6) r9
            if (r8 == 0) goto Ld5
            of5 r10 = r9.h()
            float r10 = r10.b
            of5 r11 = r9.h()
            float r11 = r11.d
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 < 0) goto L60
            r12 = r6
            goto L61
        L60:
            r12 = 0
        L61:
            int r13 = r5.size()
            int r13 = r13 - r6
            if (r13 < 0) goto Ld5
            r14 = 0
        L69:
            java.lang.Object r15 = r5.get(r14)
            vr4 r15 = (defpackage.vr4) r15
            java.lang.Object r15 = r15.A
            of5 r15 = (defpackage.of5) r15
            float r4 = r15.b
            r17 = r6
            float r6 = r15.d
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 < 0) goto L80
            r16 = r17
            goto L82
        L80:
            r16 = 0
        L82:
            if (r12 != 0) goto Lce
            if (r16 != 0) goto Lce
            float r4 = java.lang.Math.max(r10, r4)
            float r16 = java.lang.Math.min(r11, r6)
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 >= 0) goto Lce
            of5 r4 = new of5
            float r12 = r15.a
            r13 = 0
            float r12 = java.lang.Math.max(r12, r13)
            float r13 = r15.b
            float r10 = java.lang.Math.max(r13, r10)
            float r13 = r15.c
            r15 = 2139095040(0x7f800000, float:Infinity)
            float r13 = java.lang.Math.min(r13, r15)
            float r6 = java.lang.Math.min(r6, r11)
            r4.<init>(r12, r10, r13, r6)
            vr4 r6 = new vr4
            java.lang.Object r10 = r5.get(r14)
            vr4 r10 = (defpackage.vr4) r10
            java.lang.Object r10 = r10.B
            r6.<init>(r4, r10)
            r5.set(r14, r6)
            java.lang.Object r4 = r5.get(r14)
            vr4 r4 = (defpackage.vr4) r4
            java.lang.Object r4 = r4.B
            java.util.List r4 = (java.util.List) r4
            r4.add(r9)
            goto Leb
        Lce:
            if (r14 == r13) goto Ld7
            int r14 = r14 + 1
            r6 = r17
            goto L69
        Ld5:
            r17 = r6
        Ld7:
            of5 r4 = r9.h()
            vr4 r6 = new vr4
            xa6[] r9 = new defpackage.xa6[]{r9}
            java.util.ArrayList r9 = defpackage.hf.d0(r9)
            r6.<init>(r4, r9)
            r5.add(r6)
        Leb:
            if (r8 == r7) goto Lf5
            int r8 = r8 + 1
            r6 = r17
            goto L46
        Lf3:
            r17 = r6
        Lf5:
            zh2 r2 = defpackage.zh2.f
            defpackage.jt0.x0(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Comparator[] r4 = defpackage.hb6.a
            r3 = r3 ^ 1
            r3 = r4[r3]
            int r4 = r5.size()
            r6 = 0
        L10a:
            if (r6 >= r4) goto L123
            java.lang.Object r7 = r5.get(r6)
            vr4 r7 = (defpackage.vr4) r7
            java.lang.Object r8 = r7.B
            java.util.List r8 = (java.util.List) r8
            defpackage.jt0.x0(r8, r3)
            java.lang.Object r7 = r7.B
            java.util.Collection r7 = (java.util.Collection) r7
            r2.addAll(r7)
            int r6 = r6 + 1
            goto L10a
        L123:
            su0 r3 = new su0
            r4 = 4
            db6 r5 = defpackage.hb6.b
            r3.<init>(r5, r4)
            defpackage.jt0.x0(r2, r3)
            r4 = 0
        L12f:
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r4 > r3) goto L169
            java.lang.Object r3 = r2.get(r4)
            xa6 r3 = (defpackage.xa6) r3
            int r3 = r3.f
            java.lang.Object r3 = r1.b(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L166
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r5 = r0.g(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L15b
            r2.remove(r4)
            goto L15d
        L15b:
            int r4 = r4 + 1
        L15d:
            r2.addAll(r4, r3)
            int r3 = r3.size()
            int r4 = r4 + r3
            goto L12f
        L166:
            int r4 = r4 + 1
            goto L12f
        L169:
            return r2
    }
}
