package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.o;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragment extends o implements q15 {
    @Override // defpackage.q15
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
        composeView.setViewCompositionStrategy(cs1.p0);
        composeView.setContent(ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.b);
        return composeView;
    }
}
