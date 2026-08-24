package me.magnum.melonds.ui.settings.fragments;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements qn2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ VideoPreferencesFragment.ShaderBrowserAdapter B;
    public final /* synthetic */ VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder L;

    public /* synthetic */ l(String str, VideoPreferencesFragment.ShaderBrowserAdapter shaderBrowserAdapter, VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder viewHolder) {
        this.A = str;
        this.B = shaderBrowserAdapter;
        this.L = viewHolder;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        String str;
        boolean z;
        RecyclerView recyclerView;
        wf5 adapter;
        int K;
        ep5 ep5Var = (ep5) obj;
        int i = VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder.A;
        ep5Var.getClass();
        int i2 = ep5Var.a;
        VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder viewHolder = this.L;
        wf5 wf5Var = viewHolder.s;
        TextView textView = viewHolder.x;
        TextView textView2 = viewHolder.w;
        int i3 = -1;
        if (wf5Var != null && (recyclerView = viewHolder.r) != null && (adapter = recyclerView.getAdapter()) != null && (K = viewHolder.r.K(viewHolder)) != -1 && viewHolder.s == adapter) {
            i3 = K;
        }
        VideoPreferencesFragment.ShaderBrowserItem shaderBrowserItem = (VideoPreferencesFragment.ShaderBrowserItem) gt0.K0(i3, this.B.f);
        if (shaderBrowserItem != null) {
            str = shaderBrowserItem.b;
        } else {
            str = null;
        }
        boolean k = nb3.k(this.A, str);
        jg7 jg7Var = jg7.a;
        if (k) {
            int i4 = 0;
            textView2.setVisibility(0);
            textView2.setText(viewHolder.a.getContext().getResources().getQuantityString(R.plurals.video_retroarch_shader_browser_passes, i2, Integer.valueOf(i2)));
            if (((i2 * 40) + ((ep5Var.b * 15) / 100)) * 2 >= 60000) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i4 = 8;
            }
            textView.setVisibility(i4);
            if (z) {
                textView.setText(R.string.video_retroarch_shader_browser_slow);
            }
        }
        return jg7Var;
    }
}
