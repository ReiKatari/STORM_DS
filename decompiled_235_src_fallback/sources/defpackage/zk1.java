package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zk1  reason: default package */
/* loaded from: classes.dex */
public final class zk1 implements android.hardware.display.DisplayManager.DisplayListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ zk1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    private final void a(int r1) {
            r0 = this;
            return
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int r2) {
            r1 = this;
            int r2 = r1.a
            switch(r2) {
                case 0: goto L26;
                case 1: goto L17;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.b
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r1
            int r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r1.E()
            return
        Lf:
            java.lang.Object r1 = r1.b
            v82 r1 = (defpackage.v82) r1
            r1.b()
            return
        L17:
            java.lang.Object r1 = r1.b
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            yu1 r2 = new yu1
            r0 = 13
            r2.<init>(r1, r0)
            r1.runOnUiThread(r2)
            return
        L26:
            java.lang.Object r1 = r1.b
            al1 r1 = (defpackage.al1) r1
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            r0 = 0
            r1.d = r0     // Catch: java.lang.Throwable -> L34
            r1.f = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return
        L34:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r2) {
            r1 = this;
            int r2 = r1.a
            switch(r2) {
                case 0: goto L19;
                case 1: goto Lf;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.b
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r1
            int r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r1.E()
        Le:
            return
        Lf:
            java.lang.Object r1 = r1.b
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.R0()
            return
        L19:
            java.lang.Object r1 = r1.b
            al1 r1 = (defpackage.al1) r1
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            r0 = 0
            r1.d = r0     // Catch: java.lang.Throwable -> L27
            r1.f = r0     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)
            return
        L27:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int r2) {
            r1 = this;
            int r2 = r1.a
            switch(r2) {
                case 0: goto L26;
                case 1: goto L17;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.b
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r1
            int r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r1.E()
            return
        Lf:
            java.lang.Object r1 = r1.b
            v82 r1 = (defpackage.v82) r1
            r1.b()
            return
        L17:
            java.lang.Object r1 = r1.b
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            yu1 r2 = new yu1
            r0 = 14
            r2.<init>(r1, r0)
            r1.runOnUiThread(r2)
            return
        L26:
            java.lang.Object r1 = r1.b
            al1 r1 = (defpackage.al1) r1
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            r0 = 0
            r1.d = r0     // Catch: java.lang.Throwable -> L34
            r1.f = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return
        L34:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
    }
}
