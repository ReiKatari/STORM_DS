package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz0  reason: default package */
/* loaded from: classes.dex */
public final class lz0 implements android.hardware.input.InputManager.InputDeviceListener {
    public defpackage.o41 a;
    public final defpackage.tp6 b;
    public final defpackage.tp6 c;
    public final defpackage.de5 d;
    public final defpackage.tp6 e;
    public final defpackage.de5 f;

    public lz0() {
            r2 = this;
            r2.<init>()
            r0 = 0
            tp6 r0 = defpackage.up6.a(r0)
            r2.b = r0
            yt1 r0 = defpackage.yt1.A
            tp6 r0 = defpackage.up6.a(r0)
            r2.c = r0
            de5 r1 = new de5
            r1.<init>(r0)
            r2.d = r1
            nz0 r0 = defpackage.nz0.a
            tp6 r0 = defpackage.up6.a(r0)
            r2.e = r0
            de5 r1 = new de5
            r1.<init>(r0)
            r2.f = r1
            return
    }

    public static boolean a(android.view.InputDevice r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            r2 = 1
            if (r0 < r1) goto Lc
            boolean r0 = defpackage.hz.d(r3)
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L27
            boolean r0 = r3.isVirtual()
            if (r0 != 0) goto L27
            r0 = 1025(0x401, float:1.436E-42)
            boolean r0 = r3.supportsSource(r0)
            if (r0 != 0) goto L26
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            boolean r3 = r3.supportsSource(r0)
            if (r3 == 0) goto L27
        L26:
            return r2
        L27:
            r3 = 0
            return r3
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int r4) {
            r3 = this;
            android.view.InputDevice r4 = android.view.InputDevice.getDevice(r4)
            if (r4 == 0) goto L22
            boolean r0 = a(r4)
            if (r0 == 0) goto L22
        Lc:
            tp6 r0 = r3.c
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = defpackage.gt0.m1(r2)
            r2.add(r4)
            boolean r0 = r0.j(r1, r2)
            if (r0 == 0) goto Lc
        L22:
            return
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int r8) {
            r7 = this;
        L0:
            tp6 r0 = r7.c
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = defpackage.gt0.m1(r2)
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L2a
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            android.view.InputDevice r6 = (android.view.InputDevice) r6
            r6.getClass()
            int r6 = r6.getId()
            if (r6 != r8) goto L27
            goto L2b
        L27:
            int r4 = r4 + 1
            goto L13
        L2a:
            r4 = -1
        L2b:
            if (r4 < 0) goto L30
            r2.remove(r4)
        L30:
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r8)
            if (r3 == 0) goto L3f
            boolean r4 = a(r3)
            if (r4 == 0) goto L3f
            r2.add(r3)
        L3f:
            boolean r0 = r0.j(r1, r2)
            if (r0 == 0) goto L0
            return
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int r7) {
            r6 = this;
        L0:
            tp6 r0 = r6.c
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r3 = r2.iterator()
            r4 = 0
        Le:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L24
            java.lang.Object r5 = r3.next()
            android.view.InputDevice r5 = (android.view.InputDevice) r5
            int r5 = r5.getId()
            if (r5 != r7) goto L21
            goto L25
        L21:
            int r4 = r4 + 1
            goto Le
        L24:
            r4 = -1
        L25:
            if (r4 < 0) goto L30
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r3.remove(r4)
            r2 = r3
        L30:
            boolean r0 = r0.j(r1, r2)
            if (r0 == 0) goto L0
            return
    }
}
