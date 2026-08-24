package defpackage;

import java.util.ArrayList;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a10  reason: default package */
/* loaded from: classes.dex */
public final class a10 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public a10(wu1 wu1Var, EmulatorActivity emulatorActivity) {
        this.A = 1;
        this.B = wu1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.on2
    public final Object c() {
        Object valueOf;
        boolean z;
        Object obj;
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((qn2) obj2).g(null);
                return jg7.a;
            case 1:
                return (j71) ((wu1) obj2).c();
            default:
                ArrayList arrayList = ((ar2) obj2).a;
                ja4 ja4Var = new ja4(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zg3 zg3Var = (zg3) arrayList.get(i2);
                    Object obj3 = zg3Var.b;
                    int i3 = zg3Var.a;
                    if (obj3 != null) {
                        valueOf = new gd3(Integer.valueOf(i3), zg3Var.b);
                    } else {
                        valueOf = Integer.valueOf(i3);
                    }
                    int f = ja4Var.f(valueOf);
                    if (f < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        obj = null;
                    } else {
                        obj = ja4Var.c[f];
                    }
                    if (obj != null) {
                        if (obj instanceof ca4) {
                            ca4 ca4Var = (ca4) obj;
                            ca4Var.a(zg3Var);
                            zg3Var = ca4Var;
                        } else {
                            Object[] objArr = uh4.a;
                            ca4 ca4Var2 = new ca4(2);
                            ca4Var2.a(obj);
                            ca4Var2.a(zg3Var);
                            zg3Var = ca4Var2;
                        }
                    }
                    if (z) {
                        int i4 = ~f;
                        ja4Var.b[i4] = valueOf;
                        ja4Var.c[i4] = zg3Var;
                    } else {
                        ja4Var.c[f] = zg3Var;
                    }
                }
                return new g94(ja4Var);
        }
    }

    public /* synthetic */ a10(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
