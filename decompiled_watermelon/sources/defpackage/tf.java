package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tf  reason: default package */
/* loaded from: classes.dex */
public final class tf extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Serializable Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, Serializable serializable, int i) {
        super(0);
        this.B = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = serializable;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.B;
        o27 o27Var = o27.a;
        Serializable serializable = this.Y;
        Object obj = this.L;
        Object obj2 = this.R;
        Object obj3 = this.X;
        switch (i) {
            case 0:
                ((if1) obj).g((ki2) obj2, (ff1) obj3, (sd3) serializable);
                return o27Var;
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
                    ((n75) serializable).A = new ob1(gVar, obj3, viewGroup);
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + gVar.d + " to " + gVar.e);
                    }
                }
                return o27Var;
        }
    }
}
