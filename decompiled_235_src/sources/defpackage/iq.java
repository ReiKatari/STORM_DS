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
import me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iq  reason: default package */
/* loaded from: classes.dex */
public final class iq implements ml4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq b;

    public /* synthetic */ iq(jq jqVar, int i) {
        this.a = i;
        this.b = jqVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [x86, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [x86, java.lang.Object] */
    @Override // defpackage.ml4
    public final void a(mv0 mv0Var) {
        int i = this.a;
        jq jqVar = this.b;
        switch (i) {
            case 0:
                tq v = jqVar.v();
                v.c();
                jqVar.R.b.a("androidx:appcompat");
                v.f();
                return;
            case 1:
                BackgroundsActivity backgroundsActivity = (BackgroundsActivity) jqVar;
                if (!backgroundsActivity.z0) {
                    backgroundsActivity.z0 = true;
                    ((p10) backgroundsActivity.c()).getClass();
                    return;
                }
                return;
            case 2:
                CheatsActivity cheatsActivity = (CheatsActivity) jqVar;
                if (!cheatsActivity.z0) {
                    cheatsActivity.z0 = true;
                    ((oo0) cheatsActivity.c()).getClass();
                    return;
                }
                return;
            case 3:
                DSiWareManagerActivity dSiWareManagerActivity = (DSiWareManagerActivity) jqVar;
                if (!dSiWareManagerActivity.z0) {
                    dSiWareManagerActivity.z0 = true;
                    ((r91) dSiWareManagerActivity.c()).getClass();
                    return;
                }
                return;
            case 4:
                EmulatorActivity emulatorActivity = (EmulatorActivity) jqVar;
                if (!emulatorActivity.A0) {
                    emulatorActivity.A0 = true;
                    ob1 ob1Var = (ob1) ((ew1) emulatorActivity.c());
                    ob1Var.getClass();
                    emulatorActivity.D0 = new Object();
                    sb1 sb1Var = ob1Var.a;
                    emulatorActivity.E0 = (pi1) sb1Var.H.get();
                    sw4 sw4Var = (sw4) sb1Var.B.get();
                    emulatorActivity.F0 = (uv4) sb1Var.I.get();
                    emulatorActivity.G0 = (iu3) ob1Var.b.d.get();
                    at atVar = (at) sb1Var.G.get();
                    atVar.getClass();
                    emulatorActivity.H0 = atVar;
                    emulatorActivity.I0 = (kd6) sb1Var.s.get();
                    emulatorActivity.J0 = (e70) sb1Var.J.get();
                    emulatorActivity.b1 = (ae6) sb1Var.K.get();
                    emulatorActivity.c1 = (ce6) sb1Var.L.get();
                    return;
                }
                return;
            case 5:
                InputSetupActivity inputSetupActivity = (InputSetupActivity) jqVar;
                if (!inputSetupActivity.A0) {
                    inputSetupActivity.A0 = true;
                    ((j73) inputSetupActivity.c()).getClass();
                    return;
                }
                return;
            case 6:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) jqVar;
                if (!layoutEditorActivity.A0) {
                    layoutEditorActivity.A0 = true;
                    sb1 sb1Var2 = ((ob1) ((xk3) layoutEditorActivity.c())).a;
                    c76 c76Var = (c76) sb1Var2.M.get();
                    layoutEditorActivity.B0 = new Object();
                    layoutEditorActivity.C0 = (pi1) sb1Var2.H.get();
                    layoutEditorActivity.D0 = (sw4) sb1Var2.B.get();
                    return;
                }
                return;
            case 7:
                LayoutListActivity layoutListActivity = (LayoutListActivity) jqVar;
                if (!layoutListActivity.z0) {
                    layoutListActivity.z0 = true;
                    ((gm3) layoutListActivity.c()).getClass();
                    return;
                }
                return;
            case 8:
                LayoutSelectorActivity layoutSelectorActivity = (LayoutSelectorActivity) jqVar;
                if (!layoutSelectorActivity.z0) {
                    layoutSelectorActivity.z0 = true;
                    ((pn3) layoutSelectorActivity.c()).getClass();
                    return;
                }
                return;
            case 9:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) jqVar;
                if (!romDetailsActivity.z0) {
                    romDetailsActivity.z0 = true;
                    sb1 sb1Var3 = ((ob1) ((iv5) romDetailsActivity.c())).a;
                    romDetailsActivity.A0 = (e70) sb1Var3.J.get();
                    romDetailsActivity.B0 = (l06) sb1Var3.N.get();
                    return;
                }
                return;
            case 10:
                RomListActivity romListActivity = (RomListActivity) jqVar;
                if (!romListActivity.A0) {
                    romListActivity.A0 = true;
                    romListActivity.B0 = (e14) ((ob1) ((oy5) romListActivity.c())).a.O.get();
                    return;
                }
                return;
            case 11:
                SettingsActivity settingsActivity = (SettingsActivity) jqVar;
                if (!settingsActivity.z0) {
                    settingsActivity.z0 = true;
                    ((id6) settingsActivity.c()).getClass();
                    return;
                }
                return;
            case 12:
                ShortcutSetupActivity shortcutSetupActivity = (ShortcutSetupActivity) jqVar;
                if (!shortcutSetupActivity.A0) {
                    shortcutSetupActivity.A0 = true;
                    ((jh6) shortcutSetupActivity.c()).getClass();
                    return;
                }
                return;
            default:
                VulkanDriverManagerActivity vulkanDriverManagerActivity = (VulkanDriverManagerActivity) jqVar;
                if (!vulkanDriverManagerActivity.z0) {
                    vulkanDriverManagerActivity.z0 = true;
                    ((cr7) vulkanDriverManagerActivity.c()).getClass();
                    return;
                }
                return;
        }
    }
}
