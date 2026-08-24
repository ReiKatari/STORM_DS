package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar1  reason: default package */
/* loaded from: classes.dex */
public final class ar1 extends defpackage.qu2 {
    public static final /* synthetic */ int c = 0;
    public final defpackage.yq1 a;
    public final defpackage.da2 b;

    public ar1() {
            r1 = this;
            r1.<init>()
            yq1 r0 = defpackage.yq1.e
            r1.a = r0
            da2 r0 = defpackage.da2.DYNAMIC_RANGE
            r1.b = r0
            return
    }

    @Override // defpackage.qu2
    public final defpackage.da2 a() {
            r0 = this;
            da2 r0 = r0.b
            return r0
    }

    @Override // defpackage.qu2
    public final boolean b(defpackage.cg0 r8, defpackage.qi1 r9) {
            r7 = this;
            java.util.Set r0 = r8.a()
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isSupportedIndividually: cameraInfoSupportedDynamicRanges = "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = ", this = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "DynamicRangeFeature"
            defpackage.kj2.t(r3, r1)
            yq1 r1 = r7.a
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2b
            goto L6a
        L2b:
            java.lang.Object r9 = r9.g
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L33:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r9.next()
            di7 r0 = (defpackage.di7) r0
            java.util.Set r4 = r0.k(r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isSupportedIndividually: useCaseSupportedDynamicRanges = "
            r5.<init>(r6)
            r5.append(r4)
            r5.append(r2)
            r5.append(r7)
            java.lang.String r6 = ", useCases = "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            defpackage.kj2.t(r3, r0)
            if (r4 == 0) goto L33
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L33
        L6a:
            r7 = 0
            return r7
        L6c:
            r7 = 1
            return r7
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DynamicRangeFeature(dynamicRange="
            r0.<init>(r1)
            yq1 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
