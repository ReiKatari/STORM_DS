package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;

    public /* synthetic */ c5(int i, List list) {
        this.A = i;
        this.B = list;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                return new rj4(((c6) tq0.K0(list)).a);
            case 1:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 2:
                return list;
            case 3:
                return ((n93) list.get(0)).c();
            default:
                return ((n93) list.get(0)).c();
        }
    }
}
