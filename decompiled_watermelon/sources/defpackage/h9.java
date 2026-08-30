package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h9  reason: default package */
/* loaded from: classes.dex */
public final class h9 extends c9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a9 d;

    public /* synthetic */ h9(i9 i9Var, String str, a9 a9Var, int i) {
        this.a = i;
        this.b = i9Var;
        this.c = str;
        this.d = a9Var;
    }

    @Override // defpackage.c9
    public final void a(Object obj) {
        int i = this.a;
        a9 a9Var = this.d;
        String str = this.c;
        i9 i9Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = i9Var.d;
                Object obj2 = i9Var.b.get(str);
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        i9Var.b(intValue, a9Var, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                f81.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", a9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                ArrayList arrayList2 = i9Var.d;
                Object obj3 = i9Var.b.get(str);
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str);
                    try {
                        i9Var.b(intValue2, a9Var, obj);
                        return;
                    } catch (Exception e2) {
                        arrayList2.remove(str);
                        throw e2;
                    }
                }
                f81.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", a9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}
