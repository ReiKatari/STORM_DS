package defpackage;

import android.graphics.BitmapRegionDecoder;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dd  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class dd {
    public static /* bridge */ /* synthetic */ Class B() {
        return CameraExtensionSession.class;
    }

    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ BitmapRegionDecoder c(InputStream inputStream) {
        return BitmapRegionDecoder.newInstance(inputStream);
    }

    public static /* bridge */ /* synthetic */ CameraExtensionCharacteristics e(Object obj) {
        return (CameraExtensionCharacteristics) obj;
    }

    public static /* bridge */ /* synthetic */ CameraExtensionSession f(Object obj) {
        return (CameraExtensionSession) obj;
    }

    public static /* synthetic */ ExtensionSessionConfiguration g(int i, ArrayList arrayList, di diVar, CameraExtensionSession$StateCallback cameraExtensionSession$StateCallback) {
        return new ExtensionSessionConfiguration(i, arrayList, diVar, cameraExtensionSession$StateCallback);
    }

    public static /* synthetic */ InputConfiguration h(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo i(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* bridge */ /* synthetic */ TranslationRequestValue k(to toVar) {
        return TranslationRequestValue.forText(toVar);
    }

    public static /* bridge */ /* synthetic */ TranslationResponseValue l(ViewTranslationResponse viewTranslationResponse) {
        return viewTranslationResponse.getValue("android:text");
    }

    public static /* synthetic */ ViewTranslationRequest.Builder m(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationRequest n(ViewTranslationRequest.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse o(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ CharSequence p(TranslationResponseValue translationResponseValue) {
        return translationResponseValue.getText();
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return CameraExtensionCharacteristics.class;
    }

    public static /* bridge */ /* synthetic */ Map s(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ void y(ViewTranslationRequest.Builder builder, TranslationRequestValue translationRequestValue) {
        builder.setValue("android:text", translationRequestValue);
    }
}
