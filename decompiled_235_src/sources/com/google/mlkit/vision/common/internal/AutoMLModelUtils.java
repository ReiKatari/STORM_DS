package com.google.mlkit.vision.common.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
    }

    public static String[] getModelAndLabelFilePaths(Context context, LocalModel localModel, boolean z) {
        String str;
        String str2;
        if (z) {
            str = (String) Preconditions.checkNotNull(localModel.getAssetFilePath());
        } else {
            str = (String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath());
        }
        if (localModel.isManifestFile()) {
            ModelUtils.AutoMLManifest parseManifestFile = ModelUtils.parseManifestFile(str, z, context);
            if (parseManifestFile != null) {
                Preconditions.checkState(Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(parseManifestFile.getModelType()), "Model type should be: %s.", Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE);
                str = new File(new File(str).getParent(), parseManifestFile.getModelFile()).toString();
                str2 = new File(new File(str).getParent(), parseManifestFile.getLabelsFile()).toString();
            } else {
                e41.i("Failed to parse manifest file.");
                return null;
            }
        } else {
            str2 = "";
        }
        return new String[]{str, str2};
    }

    public static List<String> readLabelsFile(Context context, String str, boolean z) {
        InputStream fileInputStream;
        ArrayList arrayList = new ArrayList();
        if (z) {
            fileInputStream = context.getAssets().open(str);
        } else {
            fileInputStream = new FileInputStream(new File(str));
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                arrayList.add(readLine);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
