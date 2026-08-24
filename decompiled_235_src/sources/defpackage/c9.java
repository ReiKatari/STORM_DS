package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c9  reason: default package */
/* loaded from: classes.dex */
public final class c9 extends b9 {
    public final /* synthetic */ int a;

    public /* synthetic */ c9(int i) {
        this.a = i;
    }

    @Override // defpackage.b9
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType("application/json").putExtra("android.intent.extra.TITLE", str);
                putExtra.getClass();
                return putExtra;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 2:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 3:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                putExtra2.getClass();
                return putExtra2;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
                putExtra3.getClass();
                return putExtra3;
            case 5:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return intent2;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                Intent type2 = new Intent("android.intent.action.CREATE_DOCUMENT").putExtra("android.intent.extra.TITLE", str3).addCategory("android.intent.category.OPENABLE").setType("application/octet-stream");
                type2.getClass();
                return type2;
            default:
                s93 s93Var = (s93) obj;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent4 = s93Var.B;
                if (intent4 != null && (bundleExtra = intent4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        s93Var = new s93(s93Var.A, null, s93Var.L, s93Var.R);
                    }
                }
                intent3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", s93Var);
                if (u.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent3);
                }
                return intent3;
        }
    }

    @Override // defpackage.b9
    public os0 b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                return null;
            case 1:
                ((String[]) obj).getClass();
                return null;
            case 2:
                Uri uri = (Uri) obj;
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new os0(zt1.A, 7);
                }
                for (String str : strArr) {
                    if (ge7.s(context, str) != 0) {
                        return null;
                    }
                }
                int k0 = c14.k0(strArr.length);
                if (k0 < 16) {
                    k0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new os0(linkedHashMap, 7);
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                if (ge7.s(context, str3) != 0) {
                    return null;
                }
                return new os0(Boolean.TRUE, 7);
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.b9
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
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 3:
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
                        return c14.r0(gt0.q1(fv.C0(stringArrayExtra), arrayList));
                    }
                }
                return zt1.A;
            case 4:
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
            case 5:
                return new z8(intent, i);
            case 6:
                if (intent == null || i != -1) {
                    return null;
                }
                return intent.getData();
            default:
                return new z8(intent, i);
        }
    }
}
