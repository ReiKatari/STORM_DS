package me.magnum.melonds.ui.settings.fragments;

import android.widget.TextView;
import androidx.preference.ListPreference;
import java.util.LinkedHashMap;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mi2 {
    public final /* synthetic */ VideoPreferencesFragment A;
    public final /* synthetic */ ListPreference B;
    public final /* synthetic */ tb L;
    public final /* synthetic */ n75 R;
    public final /* synthetic */ VideoPreferencesFragment.ShaderDirectoryLister X;
    public final /* synthetic */ LinkedHashMap Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ TextView c0;
    public final /* synthetic */ n75 d0;

    public /* synthetic */ c(VideoPreferencesFragment videoPreferencesFragment, ListPreference listPreference, tb tbVar, n75 n75Var, VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister, LinkedHashMap linkedHashMap, TextView textView, TextView textView2, n75 n75Var2) {
        this.A = videoPreferencesFragment;
        this.B = listPreference;
        this.L = tbVar;
        this.R = n75Var;
        this.X = shaderDirectoryLister;
        this.Y = linkedHashMap;
        this.Z = textView;
        this.c0 = textView2;
        this.d0 = n75Var2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        VideoPreferencesFragment.ShaderBrowserItem shaderBrowserItem = (VideoPreferencesFragment.ShaderBrowserItem) obj;
        shaderBrowserItem.getClass();
        boolean z = shaderBrowserItem.c;
        String str = shaderBrowserItem.b;
        if (z) {
            VideoPreferencesFragment.w(this.R, this.A, this.X, this.Y, this.Z, this.c0, this.d0, str);
        } else {
            ListPreference listPreference = this.B;
            listPreference.h(str);
            listPreference.g(new String[]{str});
            listPreference.c0 = new String[]{str};
            listPreference.setSummary(str);
            this.L.dismiss();
        }
        return o27.a;
    }
}
