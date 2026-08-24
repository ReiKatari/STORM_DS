package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c14  reason: default package */
/* loaded from: classes.dex */
public abstract class c14 extends defpackage.ln2 {
    public static java.lang.Object j0(java.util.Map r2, java.lang.Object r3) {
            r2.getClass()
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L29
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L10
            goto L29
        L10:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " is missing in the map."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L29:
            return r0
    }

    public static int k0(int r1) {
            if (r1 >= 0) goto L3
            return r1
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            return r1
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    public static java.util.Map l0(defpackage.vr4 r1) {
            r1.getClass()
            java.lang.Object r0 = r1.A
            java.lang.Object r1 = r1.B
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            r1.getClass()
            return r1
    }

    public static java.util.Map m0(defpackage.vr4... r2) {
            int r0 = r2.length
            if (r0 <= 0) goto L11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = k0(r1)
            r0.<init>(r1)
            q0(r0, r2)
            return r0
        L11:
            zt1 r2 = defpackage.zt1.A
            return r2
    }

    public static java.util.LinkedHashMap n0(defpackage.vr4... r2) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = k0(r1)
            r0.<init>(r1)
            q0(r0, r2)
            return r0
    }

    public static java.util.LinkedHashMap o0(java.util.Map r1, java.util.Map r2) {
            r1.getClass()
            r2.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            r0.putAll(r2)
            return r0
    }

    public static java.util.Map p0(java.util.Map r1, defpackage.vr4 r2) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            java.util.Map r1 = l0(r2)
            return r1
        Le:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.lang.Object r1 = r2.A
            java.lang.Object r2 = r2.B
            r0.put(r1, r2)
            return r0
    }

    public static final void q0(java.util.HashMap r4, defpackage.vr4[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r5[r1]
            java.lang.Object r3 = r2.A
            java.lang.Object r2 = r2.B
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L2
        L10:
            return
    }

    public static java.util.Map r0(java.util.ArrayList r5) {
            int r0 = r5.size()
            if (r0 == 0) goto L39
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L2e
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r2 = r5.size()
            int r2 = k0(r2)
            r0.<init>(r2)
            int r2 = r5.size()
        L1b:
            if (r1 >= r2) goto L2d
            java.lang.Object r3 = r5.get(r1)
            int r1 = r1 + 1
            vr4 r3 = (defpackage.vr4) r3
            java.lang.Object r4 = r3.A
            java.lang.Object r3 = r3.B
            r0.put(r4, r3)
            goto L1b
        L2d:
            return r0
        L2e:
            java.lang.Object r5 = r5.get(r1)
            vr4 r5 = (defpackage.vr4) r5
            java.util.Map r5 = l0(r5)
            return r5
        L39:
            zt1 r5 = defpackage.zt1.A
            return r5
    }

    public static java.util.Map s0(java.util.Map r2) {
            r2.getClass()
            int r0 = r2.size()
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L12
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            return r0
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = java.util.Collections.singletonMap(r0, r2)
            r2.getClass()
            return r2
        L30:
            zt1 r2 = defpackage.zt1.A
            return r2
    }

    public static java.util.LinkedHashMap t0(java.util.Map r1) {
            r1.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }
}
