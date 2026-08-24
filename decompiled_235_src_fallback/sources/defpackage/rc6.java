package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc6  reason: default package */
/* loaded from: classes.dex */
public final class rc6 {
    public static final java.util.List j = null;
    public final java.util.ArrayList a;
    public final defpackage.wy b;
    public final java.util.List c;
    public final java.util.List d;
    public final java.util.List e;
    public final defpackage.nc6 f;
    public final defpackage.ek0 g;
    public final int h;
    public final android.hardware.camera2.params.InputConfiguration i;

    static {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            defpackage.rc6.j = r0
            return
    }

    public rc6(java.util.ArrayList r1, java.util.ArrayList r2, java.util.ArrayList r3, java.util.ArrayList r4, defpackage.ek0 r5, defpackage.nc6 r6, android.hardware.camera2.params.InputConfiguration r7, int r8, defpackage.wy r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.c = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.d = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.e = r1
            r0.f = r6
            r0.g = r5
            r0.i = r7
            r0.h = r8
            r0.b = r9
            return
    }

    public static defpackage.rc6 a() {
            rc6 r0 = new rc6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 0
            r2.<init>(r3)
            r4 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r5 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            da4 r6 = defpackage.da4.d()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            sa4 r8 = defpackage.sa4.a()
            ek0 r9 = new ek0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            go4 r11 = defpackage.go4.a(r6)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r7)
            sy6 r5 = defpackage.sy6.b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            android.util.ArrayMap r6 = r8.a
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L4c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L60
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r6.get(r8)
            r5.put(r8, r12)
            goto L4c
        L60:
            sy6 r14 = new sy6
            r14.<init>(r5)
            r12 = -1
            r9.<init>(r10, r11, r12, r13, r14)
            r5 = r9
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final java.util.List b() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r5 = r5.a
            int r1 = r5.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            wy r3 = (defpackage.wy) r3
            ig1 r4 = r3.a
            r0.add(r4)
            java.util.List r3 = r3.b
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc
            java.lang.Object r4 = r3.next()
            ig1 r4 = (defpackage.ig1) r4
            r0.add(r4)
            goto L21
        L31:
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            return r5
    }
}
