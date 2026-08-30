package defpackage;

import java.util.Comparator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aj3  reason: default package */
/* loaded from: classes.dex */
public final class aj3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh b;

    public /* synthetic */ aj3(sh shVar, int i) {
        this.a = i;
        this.b = shVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        sh shVar = this.b;
        switch (i) {
            case 0:
                return iq2.i(Integer.valueOf(shVar.e(((hj3) obj).getKey())), Integer.valueOf(shVar.e(((hj3) obj2).getKey())));
            case 1:
                return iq2.i(Integer.valueOf(shVar.e(((hj3) obj).getKey())), Integer.valueOf(shVar.e(((hj3) obj2).getKey())));
            case 2:
                return iq2.i(Integer.valueOf(shVar.e(((hj3) obj2).getKey())), Integer.valueOf(shVar.e(((hj3) obj).getKey())));
            default:
                return iq2.i(Integer.valueOf(shVar.e(((hj3) obj2).getKey())), Integer.valueOf(shVar.e(((hj3) obj).getKey())));
        }
    }
}
