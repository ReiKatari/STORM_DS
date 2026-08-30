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
import java.util.Set;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class BiosDirectoryPickerPreference extends StoragePickerPreference {
    public ConsoleType Y;
    public CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 Z;
    public hw0 c0;
    public ImageView d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiosDirectoryPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWidgetLayoutResource(R.layout.preference_directory_picker_status);
        StoragePickerPreference.a aVar = StoragePickerPreference.a.DIRECTORY;
        aVar.getClass();
        this.B = aVar;
        nm4 nm4Var = nm4.READ_WRITE;
        nm4Var.getClass();
        this.L = nm4Var;
        this.R = true;
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void e(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, rx4.a, 0, 0);
        obtainStyledAttributes.getClass();
        e12 entries = ConsoleType.getEntries();
        if (obtainStyledAttributes.hasValue(0)) {
            this.Y = (ConsoleType) ((f12) entries).get(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            return;
        }
        i.i("Attribute not defined in set.");
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
        hw0 hw0Var;
        ImageView imageView = this.d0;
        if (imageView != null) {
            if (!isEnabled()) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            if (isEnabled() && (hw0Var = this.c0) != null) {
                int i2 = n20.a[hw0Var.b.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ViewParent parent = imageView.getParent();
                            parent.getClass();
                            ((View) parent).setVisibility(0);
                            imageView.setImageResource(R.drawable.ic_status_error);
                            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.statusError)));
                        } else {
                            i.c();
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
                imageView.setOnClickListener(new dq1(this, hw0Var, imageView, 2));
            }
        }
    }

    public final void h(Uri uri) {
        hw0 hw0Var;
        boolean isEnabled = isEnabled();
        ImageView imageView = this.d0;
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
            l62 l62Var = ((y41) customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1.a.Z.getValue()).b;
            l62Var.getClass();
            int i = iw0.a[consoleType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    hw0Var = l62Var.a(ConsoleType.DSi, uri);
                } else {
                    i.c();
                    return;
                }
            } else {
                hw0Var = l62Var.a(ConsoleType.DS, uri);
            }
        } else {
            hw0Var = null;
        }
        this.c0 = hw0Var;
        g();
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
        Uri uri;
        a();
        Set<String> persistedStringSet = getPersistedStringSet(up1.A);
        persistedStringSet.getClass();
        String str = (String) tq0.L0(persistedStringSet);
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        h(uri);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        vs4Var.getClass();
        super.onBindViewHolder(vs4Var);
        View q = vs4Var.q(R.id.imageViewStatus);
        q.getClass();
        this.d0 = (ImageView) q;
        g();
    }

    @Override // androidx.preference.Preference
    public final void onDependencyChanged(Preference preference, boolean z) {
        int i;
        preference.getClass();
        super.onDependencyChanged(preference, z);
        ImageView imageView = this.d0;
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
