package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ij5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ij5 {
    public static /* synthetic */ Font.Builder e(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ScrollCaptureTarget j(te teVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(teVar, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView l(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean q(View view) {
        return view instanceof SplashScreenView;
    }
}
