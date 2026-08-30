package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ob1  reason: default package */
/* loaded from: classes.dex */
public final class ob1 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob1(g gVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.B = 1;
        this.L = gVar;
        this.R = obj;
        this.X = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [lh0, java.lang.Object] */
    @Override // defpackage.ki2
    public final Object c() {
        int i = this.B;
        o27 o27Var = o27.a;
        Object obj = this.R;
        Object obj2 = this.X;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                ((g) obj3).f.e((ViewGroup) obj2, obj);
                return o27Var;
            case 1:
                g gVar = (g) obj3;
                ArrayList arrayList = gVar.c;
                dh2 dh2Var = gVar.f;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (!((pb1) obj4).a.g) {
                            if (u.K(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            ?? obj5 = new Object();
                            dh2Var.u(((pb1) arrayList.get(0)).a.c, obj, obj5, new m0(16, gVar));
                            obj5.a();
                            return o27Var;
                        }
                    }
                }
                if (u.K(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj6 = gVar.q;
                obj6.getClass();
                dh2Var.d(obj6, new we(15, gVar, (ViewGroup) obj2));
                return o27Var;
            default:
                o0 o0Var = (o0) obj3;
                o0Var.removeOnAttachStateChangeListener((kh) obj2);
                gk2.T(o0Var).a.remove((da7) obj);
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob1(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.B = i;
        this.L = obj;
        this.X = obj2;
        this.R = obj3;
    }
}
