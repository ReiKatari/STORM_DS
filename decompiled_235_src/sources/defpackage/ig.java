package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig  reason: default package */
/* loaded from: classes.dex */
public final class ig extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Serializable Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig(Object obj, Object obj2, Object obj3, Serializable serializable, int i) {
        super(0);
        this.B = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = serializable;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.B;
        jg7 jg7Var = jg7.a;
        Serializable serializable = this.Y;
        Object obj = this.L;
        Object obj2 = this.R;
        Object obj3 = this.X;
        switch (i) {
            case 0:
                ((mj1) obj).g((on2) obj2, (jj1) obj3, (kk3) serializable);
                return jg7Var;
            default:
                ViewGroup viewGroup = (ViewGroup) obj2;
                g gVar = (g) obj;
                if (u.K(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                Object i2 = gVar.f.i(viewGroup, obj3);
                gVar.q = i2;
                if (i2 == null) {
                    if (u.K(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    gVar.r = true;
                } else {
                    ((dh5) serializable).A = new mf1(gVar, obj3, viewGroup);
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + gVar.d + " to " + gVar.e);
                    }
                }
                return jg7Var;
        }
    }
}
