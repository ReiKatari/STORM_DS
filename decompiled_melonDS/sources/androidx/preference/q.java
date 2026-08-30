package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference A;

    public q(Preference preference) {
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
