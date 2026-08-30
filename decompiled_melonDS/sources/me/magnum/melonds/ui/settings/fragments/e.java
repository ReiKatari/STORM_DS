package me.magnum.melonds.ui.settings.fragments;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ BasePreferenceFragment B;

    public /* synthetic */ e(BasePreferenceFragment basePreferenceFragment, int i2) {
        this.A = i2;
        this.B = basePreferenceFragment;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = (CustomFirmwarePreferencesFragment) this.B;
                sd.i iVar = customFirmwarePreferencesFragment.f9585b0;
                if (iVar != null) {
                    sd.d dVar = customFirmwarePreferencesFragment.f9586c0;
                    if (dVar != null) {
                        return new ci.k(customFirmwarePreferencesFragment, iVar, dVar);
                    }
                    nc.k.f("directoryAccessValidator");
                    throw null;
                }
                nc.k.f("uriPermissionManager");
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                FirmwarePreferencesFragment firmwarePreferencesFragment = (FirmwarePreferencesFragment) this.B;
                sd.i iVar2 = firmwarePreferencesFragment.Z;
                if (iVar2 != null) {
                    sd.d dVar2 = firmwarePreferencesFragment.f9589b0;
                    if (dVar2 != null) {
                        return new ci.k(firmwarePreferencesFragment, iVar2, dVar2);
                    }
                    nc.k.f("directoryAccessValidator");
                    throw null;
                }
                nc.k.f("uriPermissionManager");
                throw null;
            case 2:
                GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) this.B;
                sd.i iVar3 = generalPreferencesFragment.Z;
                if (iVar3 != null) {
                    sd.d dVar3 = generalPreferencesFragment.f9590b0;
                    if (dVar3 != null) {
                        return new ci.k(generalPreferencesFragment, iVar3, dVar3);
                    }
                    nc.k.f("directoryAccessValidator");
                    throw null;
                }
                nc.k.f("uriPermissionManager");
                throw null;
            case 3:
                RomsPreferencesFragment romsPreferencesFragment = (RomsPreferencesFragment) this.B;
                sd.i iVar4 = romsPreferencesFragment.f9601b0;
                if (iVar4 != null) {
                    sd.d dVar4 = romsPreferencesFragment.f9602c0;
                    if (dVar4 != null) {
                        return new ci.k(romsPreferencesFragment, iVar4, dVar4);
                    }
                    nc.k.f("directoryAccessValidator");
                    throw null;
                }
                nc.k.f("uriPermissionManager");
                throw null;
            case 4:
                SaveFilesPreferencesFragment saveFilesPreferencesFragment = (SaveFilesPreferencesFragment) this.B;
                sd.i iVar5 = saveFilesPreferencesFragment.Z;
                if (iVar5 != null) {
                    sd.d dVar5 = saveFilesPreferencesFragment.f9604b0;
                    if (dVar5 != null) {
                        return new ci.k(saveFilesPreferencesFragment, iVar5, dVar5);
                    }
                    nc.k.f("directoryAccessValidator");
                    throw null;
                }
                nc.k.f("uriPermissionManager");
                throw null;
            default:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) this.B;
                sd.i iVar6 = videoPreferencesFragment.Z;
                if (iVar6 != null) {
                    sd.d dVar6 = videoPreferencesFragment.f9616b0;
                    if (dVar6 != null) {
                        return new ci.k(videoPreferencesFragment, iVar6, dVar6);
                    }
                    nc.k.f("directoryAccessValidator");
                    throw null;
                }
                nc.k.f("uriPermissionManager");
                throw null;
        }
    }
}
