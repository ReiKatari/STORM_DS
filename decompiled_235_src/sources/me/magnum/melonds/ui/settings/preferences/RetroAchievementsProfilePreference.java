package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsProfilePreference extends Preference {
    public final vs4 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsProfilePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = np2.Y(null);
        setLayoutResource(R.layout.preference_retroachievements_profile);
        setSelectable(false);
        setVisible(false);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        ComposeView composeView;
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View view = x15Var.a;
        if (view instanceof ComposeView) {
            composeView = (ComposeView) view;
        } else {
            composeView = null;
        }
        if (composeView == null) {
            return;
        }
        composeView.setViewCompositionStrategy(cs1.p0);
        composeView.setContent(new zv0(-1262964841, true, new nn5(this, 0)));
    }
}
