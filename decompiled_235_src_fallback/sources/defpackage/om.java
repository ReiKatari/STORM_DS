package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class om implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ om(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public /* synthetic */ om(java.lang.Runnable r2, int r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r3
            r1.L = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.A
            int r1 = r3.B
            java.lang.Object r3 = r3.L
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L36;
                case 2: goto L30;
                case 3: goto L26;
                case 4: goto L20;
                case 5: goto L1a;
                default: goto L9;
            }
        L9:
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            java.lang.ref.WeakReference r0 = r3.p
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L19
            r2 = 0
            r3.y(r0, r1, r2)
        L19:
            return
        L1a:
            gi2 r3 = (defpackage.gi2) r3
            r3.K(r1)
            return
        L20:
            nw4 r3 = (defpackage.nw4) r3
            r3.a(r1)
            return
        L26:
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r3
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            int r1 = r1 + 1
            r3.j0(r1)
            return
        L30:
            be0 r3 = (defpackage.be0) r3
            r3.a(r1)
            return
        L36:
            java.util.function.IntConsumer r3 = (java.util.function.IntConsumer) r3
            r3.accept(r1)
            return
        L3c:
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            android.os.Process.setThreadPriority(r1)
            r3.run()
            return
    }
}
