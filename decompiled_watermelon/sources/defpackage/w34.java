package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w34  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w34 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Bundle B;

    public /* synthetic */ w34(int i, Bundle bundle) {
        this.A = i;
        this.B = bundle;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean containsKey;
        int i = this.A;
        Bundle bundle = this.B;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
