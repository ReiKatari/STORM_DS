package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RetroAchievementsProfilePreference extends Preference {
    public final tj4 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsProfilePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = me2.G(null);
        setLayoutResource(R.layout.preference_retroachievements_profile);
        setSelectable(false);
        setVisible(false);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        ComposeView composeView;
        vs4Var.getClass();
        super.onBindViewHolder(vs4Var);
        View view = vs4Var.a;
        if (view instanceof ComposeView) {
            composeView = (ComposeView) view;
        } else {
            composeView = null;
        }
        if (composeView == null) {
            return;
        }
        composeView.setViewCompositionStrategy(y60.D0);
        composeView.setContent(new et0(-1262964841, true, new sd5(this, 0)));
    }
}
