package me.magnum.melonds.ui.settings.fragments;

import android.widget.TextView;
import androidx.preference.ListPreference;
import java.util.LinkedHashMap;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements qn2 {
    public final /* synthetic */ VideoPreferencesFragment A;
    public final /* synthetic */ ListPreference B;
    public final /* synthetic */ ac L;
    public final /* synthetic */ dh5 R;
    public final /* synthetic */ VideoPreferencesFragment.ShaderDirectoryLister X;
    public final /* synthetic */ LinkedHashMap Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ TextView d0;
    public final /* synthetic */ dh5 e0;

    public /* synthetic */ d(VideoPreferencesFragment videoPreferencesFragment, ListPreference listPreference, ac acVar, dh5 dh5Var, VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister, LinkedHashMap linkedHashMap, TextView textView, TextView textView2, dh5 dh5Var2) {
        this.A = videoPreferencesFragment;
        this.B = listPreference;
        this.L = acVar;
        this.R = dh5Var;
        this.X = shaderDirectoryLister;
        this.Y = linkedHashMap;
        this.Z = textView;
        this.d0 = textView2;
        this.e0 = dh5Var2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        VideoPreferencesFragment.ShaderBrowserItem shaderBrowserItem = (VideoPreferencesFragment.ShaderBrowserItem) obj;
        shaderBrowserItem.getClass();
        boolean z = shaderBrowserItem.c;
        String str = shaderBrowserItem.b;
        if (z) {
            VideoPreferencesFragment.z(this.R, this.A, this.X, this.Y, this.Z, this.d0, this.e0, str);
        } else {
            ListPreference listPreference = this.B;
            listPreference.h(str);
            listPreference.g(new String[]{str});
            listPreference.d0 = new String[]{str};
            listPreference.setSummary(str);
            this.L.dismiss();
        }
        return jg7.a;
    }
}
