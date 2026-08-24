package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.util.Set;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class BiosDirectoryPickerPreference extends StoragePickerPreference {
    public ConsoleType Y;
    public CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 Z;
    public dz0 d0;
    public ImageView e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiosDirectoryPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWidgetLayoutResource(R.layout.preference_directory_picker_status);
        StoragePickerPreference.a aVar = StoragePickerPreference.a.DIRECTORY;
        aVar.getClass();
        this.B = aVar;
        sv4 sv4Var = sv4.READ_WRITE;
        sv4Var.getClass();
        this.L = sv4Var;
        this.R = true;
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void e(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, c75.a, 0, 0);
        obtainStyledAttributes.getClass();
        t52 entries = ConsoleType.getEntries();
        if (obtainStyledAttributes.hasValue(0)) {
            this.Y = (ConsoleType) ((u52) entries).get(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            return;
        }
        i.h("Attribute not defined in set.");
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void f(Uri uri) {
        super.f(uri);
        if (uri == null) {
            return;
        }
        h(uri);
    }

    public final void g() {
        int i;
        dz0 dz0Var;
        ImageView imageView = this.e0;
        if (imageView != null) {
            if (!isEnabled()) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            if (isEnabled() && (dz0Var = this.d0) != null) {
                int i2 = i40.a[dz0Var.b.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ViewParent parent = imageView.getParent();
                            parent.getClass();
                            ((View) parent).setVisibility(0);
                            imageView.setImageResource(R.drawable.ic_status_error);
                            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.statusError)));
                        } else {
                            i.d();
                            return;
                        }
                    } else {
                        ViewParent parent2 = imageView.getParent();
                        parent2.getClass();
                        ((View) parent2).setVisibility(0);
                        imageView.setImageResource(R.drawable.ic_status_warn);
                        imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.statusWarn)));
                    }
                } else {
                    ViewParent parent3 = imageView.getParent();
                    parent3.getClass();
                    ((View) parent3).setVisibility(8);
                }
                imageView.setOnClickListener(new ru1(this, dz0Var, imageView, 2));
            }
        }
    }

    public final void h(Uri uri) {
        dz0 dz0Var;
        boolean isEnabled = isEnabled();
        ImageView imageView = this.e0;
        if (!isEnabled) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 = this.Z;
        if (customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 != null) {
            ConsoleType consoleType = this.Y;
            consoleType.getClass();
            fb2 fb2Var = ((k81) customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1.a.Z.getValue()).b;
            fb2Var.getClass();
            int i = ez0.a[consoleType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    dz0Var = fb2Var.a(ConsoleType.DSi, uri);
                } else {
                    i.d();
                    return;
                }
            } else {
                dz0Var = fb2Var.a(ConsoleType.DS, uri);
            }
        } else {
            dz0Var = null;
        }
        this.d0 = dz0Var;
        g();
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
        Uri uri;
        a();
        Set<String> persistedStringSet = getPersistedStringSet(du1.A);
        persistedStringSet.getClass();
        String str = (String) gt0.I0(persistedStringSet);
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        h(uri);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View q = x15Var.q(R.id.imageViewStatus);
        q.getClass();
        this.e0 = (ImageView) q;
        g();
    }

    @Override // androidx.preference.Preference
    public final void onDependencyChanged(Preference preference, boolean z) {
        int i;
        preference.getClass();
        super.onDependencyChanged(preference, z);
        ImageView imageView = this.e0;
        if (imageView != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }
}
