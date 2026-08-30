package a6;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g2 {
    public static /* bridge */ /* synthetic */ Class A() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ InsertGesture j(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture k(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture l(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture m(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }
}
