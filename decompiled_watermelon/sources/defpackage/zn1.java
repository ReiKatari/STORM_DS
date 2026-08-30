package defpackage;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zn1  reason: default package */
/* loaded from: classes.dex */
public abstract class zn1 {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
