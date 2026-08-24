package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StoragePickerPreference extends Preference {
    public boolean A;
    public a B;
    public sv4 L;
    public boolean R;
    public String X;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FILE = new a("FILE", 0);
        public static final a DIRECTORY = new a("DIRECTORY", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{FILE, DIRECTORY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
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
        this.L = sv4.READ;
        this.R = false;
        this.X = null;
        e(attributeSet);
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, c75.b, 0, 0);
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
                    this.B = (a) ((u52) a.getEntries()).get(obtainStyledAttributes.getInt(4, 0));
                } else if (index == 1) {
                    this.L = (sv4) ((u52) sv4.getEntries()).get(obtainStyledAttributes.getInt(1, 0));
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
            Set<String> persistedStringSet = getPersistedStringSet(du1.A);
            if (persistedStringSet != null) {
                linkedHashSet = gt0.o1(persistedStringSet);
            } else {
                linkedHashSet = new LinkedHashSet();
            }
            if (this.A) {
                linkedHashSet.add(uri2);
            } else {
                linkedHashSet = ii2.G(uri2);
            }
            Set<String> o1 = gt0.o1(linkedHashSet);
            if (isPersistent()) {
                persistStringSet(o1);
            }
            x05 onPreferenceChangeListener = getOnPreferenceChangeListener();
            if (onPreferenceChangeListener != null) {
                onPreferenceChangeListener.a(this, o1);
            }
        }
    }
}
