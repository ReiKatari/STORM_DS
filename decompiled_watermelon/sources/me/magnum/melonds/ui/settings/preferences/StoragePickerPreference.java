package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class StoragePickerPreference extends Preference {
    public boolean A;
    public a B;
    public nm4 L;
    public boolean R;
    public String X;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FILE = new a("FILE", 0);
        public static final a DIRECTORY = new a("DIRECTORY", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{FILE, DIRECTORY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoragePickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = false;
        this.B = a.FILE;
        this.L = nm4.READ;
        this.R = false;
        this.X = null;
        e(attributeSet);
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, rx4.b, 0, 0);
        obtainStyledAttributes.getClass();
        int indexCount = obtainStyledAttributes.getIndexCount();
        if (indexCount >= 0) {
            int i = 0;
            while (true) {
                int index = obtainStyledAttributes.getIndex(i);
                boolean z = true;
                if (index == 3) {
                    if (obtainStyledAttributes.getInt(3, 0) != 1) {
                        z = false;
                    }
                    this.A = z;
                } else if (index == 4) {
                    this.B = (a) ((f12) a.getEntries()).get(obtainStyledAttributes.getInt(4, 0));
                } else if (index == 1) {
                    this.L = (nm4) ((f12) nm4.getEntries()).get(obtainStyledAttributes.getInt(1, 0));
                } else if (index == 2) {
                    this.R = obtainStyledAttributes.getBoolean(2, false);
                } else if (index == 0) {
                    this.X = obtainStyledAttributes.getString(0);
                }
                if (i == indexCount) {
                    break;
                }
                i++;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void f(Uri uri) {
        Set linkedHashSet;
        if (uri != null) {
            String uri2 = uri.toString();
            uri2.getClass();
            Set<String> persistedStringSet = getPersistedStringSet(up1.A);
            if (persistedStringSet != null) {
                linkedHashSet = tq0.r1(persistedStringSet);
            } else {
                linkedHashSet = new LinkedHashSet();
            }
            if (this.A) {
                linkedHashSet.add(uri2);
            } else {
                linkedHashSet = hi2.J(uri2);
            }
            Set<String> r1 = tq0.r1(linkedHashSet);
            if (isPersistent()) {
                persistStringSet(r1);
            }
            ur4 onPreferenceChangeListener = getOnPreferenceChangeListener();
            if (onPreferenceChangeListener != null) {
                onPreferenceChangeListener.a(this, r1);
            }
        }
    }
}
