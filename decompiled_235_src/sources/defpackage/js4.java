package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js4  reason: default package */
/* loaded from: classes.dex */
public final class js4 extends uj2 {
    public final /* synthetic */ int h;
    public final Method i;
    public final int j;

    public /* synthetic */ js4(Method method, int i, int i2) {
        this.h = i2;
        this.i = method;
        this.j = i;
    }

    @Override // defpackage.uj2
    public final void l(ok5 ok5Var, Object obj) {
        int i = this.h;
        int i2 = this.j;
        Method method = this.i;
        switch (i) {
            case 0:
                yw2 yw2Var = (yw2) obj;
                if (yw2Var != null) {
                    ww2 ww2Var = ok5Var.f;
                    ww2Var.getClass();
                    int size = yw2Var.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ft7.a(ww2Var, yw2Var.b(i3), yw2Var.d(i3));
                    }
                    return;
                }
                throw ak7.v0(method, i2, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    ok5Var.c = obj.toString();
                    return;
                }
                throw ak7.v0(method, i2, "@Url parameter is null.", new Object[0]);
        }
    }
}
