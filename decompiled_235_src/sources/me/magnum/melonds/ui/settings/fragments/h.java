package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.view.View;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                VideoPreferencesFragment videoPreferencesFragment = (VideoPreferencesFragment) obj;
                ((ac) obj2).dismiss();
                Context requireContext = videoPreferencesFragment.requireContext();
                requireContext.getClass();
                hv.L(bl2.C(videoPreferencesFragment), null, null, new VideoPreferencesFragment$scanAndImportRetroArchShaders$1(requireContext, videoPreferencesFragment, null), 3);
                return;
            default:
                int i2 = VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder.A;
                ((VideoPreferencesFragment.ShaderBrowserAdapter) obj2).e.g((VideoPreferencesFragment.ShaderBrowserItem) obj);
                return;
        }
    }
}
