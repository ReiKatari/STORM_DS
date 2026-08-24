package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uk2 implements b31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b31
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Configuration configuration = (Configuration) obj;
                ((jq) obj2).r0.l();
                return;
            case 1:
                Intent intent = (Intent) obj;
                ((jq) obj2).r0.l();
                return;
            default:
                cz czVar = (cz) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = czVar.b - ((ry) entry.getKey()).f;
                    if (((ry) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int i3 = k97.i(i2);
                    qv6 qv6Var = (qv6) entry.getValue();
                    qv6Var.getClass();
                    nj2.D(new nv6(qv6Var, i3, -1));
                }
                return;
        }
    }
}
