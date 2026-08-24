package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.Collection;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc0  reason: default package */
/* loaded from: classes.dex */
public final class mc0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ nc0 B;

    public /* synthetic */ mc0(nc0 nc0Var, int i) {
        this.A = i;
        this.B = nc0Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        Collection collection;
        Set availableCaptureRequestKeys;
        Collection collection2;
        Set availableCaptureResultKeys;
        boolean z;
        boolean z2;
        int i = this.A;
        Collection collection3 = du1.A;
        boolean z3 = false;
        nc0 nc0Var = this.B;
        switch (i) {
            case 0:
                String str = ((Object) xf0.b(nc0Var.A)) + "#availableCaptureRequestKeys";
                try {
                    Trace.beginSection(str);
                    if (Build.VERSION.SDK_INT >= 33) {
                        availableCaptureRequestKeys = nc0Var.L.getAvailableCaptureRequestKeys(nc0Var.B);
                        availableCaptureRequestKeys.getClass();
                        collection = gt0.p1(availableCaptureRequestKeys);
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
                String str2 = ((Object) xf0.b(nc0Var.A)) + "#availableCaptureResultKeys";
                try {
                    Trace.beginSection(str2);
                    if (Build.VERSION.SDK_INT >= 33) {
                        availableCaptureResultKeys = nc0Var.L.getAvailableCaptureResultKeys(nc0Var.B);
                        availableCaptureResultKeys.getClass();
                        collection2 = gt0.p1(availableCaptureResultKeys);
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
                String str3 = ((Object) xf0.b(nc0Var.A)) + "#isPostviewSupported";
                try {
                    Trace.beginSection(str3);
                    if (Build.VERSION.SDK_INT >= 34) {
                        z = nc0Var.L.isPostviewAvailable(nc0Var.B);
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
                String str4 = ((Object) xf0.b(nc0Var.A)) + "#isCaptureProgressSupported";
                try {
                    Trace.beginSection(str4);
                    if (Build.VERSION.SDK_INT >= 34) {
                        z2 = nc0Var.L.isCaptureProcessProgressAvailable(nc0Var.B);
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
