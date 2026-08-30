package ah;

import kf.w1;
import me.magnum.melonds.common.camera.DSiCameraSource;
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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 implements g.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.i f790b;

    public /* synthetic */ i1(l.i iVar, int i2) {
        this.f789a = i2;
        this.f790b = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sf.d] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sf.d] */
    @Override // g.b
    public final void a(d.k kVar) {
        switch (this.f789a) {
            case 0:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.f790b;
                if (!emulatorActivity.f795x0) {
                    emulatorActivity.f795x0 = true;
                    rd.a aVar = (rd.a) ((z) emulatorActivity.d());
                    aVar.getClass();
                    emulatorActivity.A0 = new Object();
                    rd.g gVar = aVar.f12641a;
                    emulatorActivity.B0 = (sf.c) gVar.f12685x.get();
                    emulatorActivity.C0 = (com.squareup.picasso.a0) gVar.f12686y.get();
                    emulatorActivity.D0 = (sd.h) gVar.f12687z.get();
                    emulatorActivity.E0 = (pf.q) aVar.f12642b.f12650d.get();
                    yf.b bVar = (yf.b) gVar.f12684w.get();
                    bVar.getClass();
                    emulatorActivity.F0 = bVar;
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                RomListActivity romListActivity = (RomListActivity) this.f790b;
                if (!romListActivity.f795x0) {
                    romListActivity.f795x0 = true;
                    romListActivity.f9572y0 = (ob.c) ((rd.a) ((bi.s) romListActivity.d())).f12641a.B.get();
                    return;
                }
                return;
            case 2:
                SettingsActivity settingsActivity = (SettingsActivity) this.f790b;
                if (!settingsActivity.f9580w0) {
                    settingsActivity.f9580w0 = true;
                    ((ci.n) settingsActivity.d()).getClass();
                    return;
                }
                return;
            case 3:
                BackgroundsActivity backgroundsActivity = (BackgroundsActivity) this.f790b;
                if (!backgroundsActivity.f9491w0) {
                    backgroundsActivity.f9491w0 = true;
                    ((hg.d) backgroundsActivity.d()).getClass();
                    return;
                }
                return;
            case 4:
                ShortcutSetupActivity shortcutSetupActivity = (ShortcutSetupActivity) this.f790b;
                if (!shortcutSetupActivity.f795x0) {
                    shortcutSetupActivity.f795x0 = true;
                    ((hi.d) shortcutSetupActivity.d()).getClass();
                    return;
                }
                return;
            case l1.c.f8511g /* 5 */:
                CheatsActivity cheatsActivity = (CheatsActivity) this.f790b;
                if (!cheatsActivity.f9496w0) {
                    cheatsActivity.f9496w0 = true;
                    ((jg.d) cheatsActivity.d()).getClass();
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
                l.i iVar = this.f790b;
                l.m v10 = iVar.v();
                v10.a();
                iVar.R.f12313b.a("androidx:appcompat");
                v10.f();
                return;
            case 7:
                InputSetupActivity inputSetupActivity = (InputSetupActivity) this.f790b;
                if (!inputSetupActivity.f9523w0) {
                    inputSetupActivity.f9523w0 = true;
                    ((ph.e) inputSetupActivity.d()).getClass();
                    return;
                }
                return;
            case 8:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.f790b;
                if (!layoutEditorActivity.f795x0) {
                    layoutEditorActivity.f795x0 = true;
                    rd.g gVar2 = ((rd.a) ((rh.j) layoutEditorActivity.d())).f12641a;
                    w1 w1Var = (w1) gVar2.A.get();
                    layoutEditorActivity.f9526y0 = new Object();
                    layoutEditorActivity.f9527z0 = (sf.c) gVar2.f12685x.get();
                    layoutEditorActivity.A0 = (com.squareup.picasso.a0) gVar2.f12686y.get();
                    return;
                }
                return;
            case l1.c.f8508d /* 9 */:
                LayoutListActivity layoutListActivity = (LayoutListActivity) this.f790b;
                if (!layoutListActivity.f9559w0) {
                    layoutListActivity.f9559w0 = true;
                    ((uh.c) layoutListActivity.d()).getClass();
                    return;
                }
                return;
            case l1.c.f8510f /* 10 */:
                LayoutSelectorActivity layoutSelectorActivity = (LayoutSelectorActivity) this.f790b;
                if (!layoutSelectorActivity.f9564w0) {
                    layoutSelectorActivity.f9564w0 = true;
                    ((uh.g) layoutSelectorActivity.d()).getClass();
                    return;
                }
                return;
            case 11:
                DSiWareManagerActivity dSiWareManagerActivity = (DSiWareManagerActivity) this.f790b;
                if (!dSiWareManagerActivity.f9501w0) {
                    dSiWareManagerActivity.f9501w0 = true;
                    ((xg.c) dSiWareManagerActivity.d()).getClass();
                    return;
                }
                return;
            default:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.f790b;
                if (!romDetailsActivity.f9569w0) {
                    romDetailsActivity.f9569w0 = true;
                    ((yh.d) romDetailsActivity.d()).getClass();
                    return;
                }
                return;
        }
    }
}
