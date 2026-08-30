package d2;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectRangeGesture;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder l(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder m(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture n(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture o(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture p(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
