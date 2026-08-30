package a6;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ int D(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static /* bridge */ /* synthetic */ int b(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static /* bridge */ /* synthetic */ ClipData c(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static /* synthetic */ ContentInfo.Builder g(ClipData clipData, int i2) {
        return new ContentInfo.Builder(clipData, i2);
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(ContentInfo.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ ContentInfo i(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession j(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget k(b4.x xVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(xVar, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder p(AutofillId autofillId, long j2) {
        return new ViewTranslationRequest.Builder(autofillId, j2);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse r(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ void v(ContentInfo.Builder builder, int i2) {
        builder.setFlags(i2);
    }

    public static /* bridge */ /* synthetic */ void w(ContentInfo.Builder builder, Uri uri) {
        builder.setLinkUri(uri);
    }

    public static /* bridge */ /* synthetic */ void x(ContentInfo.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
