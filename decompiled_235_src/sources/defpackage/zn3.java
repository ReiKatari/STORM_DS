package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zn3 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ zn3(Context context, int i) {
        this.A = i;
        this.B = context;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Bundle bundle;
        Bundle[] bundleArr;
        String str;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = R.string.layout_operation_failed;
        boolean z = false;
        Context context = this.B;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    i2 = R.string.layout_import_success;
                }
                Toast.makeText(context, i2, 0).show();
                return jg7Var;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    i2 = R.string.layout_export_success;
                }
                Toast.makeText(context, i2, 0).show();
                return jg7Var;
            default:
                Bundle bundle2 = (Bundle) obj;
                rc4 A = gi2.A(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(A.a.getClassLoader());
                }
                zb4 zb4Var = A.b;
                LinkedHashMap linkedHashMap = zb4Var.m;
                Boolean bool = null;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            xk2.B("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    zb4Var.d = bundle;
                    if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                        bundleArr = (Bundle[]) uj2.O(bundle2, "android-support-nav:controller:backStack").toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    zb4Var.e = bundleArr;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray != null) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList != null) {
                                int length = intArray.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length) {
                                    int i5 = i4 + 1;
                                    Integer valueOf = Integer.valueOf(intArray[i3]);
                                    LinkedHashMap linkedHashMap2 = zb4Var.l;
                                    if (!nb3.k(stringArrayList.get(i4), "")) {
                                        str = stringArrayList.get(i4);
                                    } else {
                                        str = null;
                                    }
                                    linkedHashMap2.put(valueOf, str);
                                    i3++;
                                    i4 = i5;
                                }
                            } else {
                                xk2.B("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                        } else {
                            xk2.B("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                    }
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            int size = stringArrayList2.size();
                            int i6 = 0;
                            while (i6 < size) {
                                String str2 = stringArrayList2.get(i6);
                                i6++;
                                String str3 = str2;
                                if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                    ArrayList O = uj2.O(bundle2, "android-support-nav:controller:backStackStates:" + str3);
                                    pu puVar = new pu(O.size());
                                    int size2 = O.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj2 = O.get(i7);
                                        i7++;
                                        puVar.addLast(new ub4((Bundle) obj2));
                                    }
                                    linkedHashMap.put(str3, puVar);
                                }
                            }
                        } else {
                            xk2.B("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z2 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    if (z2 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                        bool = Boolean.valueOf(z2);
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    A.e = z;
                }
                return A;
        }
    }
}
