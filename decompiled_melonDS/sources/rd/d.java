package rd;

import bi.d0;
import kf.b1;
import kf.x1;
import me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment_GeneratedInjector;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment_GeneratedInjector;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements jb.b, mb.a, bi.f, d0, ci.e, CheatsPreferencesFragment_GeneratedInjector, CustomFirmwarePreferencesFragment_GeneratedInjector, FirmwarePreferencesFragment_GeneratedInjector, GeneralPreferencesFragment_GeneratedInjector, InputPreferencesFragment_GeneratedInjector, MainPreferencesFragment_GeneratedInjector, RetroAchievementsPreferencesFragment_GeneratedInjector, RomsPreferencesFragment_GeneratedInjector, SaveFilesPreferencesFragment_GeneratedInjector, SystemPreferencesFragment_GeneratedInjector, VideoPreferencesFragment_GeneratedInjector {

    /* renamed from: a  reason: collision with root package name */
    public final g f12657a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12658b;

    public d(g gVar, c cVar, a aVar) {
        this.f12657a = gVar;
        this.f12658b = aVar;
    }

    @Override // me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment_GeneratedInjector
    public final void a(SystemPreferencesFragment systemPreferencesFragment) {
        g gVar = this.f12657a;
        sd.i iVar = (sd.i) gVar.C.get();
        systemPreferencesFragment.getClass();
        sd.d dVar = (sd.d) gVar.f12681t.get();
        systemPreferencesFragment.Y = (x1) gVar.D.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment_GeneratedInjector
    public final void b(SaveFilesPreferencesFragment saveFilesPreferencesFragment) {
        g gVar = this.f12657a;
        saveFilesPreferencesFragment.Z = (sd.i) gVar.C.get();
        saveFilesPreferencesFragment.f9604b0 = (sd.d) gVar.f12681t.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment_GeneratedInjector
    public final void c(FirmwarePreferencesFragment firmwarePreferencesFragment) {
        g gVar = this.f12657a;
        firmwarePreferencesFragment.Z = (sd.i) gVar.C.get();
        firmwarePreferencesFragment.f9589b0 = (sd.d) gVar.f12681t.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment_GeneratedInjector
    public final void d(InputPreferencesFragment inputPreferencesFragment) {
        inputPreferencesFragment.Y = (ce.c) this.f12657a.E.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment_GeneratedInjector
    public final void e(CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment) {
        g gVar = this.f12657a;
        customFirmwarePreferencesFragment.f9585b0 = (sd.i) gVar.C.get();
        customFirmwarePreferencesFragment.f9586c0 = (sd.d) gVar.f12681t.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment_GeneratedInjector
    public final void f(GeneralPreferencesFragment generalPreferencesFragment) {
        g gVar = this.f12657a;
        generalPreferencesFragment.Z = (sd.i) gVar.C.get();
        generalPreferencesFragment.f9590b0 = (sd.d) gVar.f12681t.get();
        generalPreferencesFragment.f9591c0 = (x1) gVar.D.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment_GeneratedInjector
    public final void g(VideoPreferencesFragment videoPreferencesFragment) {
        g gVar = this.f12657a;
        videoPreferencesFragment.Z = (sd.i) gVar.C.get();
        videoPreferencesFragment.f9616b0 = (sd.d) gVar.f12681t.get();
        b1 b1Var = (b1) gVar.F.get();
        cf.d dVar = (cf.d) gVar.f12675n.get();
    }

    @Override // me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment_GeneratedInjector
    public final void h(RomsPreferencesFragment romsPreferencesFragment) {
        g gVar = this.f12657a;
        romsPreferencesFragment.f9601b0 = (sd.i) gVar.C.get();
        romsPreferencesFragment.f9602c0 = (sd.d) gVar.f12681t.get();
    }
}
