package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wd2  reason: default package */
/* loaded from: classes.dex */
public abstract class wd2 {
    public static final us3 a = new us3(2);
    public static final pj b = new pj(1);

    public static re2 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(io2.p0("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                xd2 xd2Var = (xd2) list.get(i);
                if (Build.VERSION.SDK_INT >= 31 && (c = o07.c((str = xd2Var.e))) != null && o07.d(c) != null) {
                    arrayList.add(new se2[]{new se2(str, xd2Var.f)});
                } else {
                    ProviderInfo b2 = b(context.getPackageManager(), xd2Var, context.getResources());
                    if (b2 == null) {
                        return new re2();
                    }
                    arrayList.add(c(context, xd2Var, b2.authority));
                }
            }
            return new re2(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [vd2, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, xd2 xd2Var, Resources resources) {
        pj pjVar = b;
        us3 us3Var = a;
        Trace.beginSection(io2.p0("FontProvider.getProvider"));
        try {
            List list = xd2Var.d;
            String str = xd2Var.a;
            String str2 = xd2Var.b;
            if (list == null) {
                list = uj7.e(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) us3Var.h(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, pjVar);
                    for (int i = 0; i < list.size(); i++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                        Collections.sort(arrayList2, pjVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                    break;
                                }
                            }
                            us3Var.l(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static se2[] c(Context context, xd2 xd2Var, String str) {
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        Trace.beginSection(io2.p0("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.beginSection(io2.p0("ContentQueryWrapper.query"));
            try {
                String[] strArr2 = {xd2Var.c};
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                    } catch (RemoteException e) {
                        Log.w("FontsProvider", "Unable to query the content provider", e);
                    }
                }
                Trace.endSection();
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    ArrayList arrayList2 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        if (columnIndex != -1) {
                            i = cursor.getInt(columnIndex);
                        } else {
                            i = 0;
                        }
                        if (columnIndex4 != -1) {
                            i2 = cursor.getInt(columnIndex4);
                        } else {
                            i2 = 0;
                        }
                        if (columnIndex3 == -1) {
                            withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i3 = cursor.getInt(columnIndex5);
                        } else {
                            i3 = 400;
                        }
                        int i4 = i3;
                        if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList2.add(new se2(uri, i2, i4, z, xd2Var.f, i));
                    }
                    arrayList = arrayList2;
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                return (se2[]) arrayList.toArray(new se2[0]);
            } finally {
            }
        } finally {
        }
    }
}
