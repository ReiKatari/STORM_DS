package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dr5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class dr5 {
    public static /* synthetic */ Font.Builder d(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ScrollCaptureTarget h(ee eeVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(eeVar, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView j(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean n(View view) {
        return view instanceof SplashScreenView;
    }
}
