package defpackage;

import android.transition.Transition;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zg2  reason: default package */
/* loaded from: classes.dex */
public final class zg2 implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ bh2 e;

    public zg2(bh2 bh2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = bh2Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        bh2 bh2Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            bh2Var.A(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            bh2Var.A(obj2, this.d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
