package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.o;
import fc.b;
import java.util.Set;
import p7.j;
import q8.r;
import rd.n;
import sd.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class StoragePickerPreference extends Preference {
    public a A;
    public f B;
    public boolean L;
    public String R;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ fc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FILE = new a("FILE", 0);
        public static final a DIRECTORY = new a("DIRECTORY", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{FILE, DIRECTORY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = r.x($values);
        }

        private a(String str, int i2) {
        }

        public static fc.a getEntries() {
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
        this.A = a.FILE;
        this.B = f.READ;
        this.L = false;
        this.R = null;
        e(attributeSet);
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, n.f12715b, 0, 0);
        obtainStyledAttributes.getClass();
        int indexCount = obtainStyledAttributes.getIndexCount();
        if (indexCount >= 0) {
            int i2 = 0;
            while (true) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 3) {
                    obtainStyledAttributes.getInt(3, 0);
                } else if (index == 4) {
                    this.A = (a) ((b) a.getEntries()).get(obtainStyledAttributes.getInt(4, 0));
                } else if (index == 1) {
                    this.B = (f) ((b) f.getEntries()).get(obtainStyledAttributes.getInt(1, 0));
                } else if (index == 2) {
                    this.L = obtainStyledAttributes.getBoolean(2, false);
                } else if (index == 0) {
                    this.R = obtainStyledAttributes.getString(0);
                }
                if (i2 == indexCount) {
                    break;
                }
                i2++;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void f(Uri uri) {
        if (uri != null) {
            Set<String> E = j.E(uri.toString());
            if (isPersistent()) {
                persistStringSet(E);
            }
            o onPreferenceChangeListener = getOnPreferenceChangeListener();
            if (onPreferenceChangeListener != null) {
                onPreferenceChangeListener.a(this, E);
            }
        }
    }
}
