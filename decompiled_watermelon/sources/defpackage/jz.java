package defpackage;

import java.util.ArrayList;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jz  reason: default package */
/* loaded from: classes.dex */
public final class jz implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public jz(iq1 iq1Var, EmulatorActivity emulatorActivity) {
        this.A = 1;
        this.B = iq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ki2
    public final Object c() {
        Object valueOf;
        boolean z;
        Object obj;
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((mi2) obj2).n(null);
                return o27.a;
            case 1:
                return (z31) ((iq1) obj2).c();
            default:
                ArrayList arrayList = ((vk2) obj2).a;
                d24 d24Var = new d24(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ga3 ga3Var = (ga3) arrayList.get(i2);
                    Object obj3 = ga3Var.b;
                    int i3 = ga3Var.a;
                    if (obj3 != null) {
                        valueOf = new r63(Integer.valueOf(i3), ga3Var.b);
                    } else {
                        valueOf = Integer.valueOf(i3);
                    }
                    int f = d24Var.f(valueOf);
                    if (f < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        obj = null;
                    } else {
                        obj = d24Var.c[f];
                    }
                    if (obj != null) {
                        if (obj instanceof w14) {
                            w14 w14Var = (w14) obj;
                            w14Var.a(ga3Var);
                            ga3Var = w14Var;
                        } else {
                            Object[] objArr = b94.a;
                            w14 w14Var2 = new w14(2);
                            w14Var2.a(obj);
                            w14Var2.a(ga3Var);
                            ga3Var = w14Var2;
                        }
                    }
                    if (z) {
                        int i4 = ~f;
                        d24Var.b[i4] = valueOf;
                        d24Var.c[i4] = ga3Var;
                    } else {
                        d24Var.c[f] = ga3Var;
                    }
                }
                return new a14(d24Var);
        }
    }

    public /* synthetic */ jz(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }
}
