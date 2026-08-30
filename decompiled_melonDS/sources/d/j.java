package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.o0;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends h.h {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ o0 f3292h;

    public j(o0 o0Var) {
        this.f3292h = o0Var;
    }

    @Override // h.h
    public final void b(int i2, i.a aVar, Object obj) {
        Bundle bundle;
        int i10;
        String[] strArr;
        aVar.getClass();
        o0 o0Var = this.f3292h;
        d2.t b10 = aVar.b(o0Var, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new i(this, i2, b10, 0));
            return;
        }
        Intent a10 = aVar.a(o0Var, obj);
        if (a10.getExtras() != null) {
            Bundle extras = a10.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a10.setExtrasClassLoader(o0Var.getClassLoader());
            }
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i11])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                } else {
                    a0.j.h(w.d.s(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr[i12] = stringArrayExtra[i13];
                        i12++;
                    }
                }
            }
            o0Var.requestPermissions(stringArrayExtra, i2);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
            h.j jVar = (h.j) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                jVar.getClass();
                i10 = i2;
                try {
                    o0Var.startIntentSenderForResult(jVar.A, i10, jVar.B, jVar.L, jVar.R, 0, bundle2);
                } catch (IntentSender.SendIntentException e6) {
                    e = e6;
                    new Handler(Looper.getMainLooper()).post(new i(this, i10, e, 1));
                }
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i10 = i2;
            }
        } else {
            o0Var.startActivityForResult(a10, i2, bundle2);
        }
    }
}
