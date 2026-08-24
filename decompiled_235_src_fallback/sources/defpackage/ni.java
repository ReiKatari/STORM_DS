package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni  reason: default package */
/* loaded from: classes.dex */
public final class ni implements defpackage.sk0 {
    public final defpackage.jr6 a;

    public ni(defpackage.jr6 r1, defpackage.t57 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.sk0
    public final defpackage.rk0 a(defpackage.bf0 r4, java.util.Map r5, defpackage.yk0 r6) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            android.view.Surface r2 = (android.view.Surface) r2
            r0.add(r2)
            goto L1a
        L30:
            boolean r0 = r4.F(r0, r6)
            if (r0 != 0) goto L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to create ConstrainedHighSpeedCaptureSession from "
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r6)
            r4 = 33
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CXCP"
            android.util.Log.w(r4, r3)
            r6.a()
            d90 r3 = defpackage.d90.q0
            return r3
        L5c:
            jr6 r3 = r3.a
            p04 r3 = defpackage.l.g(r5, r3)
            qk0 r4 = new qk0
            zt1 r5 = defpackage.zt1.A
            r4.<init>(r5, r3)
            return r4
    }
}
