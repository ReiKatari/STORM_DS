package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z05  reason: default package */
/* loaded from: classes.dex */
public final class z05 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference A;

    public z05(Preference preference) {
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
