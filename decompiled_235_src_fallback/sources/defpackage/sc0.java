package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc0  reason: default package */
/* loaded from: classes.dex */
public final class sc0 implements java.lang.AutoCloseable {
    public final defpackage.t57 A;
    public final java.lang.String B;
    public final android.hardware.camera2.CameraManager L;
    public final defpackage.o41 R;
    public final defpackage.sw X;
    public final defpackage.tp6 Y;
    public final defpackage.de5 Z;
    public final defpackage.of6 d0;
    public final defpackage.be5 e0;
    public final defpackage.pb0 f0;
    public final defpackage.ap6 g0;

    public sc0(defpackage.n55 r1, defpackage.t57 r2, java.lang.String r3, defpackage.rc3 r4) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.A = r2
            r0.B = r3
            java.lang.Object r1 = r1.get()
            android.hardware.camera2.CameraManager r1 = (android.hardware.camera2.CameraManager) r1
            r0.L = r1
            gu6 r1 = new gu6
            r1.<init>(r4)
            n61 r2 = r2.h
            r61 r3 = new r61
            java.lang.String r4 = "CXCP-CameraStatusMonitor"
            r3.<init>(r4)
            l61 r2 = defpackage.jw2.y(r2, r3)
            l61 r1 = defpackage.jw2.y(r1, r2)
            o41 r1 = defpackage.g04.i(r1)
            r0.R = r1
            r2 = 0
            sw r3 = defpackage.g04.s(r2)
            r0.X = r3
            hi0 r3 = defpackage.hi0.a
            tp6 r3 = defpackage.up6.a(r3)
            r0.Y = r3
            de5 r4 = new de5
            r4.<init>(r3)
            r0.Z = r4
            r3 = 7
            r4 = 0
            of6 r2 = defpackage.pf6.b(r2, r2, r4, r3)
            r0.d0 = r2
            be5 r3 = new be5
            r3.<init>(r2)
            r0.e0 = r3
            z r2 = new z
            r3 = 11
            r2.<init>(r0, r4, r3)
            pb0 r2 = defpackage.f04.p(r2)
            r0.f0 = r2
            a6 r2 = new a6
            r3 = 5
            r2.<init>(r0, r4, r3)
            r3 = 3
            ap6 r1 = defpackage.hv.L(r1, r4, r4, r2, r3)
            r0.g0 = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            sw r0 = r2.X
            boolean r0 = r0.a()
            if (r0 == 0) goto L13
            ap6 r0 = r2.g0
            r1 = 0
            r0.h(r1)
            o41 r2 = r2.R
            defpackage.g04.x(r2, r1)
        L13:
            return
    }
}
