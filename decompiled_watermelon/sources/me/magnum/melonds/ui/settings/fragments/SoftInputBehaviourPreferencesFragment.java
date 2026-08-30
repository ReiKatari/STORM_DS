package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.o;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragment extends o implements os4 {
    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.soft_input_behaviour);
        string.getClass();
        return string;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(y60.D0);
        composeView.setContent(ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.b);
        return composeView;
    }
}
