package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq1  reason: default package */
/* loaded from: classes.dex */
public abstract class zq1 {
    public static final java.util.LinkedHashMap a = null;
    public static final java.util.LinkedHashMap b = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.zq1.a = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            defpackage.zq1.b = r1
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            yq1 r3 = defpackage.yq1.d
            r0.put(r2, r3)
            java.util.List r2 = defpackage.hf.b0(r2)
            r1.put(r3, r2)
            r2 = 2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            yq1 r3 = defpackage.yq1.e
            r0.put(r2, r3)
            java.lang.Object r3 = r0.get(r2)
            java.util.List r2 = defpackage.hf.b0(r2)
            r1.put(r3, r2)
            r2 = 4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            yq1 r3 = defpackage.yq1.f
            r0.put(r2, r3)
            java.util.List r2 = defpackage.hf.b0(r2)
            r1.put(r3, r2)
            r2 = 8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            yq1 r3 = defpackage.yq1.g
            r0.put(r2, r3)
            java.util.List r0 = defpackage.hf.b0(r2)
            r1.put(r3, r0)
            r0 = 64
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 128(0x80, double:6.3E-322)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 16
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 32
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long[] r0 = new java.lang.Long[]{r0, r1, r2, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.Iterator r1 = r0.iterator()
        L7e:
            boolean r2 = r1.hasNext()
            yq1 r3 = defpackage.yq1.h
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.LinkedHashMap r2 = defpackage.zq1.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r4, r3)
            goto L7e
        L9a:
            java.util.LinkedHashMap r1 = defpackage.zq1.b
            r1.put(r3, r0)
            r0 = 1024(0x400, double:5.06E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 2048(0x800, double:1.012E-320)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 256(0x100, double:1.265E-321)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 512(0x200, double:2.53E-321)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long[] r0 = new java.lang.Long[]{r0, r1, r2, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.Iterator r1 = r0.iterator()
        Lc3:
            boolean r2 = r1.hasNext()
            yq1 r3 = defpackage.yq1.i
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.LinkedHashMap r2 = defpackage.zq1.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r4, r3)
            goto Lc3
        Ldf:
            java.util.LinkedHashMap r1 = defpackage.zq1.b
            r1.put(r3, r0)
            return
    }

    public static java.lang.Long a(defpackage.yq1 r3, android.hardware.camera2.params.DynamicRangeProfiles r4) {
            r3.getClass()
            r4.getClass()
            java.util.LinkedHashMap r0 = defpackage.zq1.b
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L3a
            java.util.Set r4 = defpackage.a81.m(r4)
            r4.getClass()
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L1b
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L3a:
            r3 = 0
            return r3
    }
}
