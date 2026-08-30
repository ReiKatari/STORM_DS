package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.p;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws0  reason: default package */
/* loaded from: classes.dex */
public final class ws0 extends i9 {
    public final /* synthetic */ p h;

    public ws0(p pVar) {
        this.h = pVar;
    }

    @Override // defpackage.i9
    public final void b(int i, a9 a9Var, Object obj) {
        Bundle bundle;
        int i2;
        String[] strArr;
        a9Var.getClass();
        p pVar = this.h;
        bq0 b = a9Var.b(pVar, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new ob0(i, 1, this, b));
            return;
        }
        Intent a = a9Var.a(pVar, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(pVar.getClassLoader());
            }
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i3])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                } else {
                    i.i(b31.q(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
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
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            pVar.requestPermissions(stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            k33 k33Var = (k33) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                k33Var.getClass();
                i2 = i;
                try {
                    pVar.startIntentSenderForResult(k33Var.A, i2, k33Var.B, k33Var.L, k33Var.R, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    new Handler(Looper.getMainLooper()).post(new ob0(i2, 2, this, e));
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        } else {
            pVar.startActivityForResult(a, i, bundle2);
        }
    }
}
