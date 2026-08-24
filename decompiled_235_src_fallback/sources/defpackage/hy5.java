package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy5  reason: default package */
/* loaded from: classes.dex */
public class hy5 implements defpackage.ax1, defpackage.t86 {
    public final me.magnum.melonds.ui.romlist.RomListActivity A;

    public /* synthetic */ hy5(me.magnum.melonds.ui.romlist.RomListActivity r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public void a() {
            r4 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            me.magnum.melonds.ui.romlist.RomListActivity r4 = r4.A
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130970108(0x7f0405fc, float:1.7548917E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            r2 = 2130970106(0x7f0405fa, float:1.7548913E38)
            boolean r2 = r1.resolveAttribute(r2, r0, r3)
            if (r2 == 0) goto L20
            int r2 = r0.resourceId
            defpackage.hf.S(r4, r2)
        L20:
            r2 = 2130969780(0x7f0404b4, float:1.7548252E38)
            r1.resolveAttribute(r2, r0, r3)
            r2 = 2130969655(0x7f040437, float:1.7547998E38)
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L36
            int r0 = r0.resourceId
            if (r0 == 0) goto L36
            r4.setTheme(r0)
        L36:
            return
    }

    @Override // defpackage.ax1
    public void d() {
            r0 = this;
            return
    }

    @Override // defpackage.ax1
    public void e(defpackage.pq5 r3) {
            r2 = this;
            r3.getClass()
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity> r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.class
            me.magnum.melonds.ui.romlist.RomListActivity r2 = r2.A
            r0.<init>(r2, r1)
            wz5 r1 = new wz5
            r1.<init>()
            r1.A = r3
            java.lang.String r3 = "rom"
            r0.putExtra(r3, r1)
            r2.startActivity(r0)
            r3 = 17432576(0x10a0000, float:2.5346597E-38)
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r2.overridePendingTransition(r3, r0)
            return
    }

    @Override // defpackage.ax1
    public void k(me.magnum.melonds.domain.model.ConsoleType r4) {
            r3 = this;
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity> r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.class
            me.magnum.melonds.ui.romlist.RomListActivity r3 = r3.A
            r0.<init>(r3, r1)
            java.lang.String r1 = "boot_firmware_only"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "boot_firmware_console"
            int r4 = r4.ordinal()
            r0.putExtra(r1, r4)
            r3.startActivity(r0)
            r4 = 17432576(0x10a0000, float:2.5346597E-38)
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r3.overridePendingTransition(r4, r0)
            return
    }
}
