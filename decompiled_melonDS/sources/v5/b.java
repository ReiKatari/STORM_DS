package v5;

import a1.s;
import a4.e0;
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
import o1.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final s f13725a = new s(2);

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f13726b = new e0(10);

    public static r a(Context context, List list) {
        String str;
        Typeface c4;
        Trace.beginSection(aj.g.v0("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c cVar = (c) list.get(i2);
                if (Build.VERSION.SDK_INT >= 31 && (c4 = q5.e.c((str = cVar.f13731e))) != null && q5.e.d(c4) != null) {
                    arrayList.add(new g[]{new g(str, cVar.f13732f)});
                } else {
                    ProviderInfo b10 = b(context.getPackageManager(), cVar, context.getResources());
                    if (b10 == null) {
                        return new r();
                    }
                    arrayList.add(c(context, cVar, b10.authority));
                }
            }
            return new r(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [v5.a, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        e0 e0Var = f13726b;
        s sVar = f13725a;
        Trace.beginSection(aj.g.v0("FontProvider.getProvider"));
        try {
            List list = cVar.f13730d;
            String str = cVar.f13727a;
            String str2 = cVar.f13728b;
            if (list == null) {
                list = p5.b.l(resources, 0);
            }
            ?? obj = new Object();
            obj.f13722a = str;
            obj.f13723b = str2;
            obj.f13724c = list;
            ProviderInfo providerInfo = (ProviderInfo) sVar.h(obj);
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
                    Collections.sort(arrayList, e0Var);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i2));
                        Collections.sort(arrayList2, e0Var);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                                    break;
                                }
                            }
                            sVar.l(obj, resolveContentProvider);
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

    public static g[] c(Context context, c cVar, String str) {
        int i2;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z10;
        Trace.beginSection(aj.g.v0("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.beginSection(aj.g.v0("ContentQueryWrapper.query"));
            try {
                String[] strArr2 = {cVar.f13729c};
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                    } catch (RemoteException e6) {
                        Log.w("FontsProvider", "Unable to query the content provider", e6);
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
                            i2 = cursor.getInt(columnIndex);
                        } else {
                            i2 = 0;
                        }
                        if (columnIndex4 != -1) {
                            i10 = cursor.getInt(columnIndex4);
                        } else {
                            i10 = 0;
                        }
                        if (columnIndex3 == -1) {
                            withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i11 = cursor.getInt(columnIndex5);
                        } else {
                            i11 = 400;
                        }
                        if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList2.add(new g(uri, i10, i11, z10, i2));
                    }
                    arrayList = arrayList2;
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                return (g[]) arrayList.toArray(new g[0]);
            } finally {
            }
        } finally {
        }
    }
}
