package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.j0;
import b4.b2;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragment extends j0 implements ci.l {
    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.soft_input_behaviour);
        string.getClass();
        return string;
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(b2.B);
        composeView.setContent(ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.f9584b);
        return composeView;
    }
}
