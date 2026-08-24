package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cr1  reason: default package */
/* loaded from: classes.dex */
public final class cr1 implements defpackage.br1 {
    public final android.hardware.camera2.params.DynamicRangeProfiles a;

    public cr1(android.hardware.camera2.params.DynamicRangeProfiles r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.util.Set d(java.util.Set r6) {
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            du1 r6 = defpackage.du1.A
            return r6
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r6.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.util.LinkedHashMap r3 = defpackage.zq1.a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            yq1 r3 = (defpackage.yq1) r3
            if (r3 != 0) goto L49
            boolean r4 = defpackage.kj2.L()
            if (r4 == 0) goto L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Dynamic range profile cannot be converted to a DynamicRange object: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.w(r2, r1)
        L49:
            if (r3 == 0) goto L12
            r0.add(r3)
            goto L12
        L4f:
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r0)
            r6.getClass()
            return r6
    }

    @Override // defpackage.br1
    public final java.util.Set a() {
            r0 = this;
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r0.a
            java.util.Set r0 = r0.getSupportedProfiles()
            r0.getClass()
            java.util.Set r0 = d(r0)
            return r0
    }

    @Override // defpackage.br1
    public final android.hardware.camera2.params.DynamicRangeProfiles b() {
            r0 = this;
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r0.a
            return r0
    }

    @Override // defpackage.br1
    public final java.util.Set c(defpackage.yq1 r3) {
            r2 = this;
            r3.getClass()
            java.util.LinkedHashMap r0 = defpackage.zq1.a
            android.hardware.camera2.params.DynamicRangeProfiles r0 = r2.a
            java.lang.Long r0 = defpackage.zq1.a(r3, r0)
            if (r0 == 0) goto L1f
            android.hardware.camera2.params.DynamicRangeProfiles r2 = r2.a
            long r0 = r0.longValue()
            java.util.Set r2 = r2.getProfileCaptureRequestConstraints(r0)
            r2.getClass()
            java.util.Set r2 = d(r2)
            return r2
        L1f:
            java.lang.String r2 = "DynamicRange is not supported: "
            defpackage.u34.w(r3, r2)
            r2 = 0
            return r2
    }
}
