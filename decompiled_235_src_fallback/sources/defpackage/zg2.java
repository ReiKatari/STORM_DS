package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg2  reason: default package */
/* loaded from: classes.dex */
public final class zg2 implements defpackage.gi7, defpackage.fj7 {
    public final defpackage.sg0 a;
    public final defpackage.op6 b;
    public defpackage.li7 c;
    public defpackage.tu0 d;

    public zg2(defpackage.sg0 r3, defpackage.t54 r4, defpackage.op6 r5, defpackage.kj7 r6, defpackage.oy7 r7) {
            r2 = this;
            r3.getClass()
            r5.getClass()
            r6.getClass()
            r2.<init>()
            r2.a = r3
            r2.b = r5
            lg0 r3 = r3.b
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            r4.getClass()
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = r3
            qc0 r7 = (defpackage.qc0) r7
            r7.getClass()
            java.lang.Object r4 = r7.c(r4)
            if (r4 != 0) goto L29
            r4 = r6
        L29:
            java.lang.Integer r4 = (java.lang.Integer) r4
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            r4.getClass()
            r7.getClass()
            java.lang.Object r4 = r7.c(r4)
            if (r4 != 0) goto L3a
            r4 = r6
        L3a:
            java.lang.Integer r4 = (java.lang.Integer) r4
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB
            r4.getClass()
            r7.getClass()
            java.lang.Object r4 = r7.c(r4)
            if (r4 != 0) goto L4b
            goto L4c
        L4b:
            r6 = r4
        L4c:
            java.lang.Integer r6 = (java.lang.Integer) r6
            kg0 r4 = defpackage.lg0.g
            r4.getClass()
            defpackage.kg0.a(r3)
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES
            r4.getClass()
            qc0 r3 = (defpackage.qc0) r3
            java.lang.Object r3 = r3.c(r4)
            int[] r3 = (int[]) r3
            if (r3 == 0) goto L7d
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r3.length
            r4.<init>(r6)
            int r6 = r3.length
            r7 = r5
        L6d:
            if (r7 >= r6) goto L7d
            r0 = r3[r7]
            java.util.List r1 = defpackage.oa.b
            oa r0 = defpackage.nc1.N(r0)
            r4.add(r0)
            int r7 = r7 + 1
            goto L6d
        L7d:
            sg0 r2 = r2.a
            lg0 r2 = r2.b
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            r3.getClass()
            qc0 r2 = (defpackage.qc0) r2
            java.lang.Object r2 = r2.c(r3)
            int[] r2 = (int[]) r2
            if (r2 == 0) goto Lbc
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
        L97:
            if (r5 >= r4) goto Lbc
            r6 = r2[r5]
            java.util.List r7 = defpackage.qb.b
            java.util.Iterator r7 = r7.iterator()
        La1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r7.next()
            r1 = r0
            qb r1 = (defpackage.qb) r1
            int r1 = r1.a
            if (r1 != r6) goto La1
            goto Lb4
        Lb3:
            r0 = 0
        Lb4:
            qb r0 = (defpackage.qb) r0
            r3.add(r0)
            int r5 = r5 + 1
            goto L97
        Lbc:
            return
    }

    @Override // defpackage.fj7
    public final void a(java.util.LinkedHashSet r3) {
            r2 = this;
            java.util.Iterator r2 = r3.iterator()
        L4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            di7 r3 = (defpackage.di7) r3
            boolean r0 = r3 instanceof defpackage.p25
            if (r0 == 0) goto L4
            p25 r3 = (defpackage.p25) r3
            android.util.Size r3 = r3.c()
            if (r3 == 0) goto L4
            android.util.Rational r0 = new android.util.Rational
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            r0.<init>(r1, r3)
            goto L4
        L2a:
            return
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r4 = this;
            tu0 r0 = new tu0
            r0.<init>()
            li7 r1 = r4.c
            if (r1 == 0) goto L25
            tu0 r2 = r4.d
            if (r2 == 0) goto L12
            java.lang.String r3 = "Cancelled by another cancelFocusAndMetering()"
            defpackage.i61.A(r3, r2)
        L12:
            r4.d = r0
            op6 r4 = r4.b
            java.lang.Object r2 = r4.d
            monitor-enter(r2)
            monitor-exit(r2)
            r4.f()
            jg1 r4 = r1.j()
            defpackage.nc1.a0(r4, r0)
            return
        L25:
            java.lang.String r4 = "Camera is not active."
            defpackage.i61.A(r4, r0)
            return
    }
}
