package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv0  reason: default package */
/* loaded from: classes.dex */
public final class kv0 extends j9 {
    public final /* synthetic */ mv0 h;

    public kv0(mv0 mv0Var) {
        this.h = mv0Var;
    }

    @Override // defpackage.j9
    public final void b(int i, b9 b9Var, Object obj) {
        Bundle bundle;
        int i2;
        String[] strArr;
        b9Var.getClass();
        mv0 mv0Var = this.h;
        os0 b = b9Var.b(mv0Var, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new xd0(this, i, 1, b));
            return;
        }
        Intent a = b9Var.a(mv0Var, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(mv0Var.getClassLoader());
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
                    i.h(i61.n(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
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
            mv0Var.requestPermissions(stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            s93 s93Var = (s93) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                s93Var.getClass();
                i2 = i;
                try {
                    mv0Var.startIntentSenderForResult(s93Var.A, i2, s93Var.B, s93Var.L, s93Var.R, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    new Handler(Looper.getMainLooper()).post(new xd0(this, i2, 2, e));
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        } else {
            mv0Var.startActivityForResult(a, i, bundle2);
        }
    }
}
