package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uh */
/* loaded from: classes.dex */
public abstract /* synthetic */ class uh {
    public static /* bridge */ /* synthetic */ Class A() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key g() {
        return CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
    }

    public static /* bridge */ /* synthetic */ CaptureRequest.Key h() {
        return CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder i(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder j(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ Object l(so0 so0Var, Class cls) {
        return so0Var.get(cls);
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DeleteRangeGesture.class;
    }
}
