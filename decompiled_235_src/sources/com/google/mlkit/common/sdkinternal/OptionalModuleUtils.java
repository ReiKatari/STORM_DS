package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class OptionalModuleUtils {
    public static final String BARCODE = "barcode";
    public static final String BARCODE_MODULE_ID = "com.google.android.gms.vision.barcode";
    public static final String CUSTOM_ICA = "custom_ica";
    public static final String CUSTOM_ICA_MODULE_ID = "com.google.android.gms.vision.custom.ica";
    public static final String DEPRECATED_DYNAMITE_MODULE_ID = "com.google.android.gms.vision.dynamite";
    public static final String DOCSCAN_CROP_MODULE_ID = "com.google.android.gms.mlkit_docscan_crop";
    public static final String DOCSCAN_DETECT_MODULE_ID = "com.google.android.gms.mlkit_docscan_detect";
    public static final String DOCSCAN_ENHANCE_MODULE_ID = "com.google.android.gms.mlkit_docscan_enhance";
    public static final String DOCSCAN_SHADOW_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_shadow";
    public static final String DOCSCAN_STAIN_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_stain";
    public static final Feature[] EMPTY_FEATURES = new Feature[0];
    public static final String FACE = "face";
    public static final String FACE_MODULE_ID = "com.google.android.gms.vision.face";
    public static final Feature FEATURE_BARCODE;
    public static final Feature FEATURE_CUSTOM_ICA;
    public static final Feature FEATURE_DOCSCAN_CROP;
    public static final Feature FEATURE_DOCSCAN_DETECT;
    public static final Feature FEATURE_DOCSCAN_ENHANCE;
    public static final Feature FEATURE_DOCSCAN_SHADOW_REMOVAL;
    public static final Feature FEATURE_DOCSCAN_STAIN_REMOVAL;
    public static final Feature FEATURE_DOCSCAN_UI;
    public static final Feature FEATURE_FACE;
    public static final Feature FEATURE_ICA;
    public static final Feature FEATURE_IMAGE_CAPTION;
    public static final Feature FEATURE_IMAGE_QUALITY_AESTHETIC;
    public static final Feature FEATURE_IMAGE_QUALITY_TECHNICAL;
    public static final Feature FEATURE_LANGID;
    public static final Feature FEATURE_MLKIT_BARCODE_UI;
    public static final Feature FEATURE_NLCLASSIFIER;
    public static final Feature FEATURE_OCR;
    public static final Feature FEATURE_OCR_CHINESE;
    public static final Feature FEATURE_OCR_COMMON;
    public static final Feature FEATURE_OCR_DEVANAGARI;
    public static final Feature FEATURE_OCR_JAPANESE;
    public static final Feature FEATURE_OCR_KOREAN;
    public static final Feature FEATURE_SMART_REPLY;
    public static final Feature FEATURE_SUBJECT_SEGMENTATION;
    public static final Feature FEATURE_TFLITE_DYNAMITE;
    public static final String ICA = "ica";
    public static final String ICA_MODULE_ID = "com.google.android.gms.vision.ica";
    public static final String IMAGE_CAPTION_MODULE_ID = "com.google.android.gms.mlkit_image_caption";
    public static final String IMAGE_QUALITY_AESTHETIC_MODULE_ID = "com.google.android.gms.mlkit_quality_aesthetic";
    public static final String IMAGE_QUALITY_TECHNICAL_MODULE_ID = "com.google.android.gms.mlkit_quality_technical";
    public static final String LANGID = "langid";
    public static final String LANGID_MODULE_ID = "com.google.android.gms.mlkit.langid";
    public static final String MLKIT_BARCODE_UI = "barcode_ui";
    public static final String NLCLASSIFIER = "nlclassifier";
    public static final String NLCLASSIFIER_MODULE_ID = "com.google.android.gms.mlkit.nlclassifier";
    public static final String OCR = "ocr";
    public static final String OCR_CHINESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_chinese";
    public static final String OCR_COMMON_MODULE_ID = "com.google.android.gms.mlkit_ocr_common";
    public static final String OCR_DEVANAGARI_MODULE_ID = "com.google.android.gms.mlkit_ocr_devanagari";
    public static final String OCR_JAPANESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_japanese";
    public static final String OCR_KOREAN_MODULE_ID = "com.google.android.gms.mlkit_ocr_korean";
    public static final String OCR_MODULE_ID = "com.google.android.gms.vision.ocr";
    public static final String SMART_REPLY = "smart_reply";
    public static final String SMART_REPLY_MODULE_ID = "com.google.android.gms.mlkit_smartreply";
    public static final String SUBJECT_SEGMENTATION_MODULE_ID = "com.google.android.gms.mlkit_subject_segmentation";
    public static final String TFLITE_DYNAMITE = "tflite_dynamite";
    public static final String TFLITE_DYNAMITE_MODULE_ID = "com.google.android.gms.tflite_dynamite";
    private static final zzai zza;
    private static final zzai zzb;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        FEATURE_BARCODE = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        FEATURE_CUSTOM_ICA = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        FEATURE_FACE = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        FEATURE_ICA = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        FEATURE_OCR = feature5;
        FEATURE_OCR_CHINESE = new Feature("mlkit.ocr.chinese", 1L);
        FEATURE_OCR_COMMON = new Feature("mlkit.ocr.common", 1L);
        FEATURE_OCR_DEVANAGARI = new Feature("mlkit.ocr.devanagari", 1L);
        FEATURE_OCR_JAPANESE = new Feature("mlkit.ocr.japanese", 1L);
        FEATURE_OCR_KOREAN = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        FEATURE_LANGID = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        FEATURE_NLCLASSIFIER = feature7;
        Feature feature8 = new Feature(TFLITE_DYNAMITE, 1L);
        FEATURE_TFLITE_DYNAMITE = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        FEATURE_MLKIT_BARCODE_UI = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        FEATURE_SMART_REPLY = feature10;
        FEATURE_IMAGE_CAPTION = new Feature("mlkit.image.caption", 1L);
        FEATURE_DOCSCAN_DETECT = new Feature("mlkit.docscan.detect", 1L);
        FEATURE_DOCSCAN_CROP = new Feature("mlkit.docscan.crop", 1L);
        FEATURE_DOCSCAN_ENHANCE = new Feature("mlkit.docscan.enhance", 1L);
        FEATURE_DOCSCAN_UI = new Feature("mlkit.docscan.ui", 1L);
        FEATURE_DOCSCAN_STAIN_REMOVAL = new Feature("mlkit.docscan.stain", 1L);
        FEATURE_DOCSCAN_SHADOW_REMOVAL = new Feature("mlkit.docscan.shadow", 1L);
        FEATURE_IMAGE_QUALITY_AESTHETIC = new Feature("mlkit.quality.aesthetic", 1L);
        FEATURE_IMAGE_QUALITY_TECHNICAL = new Feature("mlkit.quality.technical", 1L);
        FEATURE_SUBJECT_SEGMENTATION = new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza(BARCODE, feature);
        zzahVar.zza(CUSTOM_ICA, feature2);
        zzahVar.zza(FACE, feature3);
        zzahVar.zza(ICA, feature4);
        zzahVar.zza(OCR, feature5);
        zzahVar.zza(LANGID, feature6);
        zzahVar.zza(NLCLASSIFIER, feature7);
        zzahVar.zza(TFLITE_DYNAMITE, feature8);
        zzahVar.zza(MLKIT_BARCODE_UI, feature9);
        zzahVar.zza(SMART_REPLY, feature10);
        zza = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza(BARCODE_MODULE_ID, feature);
        zzahVar2.zza(CUSTOM_ICA_MODULE_ID, feature2);
        zzahVar2.zza(FACE_MODULE_ID, feature3);
        zzahVar2.zza(ICA_MODULE_ID, feature4);
        zzahVar2.zza(OCR_MODULE_ID, feature5);
        zzahVar2.zza(LANGID_MODULE_ID, feature6);
        zzahVar2.zza(NLCLASSIFIER_MODULE_ID, feature7);
        zzahVar2.zza(TFLITE_DYNAMITE_MODULE_ID, feature8);
        zzahVar2.zza(SMART_REPLY_MODULE_ID, feature10);
        zzb = zzahVar2.zzb();
    }

    private OptionalModuleUtils() {
    }

    @Deprecated
    public static boolean areAllRequiredModulesAvailable(Context context, List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return areAllRequiredModulesAvailable(context, zza(zzb, list));
        }
        try {
            for (String str : list) {
                DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str);
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @Deprecated
    public static void requestDownload(Context context, List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            requestDownload(context, zza(zza, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    private static Feature[] zza(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            featureArr[i] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i)));
        }
        return featureArr;
    }

    public static boolean areAllRequiredModulesAvailable(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzq
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                    return featureArr;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.zzr
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    @Deprecated
    public static void requestDownload(Context context, String str) {
        requestDownload(context, zzaf.zzh(str));
    }

    public static void requestDownload(Context context, final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzo
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                return featureArr;
            }
        }).build()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.zzp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }
}
