package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx2  reason: default package */
/* loaded from: classes.dex */
public abstract class sx2 extends defpackage.jq implements defpackage.kr2 {
    public boolean A0;
    public final /* synthetic */ int x0;
    public volatile defpackage.r8 y0;
    public final java.lang.Object z0;

    public sx2(int r3) {
            r2 = this;
            r2.x0 = r3
            switch(r3) {
                case 1: goto L6f;
                case 2: goto L55;
                case 3: goto L3a;
                case 4: goto L1f;
                default: goto L5;
            }
        L5:
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.z0 = r3
            r3 = 0
            r2.A0 = r3
            iq r3 = new iq
            r0 = r2
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            r1 = 4
            r3.<init>(r0, r1)
            r2.q(r3)
            return
        L1f:
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.z0 = r3
            r3 = 0
            r2.A0 = r3
            iq r3 = new iq
            r0 = r2
            me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity r0 = (me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity) r0
            r1 = 12
            r3.<init>(r0, r1)
            r2.q(r3)
            return
        L3a:
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.z0 = r3
            r3 = 0
            r2.A0 = r3
            iq r3 = new iq
            r0 = r2
            me.magnum.melonds.ui.romlist.RomListActivity r0 = (me.magnum.melonds.ui.romlist.RomListActivity) r0
            r1 = 10
            r3.<init>(r0, r1)
            r2.q(r3)
            return
        L55:
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.z0 = r3
            r3 = 0
            r2.A0 = r3
            iq r3 = new iq
            r0 = r2
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r0
            r1 = 6
            r3.<init>(r0, r1)
            r2.q(r3)
            return
        L6f:
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.z0 = r3
            r3 = 0
            r2.A0 = r3
            iq r3 = new iq
            r0 = r2
            me.magnum.melonds.ui.inputsetup.InputSetupActivity r0 = (me.magnum.melonds.ui.inputsetup.InputSetupActivity) r0
            r1 = 5
            r3.<init>(r0, r1)
            r2.q(r3)
            return
    }

    private final defpackage.r8 A() {
            r2 = this;
            r8 r0 = r2.y0
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.z0
            monitor-enter(r0)
            r8 r1 = r2.y0     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.y0 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            r8 r2 = r2.y0
            return r2
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.x0
            switch(r0) {
                case 0: goto L29;
                case 1: goto L20;
                case 2: goto L17;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r8 r1 = r1.z()
            java.lang.Object r1 = r1.c()
            return r1
        Le:
            r8 r1 = r1.z()
            java.lang.Object r1 = r1.c()
            return r1
        L17:
            r8 r1 = r1.z()
            java.lang.Object r1 = r1.c()
            return r1
        L20:
            r8 r1 = r1.z()
            java.lang.Object r1 = r1.c()
            return r1
        L29:
            r8 r1 = r1.z()
            java.lang.Object r1 = r1.c()
            return r1
    }

    @Override // defpackage.mv0, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            int r0 = r1.x0
            switch(r0) {
                case 0: goto L29;
                case 1: goto L20;
                case 2: goto L17;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
        Le:
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
        L17:
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
        L20:
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
        L29:
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            int r0 = r1.x0
            switch(r0) {
                case 0: goto L31;
                case 1: goto L26;
                case 2: goto L1b;
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            super.onCreate(r2)
            r8 r1 = r1.z()
            r1.d()
            return
        L10:
            super.onCreate(r2)
            r8 r1 = r1.z()
            r1.d()
            return
        L1b:
            super.onCreate(r2)
            r8 r1 = r1.z()
            r1.d()
            return
        L26:
            super.onCreate(r2)
            r8 r1 = r1.z()
            r1.d()
            return
        L31:
            super.onCreate(r2)
            r8 r1 = r1.z()
            r1.d()
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
            r1 = this;
            int r0 = r1.x0
            switch(r0) {
                case 0: goto L31;
                case 1: goto L26;
                case 2: goto L1b;
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            super.onDestroy()
            r8 r1 = r1.z()
            r1.a()
            return
        L10:
            super.onDestroy()
            r8 r1 = r1.z()
            r1.a()
            return
        L1b:
            super.onDestroy()
            r8 r1 = r1.z()
            r1.a()
            return
        L26:
            super.onDestroy()
            r8 r1 = r1.z()
            r1.a()
            return
        L31:
            super.onDestroy()
            r8 r1 = r1.z()
            r1.a()
            return
    }

    public final defpackage.r8 z() {
            r2 = this;
            int r0 = r2.x0
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L42;
                case 2: goto L26;
                case 3: goto L21;
                default: goto L5;
            }
        L5:
            r8 r0 = r2.y0
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r2.z0
            monitor-enter(r0)
            r8 r1 = r2.y0     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            r2.y0 = r1     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
        L1e:
            r8 r2 = r2.y0
            return r2
        L21:
            r8 r2 = r2.A()
            return r2
        L26:
            r8 r0 = r2.y0
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r2.z0
            monitor-enter(r0)
            r8 r1 = r2.y0     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L3b
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L39
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r2.y0 = r1     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r2 = move-exception
            goto L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L3f
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2
        L3f:
            r8 r2 = r2.y0
            return r2
        L42:
            r8 r0 = r2.y0
            if (r0 != 0) goto L5b
            java.lang.Object r0 = r2.z0
            monitor-enter(r0)
            r8 r1 = r2.y0     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L57
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L55
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L55
            r2.y0 = r1     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r2 = move-exception
            goto L59
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            goto L5b
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r2
        L5b:
            r8 r2 = r2.y0
            return r2
        L5e:
            r8 r0 = r2.y0
            if (r0 != 0) goto L77
            java.lang.Object r0 = r2.z0
            monitor-enter(r0)
            r8 r1 = r2.y0     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L73
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L71
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L71
            r2.y0 = r1     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r2 = move-exception
            goto L75
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            goto L77
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r2
        L77:
            r8 r2 = r2.y0
            return r2
    }
}
