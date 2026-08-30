package me.magnum.melonds.ui.settings.fragments;

import android.content.DialogInterface;
import android.text.format.Formatter;
import android.widget.Toast;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ VideoPreferencesFragment B;

    public /* synthetic */ j(VideoPreferencesFragment videoPreferencesFragment, int i) {
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
                            String formatShortFileSize = Formatter.formatShortFileSize(videoPreferencesFragment.requireContext(), videoPreferencesFragment.o().f());
                            sb sbVar = new sb(videoPreferencesFragment.requireContext());
                            ((pb) sbVar.L).f = videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall_confirm, formatShortFileSize);
                            sbVar.z(R.string.video_retroarch_shader_uninstall, new j(videoPreferencesFragment, 1));
                            sbVar.x(17039360, null);
                            sbVar.C();
                            return;
                        }
                        return;
                    }
                    videoPreferencesFragment.A();
                    return;
                }
                Toast.makeText(videoPreferencesFragment.requireContext(), (int) R.string.video_retroarch_shader_checking_updates, 0).show();
                tq5.w(hk2.y(videoPreferencesFragment), null, null, new VideoPreferencesFragment$checkShaderUpdates$1(videoPreferencesFragment, null), 3);
                return;
            default:
                tq5.w(hk2.y(videoPreferencesFragment), null, null, new VideoPreferencesFragment$confirmShaderUninstall$1$1(videoPreferencesFragment, null), 3);
                return;
        }
    }
}
