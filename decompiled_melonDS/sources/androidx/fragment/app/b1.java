package androidx.fragment.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends i.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1256a;

    public /* synthetic */ b1(int i2) {
        this.f1256a = i2;
    }

    @Override // i.a
    public final Intent a(o0 o0Var, Object obj) {
        Bundle bundleExtra;
        switch (this.f1256a) {
            case 0:
                h.j jVar = (h.j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.B;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        jVar = new h.j(jVar.A, null, jVar.L, jVar.R);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (g1.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case DSiCameraSource.FrontCamera /* 1 */:
                Uri uri = (Uri) obj;
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent3.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent3;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra.getClass();
                return putExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra2.getClass();
                return putExtra2;
            case 4:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            default:
                String str2 = (String) obj;
                str2.getClass();
                Intent type = new Intent("android.intent.action.CREATE_DOCUMENT").putExtra("android.intent.extra.TITLE", str2).addCategory("android.intent.category.OPENABLE").setType("application/octet-stream");
                type.getClass();
                return type;
        }
    }

    @Override // i.a
    public d2.t b(o0 o0Var, Object obj) {
        switch (this.f1256a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                Uri uri = (Uri) obj;
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new d2.t(14, zb.r.A);
                }
                for (String str : strArr) {
                    if (aj.g.k(o0Var, str) != 0) {
                        return null;
                    }
                }
                int E = zb.v.E(strArr.length);
                if (E < 16) {
                    E = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(E);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new d2.t(14, linkedHashMap);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (aj.g.k(o0Var, str3) == 0) {
                    return new d2.t(14, Boolean.TRUE);
                }
                return null;
            default:
                return super.b(o0Var, obj);
        }
    }

    @Override // i.a
    public final Object c(Intent intent, int i2) {
        boolean z10;
        switch (this.f1256a) {
            case 0:
                return new h.a(intent, i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 2:
                if (i2 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            if (i10 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            arrayList.add(Boolean.valueOf(z10));
                        }
                        return zb.v.H(zb.l.t0(zb.k.v(stringArrayExtra), arrayList));
                    }
                }
                return zb.r.A;
            case 3:
                if (intent != null && i2 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z11 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra2[i11] == 0) {
                                    z11 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
                return Boolean.FALSE;
            case 4:
                return new h.a(intent, i2);
            default:
                if (intent != null && i2 == -1) {
                    return intent.getData();
                }
                return null;
        }
    }
}
