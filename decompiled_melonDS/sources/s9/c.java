package s9;

import a5.e0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import b4.r0;
import i3.z;
import j3.d;
import n2.l;
import n2.m;
import n2.r;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final long f12851a = z.b(0.0f, 0.0f, 0.0f, 0.3f, d.f7353e);

    /* renamed from: b  reason: collision with root package name */
    public static final b f12852b = b.B;

    public static final a a(m mVar) {
        e0 e0Var;
        Window window;
        r rVar = (r) mVar;
        rVar.Y(-715745933);
        rVar.Y(1009281237);
        t2 t2Var = r0.f1941f;
        ViewParent parent = ((View) rVar.j(t2Var)).getParent();
        Window window2 = null;
        if (parent instanceof e0) {
            e0Var = (e0) parent;
        } else {
            e0Var = null;
        }
        if (e0Var != null) {
            window = e0Var.f384f0;
        } else {
            window = null;
        }
        if (window == null) {
            Context context = ((View) rVar.j(t2Var)).getContext();
            context.getClass();
            while (true) {
                if (context instanceof Activity) {
                    window2 = ((Activity) context).getWindow();
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    context.getClass();
                }
            }
            window = window2;
        }
        rVar.p(false);
        View view = (View) rVar.j(r0.f1941f);
        rVar.Y(-1044852491);
        boolean f8 = rVar.f(view) | rVar.f(window);
        Object L = rVar.L();
        if (f8 || L == l.f9953a) {
            L = new a(view, window);
            rVar.h0(L);
        }
        a aVar = (a) L;
        rVar.p(false);
        rVar.p(false);
        return aVar;
    }
}
