package c6;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f2615a = new String[0];

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i2;
        int i10;
        CharSequence subSequence;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i11 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        int i12 = editorInfo.initialSelStart;
        int i13 = editorInfo.initialSelEnd;
        if (i12 > i13) {
            i2 = i13;
        } else {
            i2 = i12;
        }
        if (i12 <= i13) {
            i12 = i13;
        }
        int length = charSequence.length();
        if (i2 >= 0 && i12 <= length) {
            int i14 = editorInfo.inputType & 4095;
            if (i14 != 129 && i14 != 225 && i14 != 18) {
                if (length <= 2048) {
                    c(editorInfo, charSequence, i2, i12);
                    return;
                }
                int i15 = i12 - i2;
                if (i15 > 1024) {
                    i10 = 0;
                } else {
                    i10 = i15;
                }
                int i16 = 2048 - i10;
                int min = Math.min(charSequence.length() - i12, i16 - Math.min(i2, (int) (i16 * 0.8d)));
                int min2 = Math.min(i2, i16 - min);
                int i17 = i2 - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i17))) {
                    i17++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i12 + min) - 1))) {
                    min--;
                }
                int i18 = min2 + i10;
                int i19 = i18 + min;
                if (i10 != i15) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i17, i17 + min2), charSequence.subSequence(i12, min + i12));
                } else {
                    subSequence = charSequence.subSequence(i17, i19 + i17);
                }
                c(editorInfo, subSequence, min2, i18);
                return;
            }
            c(editorInfo, null, 0, 0);
            return;
        }
        c(editorInfo, null, 0, 0);
    }

    public static void b(EditorInfo editorInfo, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z10);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence, int i2, int i10) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }
}
