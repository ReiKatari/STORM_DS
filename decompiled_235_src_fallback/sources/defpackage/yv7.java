package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv7  reason: default package */
/* loaded from: classes.dex */
public abstract class yv7 {
    public static final defpackage.ng2 a(defpackage.m16 r8, boolean r9, java.lang.String[] r10, defpackage.qn2 r11) {
            zb3 r0 = r8.g()
            int r1 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r1)
            java.lang.String[] r10 = (java.lang.String[]) r10
            nc7 r2 = r0.b
            r2.getClass()
            ad6 r0 = new ad6
            r0.<init>()
            int r1 = r10.length
            r3 = 0
            r4 = r3
        L18:
            if (r4 >= r1) goto L3b
            r5 = r10[r4]
            java.util.LinkedHashMap r6 = r2.c
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r7 = r5.toLowerCase(r7)
            r7.getClass()
            java.lang.Object r6 = r6.get(r7)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L35
            java.util.Collection r6 = (java.util.Collection) r6
            r0.addAll(r6)
            goto L38
        L35:
            r0.add(r5)
        L38:
            int r4 = r4 + 1
            goto L18
        L3b:
            ad6 r10 = defpackage.ii2.p(r0)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r10 = r10.toArray(r0)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r0 = r10.length
            int[] r1 = new int[r0]
        L4a:
            if (r3 >= r0) goto L75
            r4 = r10[r3]
            java.util.LinkedHashMap r5 = r2.f
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r4.toLowerCase(r6)
            r6.getClass()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L6a
            int r4 = r5.intValue()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L4a
        L6a:
            java.lang.String r10 = "There is no table with name "
            java.lang.String r10 = r10.concat(r4)
            defpackage.i.h(r10)
            r10 = 0
            goto L7b
        L75:
            vr4 r0 = new vr4
            r0.<init>(r10, r1)
            r10 = r0
        L7b:
            java.lang.Object r0 = r10.A
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.Object r10 = r10.B
            r3 = r10
            int[] r3 = (int[]) r3
            r4.getClass()
            r3.getClass()
            kp5 r1 = new kp5
            r5 = 0
            r6 = 8
            r1.<init>(r2, r3, r4, r5, r6)
            g21 r10 = new g21
            r0 = 7
            r10.<init>(r1, r0)
            r0 = -1
            le2 r10 = defpackage.f04.o(r10, r0)
            ng2 r0 = new ng2
            r0.<init>(r10, r8, r9, r11)
            return r0
    }

    public static boolean b(int r1) {
            int r1 = java.lang.Character.getType(r1)
            r0 = 23
            if (r1 == r0) goto L23
            r0 = 20
            if (r1 == r0) goto L23
            r0 = 22
            if (r1 == r0) goto L23
            r0 = 30
            if (r1 == r0) goto L23
            r0 = 29
            if (r1 == r0) goto L23
            r0 = 24
            if (r1 == r0) goto L23
            r0 = 21
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }
}
