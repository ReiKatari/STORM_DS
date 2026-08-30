package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ud4  reason: default package */
/* loaded from: classes.dex */
public final class ud4 extends ze4 {
    public static final ud4 d = new ze4(0, 2, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        int i = ((f33) yp0Var.g(0)).a;
        List list = (List) yp0Var.g(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            xsVar.c(i3, obj);
            xsVar.f(i3, obj);
        }
    }
}
