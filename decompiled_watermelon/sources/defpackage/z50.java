package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z50  reason: default package */
/* loaded from: classes.dex */
public final class z50 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ z50(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((kh0) obj2).cancel();
                return o27Var;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((ih0) obj2).k(o27Var);
                return o27Var;
            case 2:
                Throwable th3 = (Throwable) obj;
                ((w45) obj2).cancel();
                return o27Var;
            case 3:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            default:
                float[] fArr = ((kv3) obj).a;
                rd3 rd3Var = (rd3) obj2;
                if (rd3Var.c0()) {
                    me2.s(rd3Var).K(rd3Var, fArr);
                }
                return o27Var;
        }
    }
}
