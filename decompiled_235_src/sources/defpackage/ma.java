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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ma {
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

    public static /* synthetic */ ExtensionSessionConfiguration f(int i, ArrayList arrayList, pi piVar, CameraExtensionSession$StateCallback cameraExtensionSession$StateCallback) {
        return new ExtensionSessionConfiguration(i, arrayList, piVar, cameraExtensionSession$StateCallback);
    }

    public static /* synthetic */ InputConfiguration g(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo h(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* bridge */ /* synthetic */ TranslationRequestValue j(fp fpVar) {
        return TranslationRequestValue.forText(fpVar);
    }

    public static /* bridge */ /* synthetic */ TranslationResponseValue k(ViewTranslationResponse viewTranslationResponse) {
        return viewTranslationResponse.getValue("android:text");
    }

    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationRequest m(ViewTranslationRequest.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ CharSequence o(TranslationResponseValue translationResponseValue) {
        return translationResponseValue.getText();
    }

    public static /* bridge */ /* synthetic */ Class p() {
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
