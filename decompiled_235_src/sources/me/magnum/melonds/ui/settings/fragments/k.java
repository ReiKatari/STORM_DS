package me.magnum.melonds.ui.settings.fragments;

import android.content.DialogInterface;
import android.text.format.Formatter;
import android.widget.Toast;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ VideoPreferencesFragment B;

    public /* synthetic */ k(VideoPreferencesFragment videoPreferencesFragment, int i) {
        this.A = i;
        this.B = videoPreferencesFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        VideoPreferencesFragment videoPreferencesFragment = this.B;
        switch (i2) {
            case 0:
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            String formatShortFileSize = Formatter.formatShortFileSize(videoPreferencesFragment.requireContext(), videoPreferencesFragment.p().f());
                            zb zbVar = new zb(videoPreferencesFragment.requireContext());
                            ((wb) zbVar.L).f = videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall_confirm, formatShortFileSize);
                            zbVar.y(R.string.video_retroarch_shader_uninstall, new k(videoPreferencesFragment, 1));
                            zbVar.x(17039360, null);
                            zbVar.B();
                            return;
                        }
                        return;
                    }
                    videoPreferencesFragment.D();
                    return;
                }
                Toast.makeText(videoPreferencesFragment.requireContext(), (int) R.string.video_retroarch_shader_checking_updates, 0).show();
                hv.L(bl2.C(videoPreferencesFragment), null, null, new VideoPreferencesFragment$checkShaderUpdates$1(videoPreferencesFragment, null), 3);
                return;
            default:
                hv.L(bl2.C(videoPreferencesFragment), null, null, new VideoPreferencesFragment$confirmShaderUninstall$1$1(videoPreferencesFragment, null), 3);
                return;
        }
    }
}
