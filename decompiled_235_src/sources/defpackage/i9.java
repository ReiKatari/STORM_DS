package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i9  reason: default package */
/* loaded from: classes.dex */
public final class i9 extends d9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b9 d;

    public /* synthetic */ i9(j9 j9Var, String str, b9 b9Var, int i) {
        this.a = i;
        this.b = j9Var;
        this.c = str;
        this.d = b9Var;
    }

    @Override // defpackage.d9
    public final void a(Object obj) {
        int i = this.a;
        b9 b9Var = this.d;
        String str = this.c;
        j9 j9Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = j9Var.d;
                Object obj2 = j9Var.b.get(str);
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        j9Var.b(intValue, b9Var, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                u34.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", b9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                ArrayList arrayList2 = j9Var.d;
                Object obj3 = j9Var.b.get(str);
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str);
                    try {
                        j9Var.b(intValue2, b9Var, obj);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str);
                        throw e2;
                    }
                }
                u34.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", b9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}
