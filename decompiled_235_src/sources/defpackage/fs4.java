package defpackage;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs4  reason: default package */
/* loaded from: classes.dex */
public final class fs4 extends uj2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ uj2 i;

    public /* synthetic */ fs4(uj2 uj2Var, int i) {
        this.h = i;
        this.i = uj2Var;
    }

    @Override // defpackage.uj2
    public final void l(ok5 ok5Var, Object obj) {
        int i = this.h;
        uj2 uj2Var = this.i;
        switch (i) {
            case 0:
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object obj2 : iterable) {
                        uj2Var.l(ok5Var, obj2);
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        uj2Var.l(ok5Var, Array.get(obj, i2));
                    }
                    return;
                }
                return;
        }
    }
}
