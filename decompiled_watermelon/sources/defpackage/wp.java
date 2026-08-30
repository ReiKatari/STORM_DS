package defpackage;

import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouts.LayoutListActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wp  reason: default package */
/* loaded from: classes.dex */
public final class wp implements oc4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xp b;

    public /* synthetic */ wp(xp xpVar, int i) {
        this.a = i;
        this.b = xpVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [lx5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [lx5, java.lang.Object] */
    @Override // defpackage.oc4
    public final void a(ys0 ys0Var) {
        int i = this.a;
        xp xpVar = this.b;
        switch (i) {
            case 0:
                hq v = xpVar.v();
                v.a();
                xpVar.R.b.a("androidx:appcompat");
                v.d();
                return;
            case 1:
                BackgroundsActivity backgroundsActivity = (BackgroundsActivity) xpVar;
                if (!backgroundsActivity.y0) {
                    backgroundsActivity.y0 = true;
                    ((yz) backgroundsActivity.d()).getClass();
                    return;
                }
                return;
            case 2:
                CheatsActivity cheatsActivity = (CheatsActivity) xpVar;
                if (!cheatsActivity.y0) {
                    cheatsActivity.y0 = true;
                    ((gm0) cheatsActivity.d()).getClass();
                    return;
                }
                return;
            case 3:
                DSiWareManagerActivity dSiWareManagerActivity = (DSiWareManagerActivity) xpVar;
                if (!dSiWareManagerActivity.y0) {
                    dSiWareManagerActivity.y0 = true;
                    ((d61) dSiWareManagerActivity.d()).getClass();
                    return;
                }
                return;
            case 4:
                EmulatorActivity emulatorActivity = (EmulatorActivity) xpVar;
                if (!emulatorActivity.z0) {
                    emulatorActivity.z0 = true;
                    x71 x71Var = (x71) ((sr1) emulatorActivity.d());
                    x71Var.getClass();
                    emulatorActivity.C0 = new Object();
                    b81 b81Var = x71Var.a;
                    emulatorActivity.D0 = (le1) b81Var.H.get();
                    nn4 nn4Var = (nn4) b81Var.B.get();
                    emulatorActivity.E0 = (pm4) b81Var.I.get();
                    emulatorActivity.F0 = (gn3) x71Var.b.d.get();
                    ns nsVar = (ns) b81Var.G.get();
                    nsVar.getClass();
                    emulatorActivity.G0 = nsVar;
                    emulatorActivity.H0 = (w16) b81Var.s.get();
                    emulatorActivity.I0 = (a50) b81Var.J.get();
                    emulatorActivity.Y0 = (o26) b81Var.K.get();
                    emulatorActivity.Z0 = (q26) b81Var.L.get();
                    return;
                }
                return;
            case 5:
                InputSetupActivity inputSetupActivity = (InputSetupActivity) xpVar;
                if (!inputSetupActivity.z0) {
                    inputSetupActivity.z0 = true;
                    ((f13) inputSetupActivity.d()).getClass();
                    return;
                }
                return;
            case ig7.b /* 6 */:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) xpVar;
                if (!layoutEditorActivity.z0) {
                    layoutEditorActivity.z0 = true;
                    b81 b81Var2 = ((x71) ((ee3) layoutEditorActivity.d())).a;
                    pv5 pv5Var = (pv5) b81Var2.M.get();
                    layoutEditorActivity.A0 = new Object();
                    layoutEditorActivity.B0 = (le1) b81Var2.H.get();
                    layoutEditorActivity.C0 = (nn4) b81Var2.B.get();
                    return;
                }
                return;
            case 7:
                LayoutListActivity layoutListActivity = (LayoutListActivity) xpVar;
                if (!layoutListActivity.y0) {
                    layoutListActivity.y0 = true;
                    ((jf3) layoutListActivity.d()).getClass();
                    return;
                }
                return;
            case 8:
                LayoutSelectorActivity layoutSelectorActivity = (LayoutSelectorActivity) xpVar;
                if (!layoutSelectorActivity.y0) {
                    layoutSelectorActivity.y0 = true;
                    ((rg3) layoutSelectorActivity.d()).getClass();
                    return;
                }
                return;
            case 9:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) xpVar;
                if (!romDetailsActivity.y0) {
                    romDetailsActivity.y0 = true;
                    b81 b81Var3 = ((x71) ((sk5) romDetailsActivity.d())).a;
                    romDetailsActivity.z0 = (a50) b81Var3.J.get();
                    romDetailsActivity.A0 = (rp5) b81Var3.N.get();
                    return;
                }
                return;
            case 10:
                RomListActivity romListActivity = (RomListActivity) xpVar;
                if (!romListActivity.z0) {
                    romListActivity.z0 = true;
                    romListActivity.A0 = (bu3) ((x71) ((yn5) romListActivity.d())).a.O.get();
                    return;
                }
                return;
            case 11:
                SettingsActivity settingsActivity = (SettingsActivity) xpVar;
                if (!settingsActivity.y0) {
                    settingsActivity.y0 = true;
                    ((u16) settingsActivity.d()).getClass();
                    return;
                }
                return;
            default:
                ShortcutSetupActivity shortcutSetupActivity = (ShortcutSetupActivity) xpVar;
                if (!shortcutSetupActivity.z0) {
                    shortcutSetupActivity.z0 = true;
                    ((w56) shortcutSetupActivity.d()).getClass();
                    return;
                }
                return;
        }
    }
}
