package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u2  reason: default package */
/* loaded from: classes.dex */
public final class u2 implements sv0 {
    public static u2 c;
    public final /* synthetic */ int a;
    public Object b;

    public u2() {
        this.a = 6;
        this.b = new Object();
        new Handler(Looper.getMainLooper(), new kl6(this));
    }

    public static u2 b(boolean z, int i, int i2, int i3, int i4) {
        return new u2(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList a() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, MlKitComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", MlKitComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new rv0(str2, 0));
        }
        return arrayList2;
    }

    @Override // defpackage.sv0
    public Object create(ov0 ov0Var) {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("[Result: <");
                sb.append("Value: " + this.b);
                sb.append(">]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public u2(Context context, d90 d90Var) {
        this.a = 3;
        this.b = context;
    }
}
