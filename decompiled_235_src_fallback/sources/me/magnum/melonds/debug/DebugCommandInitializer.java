package me.magnum.melonds.debug;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DebugCommandInitializer implements defpackage.j53 {
    public DebugCommandInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void c(me.magnum.melonds.debug.DebugCommandInitializer r1, android.content.Context r2, android.app.Activity r3) {
            boolean r1 = r3 instanceof me.magnum.melonds.ui.emulator.EmulatorActivity
            if (r1 == 0) goto L3d
            lc1 r1 = defpackage.lc1.a
            android.content.Context r1 = r2.getApplicationContext()
            r1.getClass()
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            defpackage.lc1.b = r2
            android.content.Intent r2 = r3.getIntent()
            if (r2 == 0) goto L3d
            android.net.Uri r2 = r2.getData()
            if (r2 != 0) goto L23
            goto L3d
        L23:
            java.lang.String r3 = "debug_command_state"
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r0)
            r1.getClass()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = "last_rom_uri"
            java.lang.String r2 = r2.toString()
            r1.putString(r3, r2)
            r1.commit()
        L3d:
            return
    }

    @Override // defpackage.j53
    public final java.util.List a() {
            r0 = this;
            yt1 r0 = defpackage.yt1.A
            return r0
    }

    @Override // defpackage.j53
    public final java.lang.Object b(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getApplicationContext()
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto Le
            android.app.Application r0 = (android.app.Application) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L12
            goto L1a
        L12:
            jc1 r1 = new jc1
            r1.<init>(r2, r3)
            r0.registerActivityLifecycleCallbacks(r1)
        L1a:
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
