package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh  reason: default package */
/* loaded from: classes.dex */
public final class nh extends android.hardware.camera2.CameraExtensionSession$StateCallback {
    public final defpackage.rd a;
    public final defpackage.l82 b;
    public final defpackage.id0 c;
    public final defpackage.u63 d;
    public final defpackage.pi e;
    public final defpackage.xw f;
    public final defpackage.xw g;

    public nh(defpackage.rd r1, defpackage.l82 r2, defpackage.zc6 r3, defpackage.id0 r4, defpackage.u63 r5, defpackage.pi r6) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            xw r1 = defpackage.g04.u(r3)
            r0.f = r1
            r1 = 0
            xw r1 = defpackage.g04.u(r1)
            r0.g = r1
            return
    }

    public final defpackage.td a(android.hardware.camera2.CameraExtensionSession r4, defpackage.id0 r5) {
            r3 = this;
            xw r0 = r3.g
            java.lang.Object r0 = r0.a
            td r0 = (defpackage.td) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            td r0 = new td
            rd r1 = r3.a
            pi r2 = r3.e
            r0.<init>(r1, r4, r5, r2)
            xw r4 = r3.g
            r5 = 0
            boolean r4 = r4.a(r5, r0)
            if (r4 == 0) goto L1c
            return r0
        L1c:
            xw r3 = r3.g
            java.lang.Object r3 = r3.a
            r3.getClass()
            td r3 = (defpackage.td) r3
            return r3
    }

    public final void onClosed(android.hardware.camera2.CameraExtensionSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            r2.a(r3, r0)
            td r3 = r2.a(r3, r0)
            l82 r0 = r2.b
            r0.getClass()
            yk0 r1 = r0.a
            r1.d(r3)
            xw r3 = r2.f
            r1 = 0
            java.lang.Object r3 = r3.b(r1)
            zc6 r3 = (defpackage.zc6) r3
            if (r3 == 0) goto L24
            r3.a()
        L24:
            r0.a()
            u63 r3 = r2.d
            if (r3 == 0) goto L32
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r3.t(r2)
        L32:
            return
    }

    public final void onConfigureFailed(android.hardware.camera2.CameraExtensionSession r3) {
            r2 = this;
            r3.getClass()
            id0 r0 = r2.c
            td r3 = r2.a(r3, r0)
            l82 r0 = r2.b
            r0.getClass()
            yk0 r1 = r0.a
            r1.h(r3)
            xw r3 = r2.f
            r1 = 0
            java.lang.Object r3 = r3.b(r1)
            zc6 r3 = (defpackage.zc6) r3
            if (r3 == 0) goto L21
            r3.a()
        L21:
            r0.a()
            u63 r3 = r2.d
            if (r3 == 0) goto L2f
            rd r2 = r2.a
            java.lang.String r2 = r2.L
            r3.u(r2)
        L2f:
            return
    }

    public final void onConfigured(android.hardware.camera2.CameraExtensionSession r2) {
            r1 = this;
            r2.getClass()
            id0 r0 = r1.c
            td r2 = r1.a(r2, r0)
            l82 r0 = r1.b
            r0.getClass()
            yk0 r0 = r0.a
            r0.g(r2)
            xw r2 = r1.f
            r0 = 0
            java.lang.Object r2 = r2.b(r0)
            zc6 r2 = (defpackage.zc6) r2
            if (r2 == 0) goto L21
            r2.a()
        L21:
            u63 r2 = r1.d
            if (r2 == 0) goto L2c
            rd r1 = r1.a
            java.lang.String r1 = r1.L
            r2.v(r1)
        L2c:
            return
    }
}
