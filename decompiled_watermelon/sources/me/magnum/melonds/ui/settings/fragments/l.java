package me.magnum.melonds.ui.settings.fragments;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements mi2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ VideoPreferencesFragment.ShaderBrowserAdapter B;
    public final /* synthetic */ VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder L;

    public /* synthetic */ l(String str, VideoPreferencesFragment.ShaderBrowserAdapter shaderBrowserAdapter, VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder viewHolder) {
        this.A = str;
        this.B = shaderBrowserAdapter;
        this.L = viewHolder;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        String str;
        boolean z;
        RecyclerView recyclerView;
        g65 adapter;
        int K;
        if5 if5Var = (if5) obj;
        int i = VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder.A;
        if5Var.getClass();
        int i2 = if5Var.a;
        VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder viewHolder = this.L;
        g65 g65Var = viewHolder.s;
        TextView textView = viewHolder.x;
        TextView textView2 = viewHolder.w;
        int i3 = -1;
        if (g65Var != null && (recyclerView = viewHolder.r) != null && (adapter = recyclerView.getAdapter()) != null && (K = viewHolder.r.K(viewHolder)) != -1 && viewHolder.s == adapter) {
            i3 = K;
        }
        VideoPreferencesFragment.ShaderBrowserItem shaderBrowserItem = (VideoPreferencesFragment.ShaderBrowserItem) tq0.N0(i3, this.B.f);
        if (shaderBrowserItem != null) {
            str = shaderBrowserItem.b;
        } else {
            str = null;
        }
        boolean x = b53.x(this.A, str);
        o27 o27Var = o27.a;
        if (x) {
            int i4 = 0;
            textView2.setVisibility(0);
            textView2.setText(viewHolder.a.getContext().getResources().getQuantityString(R.plurals.video_retroarch_shader_browser_passes, i2, Integer.valueOf(i2)));
            if (((i2 * 40) + ((if5Var.b * 15) / 100)) * 2 >= 60000) {
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
        return o27Var;
    }
}
