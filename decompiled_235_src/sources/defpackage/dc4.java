package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dc4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Bundle B;

    public /* synthetic */ dc4(int i, Bundle bundle) {
        this.A = i;
        this.B = bundle;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
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
