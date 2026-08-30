package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.Collection;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ea0  reason: default package */
/* loaded from: classes.dex */
public final class ea0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ fa0 B;

    public /* synthetic */ ea0(fa0 fa0Var, int i) {
        this.A = i;
        this.B = fa0Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Collection collection;
        Set availableCaptureRequestKeys;
        Collection collection2;
        Set availableCaptureResultKeys;
        boolean z;
        boolean z2;
        int i = this.A;
        Collection collection3 = up1.A;
        boolean z3 = false;
        fa0 fa0Var = this.B;
        switch (i) {
            case 0:
                String str = ((Object) od0.b(fa0Var.A)) + "#availableCaptureRequestKeys";
                try {
                    Trace.beginSection(str);
                    if (Build.VERSION.SDK_INT >= 33) {
                        availableCaptureRequestKeys = fa0Var.L.getAvailableCaptureRequestKeys(fa0Var.B);
                        availableCaptureRequestKeys.getClass();
                        collection = tq0.s1(availableCaptureRequestKeys);
                    } else {
                        collection = collection3;
                    }
                    Trace.endSection();
                    collection3 = collection;
                    return collection3;
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th);
                    return collection3;
                }
            case 1:
                String str2 = ((Object) od0.b(fa0Var.A)) + "#availableCaptureResultKeys";
                try {
                    Trace.beginSection(str2);
                    if (Build.VERSION.SDK_INT >= 33) {
                        availableCaptureResultKeys = fa0Var.L.getAvailableCaptureResultKeys(fa0Var.B);
                        availableCaptureResultKeys.getClass();
                        collection2 = tq0.s1(availableCaptureResultKeys);
                    } else {
                        collection2 = collection3;
                    }
                    Trace.endSection();
                    collection3 = collection2;
                    return collection3;
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to get " + str2 + "! Caching {} and ignoring exception.", th2);
                    return collection3;
                }
            case 2:
                String str3 = ((Object) od0.b(fa0Var.A)) + "#isPostviewSupported";
                try {
                    Trace.beginSection(str3);
                    if (Build.VERSION.SDK_INT >= 34) {
                        z = fa0Var.L.isPostviewAvailable(fa0Var.B);
                    } else {
                        z = false;
                    }
                    Trace.endSection();
                    z3 = z;
                } catch (Throwable th3) {
                    Log.w("CXCP", "Failed to get " + str3 + "! Caching false and ignoring exception.", th3);
                }
                return Boolean.valueOf(z3);
            default:
                String str4 = ((Object) od0.b(fa0Var.A)) + "#isCaptureProgressSupported";
                try {
                    Trace.beginSection(str4);
                    if (Build.VERSION.SDK_INT >= 34) {
                        z2 = fa0Var.L.isCaptureProcessProgressAvailable(fa0Var.B);
                    } else {
                        z2 = false;
                    }
                    Trace.endSection();
                    z3 = z2;
                } catch (Throwable th4) {
                    Log.w("CXCP", "Failed to get " + str4 + "! Caching false and ignoring exception.", th4);
                }
                return Boolean.valueOf(z3);
        }
    }
}
