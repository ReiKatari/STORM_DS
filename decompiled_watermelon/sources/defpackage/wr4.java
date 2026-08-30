package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wr4  reason: default package */
/* loaded from: classes.dex */
public final class wr4 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference A;

    public wr4(Preference preference) {
        this.A = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A;
        CharSequence summary = preference.getSummary();
        if (preference.isCopyingEnabled() && !TextUtils.isEmpty(summary)) {
            contextMenu.setHeaderTitle(summary);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A;
        CharSequence summary = preference.getSummary();
        ((ClipboardManager) preference.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", summary));
        Toast.makeText(preference.getContext(), preference.getContext().getString(R.string.preference_copied, summary), 0).show();
        return true;
    }
}
