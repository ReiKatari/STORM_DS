package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.p;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b9  reason: default package */
/* loaded from: classes.dex */
public final class b9 extends a9 {
    public final /* synthetic */ int a;

    public /* synthetic */ b9(int i) {
        this.a = i;
    }

    @Override // defpackage.a9
    public final Intent a(p pVar, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 2:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                putExtra.getClass();
                return putExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra2.getClass();
                return putExtra2;
            case 4:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return intent2;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                Intent type2 = new Intent("android.intent.action.CREATE_DOCUMENT").putExtra("android.intent.extra.TITLE", str2).addCategory("android.intent.category.OPENABLE").setType("application/octet-stream");
                type2.getClass();
                return type2;
            default:
                k33 k33Var = (k33) obj;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent4 = k33Var.B;
                if (intent4 != null && (bundleExtra = intent4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        k33Var = new k33(k33Var.A, null, k33Var.L, k33Var.R);
                    }
                }
                intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", k33Var);
                if (u.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent3);
                }
                return intent3;
        }
    }

    @Override // defpackage.a9
    public bq0 b(p pVar, Object obj) {
        switch (this.a) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                Uri uri = (Uri) obj;
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new bq0(7, qp1.A);
                }
                for (String str : strArr) {
                    if (jv3.o(pVar, str) != 0) {
                        return null;
                    }
                }
                int j0 = zt3.j0(strArr.length);
                if (j0 < 16) {
                    j0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new bq0(7, linkedHashMap);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (jv3.o(pVar, str3) != 0) {
                    return null;
                }
                return new bq0(7, Boolean.TRUE);
            default:
                return super.b(pVar, obj);
        }
    }

    @Override // defpackage.a9
    public final Object c(Intent intent, int i) {
        boolean z;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 2:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            if (i2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(Boolean.valueOf(z));
                        }
                        return zt3.q0(tq0.t1(nu.o0(stringArrayExtra), arrayList));
                    }
                }
                return qp1.A;
            case 3:
                if (intent != null && i == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (intArrayExtra2[i3] == 0) {
                                    z2 = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                return Boolean.FALSE;
            case 4:
                return new y8(intent, i);
            case 5:
                if (intent == null || i != -1) {
                    return null;
                }
                return intent.getData();
            default:
                return new y8(intent, i);
        }
    }
}
