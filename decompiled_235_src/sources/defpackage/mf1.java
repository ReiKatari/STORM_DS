package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf1  reason: default package */
/* loaded from: classes.dex */
public final class mf1 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(g gVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.B = 1;
        this.L = gVar;
        this.R = obj;
        this.X = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, uj0] */
    @Override // defpackage.on2
    public final Object c() {
        int i = this.B;
        jg7 jg7Var = jg7.a;
        Object obj = this.R;
        Object obj2 = this.X;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                ((g) obj3).f.e((ViewGroup) obj2, obj);
                return jg7Var;
            case 1:
                g gVar = (g) obj3;
                ArrayList arrayList = gVar.c;
                dm2 dm2Var = gVar.f;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        if (!((nf1) obj4).a.g) {
                            if (u.K(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            ?? obj5 = new Object();
                            dm2Var.u(((nf1) arrayList.get(0)).a.c, obj, obj5, new n0(gVar, 16));
                            obj5.a();
                            return jg7Var;
                        }
                    }
                }
                if (u.K(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj6 = gVar.q;
                obj6.getClass();
                dm2Var.d(obj6, new mf(15, gVar, (ViewGroup) obj2));
                return jg7Var;
            default:
                p0 p0Var = (p0) obj3;
                p0Var.removeOnAttachStateChangeListener((wh) obj2);
                bl2.D(p0Var).a.remove((do7) obj);
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf1(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.B = i;
        this.L = obj;
        this.X = obj2;
        this.R = obj3;
    }
}
